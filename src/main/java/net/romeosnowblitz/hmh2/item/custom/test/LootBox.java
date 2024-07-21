package net.romeosnowblitz.hmh2.item.custom.test;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.keys.ModNetworking;
import net.romeosnowblitz.hmh2.keys.packet.ServerEventPacket;
import net.romeosnowblitz.hmh2.keys.packet.WorldEventPacket;

public class LootBox extends Item {
    public LootBox(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(world instanceof ServerWorld serverWorld){
            for (ItemStack itemStack : world.getServer().getLootManager().getLootTable(LootTables.FISHING_GAMEPLAY)
                    .generateLoot(new LootContextParameterSet.Builder(serverWorld).build(LootContextTypes.EMPTY))) {
                world.spawnEntity(new ItemEntity(world, user.getX(), user.getY(), user.getZ(), itemStack));}}
        return super.use(world, user, hand);
    }

}
