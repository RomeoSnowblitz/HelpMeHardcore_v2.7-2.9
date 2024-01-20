package net.romeosnowblitz.hmh2.item.custom.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.tag.ModItemTags;

public class VoidHealthArmorItem extends ArmorItem {
    public VoidHealthArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }
    public static int t = 0;

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity player) {
            LivingEntity attackingEntity = player.getLastAttacker();
            if (numberOfArmorPieces(player)>0 && attackingEntity != null && attackingEntity != player) {t++;
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.UNDERGROUND_SIGHT_ITEM)) {
                    armorStrengthHeal(player, 4);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.NETHER_SIGHT_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.UNDERGROUND_CHARISMA_ITEM)) {
                    armorStrengthHeal(player, 3);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.VOID_SIGHT_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.NETHER_CHARISMA_ITEM) ||
                attackingEntity.getMainHandStack().isIn(ModItemTags.UNDERGROUND_HEALTH_ITEM)) {
                    armorStrengthHeal(player, 2);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.AQUATIC_SIGHT_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.VOID_CHARISMA_ITEM) ||
                        attackingEntity.getMainHandStack().isIn(ModItemTags.NETHER_HEALTH_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.UNDERGROUND_MOVEMENT_ITEM)) {
                    armorStrengthHeal(player, 1);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.ARIAL_CHARISMA_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.AQUATIC_HEALTH_ITEM) ||
                        attackingEntity.getMainHandStack().isIn(ModItemTags.VOID_MOVEMENT_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.NETHER_NOURISHMENT_ITEM)) {
                    armorWeaknessAttack(world, player, 1);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.ARIAL_HEALTH_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.AQUATIC_MOVEMENT_ITEM) ||
                        attackingEntity.getMainHandStack().isIn(ModItemTags.VOID_NOURISHMENT_ITEM)) {
                    armorWeaknessAttack(world, player, 2);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.ARIAL_MOVEMENT_ITEM) || attackingEntity.getMainHandStack().isIn(ModItemTags.AQUATIC_NOURISHMENT_ITEM)) {
                    armorWeaknessAttack(world, player, 3);
                }
                if (attackingEntity.getMainHandStack().isIn(ModItemTags.ARIAL_NOURISHMENT_ITEM)) {
                    armorWeaknessAttack(world, player, 4);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public void armorStrengthHeal(PlayerEntity player, int heal){
        player.sendMessage(Text.literal(String.valueOf(t)).formatted(Formatting.RED));
        if(t*numberOfArmorPieces(player) >= 192){t=0;
            player.heal(heal);
        }
    }

    public void armorWeaknessAttack(World world, PlayerEntity player, int damage) {
        if (player.getLastAttacker() != null) {
            if(player.getEquippedStack(EquipmentSlot.HEAD).isOf(this)){
                player.getEquippedStack(EquipmentSlot.HEAD).damage(numberOfArmorPieces(player), player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.HEAD));}
            if(player.getEquippedStack(EquipmentSlot.CHEST).isOf(this)){
                player.getEquippedStack(EquipmentSlot.CHEST).damage(numberOfArmorPieces(player), player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));}
            if(player.getEquippedStack(EquipmentSlot.LEGS).isOf(this)){
                player.getEquippedStack(EquipmentSlot.LEGS).damage(numberOfArmorPieces(player), player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.LEGS));}
            if(player.getEquippedStack(EquipmentSlot.FEET).isOf(this)){
                player.getEquippedStack(EquipmentSlot.FEET).damage(numberOfArmorPieces(player), player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.FEET));}
        }
        if(numberOfArmorPieces(player)==4){
            player.damage(world.getDamageSources().create(ModDamageTypes.KILLED_BY_ARMOR_WEAKNESS, player), damage*2);
            player.damage(world.getDamageSources().create(ModDamageTypes.KILLED_BY_ARMOR_WEAKNESS, player.getLastAttacker()), damage*2);
        } else {
            player.damage(world.getDamageSources().create(ModDamageTypes.KILLED_BY_ARMOR_WEAKNESS, player), damage*numberOfArmorPieces(player));
        }
    }

    public int numberOfArmorPieces(PlayerEntity player){
        int number = 0;
        if (player.getEquippedStack(EquipmentSlot.HEAD).isIn(ModItemTags.VOID_HEALTH_ARMOR)) {number++;}
        if (player.getEquippedStack(EquipmentSlot.CHEST).isIn(ModItemTags.VOID_HEALTH_ARMOR)) {number++;}
        if (player.getEquippedStack(EquipmentSlot.LEGS).isIn(ModItemTags.VOID_HEALTH_ARMOR)) {number++;}
        if (player.getEquippedStack(EquipmentSlot.FEET).isIn(ModItemTags.VOID_HEALTH_ARMOR)) {number++;}
        return number;
    }




}