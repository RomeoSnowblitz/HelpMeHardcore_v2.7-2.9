/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  net.minecraft.class_10
 *  net.minecraft.class_1309
 *  net.minecraft.class_1750
 *  net.minecraft.class_1799
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2318
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2415
 *  net.minecraft.class_2470
 *  net.minecraft.class_2586
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2746
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3481
 *  net.minecraft.class_3619
 *  net.minecraft.class_3726
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5712
 *  net.minecraft.class_5712$class_7397
 */
package net.romeosnowblitz.hmh2.block.custom.piston;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_10;
import net.minecraft.class_1309;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2318;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2586;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3481;
import net.minecraft.class_3619;
import net.minecraft.class_3726;
import net.minecraft.class_4970;
import net.minecraft.class_5712;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlockEntity;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonExtensionBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHandler;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonType;

public class ModPistonBlock
extends class_2318 {
    public static final class_2746 EXTENDED = class_2741.field_12552;
    public static final int field_31373 = 0;
    public static final int field_31374 = 1;
    public static final int field_31375 = 2;
    public static final float field_31376 = 4.0f;
    protected static final class_265 EXTENDED_EAST_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)12.0, (double)16.0, (double)16.0);
    protected static final class_265 EXTENDED_WEST_SHAPE = class_2248.method_9541((double)4.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0);
    protected static final class_265 EXTENDED_SOUTH_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)12.0);
    protected static final class_265 EXTENDED_NORTH_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)4.0, (double)16.0, (double)16.0, (double)16.0);
    protected static final class_265 EXTENDED_UP_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)12.0, (double)16.0);
    protected static final class_265 EXTENDED_DOWN_SHAPE = class_2248.method_9541((double)0.0, (double)4.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0);
    private final boolean gluey;

    public ModPistonBlock(boolean gluey, class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)field_10927, (Comparable)class_2350.field_11043)).method_11657((class_2769)EXTENDED, (Comparable)Boolean.valueOf(false)));
        this.gluey = gluey;
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        if (((Boolean)state.method_11654((class_2769)EXTENDED)).booleanValue()) {
            switch ((class_2350)state.method_11654((class_2769)field_10927)) {
                case field_11033: {
                    return EXTENDED_DOWN_SHAPE;
                }
                default: {
                    return EXTENDED_UP_SHAPE;
                }
                case field_11043: {
                    return EXTENDED_NORTH_SHAPE;
                }
                case field_11035: {
                    return EXTENDED_SOUTH_SHAPE;
                }
                case field_11039: {
                    return EXTENDED_WEST_SHAPE;
                }
                case field_11034: 
            }
            return EXTENDED_EAST_SHAPE;
        }
        return class_259.method_1077();
    }

    public void method_9567(class_1937 world, class_2338 pos, class_2680 state, class_1309 placer, class_1799 itemStack) {
        if (!world.field_9236) {
            this.tryMove(world, pos, state);
        }
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 sourceBlock, class_2338 sourcePos, boolean notify) {
        if (!world.field_9236) {
            this.tryMove(world, pos, state);
        }
    }

    public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean notify) {
        if (oldState.method_27852(state.method_26204())) {
            return;
        }
        if (!world.field_9236 && world.method_8321(pos) == null) {
            this.tryMove(world, pos, state);
        }
    }

    public class_2680 method_9605(class_1750 ctx) {
        return (class_2680)((class_2680)this.method_9564().method_11657((class_2769)field_10927, (Comparable)ctx.method_7715().method_10153())).method_11657((class_2769)EXTENDED, (Comparable)Boolean.valueOf(false));
    }

    private void tryMove(class_1937 world, class_2338 pos, class_2680 state) {
        class_2350 direction = (class_2350)state.method_11654((class_2769)field_10927);
        boolean bl = this.shouldExtend(world, pos, direction);
        if (bl && !((Boolean)state.method_11654((class_2769)EXTENDED)).booleanValue()) {
            if (new ModPistonHandler(world, pos, direction, true).calculatePush()) {
                world.method_8427(pos, (class_2248)this, 0, direction.method_10146());
            }
        } else if (!bl && ((Boolean)state.method_11654((class_2769)EXTENDED)).booleanValue()) {
            ModPistonBlockEntity pistonBlockEntity;
            class_2586 blockEntity;
            class_2338 blockPos = pos.method_10079(direction, 2);
            class_2680 blockState = world.method_8320(blockPos);
            int i = 1;
            if (blockState.method_27852(ModBlocks.MOD_MOVING_PISTON) && blockState.method_11654((class_2769)field_10927) == direction && (blockEntity = world.method_8321(blockPos)) instanceof ModPistonBlockEntity && (pistonBlockEntity = (ModPistonBlockEntity)blockEntity).isExtending() && (pistonBlockEntity.getProgress(0.0f) < 0.5f || world.method_8510() == pistonBlockEntity.getSavedWorldTime() || ((class_3218)world).method_14177())) {
                i = 2;
            }
            world.method_8427(pos, (class_2248)this, i, direction.method_10146());
        }
    }

    private boolean shouldExtend(class_1937 world, class_2338 pos, class_2350 pistonFace) {
        for (class_2350 direction : class_2350.values()) {
            if (direction == pistonFace || !world.method_8459(pos.method_10093(direction), direction)) continue;
            return true;
        }
        if (world.method_8459(pos, class_2350.field_11033)) {
            return true;
        }
        class_2338 blockPos = pos.method_10084();
        for (class_2350 direction2 : class_2350.values()) {
            if (direction2 == class_2350.field_11033 || !world.method_8459(blockPos.method_10093(direction2), direction2)) continue;
            return true;
        }
        return false;
    }

    public boolean method_9592(class_2680 state, class_1937 world, class_2338 pos, int type, int data) {
        class_2350 direction = (class_2350)state.method_11654((class_2769)field_10927);
        if (!world.field_9236) {
            boolean bl = this.shouldExtend(world, pos, direction);
            if (bl && (type == 1 || type == 2)) {
                world.method_8652(pos, (class_2680)state.method_11657((class_2769)EXTENDED, (Comparable)Boolean.valueOf(true)), 2);
                return false;
            }
            if (!bl && type == 0) {
                return false;
            }
        }
        if (type == 0) {
            if (!this.move(world, pos, direction, true)) {
                return false;
            }
            world.method_8652(pos, (class_2680)state.method_11657((class_2769)EXTENDED, (Comparable)Boolean.valueOf(true)), 67);
            world.method_8396(null, pos, class_3417.field_15134, class_3419.field_15245, 0.5f, world.field_9229.method_43057() * 0.25f + 0.6f);
            world.method_33596(null, class_5712.field_28147, pos);
            return true;
        }
        if (type != 1 && type != 2) {
            return true;
        }
        class_2586 blockEntity = world.method_8321(pos.method_10093(direction));
        if (blockEntity instanceof ModPistonBlockEntity) {
            ((ModPistonBlockEntity)blockEntity).finish();
        }
        class_2680 blockState = (class_2680)((class_2680)ModBlocks.MOD_MOVING_PISTON.method_9564().method_11657((class_2769)ModPistonExtensionBlock.FACING, (Comparable)direction)).method_11657(ModPistonExtensionBlock.TYPE, (Comparable)((Object)(this.gluey ? ModPistonType.GLUEY : ModPistonType.DEFAULT)));
        world.method_8652(pos, blockState, 20);
        world.method_8438(ModPistonExtensionBlock.createBlockEntityPiston(pos, blockState, (class_2680)this.method_9564().method_11657((class_2769)field_10927, (Comparable)class_2350.method_10143((int)(data & 7))), direction, false, true));
        world.method_8408(pos, blockState.method_26204());
        blockState.method_30101((class_1936)world, pos, 2);
        if (this.gluey) {
            ModPistonBlockEntity pistonBlockEntity;
            class_2586 blockEntity2;
            class_2338 blockPos = pos.method_10069(direction.method_10148() * 2, direction.method_10164() * 2, direction.method_10165() * 2);
            class_2680 blockState2 = world.method_8320(blockPos);
            boolean bl2 = false;
            if (blockState2.method_27852(ModBlocks.MOD_MOVING_PISTON) && (blockEntity2 = world.method_8321(blockPos)) instanceof ModPistonBlockEntity && (pistonBlockEntity = (ModPistonBlockEntity)blockEntity2).getFacing() == direction && pistonBlockEntity.isExtending()) {
                pistonBlockEntity.finish();
                bl2 = true;
            }
            if (!bl2) {
                if (type == 1 && !blockState2.method_26215() && ModPistonBlock.isMovable(blockState2, world, blockPos, direction.method_10153(), false, direction) && (blockState2.method_26223() == class_3619.field_15974 || blockState2.method_27852(class_2246.field_10560) || blockState2.method_27852(class_2246.field_10615) || blockState2.method_27852(ModBlocks.GLUEY_PISTON))) {
                    this.move(world, pos, direction, false);
                } else {
                    world.method_8650(pos.method_10093(direction), false);
                }
            }
        } else {
            world.method_8650(pos.method_10093(direction), false);
        }
        world.method_8396(null, pos, class_3417.field_15228, class_3419.field_15245, 0.5f, world.field_9229.method_43057() * 0.15f + 0.6f);
        world.method_33596(null, class_5712.field_28148, pos);
        return true;
    }

    public static boolean isMovable(class_2680 state, class_1937 world, class_2338 pos, class_2350 direction, boolean canBreak, class_2350 pistonDir) {
        if (pos.method_10264() < world.method_31607() || pos.method_10264() > world.method_31600() - 1 || !world.method_8621().method_11952(pos)) {
            return false;
        }
        if (state.method_26215()) {
            return true;
        }
        if (state.method_27852(class_2246.field_10540) || state.method_27852(class_2246.field_22423) || state.method_27852(class_2246.field_23152) || state.method_27852(class_2246.field_38420) || state.method_27852(class_2246.field_10398)) {
            return true;
        }
        if (direction == class_2350.field_11033 && pos.method_10264() == world.method_31607()) {
            return false;
        }
        if (direction == class_2350.field_11036 && pos.method_10264() == world.method_31600() - 1) {
            return false;
        }
        if (state.method_27852(class_2246.field_10560) || state.method_27852(class_2246.field_10615) || state.method_27852(ModBlocks.GLUEY_PISTON)) {
            if (((Boolean)state.method_11654((class_2769)EXTENDED)).booleanValue()) {
                return false;
            }
        } else {
            if (state.method_26214((class_1922)world, pos) == -1.0f) {
                return false;
            }
            switch (state.method_26223()) {
                case field_15972: {
                    return false;
                }
                case field_15971: {
                    return canBreak;
                }
                case field_15970: {
                    return direction == pistonDir;
                }
            }
        }
        return !state.method_31709();
    }

    private boolean move(class_1937 world, class_2338 pos, class_2350 dir, boolean retract) {
        int l;
        class_2338 blockPos5;
        class_2680 blockState4;
        class_2680 blockState;
        class_2338 blockPos3;
        int k;
        ModPistonHandler pistonHandler;
        class_2338 blockPos = pos.method_10093(dir);
        if (!retract && world.method_8320(blockPos).method_27852(ModBlocks.MOD_PISTON_HEAD)) {
            world.method_8652(blockPos, class_2246.field_10124.method_9564(), 20);
        }
        if (!(pistonHandler = new ModPistonHandler(world, pos, dir, retract)).calculatePush()) {
            return false;
        }
        HashMap map = Maps.newHashMap();
        List<class_2338> list = pistonHandler.getMovedBlocks();
        ArrayList list2 = Lists.newArrayList();
        for (int i = 0; i < list.size(); ++i) {
            class_2338 blockPos2 = list.get(i);
            class_2680 blockState2 = world.method_8320(blockPos2);
            list2.add(blockState2);
            map.put(blockPos2, blockState2);
        }
        List<class_2338> list3 = pistonHandler.getBrokenBlocks();
        class_2680[] blockStates = new class_2680[list.size() + list3.size()];
        class_2350 direction = retract ? dir : dir.method_10153();
        int j = 0;
        for (k = list3.size() - 1; k >= 0; --k) {
            blockPos3 = list3.get(k);
            blockState = world.method_8320(blockPos3);
            class_2586 blockEntity = blockState.method_31709() ? world.method_8321(blockPos3) : null;
            ModPistonBlock.method_9610((class_2680)blockState, (class_1936)world, (class_2338)blockPos3, (class_2586)blockEntity);
            world.method_8652(blockPos3, class_2246.field_10124.method_9564(), 18);
            world.method_43276(class_5712.field_28165, blockPos3, class_5712.class_7397.method_43287((class_2680)blockState));
            if (!blockState.method_26164(class_3481.field_21952)) {
                world.method_31595(blockPos3, blockState);
            }
            blockStates[j++] = blockState;
        }
        for (k = list.size() - 1; k >= 0; --k) {
            blockPos3 = list.get(k);
            blockState = world.method_8320(blockPos3);
            blockPos3 = blockPos3.method_10093(direction);
            map.remove(blockPos3);
            class_2680 blockState3 = (class_2680)ModBlocks.MOD_MOVING_PISTON.method_9564().method_11657((class_2769)field_10927, (Comparable)dir);
            world.method_8652(blockPos3, blockState3, 68);
            world.method_8438(ModPistonExtensionBlock.createBlockEntityPiston(blockPos3, blockState3, (class_2680)list2.get(k), dir, retract, false));
            blockStates[j++] = blockState;
        }
        if (retract) {
            ModPistonType pistonType = this.gluey ? ModPistonType.GLUEY : ModPistonType.DEFAULT;
            blockState4 = (class_2680)((class_2680)ModBlocks.MOD_PISTON_HEAD.method_9564().method_11657((class_2769)ModPistonHeadBlock.field_10927, (Comparable)dir)).method_11657(ModPistonHeadBlock.TYPE, (Comparable)((Object)pistonType));
            class_2680 class_26802 = (class_2680)((class_2680)ModBlocks.MOD_MOVING_PISTON.method_9564().method_11657((class_2769)ModPistonExtensionBlock.FACING, (Comparable)dir)).method_11657(ModPistonExtensionBlock.TYPE, (Comparable)((Object)(this.gluey ? ModPistonType.GLUEY : ModPistonType.DEFAULT)));
            map.remove(blockPos);
            world.method_8652(blockPos, class_26802, 68);
            world.method_8438(ModPistonExtensionBlock.createBlockEntityPiston(blockPos, class_26802, blockState4, dir, true, true));
        }
        class_2680 blockState5 = class_2246.field_10124.method_9564();
        for (class_2338 class_23382 : map.keySet()) {
            world.method_8652(class_23382, blockState5, 82);
        }
        for (Map.Entry entry : map.entrySet()) {
            blockPos5 = (class_2338)entry.getKey();
            class_2680 blockState6 = (class_2680)entry.getValue();
            blockState6.method_30102((class_1936)world, blockPos5, 2);
            blockState5.method_30101((class_1936)world, blockPos5, 2);
            blockState5.method_30102((class_1936)world, blockPos5, 2);
        }
        j = 0;
        for (l = list3.size() - 1; l >= 0; --l) {
            blockState4 = blockStates[j++];
            blockPos5 = list3.get(l);
            blockState4.method_30102((class_1936)world, blockPos5, 2);
            world.method_8452(blockPos5, blockState4.method_26204());
        }
        for (l = list.size() - 1; l >= 0; --l) {
            world.method_8452(list.get(l), blockStates[j++].method_26204());
        }
        if (retract) {
            world.method_8452(blockPos, ModBlocks.MOD_PISTON_HEAD);
        }
        return true;
    }

    public class_2680 method_9598(class_2680 state, class_2470 rotation) {
        return (class_2680)state.method_11657((class_2769)field_10927, (Comparable)rotation.method_10503((class_2350)state.method_11654((class_2769)field_10927)));
    }

    public class_2680 method_9569(class_2680 state, class_2415 mirror) {
        return state.method_26186(mirror.method_10345((class_2350)state.method_11654((class_2769)field_10927)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{field_10927, EXTENDED});
    }

    public boolean method_9526(class_2680 state) {
        return (Boolean)state.method_11654((class_2769)EXTENDED);
    }

    public boolean method_9516(class_2680 state, class_1922 world, class_2338 pos, class_10 type) {
        return false;
    }
}

