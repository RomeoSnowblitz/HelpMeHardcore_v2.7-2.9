package net.romeosnowblitz.hmh2.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.tag.ModBiomeTags;
import net.romeosnowblitz.hmh2.util.ModStats;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.concurrent.atomic.AtomicInteger;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    private static int t = 0;

    @Shadow
    public abstract boolean damage(DamageSource source, float amount);

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }


    @Override
    public void move(MovementType movementType, Vec3d movement) {
        World world = getWorld();
        if(isAlive()){
            PlayerEntity getPlayer = world.getClosestPlayer(getBlockPos().getX(), getBlockPos().getY(), getBlockPos().getZ(), 2, EntityPredicates.VALID_ENTITY);
            if(getPlayer instanceof ServerPlayerEntity player) {
                player.getStatHandler().setStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_COST), (30*player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS))+1));
                player.getStatHandler().setStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_TOTAL), player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_COST))-player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_DISCOUNT)));
                if(!player.hasStatusEffect(CustomEffects.NORMIE) && player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==0){
                    player.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE, 20));
                }
                if(!player.hasStatusEffect(CustomEffects.NECROMANCER) && player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==1){
                    player.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE, 20));
                }
                if(!player.hasStatusEffect(CustomEffects.SORCERER) && player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==2){
                    player.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE, 20));
                }
                if (!player.hasStatusEffect(CustomEffects.NECROMANCER)){
                    if(player.getWorld().getBiome(player.getBlockPos()).isIn(ModBiomeTags.IS_BASALT_DELTAS)) {++t;}
                    else {t = 0;}if (t>600 && t % 200 == 0) {player.addStatusEffect(new StatusEffectInstance(CustomEffects.ASH_LUNG, 600));}
                }
                if(!player.isCreative() && !player.isSpectator() && player.getHealth()==player.getMaxHealth() && !player.hasStatusEffect(CustomEffects.NECROMANCER)){
                    Multimap<EntityAttribute, EntityAttributeModifier> subtractive_health;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> subtractive_builder = ImmutableMultimap.builder(); subtractive_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", -4, EntityAttributeModifier.Operation.ADDITION));subtractive_health = subtractive_builder.build();
                    if(player.getMaxHealth()+(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS))-player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NUMBER_OF_BLESSINGS)))*4 > 20){
                        player.heal(-4);player.getAttributes().addTemporaryModifiers(subtractive_health);}
                }
                AtomicInteger y = new AtomicInteger();
                player.getWorld().getServer().getAdvancementLoader().getAdvancements().forEach((advancement -> {if(player.getAdvancementTracker().getProgress(advancement).isDone()) {y.getAndIncrement();}}));
                player.getStatHandler().setStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.SEASON_SCORE), ((player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.PLAY_TIME))/(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS))+1))*((y.get()/15)+1))/20);
            }
        }
        super.move(movementType, movement);
    }

}
            /*
            if(player instanceof ServerPlayerEntity serverPlayer && !player.isCreative() && !player.isSpectator()){
                Multimap<EntityAttribute, EntityAttributeModifier> subtractive_health;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> subtractive_builder = ImmutableMultimap.builder(); subtractive_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH)), EntityAttributeModifier.Operation.ADDITION));subtractive_health = subtractive_builder.build();
                if(player.getMaxHealth() == 20 && player.getMaxHealth() != 20 + serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH))){
                    player.heal(serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH)));
                    player.getAttributes().addTemporaryModifiers(subtractive_health);
                } else if (player.getMaxHealth() != 20 + serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH))){
                    player.heal(-4);
                    player.getAttributes().addTemporaryModifiers(subtractive_health);}
                }
             */