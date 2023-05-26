/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1676
 *  net.minecraft.class_1750
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2237
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2341
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_2383
 *  net.minecraft.class_2464
 *  net.minecraft.class_2586
 *  net.minecraft.class_259
 *  net.minecraft.class_2591
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2746
 *  net.minecraft.class_2753
 *  net.minecraft.class_2754
 *  net.minecraft.class_2769
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3468
 *  net.minecraft.class_3619
 *  net.minecraft.class_3726
 *  net.minecraft.class_3867
 *  net.minecraft.class_3965
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5558
 *  net.minecraft.class_5712
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.entity;

import net.minecraft.class_10;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2237;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2341;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2464;
import net.minecraft.class_2586;
import net.minecraft.class_259;
import net.minecraft.class_2591;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3619;
import net.minecraft.class_3726;
import net.minecraft.class_3867;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5558;
import net.minecraft.class_5712;
import net.romeosnowblitz.hmh2.block.entity.ModBellBlockEntity;
import net.romeosnowblitz.hmh2.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class ModBellBlock
extends class_2237 {
    public static final class_2753 FACING = class_2383.field_11177;
    public static final class_2754<class_3867> ATTACHMENT = class_2741.field_17104;
    public static final class_2746 POWERED = class_2741.field_12484;
    private static final class_265 NORTH_SOUTH_SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)4.0, (double)16.0, (double)16.0, (double)12.0);
    private static final class_265 EAST_WEST_SHAPE = class_2248.method_9541((double)4.0, (double)0.0, (double)0.0, (double)12.0, (double)16.0, (double)16.0);
    private static final class_265 BELL_WAIST_SHAPE = class_2248.method_9541((double)5.0, (double)6.0, (double)5.0, (double)11.0, (double)13.0, (double)11.0);
    private static final class_265 BELL_LIP_SHAPE = class_2248.method_9541((double)4.0, (double)4.0, (double)4.0, (double)12.0, (double)6.0, (double)12.0);
    private static final class_265 BELL_SHAPE = class_259.method_1084((class_265)BELL_LIP_SHAPE, (class_265)BELL_WAIST_SHAPE);
    private static final class_265 NORTH_SOUTH_WALLS_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)7.0, (double)13.0, (double)0.0, (double)9.0, (double)15.0, (double)16.0));
    private static final class_265 EAST_WEST_WALLS_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)0.0, (double)13.0, (double)7.0, (double)16.0, (double)15.0, (double)9.0));
    private static final class_265 WEST_WALL_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)0.0, (double)13.0, (double)7.0, (double)13.0, (double)15.0, (double)9.0));
    private static final class_265 EAST_WALL_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)3.0, (double)13.0, (double)7.0, (double)16.0, (double)15.0, (double)9.0));
    private static final class_265 NORTH_WALL_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)7.0, (double)13.0, (double)0.0, (double)9.0, (double)15.0, (double)13.0));
    private static final class_265 SOUTH_WALL_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)7.0, (double)13.0, (double)3.0, (double)9.0, (double)15.0, (double)16.0));
    private static final class_265 HANGING_SHAPE = class_259.method_1084((class_265)BELL_SHAPE, (class_265)class_2248.method_9541((double)7.0, (double)13.0, (double)7.0, (double)9.0, (double)16.0, (double)9.0));
    public static final int field_31014 = 1;

    public ModBellBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)FACING, (Comparable)class_2350.field_11043)).method_11657(ATTACHMENT, (Comparable)class_3867.field_17098)).method_11657((class_2769)POWERED, (Comparable)Boolean.valueOf(false)));
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 sourceBlock, class_2338 sourcePos, boolean notify) {
        boolean bl = world.method_8479(pos);
        if (bl != (Boolean)state.method_11654((class_2769)POWERED)) {
            if (bl) {
                this.ring(world, pos, null);
            }
            world.method_8652(pos, (class_2680)state.method_11657((class_2769)POWERED, (Comparable)Boolean.valueOf(bl)), 3);
        }
    }

    public void method_19286(class_1937 world, class_2680 state, class_3965 hit, class_1676 projectile) {
        class_1297 entity = projectile.method_24921();
        class_1657 playerEntity = entity instanceof class_1657 ? (class_1657)entity : null;
        this.ring(world, state, hit, playerEntity, true);
    }

    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
        return this.ring(world, state, hit, player, true) ? class_1269.method_29236((boolean)world.field_9236) : class_1269.field_5811;
    }

    public boolean ring(class_1937 world, class_2680 state, class_3965 hitResult, @Nullable class_1657 player, boolean checkHitPos) {
        boolean bl;
        class_2350 direction = hitResult.method_17780();
        class_2338 blockPos = hitResult.method_17777();
        boolean bl2 = bl = !checkHitPos || this.isPointOnBell(state, direction, hitResult.method_17784().field_1351 - (double)blockPos.method_10264());
        if (bl) {
            boolean bl22 = this.ring((class_1297)player, world, blockPos, direction);
            if (bl22 && player != null) {
                player.method_7281(class_3468.field_19255);
            }
            return true;
        }
        return false;
    }

    private boolean isPointOnBell(class_2680 state, class_2350 side, double y) {
        if (side.method_10166() != class_2350.class_2351.field_11052 && !(y > (double)0.8124f)) {
            class_2350 direction = (class_2350)state.method_11654((class_2769)FACING);
            class_3867 attachment = (class_3867)state.method_11654(ATTACHMENT);
            switch (attachment) {
                case field_17098: {
                    return direction.method_10166() == side.method_10166();
                }
                case field_17100: 
                case field_17101: {
                    return direction.method_10166() != side.method_10166();
                }
                case field_17099: {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean ring(class_1937 world, class_2338 pos, @Nullable class_2350 direction) {
        return this.ring(null, world, pos, direction);
    }

    public boolean ring(@Nullable class_1297 entity, class_1937 world, class_2338 pos, @Nullable class_2350 direction) {
        class_2586 blockEntity = world.method_8321(pos);
        if (!world.field_9236 && blockEntity instanceof ModBellBlockEntity) {
            if (direction == null) {
                direction = (class_2350)world.method_8320(pos).method_11654((class_2769)FACING);
            }
            ((ModBellBlockEntity)blockEntity).activate(direction);
            world.method_8396((class_1657)null, pos, class_3417.field_17265, class_3419.field_15245, 2.0f, 1.0f);
            world.method_33596(entity, class_5712.field_28733, pos);
            return true;
        }
        return false;
    }

    private class_265 getShape(class_2680 state) {
        class_2350 direction = (class_2350)state.method_11654((class_2769)FACING);
        class_3867 attachment = (class_3867)state.method_11654(ATTACHMENT);
        if (attachment == class_3867.field_17098) {
            return direction != class_2350.field_11043 && direction != class_2350.field_11035 ? EAST_WEST_SHAPE : NORTH_SOUTH_SHAPE;
        }
        if (attachment == class_3867.field_17099) {
            return HANGING_SHAPE;
        }
        if (attachment == class_3867.field_17101) {
            return direction != class_2350.field_11043 && direction != class_2350.field_11035 ? EAST_WEST_WALLS_SHAPE : NORTH_SOUTH_WALLS_SHAPE;
        }
        if (direction == class_2350.field_11043) {
            return NORTH_WALL_SHAPE;
        }
        if (direction == class_2350.field_11035) {
            return SOUTH_WALL_SHAPE;
        }
        return direction == class_2350.field_11034 ? EAST_WALL_SHAPE : WEST_WALL_SHAPE;
    }

    public class_265 method_9549(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return this.getShape(state);
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return this.getShape(state);
    }

    public class_2464 method_9604(class_2680 state) {
        return class_2464.field_11458;
    }

    @Nullable
    public class_2680 method_9605(class_1750 ctx) {
        class_2350 direction = ctx.method_8038();
        class_2338 blockPos = ctx.method_8037();
        class_1937 world = ctx.method_8045();
        class_2350.class_2351 axis = direction.method_10166();
        if (axis == class_2350.class_2351.field_11052) {
            class_2680 blockState = (class_2680)((class_2680)this.method_9564().method_11657(ATTACHMENT, (Comparable)(direction == class_2350.field_11033 ? class_3867.field_17099 : class_3867.field_17098))).method_11657((class_2769)FACING, (Comparable)ctx.method_8042());
            if (blockState.method_26184((class_4538)ctx.method_8045(), blockPos)) {
                return blockState;
            }
        } else {
            boolean bl = axis == class_2350.class_2351.field_11048 && world.method_8320(blockPos.method_10067()).method_26206((class_1922)world, blockPos.method_10067(), class_2350.field_11034) && world.method_8320(blockPos.method_10078()).method_26206((class_1922)world, blockPos.method_10078(), class_2350.field_11039) || axis == class_2350.class_2351.field_11051 && world.method_8320(blockPos.method_10095()).method_26206((class_1922)world, blockPos.method_10095(), class_2350.field_11035) && world.method_8320(blockPos.method_10072()).method_26206((class_1922)world, blockPos.method_10072(), class_2350.field_11043);
            class_2680 blockState = (class_2680)((class_2680)this.method_9564().method_11657((class_2769)FACING, (Comparable)direction.method_10153())).method_11657(ATTACHMENT, (Comparable)(bl ? class_3867.field_17101 : class_3867.field_17100));
            if (blockState.method_26184((class_4538)ctx.method_8045(), ctx.method_8037())) {
                return blockState;
            }
            boolean bl2 = world.method_8320(blockPos.method_10074()).method_26206((class_1922)world, blockPos.method_10074(), class_2350.field_11036);
            if ((blockState = (class_2680)blockState.method_11657(ATTACHMENT, (Comparable)(bl2 ? class_3867.field_17098 : class_3867.field_17099))).method_26184((class_4538)ctx.method_8045(), ctx.method_8037())) {
                return blockState;
            }
        }
        return null;
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        class_3867 attachment = (class_3867)state.method_11654(ATTACHMENT);
        class_2350 direction2 = ModBellBlock.getPlacementSide(state).method_10153();
        if (direction2 == direction && !state.method_26184((class_4538)world, pos) && attachment != class_3867.field_17101) {
            return class_2246.field_10124.method_9564();
        }
        if (direction.method_10166() == ((class_2350)state.method_11654((class_2769)FACING)).method_10166()) {
            if (attachment == class_3867.field_17101 && !neighborState.method_26206((class_1922)world, neighborPos, direction)) {
                return (class_2680)((class_2680)state.method_11657(ATTACHMENT, (Comparable)class_3867.field_17100)).method_11657((class_2769)FACING, (Comparable)direction.method_10153());
            }
            if (attachment == class_3867.field_17100 && direction2.method_10153() == direction && neighborState.method_26206((class_1922)world, neighborPos, (class_2350)state.method_11654((class_2769)FACING))) {
                return (class_2680)state.method_11657(ATTACHMENT, (Comparable)class_3867.field_17101);
            }
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
        class_2350 direction = ModBellBlock.getPlacementSide(state).method_10153();
        return direction == class_2350.field_11036 ? class_2248.method_20044((class_4538)world, (class_2338)pos.method_10084(), (class_2350)class_2350.field_11033) : class_2341.method_20046((class_4538)world, (class_2338)pos, (class_2350)direction);
    }

    private static class_2350 getPlacementSide(class_2680 state) {
        switch ((class_3867)state.method_11654(ATTACHMENT)) {
            case field_17098: {
                return class_2350.field_11036;
            }
            case field_17099: {
                return class_2350.field_11033;
            }
        }
        return ((class_2350)state.method_11654((class_2769)FACING)).method_10153();
    }

    public class_3619 method_9527(class_2680 state) {
        return class_3619.field_15971;
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{FACING, ATTACHMENT, POWERED});
    }

    @Nullable
    public class_2586 method_10123(class_2338 pos, class_2680 state) {
        return new ModBellBlockEntity(pos, state);
    }

    @Nullable
    public <T extends class_2586> class_5558<T> method_31645(class_1937 world, class_2680 state, class_2591<T> type) {
        return ModBellBlock.method_31618(type, ModBlockEntities.MOD_BELL, (class_5558)(world.field_9236 ? ModBellBlockEntity::clientTick : ModBellBlockEntity::serverTick));
    }

    public boolean method_9516(class_2680 state, class_1922 world, class_2338 pos, class_10 type) {
        return false;
    }
}

