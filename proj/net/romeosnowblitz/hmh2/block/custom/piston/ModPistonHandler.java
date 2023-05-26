/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_3619
 */
package net.romeosnowblitz.hmh2.block.custom.piston;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3619;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;

public class ModPistonHandler {
    public static final int MAX_MOVABLE_BLOCKS = 12;
    private final class_1937 world;
    private final class_2338 posFrom;
    private final boolean retracted;
    private final class_2338 posTo;
    private final class_2350 motionDirection;
    private final List<class_2338> movedBlocks = Lists.newArrayList();
    private final List<class_2338> brokenBlocks = Lists.newArrayList();
    private final class_2350 pistonDirection;

    public ModPistonHandler(class_1937 world, class_2338 pos, class_2350 dir, boolean retracted) {
        this.world = world;
        this.posFrom = pos;
        this.pistonDirection = dir;
        this.retracted = retracted;
        if (retracted) {
            this.motionDirection = dir;
            this.posTo = pos.method_10093(dir);
        } else {
            this.motionDirection = dir.method_10153();
            this.posTo = pos.method_10079(dir, 2);
        }
    }

    public boolean calculatePush() {
        this.movedBlocks.clear();
        this.brokenBlocks.clear();
        class_2680 blockState = this.world.method_8320(this.posTo);
        if (!ModPistonBlock.isMovable(blockState, this.world, this.posTo, this.motionDirection, false, this.pistonDirection)) {
            if (this.retracted && blockState.method_26223() == class_3619.field_15971) {
                this.brokenBlocks.add(this.posTo);
                return true;
            }
            return false;
        }
        if (!this.tryMove(this.posTo, this.motionDirection)) {
            return false;
        }
        for (int i = 0; i < this.movedBlocks.size(); ++i) {
            class_2338 blockPos = this.movedBlocks.get(i);
            if (!ModPistonHandler.isBlockSticky(this.world.method_8320(blockPos)) || this.tryMoveAdjacentBlock(blockPos)) continue;
            return false;
        }
        return true;
    }

    private static boolean isBlockSticky(class_2680 state) {
        return state.method_27852(class_2246.field_10030) || state.method_27852(class_2246.field_21211);
    }

    private static boolean isAdjacentBlockStuck(class_2680 state, class_2680 adjacentState) {
        if (state.method_27852(class_2246.field_21211) && adjacentState.method_27852(class_2246.field_10030)) {
            return false;
        }
        if (state.method_27852(class_2246.field_10030) && adjacentState.method_27852(class_2246.field_21211)) {
            return false;
        }
        return ModPistonHandler.isBlockSticky(state) || ModPistonHandler.isBlockSticky(adjacentState);
    }

    private boolean tryMove(class_2338 pos, class_2350 dir) {
        int k;
        class_2680 blockState = this.world.method_8320(pos);
        if (blockState.method_26215()) {
            return true;
        }
        if (!ModPistonBlock.isMovable(blockState, this.world, pos, this.motionDirection, false, dir)) {
            return true;
        }
        if (pos.equals((Object)this.posFrom)) {
            return true;
        }
        if (this.movedBlocks.contains(pos)) {
            return true;
        }
        int i = 1;
        if (i + this.movedBlocks.size() > 12) {
            return false;
        }
        while (ModPistonHandler.isBlockSticky(blockState)) {
            class_2338 blockPos = pos.method_10079(this.motionDirection.method_10153(), i);
            class_2680 blockState2 = blockState;
            blockState = this.world.method_8320(blockPos);
            if (blockState.method_26215() || !ModPistonHandler.isAdjacentBlockStuck(blockState2, blockState) || !ModPistonBlock.isMovable(blockState, this.world, blockPos, this.motionDirection, false, this.motionDirection.method_10153()) || blockPos.equals((Object)this.posFrom)) break;
            if (++i + this.movedBlocks.size() <= 12) continue;
            return false;
        }
        int j = 0;
        for (k = i - 1; k >= 0; --k) {
            this.movedBlocks.add(pos.method_10079(this.motionDirection.method_10153(), k));
            ++j;
        }
        k = 1;
        while (true) {
            class_2338 blockPos2;
            int l;
            if ((l = this.movedBlocks.indexOf(blockPos2 = pos.method_10079(this.motionDirection, k))) > -1) {
                this.setMovedBlocks(j, l);
                for (int m = 0; m <= l + j; ++m) {
                    class_2338 blockPos3 = this.movedBlocks.get(m);
                    if (!ModPistonHandler.isBlockSticky(this.world.method_8320(blockPos3)) || this.tryMoveAdjacentBlock(blockPos3)) continue;
                    return false;
                }
                return true;
            }
            blockState = this.world.method_8320(blockPos2);
            if (blockState.method_26215()) {
                return true;
            }
            if (!ModPistonBlock.isMovable(blockState, this.world, blockPos2, this.motionDirection, true, this.motionDirection) || blockPos2.equals((Object)this.posFrom)) {
                return false;
            }
            if (blockState.method_26223() == class_3619.field_15971) {
                this.brokenBlocks.add(blockPos2);
                return true;
            }
            if (this.movedBlocks.size() >= 12) {
                return false;
            }
            this.movedBlocks.add(blockPos2);
            ++j;
            ++k;
        }
    }

    private void setMovedBlocks(int from, int to) {
        ArrayList list = Lists.newArrayList();
        ArrayList list2 = Lists.newArrayList();
        ArrayList list3 = Lists.newArrayList();
        list.addAll(this.movedBlocks.subList(0, to));
        list2.addAll(this.movedBlocks.subList(this.movedBlocks.size() - from, this.movedBlocks.size()));
        list3.addAll(this.movedBlocks.subList(to, this.movedBlocks.size() - from));
        this.movedBlocks.clear();
        this.movedBlocks.addAll(list);
        this.movedBlocks.addAll(list2);
        this.movedBlocks.addAll(list3);
    }

    private boolean tryMoveAdjacentBlock(class_2338 pos) {
        class_2680 blockState = this.world.method_8320(pos);
        for (class_2350 direction : class_2350.values()) {
            class_2338 blockPos;
            class_2680 blockState2;
            if (direction.method_10166() == this.motionDirection.method_10166() || !ModPistonHandler.isAdjacentBlockStuck(blockState2 = this.world.method_8320(blockPos = pos.method_10093(direction)), blockState) || this.tryMove(blockPos, direction)) continue;
            return false;
        }
        return true;
    }

    public class_2350 getMotionDirection() {
        return this.motionDirection;
    }

    public List<class_2338> getMovedBlocks() {
        return this.movedBlocks;
    }

    public List<class_2338> getBrokenBlocks() {
        return this.brokenBlocks;
    }
}

