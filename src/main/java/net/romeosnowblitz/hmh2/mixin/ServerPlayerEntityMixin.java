package net.romeosnowblitz.hmh2.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.PlayerAdvancementTracker;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.ServerStatHandler;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.tag.ModBiomeTags;
import net.romeosnowblitz.hmh2.util.ModStats;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixin extends PlayerEntity {

    @Shadow public abstract ServerStatHandler getStatHandler();

    @Shadow public abstract PlayerAdvancementTracker getAdvancementTracker();

    @Shadow public abstract ServerWorld getServerWorld();

    @Shadow public abstract void sendMessage(Text message);

    @Shadow public abstract boolean damage(DamageSource source, float amount);

    @Shadow private int joinInvulnerabilityTicks;

    @Shadow public abstract void addExperienceLevels(int levels);

    @Shadow public abstract void setSpawnPoint(RegistryKey<World> dimension, @Nullable BlockPos pos, float angle, boolean forced, boolean sendMessage);

    private static int c = 0;
    private static int t = 0;

    public ServerPlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile) {
        super(world, pos, yaw, gameProfile);
    }

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir){
        if (this.isInvulnerableTo(source)) {
            cir.setReturnValue(false);
        } else {
            boolean bl = this.getServer().isDedicated() && this.getServer().isPvpEnabled() && source.isIn(DamageTypeTags.IS_FALL);
            if (!bl && this.joinInvulnerabilityTicks > 0 && !source.isIn(DamageTypeTags.BYPASSES_INVULNERABILITY) && !this.hasStatusEffect(CustomEffects.PACIFIST)) {
                cir.setReturnValue(true);
            } else {
                Entity entity = source.getAttacker();
                if(this.hasStatusEffect(CustomEffects.NECROMANCER)){
                    this.addExperienceLevels((int) -amount);
                }
                if(this.hasStatusEffect(CustomEffects.PACIFIST)){
                    this.heal(amount*2);
                    if(entity != null){entity.damage(source, amount);}
                }
                if (entity instanceof PlayerEntity) {
                    PlayerEntity playerEntity = (PlayerEntity)entity;
                    if (!this.shouldDamagePlayer(playerEntity)) {
                        cir.setReturnValue(true);
                    }
                }
                if (entity instanceof PersistentProjectileEntity) {
                    PersistentProjectileEntity persistentProjectileEntity = (PersistentProjectileEntity)entity;
                    Entity entity2 = persistentProjectileEntity.getOwner();
                    if (entity2 instanceof PlayerEntity) {
                        PlayerEntity playerEntity2 = (PlayerEntity)entity2;
                        if (!this.shouldDamagePlayer(playerEntity2)) {
                            cir.setReturnValue(false);
                        }
                    }
                }
                super.damage(source, amount);
            }
        }
    }


    @Inject(method = "tick", at = @At("HEAD"))
    private void tick(CallbackInfo ci) {
        c++;
        if(!this.isCreative() && !this.isSpectator()){
            if (!this.hasStatusEffect(CustomEffects.NORMIE) && this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 0) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE, -1));}
            if (!this.hasStatusEffect(CustomEffects.NECROMANCER) && this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 1) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.NECROMANCER, -1));}
            if (!this.hasStatusEffect(CustomEffects.SORCERER) && this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 2) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.SORCERER, -1));}
            if (!this.hasStatusEffect(CustomEffects.ENVIRONMENTALIST) && this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 3) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.ENVIRONMENTALIST, -1));}
            if (!this.hasStatusEffect(CustomEffects.BLOOD_WITCH) && this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 4) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.BLOOD_WITCH, -1));}
            if (!this.hasStatusEffect(CustomEffects.PACIFIST) && this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 100) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.PACIFIST, -1));}
            if (!this.hasStatusEffect(CustomEffects.NECROMANCER) && this.getWorld().getBiome(this.getBlockPos()).isIn(ModBiomeTags.IS_BASALT_DELTAS)) {++t;
                if (t > 600 && t % 200 == 0) {this.addStatusEffect(new StatusEffectInstance(CustomEffects.ASH_LUNG, 600));} else {t = 0;}
            }

            if(c % 20 == 0 && getServer().isHardcore() && !this.hasStatusEffect(CustomEffects.NECROMANCER)){
                int newHealth = this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS))-this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NUMBER_OF_BLESSINGS))+this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.BLESSED))+this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH_ADJUSTMENT));
                if(this.getMaxHealth() + newHealth > 20){this.heal(newHealth);
                    Multimap<EntityAttribute, EntityAttributeModifier> subtractHealth;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> subtract_health_builder = ImmutableMultimap.builder();
                    subtract_health_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", -1, EntityAttributeModifier.Operation.ADDITION)); subtractHealth = subtract_health_builder.build();
                    if (this.getMaxHealth() + newHealth > 20) {this.damage(this.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_HEALTH_ADJUSTMENT), 1); this.getAttributes().addTemporaryModifiers(subtractHealth);}
                }
                if(this.getMaxHealth() + newHealth < 20){this.heal(newHealth);
                    Multimap<EntityAttribute, EntityAttributeModifier> addHealth;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> add_health_builder = ImmutableMultimap.builder();
                    add_health_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", 1, EntityAttributeModifier.Operation.ADDITION)); addHealth = add_health_builder.build();
                    if (this.getMaxHealth() + newHealth < 20) {this.heal(1); this.getAttributes().addTemporaryModifiers(addHealth);}
                }
            }

            if(c % 1200 == 0 && !this.hasStatusEffect(CustomEffects.PACIFIST)) {
                int numberOfDeaths = this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS));
                int revivalCost = this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_COST));
                int revivalDiscount = this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_DISCOUNT));
                int revivalTotal = this.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_TOTAL));

                if (revivalCost != (30 * numberOfDeaths) + 1) {this.getStatHandler().setStat(this, Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_COST), (30 * numberOfDeaths) + 1);}
                if (revivalTotal != revivalCost - revivalDiscount) {this.getStatHandler().setStat(this, Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_TOTAL), revivalCost - revivalDiscount);}

                int numOfCompletedAdvancements = 0;
                for (Advancement playerAdvancement : this.getWorld().getServer().getAdvancementLoader().getAdvancements()) {
                    boolean completed = this.getAdvancementTracker().getProgress(playerAdvancement).isDone();if (completed) {numOfCompletedAdvancements++;}
                }
                int advancementPoint = ((numOfCompletedAdvancements / (this.getServer().getAdvancementLoader().getAdvancements().size() / 100)) + 1);
                int seasonScoreRate = (int) (advancementPoint / ((numberOfDeaths * 0.1f) + 1));
                this.getStatHandler().increaseStat(this, Stats.CUSTOM.getOrCreateStat(ModStats.SEASON_SCORE), seasonScoreRate);
                c = 0;
            }
        }
    }

}