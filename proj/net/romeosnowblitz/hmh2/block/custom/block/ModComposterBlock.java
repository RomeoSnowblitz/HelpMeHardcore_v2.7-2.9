/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2FloatMap
 *  it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap
 *  net.minecraft.class_10
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1277
 *  net.minecraft.class_1278
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_156
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_247
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3468
 *  net.minecraft.class_3726
 *  net.minecraft.class_3954
 *  net.minecraft.class_3965
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import net.minecraft.class_10;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1277;
import net.minecraft.class_1278;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_156;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_247;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3726;
import net.minecraft.class_3954;
import net.minecraft.class_3965;
import net.minecraft.class_4970;
import net.minecraft.class_5819;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import org.jetbrains.annotations.Nullable;

public class ModComposterBlock
extends class_2248
implements class_3954 {
    public static final int MAX_LEVEL = 8;
    public static final int field_31072 = 0;
    public static final int field_31073 = 7;
    public static final class_2758 LEVEL = class_2741.field_17586;
    public static final Object2FloatMap<class_1935> ITEM_TO_LEVEL_INCREASE_CHANCE = new Object2FloatOpenHashMap();
    private static final int field_31074 = 2;
    private static final class_265 RAYCAST_SHAPE = class_259.method_1077();
    private static final class_265[] LEVEL_TO_COLLISION_SHAPE = (class_265[])class_156.method_654((Object)new class_265[9], shapes -> {
        for (int i = 0; i < 8; ++i) {
            shapes[i] = class_259.method_1072((class_265)RAYCAST_SHAPE, (class_265)class_2248.method_9541((double)2.0, (double)Math.max(2, 1 + i * 2), (double)2.0, (double)14.0, (double)16.0, (double)14.0), (class_247)class_247.field_16886);
        }
        shapes[8] = shapes[7];
    });

    public static void registerDefaultCompostableItems() {
        ITEM_TO_LEVEL_INCREASE_CHANCE.defaultReturnValue(-1.0f);
        float f = 0.3f;
        float g = 0.5f;
        float h = 0.65f;
        float i = 0.85f;
        float j = 1.0f;
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.BURNT_EGGSHELL);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.BURNT_TOAST);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.HOOF_POWDER);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.CHEESE_SLICE);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.RENNET);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.FLOUR);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModItems.BUTTER);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.BANANA_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.CHERRY_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.CORK_OAK_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.JACARANDA_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.MAHOE_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.MANGO_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.WILLOW_SAPLING);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.BANANA_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.CHERRY_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.CORK_OAK_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.JACARANDA_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.MAHOE_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.MANGO_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)WoodworkBlocks.WILLOW_LEAVES);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17506);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17503);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17504);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17508);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17507);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17505);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_28648);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_37511);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17535);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17536);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17537);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17538);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17539);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17540);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_37508);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8309);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8551);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8602);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)ModBlocks.POISON_GRASS);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_17532);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8188);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8706);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8158);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_16998);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_28659);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_8317);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_28653);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_28658);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_28656);
        ModComposterBlock.registerCompostableItem(0.3f, (class_1935)class_1802.field_37513);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)ModItems.BANANA_PEEL);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)ModItems.BANANA_PEEL);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)ModItems.SLICED_BREAD);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)ModItems.LIGHT_TOAST);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_17533);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_8256);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_28649);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_17520);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_17531);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_17523);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_21991);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_21992);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_23070);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_8497);
        ModComposterBlock.registerCompostableItem(0.5f, (class_1935)class_1802.field_28409);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.CORK);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.BANANAS);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.BLUEBERRIES);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.CHEESE);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.CHERRIES);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.CONE);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.TOAST);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.MANGO);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.ORANGE);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModItems.STRAWBERRIES);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModBlocks.BLUE_SPIDER_LILY);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModBlocks.ROSE);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)ModBlocks.WOLFSBANE);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17498);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17524);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17518);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17519);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17522);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8279);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8186);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8179);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8116);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8567);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8861);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17516);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17517);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17521);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_21987);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_21988);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8790);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_21989);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_21990);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_22017);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8491);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8880);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17499);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17500);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17501);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17502);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17509);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17510);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17511);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17512);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17513);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17514);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17515);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8471);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17525);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17526);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17527);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_17529);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_8561);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_28652);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_28650);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_28654);
        ModComposterBlock.registerCompostableItem(0.65f, (class_1935)class_1802.field_28657);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)ModItems.CHOCOLATE_ICE_CREAM);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)ModItems.BLUEBERRY_JAM);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)ModItems.STRAWBERRY_JAM);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)ModItems.BUTTERED_TOAST);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_17528);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_8506);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_8682);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_8182);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_22008);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_28651);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_8229);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_8512);
        ModComposterBlock.registerCompostableItem(0.85f, (class_1935)class_1802.field_8423);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)WarfareItems.BANANA_HELMET);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)WarfareItems.BANANA_CHESTPLATE);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)WarfareItems.BANANA_LEGGINGS);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)WarfareItems.BANANA_BOOTS);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)WarfareItems.BANANA_HORSE_ARMOR);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)WarfareItems.BANANA_PICKAXE);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)ModBlocks.PEAT);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)ModBlocks.CORK_BLOCK);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)ModBlocks.BAMBOO_BLOCK);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)class_1802.field_17534);
        ModComposterBlock.registerCompostableItem(1.0f, (class_1935)class_1802.field_8741);
    }

    private static void registerCompostableItem(float levelIncreaseChance, class_1935 item) {
        ITEM_TO_LEVEL_INCREASE_CHANCE.put((Object)item.method_8389(), levelIncreaseChance);
    }

    public ModComposterBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)LEVEL, (Comparable)Integer.valueOf(0)));
    }

    public static void playEffects(class_1937 world, class_2338 pos, boolean fill) {
        class_2680 blockState = world.method_8320(pos);
        world.method_45446(pos, fill ? class_3417.field_17608 : class_3417.field_17607, class_3419.field_15245, 1.0f, 1.0f, false);
        double d = blockState.method_26218((class_1922)world, pos).method_1102(class_2350.class_2351.field_11052, 0.5, 0.5) + 0.03125;
        double e = 0.13125f;
        double f = 0.7375f;
        class_5819 random = world.method_8409();
        for (int i = 0; i < 10; ++i) {
            double g = random.method_43059() * 0.02;
            double h = random.method_43059() * 0.02;
            double j = random.method_43059() * 0.02;
            world.method_8406((class_2394)class_2398.field_17741, (double)pos.method_10263() + (double)0.13125f + (double)0.7375f * (double)random.method_43057(), (double)pos.method_10264() + d + (double)random.method_43057() * (1.0 - d), (double)pos.method_10260() + (double)0.13125f + (double)0.7375f * (double)random.method_43057(), g, h, j);
        }
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return LEVEL_TO_COLLISION_SHAPE[(Integer)state.method_11654((class_2769)LEVEL)];
    }

    public class_265 method_9584(class_2680 state, class_1922 world, class_2338 pos) {
        return RAYCAST_SHAPE;
    }

    public class_265 method_9549(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return LEVEL_TO_COLLISION_SHAPE[0];
    }

    public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean notify) {
        if ((Integer)state.method_11654((class_2769)LEVEL) == 7) {
            world.method_39279(pos, state.method_26204(), 20);
        }
    }

    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
        int i = (Integer)state.method_11654((class_2769)LEVEL);
        class_1799 itemStack = player.method_5998(hand);
        if (i < 8 && ITEM_TO_LEVEL_INCREASE_CHANCE.containsKey((Object)itemStack.method_7909())) {
            if (i < 7 && !world.field_9236) {
                class_2680 blockState = ModComposterBlock.addToModComposter(state, (class_1936)world, pos, itemStack);
                world.method_20290(1500, pos, state != blockState ? 1 : 0);
                player.method_7259(class_3468.field_15372.method_14956((Object)itemStack.method_7909()));
                if (!player.method_31549().field_7477) {
                    itemStack.method_7934(1);
                }
            }
            return class_1269.method_29236((boolean)world.field_9236);
        }
        if (i == 8) {
            ModComposterBlock.emptyFullModComposter(state, world, pos);
            return class_1269.method_29236((boolean)world.field_9236);
        }
        return class_1269.field_5811;
    }

    public static class_2680 compost(class_2680 state, class_3218 world, class_1799 stack, class_2338 pos) {
        int i = (Integer)state.method_11654((class_2769)LEVEL);
        if (i < 7 && ITEM_TO_LEVEL_INCREASE_CHANCE.containsKey((Object)stack.method_7909())) {
            class_2680 blockState = ModComposterBlock.addToModComposter(state, (class_1936)world, pos, stack);
            stack.method_7934(1);
            return blockState;
        }
        return state;
    }

    public static class_2680 emptyFullModComposter(class_2680 state, class_1937 world, class_2338 pos) {
        if (!world.field_9236) {
            float f = 0.7f;
            double d = (double)(world.field_9229.method_43057() * 0.7f) + (double)0.15f;
            double e = (double)(world.field_9229.method_43057() * 0.7f) + 0.06000000238418579 + 0.6;
            double g = (double)(world.field_9229.method_43057() * 0.7f) + (double)0.15f;
            class_1542 itemEntity = new class_1542(world, (double)pos.method_10263() + d, (double)pos.method_10264() + e, (double)pos.method_10260() + g, new class_1799((class_1935)class_1802.field_8324));
            itemEntity.method_6988();
            world.method_8649((class_1297)itemEntity);
        }
        class_2680 blockState = ModComposterBlock.emptyModComposter(state, (class_1936)world, pos);
        world.method_8396((class_1657)null, pos, class_3417.field_17606, class_3419.field_15245, 1.0f, 1.0f);
        return blockState;
    }

    static class_2680 emptyModComposter(class_2680 state, class_1936 world, class_2338 pos) {
        class_2680 blockState = (class_2680)state.method_11657((class_2769)LEVEL, (Comparable)Integer.valueOf(0));
        world.method_8652(pos, blockState, 3);
        return blockState;
    }

    static class_2680 addToModComposter(class_2680 state, class_1936 world, class_2338 pos, class_1799 item) {
        int i = (Integer)state.method_11654((class_2769)LEVEL);
        float f = ITEM_TO_LEVEL_INCREASE_CHANCE.getFloat((Object)item.method_7909());
        if (!(i == 0 && f > 0.0f || world.method_8409().method_43058() < (double)f)) {
            return state;
        }
        int j = i + 1;
        class_2680 blockState = (class_2680)state.method_11657((class_2769)LEVEL, (Comparable)Integer.valueOf(j));
        world.method_8652(pos, blockState, 3);
        if (j == 7) {
            world.method_39279(pos, state.method_26204(), 20);
        }
        return blockState;
    }

    public void method_9588(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        if ((Integer)state.method_11654((class_2769)LEVEL) == 7) {
            world.method_8652(pos, (class_2680)state.method_28493((class_2769)LEVEL), 3);
            world.method_8396((class_1657)null, pos, class_3417.field_17609, class_3419.field_15245, 1.0f, 1.0f);
        }
    }

    public boolean method_9498(class_2680 state) {
        return true;
    }

    public int method_9572(class_2680 state, class_1937 world, class_2338 pos) {
        return (Integer)state.method_11654((class_2769)LEVEL);
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{LEVEL});
    }

    public boolean method_9516(class_2680 state, class_1922 world, class_2338 pos, class_10 type) {
        return false;
    }

    public class_1278 method_17680(class_2680 state, class_1936 world, class_2338 pos) {
        int i = (Integer)state.method_11654((class_2769)LEVEL);
        if (i == 8) {
            return new FullModComposterInventory(state, world, pos, new class_1799((class_1935)class_1802.field_8324));
        }
        return (class_1278)(i < 7 ? new ModComposterInventory(state, world, pos) : new DummyInventory());
    }

    static class FullModComposterInventory
    extends class_1277
    implements class_1278 {
        private final class_2680 state;
        private final class_1936 world;
        private final class_2338 pos;
        private boolean dirty;

        public FullModComposterInventory(class_2680 state, class_1936 world, class_2338 pos, class_1799 outputItem) {
            super(new class_1799[]{outputItem});
            this.state = state;
            this.world = world;
            this.pos = pos;
        }

        public int method_5444() {
            return 1;
        }

        public int[] method_5494(class_2350 side) {
            int[] nArray;
            if (side == class_2350.field_11033) {
                int[] nArray2 = new int[1];
                nArray = nArray2;
                nArray2[0] = 0;
            } else {
                nArray = new int[]{};
            }
            return nArray;
        }

        public boolean method_5492(int slot, class_1799 stack, @Nullable class_2350 dir) {
            return false;
        }

        public boolean method_5493(int slot, class_1799 stack, class_2350 dir) {
            return !this.dirty && dir == class_2350.field_11033 && stack.method_31574(class_1802.field_8324);
        }

        public void method_5431() {
            ModComposterBlock.emptyModComposter(this.state, this.world, this.pos);
            this.dirty = true;
        }
    }

    static class ModComposterInventory
    extends class_1277
    implements class_1278 {
        private final class_2680 state;
        private final class_1936 world;
        private final class_2338 pos;
        private boolean dirty;

        public ModComposterInventory(class_2680 state, class_1936 world, class_2338 pos) {
            super(1);
            this.state = state;
            this.world = world;
            this.pos = pos;
        }

        public int method_5444() {
            return 1;
        }

        public int[] method_5494(class_2350 side) {
            int[] nArray;
            if (side == class_2350.field_11036) {
                int[] nArray2 = new int[1];
                nArray = nArray2;
                nArray2[0] = 0;
            } else {
                nArray = new int[]{};
            }
            return nArray;
        }

        public boolean method_5492(int slot, class_1799 stack, @Nullable class_2350 dir) {
            return !this.dirty && dir == class_2350.field_11036 && ITEM_TO_LEVEL_INCREASE_CHANCE.containsKey((Object)stack.method_7909());
        }

        public boolean method_5493(int slot, class_1799 stack, class_2350 dir) {
            return false;
        }

        public void method_5431() {
            class_1799 itemStack = this.method_5438(0);
            if (!itemStack.method_7960()) {
                this.dirty = true;
                class_2680 blockState = ModComposterBlock.addToModComposter(this.state, this.world, this.pos, itemStack);
                this.world.method_20290(1500, this.pos, blockState != this.state ? 1 : 0);
                this.method_5441(0);
            }
        }
    }

    static class DummyInventory
    extends class_1277
    implements class_1278 {
        public DummyInventory() {
            super(0);
        }

        public int[] method_5494(class_2350 side) {
            return new int[0];
        }

        public boolean method_5492(int slot, class_1799 stack, @Nullable class_2350 dir) {
            return false;
        }

        public boolean method_5493(int slot, class_1799 stack, class_2350 dir) {
            return false;
        }
    }
}

