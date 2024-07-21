package net.romeosnowblitz.hmh2.item.custom.test;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.nbt.NbtOps;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.GlobalPos;
import net.minecraft.world.World;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;

public class BloodCompass extends Item implements Vanishable {

    public BloodCompass(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.hasNbt() && world.isClient()){
            if(!stack.getOrCreateNbt().getString("type").isEmpty()){
                tooltip.add(Text.literal(stack.getOrCreateNbt().getString("type")));
            } else {
                tooltip.add(Text.literal((stack.getOrCreateNbt().getString("type"))));
            }
        }
        super.appendTooltip(stack, world, tooltip, context);
    }


    @Nullable
    public static GlobalPos createVictimPos(World world, NbtCompound nbt) {
        Entity entity = world.getEntityById(Integer.parseInt(nbt.getString("type")));
        if (entity != null && entity.isAlive()) {
            return GlobalPos.create(world.getRegistryKey(), entity.getBlockPos());
        }
        return null;
    }

    @Override
    public void onItemEntityDestroyed(ItemEntity itemEntity) {
        World world = itemEntity.getWorld();
        ItemStack stack = itemEntity.getStack();
        if(stack.getNbt() != null){
            String type = stack.getNbt().getString("type");
            Entity entity = world.getEntityById(Integer.parseInt(type));
            if(entity != null){
                entity.damage(entity.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_BLOOD_WITCH_TAUNT), 1);
            }
        }
        super.onItemEntityDestroyed(itemEntity);
    }

}
