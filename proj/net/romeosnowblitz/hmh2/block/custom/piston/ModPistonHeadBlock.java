/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2318
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2415
 *  net.minecraft.class_2470
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2746
 *  net.minecraft.class_2754
 *  net.minecraft.class_2769
 *  net.minecraft.class_3726
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.piston;

import java.util.Arrays;
import net.minecraft.class_10;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2318;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonType;
import net.romeosnowblitz.hmh2.block.custom.piston.ModProperties;

public class ModPistonHeadBlock
extends class_2318 {
    public static final class_2754<ModPistonType> TYPE = ModProperties.PISTON_TYPE;
    public static final class_2746 SHORT = class_2741.field_12535;
    public static final float field_31377 = 4.0f;
    protected static final class_265 EAST_HEAD_SHAPE = class_2248.method_9541((double)12.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0);
    protected static final class_265 WEST_HEAD_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)4.0, (double)16.0, (double)16.0);
    protected static final class_265 SOUTH_HEAD_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)12.0, (double)16.0, (double)16.0, (double)16.0);
    protected static final class_265 NORTH_HEAD_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)4.0);
    protected static final class_265 UP_HEAD_SHAPE = class_2248.method_9541((double)0.0, (double)12.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0);
    protected static final class_265 DOWN_HEAD_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)4.0, (double)16.0);
    protected static final float field_31378 = 2.0f;
    protected static final float field_31379 = 6.0f;
    protected static final float field_31380 = 10.0f;
    protected static final class_265 UP_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)-4.0, (double)6.0, (double)10.0, (double)12.0, (double)10.0);
    protected static final class_265 DOWN_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)4.0, (double)6.0, (double)10.0, (double)20.0, (double)10.0);
    protected static final class_265 SOUTH_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)6.0, (double)-4.0, (double)10.0, (double)10.0, (double)12.0);
    protected static final class_265 NORTH_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)6.0, (double)4.0, (double)10.0, (double)10.0, (double)20.0);
    protected static final class_265 EAST_ARM_SHAPE = class_2248.method_9541((double)-4.0, (double)6.0, (double)6.0, (double)12.0, (double)10.0, (double)10.0);
    protected static final class_265 WEST_ARM_SHAPE = class_2248.method_9541((double)4.0, (double)6.0, (double)6.0, (double)20.0, (double)10.0, (double)10.0);
    protected static final class_265 SHORT_UP_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)0.0, (double)6.0, (double)10.0, (double)12.0, (double)10.0);
    protected static final class_265 SHORT_DOWN_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)4.0, (double)6.0, (double)10.0, (double)16.0, (double)10.0);
    protected static final class_265 SHORT_SOUTH_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)6.0, (double)0.0, (double)10.0, (double)10.0, (double)12.0);
    protected static final class_265 SHORT_NORTH_ARM_SHAPE = class_2248.method_9541((double)6.0, (double)6.0, (double)4.0, (double)10.0, (double)10.0, (double)16.0);
    protected static final class_265 SHORT_EAST_ARM_SHAPE = class_2248.method_9541((double)0.0, (double)6.0, (double)6.0, (double)12.0, (double)10.0, (double)10.0);
    protected static final class_265 SHORT_WEST_ARM_SHAPE = class_2248.method_9541((double)4.0, (double)6.0, (double)6.0, (double)16.0, (double)10.0, (double)10.0);
    private static final class_265[] SHORT_HEAD_SHAPES = ModPistonHeadBlock.getHeadShapes(true);
    private static final class_265[] HEAD_SHAPES = ModPistonHeadBlock.getHeadShapes(false);

    private static class_265[] getHeadShapes(boolean shortHead) {
        return (class_265[])Arrays.stream(class_2350.values()).map(direction -> ModPistonHeadBlock.getHeadShape(direction, shortHead)).toArray(class_265[]::new);
    }

    private static class_265 getHeadShape(class_2350 direction, boolean shortHead) {
        switch (direction) {
            default: {
                return class_259.method_1084((class_265)DOWN_HEAD_SHAPE, (class_265)(shortHead ? SHORT_DOWN_ARM_SHAPE : DOWN_ARM_SHAPE));
            }
            case field_11036: {
                return class_259.method_1084((class_265)UP_HEAD_SHAPE, (class_265)(shortHead ? SHORT_UP_ARM_SHAPE : UP_ARM_SHAPE));
            }
            case field_11043: {
                return class_259.method_1084((class_265)NORTH_HEAD_SHAPE, (class_265)(shortHead ? SHORT_NORTH_ARM_SHAPE : NORTH_ARM_SHAPE));
            }
            case field_11035: {
                return class_259.method_1084((class_265)SOUTH_HEAD_SHAPE, (class_265)(shortHead ? SHORT_SOUTH_ARM_SHAPE : SOUTH_ARM_SHAPE));
            }
            case field_11039: {
                return class_259.method_1084((class_265)WEST_HEAD_SHAPE, (class_265)(shortHead ? SHORT_WEST_ARM_SHAPE : WEST_ARM_SHAPE));
            }
            case field_11034: 
        }
        return class_259.method_1084((class_265)EAST_HEAD_SHAPE, (class_265)(shortHead ? SHORT_EAST_ARM_SHAPE : EAST_ARM_SHAPE));
    }

    public ModPistonHeadBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)field_10927, (Comparable)class_2350.field_11043)).method_11657(TYPE, (Comparable)((Object)ModPistonType.DEFAULT))).method_11657((class_2769)SHORT, (Comparable)Boolean.valueOf(false)));
    }

    public boolean method_9526(class_2680 state) {
        return true;
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return ((Boolean)state.method_11654((class_2769)SHORT) != false ? SHORT_HEAD_SHAPES : HEAD_SHAPES)[((class_2350)state.method_11654((class_2769)field_10927)).ordinal()];
    }

    private boolean isAttached(class_2680 headState, class_2680 pistonState) {
        class_2248 block = headState.method_11654(TYPE) == ModPistonType.DEFAULT ? class_2246.field_10560 : ModBlocks.GLUEY_PISTON;
        return pistonState.method_27852(block) && (Boolean)pistonState.method_11654((class_2769)ModPistonBlock.EXTENDED) != false && pistonState.method_11654((class_2769)field_10927) == headState.method_11654((class_2769)field_10927);
    }

    public void method_9576(class_1937 world, class_2338 pos, class_2680 state, class_1657 player) {
        class_2338 blockPos;
        if (!world.field_9236 && player.method_31549().field_7477 && this.isAttached(state, world.method_8320(blockPos = pos.method_10093(((class_2350)state.method_11654((class_2769)field_10927)).method_10153())))) {
            world.method_22352(blockPos, false);
        }
        super.method_9576(world, pos, state, player);
    }

    public void method_9536(class_2680 state, class_1937 world, class_2338 pos, class_2680 newState, boolean moved) {
        if (state.method_27852(newState.method_26204())) {
            return;
        }
        super.method_9536(state, world, pos, newState, moved);
        class_2338 blockPos = pos.method_10093(((class_2350)state.method_11654((class_2769)field_10927)).method_10153());
        if (this.isAttached(state, world.method_8320(blockPos))) {
            world.method_22352(blockPos, true);
        }
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (direction.method_10153() == state.method_11654((class_2769)field_10927) && !state.method_26184((class_4538)world, pos)) {
            return class_2246.field_10124.method_9564();
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
        class_2680 blockState = world.method_8320(pos.method_10093(((class_2350)state.method_11654((class_2769)field_10927)).method_10153()));
        return this.isAttached(state, blockState) || blockState.method_27852(ModBlocks.MOD_MOVING_PISTON) && blockState.method_11654((class_2769)field_10927) == state.method_11654((class_2769)field_10927);
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 sourceBlock, class_2338 sourcePos, boolean notify) {
        if (state.method_26184((class_4538)world, pos)) {
            world.method_8492(pos.method_10093(((class_2350)state.method_11654((class_2769)field_10927)).method_10153()), sourceBlock, sourcePos);
        }
    }

    public class_1799 method_9574(class_1922 world, class_2338 pos, class_2680 state) {
        return new class_1799((class_1935)(state.method_11654(TYPE) == ModPistonType.GLUEY ? ModBlocks.GLUEY_PISTON : class_2246.field_10560));
    }

    public class_2680 method_9598(class_2680 state, class_2470 rotation) {
        return (class_2680)state.method_11657((class_2769)field_10927, (Comparable)rotation.method_10503((class_2350)state.method_11654((class_2769)field_10927)));
    }

    public class_2680 method_9569(class_2680 state, class_2415 mirror) {
        return state.method_26186(mirror.method_10345((class_2350)state.method_11654((class_2769)field_10927)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{field_10927, TYPE, SHORT});
    }

    public boolean method_9516(class_2680 state, class_1922 world, class_2338 pos, class_10 type) {
        return false;
    }
}

