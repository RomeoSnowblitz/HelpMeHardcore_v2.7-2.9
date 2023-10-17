package net.romeosnowblitz.hmh2.item.custom.test;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.Blocks;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;

import net.minecraft.world.World;


public class PlusOne extends Item {
    public PlusOne(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.setBlockState(user.getBlockPos().down(), Blocks.SLIME_BLOCK.getDefaultState(), 3);
        Multimap<EntityAttribute, EntityAttributeModifier> attributes;
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", 100, EntityAttributeModifier.Operation.ADDITION));
        attributes = builder.build();
        user.getAttributes().addTemporaryModifiers(attributes);
        user.heal(100);
        user.getStackInHand(hand).decrement(1);
        double x = user.getMaxHealth();
        user.sendMessage( Text.literal(String.valueOf(x)));
        return super.use(world, user, hand);
    }
}


