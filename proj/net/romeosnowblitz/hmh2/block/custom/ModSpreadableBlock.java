/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2488
 *  net.minecraft.class_2493
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3486
 *  net.minecraft.class_3558
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 */
package net.romeosnowblitz.hmh2.block.custom;

import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2488;
import net.minecraft.class_2493;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3486;
import net.minecraft.class_3558;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5819;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModSpreadableBlock
extends class_2493 {
    protected ModSpreadableBlock(class_4970.class_2251 settings) {
        super(settings);
    }

    private static boolean canSurvive(class_2680 state, class_4538 world, class_2338 pos) {
        class_2338 blockPosUp = pos.method_10084();
        class_2338 blockPosDown = pos.method_10084();
        class_2338 blockPosNorth = pos.method_10084();
        class_2338 blockPosSouth = pos.method_10084();
        class_2338 blockPosEast = pos.method_10084();
        class_2338 blockPosWest = pos.method_10084();
        class_2680 blockStateUp = world.method_8320(blockPosUp);
        class_2680 blockStateDown = world.method_8320(blockPosDown);
        class_2680 blockStateNorth = world.method_8320(blockPosNorth);
        class_2680 blockStateSouth = world.method_8320(blockPosSouth);
        class_2680 blockStateEast = world.method_8320(blockPosEast);
        class_2680 blockStateWest = world.method_8320(blockPosWest);
        if (blockStateUp.method_27852(class_2246.field_10477) && (Integer)blockStateUp.method_11654((class_2769)class_2488.field_11518) == 1 || blockStateDown.method_27852(class_2246.field_10477) && (Integer)blockStateDown.method_11654((class_2769)class_2488.field_11518) == 1 || blockStateNorth.method_27852(class_2246.field_10477) && (Integer)blockStateNorth.method_11654((class_2769)class_2488.field_11518) == 1 || blockStateNorth.method_27852(class_2246.field_10477) && (Integer)blockStateSouth.method_11654((class_2769)class_2488.field_11518) == 1 || blockStateNorth.method_27852(class_2246.field_10477) && (Integer)blockStateEast.method_11654((class_2769)class_2488.field_11518) == 1 || blockStateNorth.method_27852(class_2246.field_10477) && (Integer)blockStateWest.method_11654((class_2769)class_2488.field_11518) == 1) {
            return true;
        }
        if (blockStateUp.method_26227().method_15761() == 8 || blockStateDown.method_26227().method_15761() == 8 || blockStateNorth.method_26227().method_15761() == 8 || blockStateSouth.method_26227().method_15761() == 8 || blockStateEast.method_26227().method_15761() == 8 || blockStateWest.method_26227().method_15761() == 8) {
            return false;
        }
        int i = class_3558.method_20049((class_1922)world, (class_2680)state, (class_2338)pos, (class_2680)blockStateUp, (class_2338)blockPosUp, (class_2350)class_2350.field_11036, (int)blockStateUp.method_26193((class_1922)world, blockPosUp));
        return i < world.method_8315();
    }

    private static boolean canSpread(class_2680 state, class_4538 world, class_2338 pos) {
        class_2338 blockPosUp = pos.method_10084();
        class_2338 blockPosDown = pos.method_10074();
        class_2338 blockPosNorth = pos.method_10095();
        class_2338 blockPosSouth = pos.method_10072();
        class_2338 blockPosEast = pos.method_10078();
        class_2338 blockPosWest = pos.method_10067();
        return ModSpreadableBlock.canSurvive(state, world, pos) && !world.method_8316(blockPosUp).method_15767(class_3486.field_15517) || !world.method_8316(blockPosDown).method_15767(class_3486.field_15517) || !world.method_8316(blockPosNorth).method_15767(class_3486.field_15517) || !world.method_8316(blockPosSouth).method_15767(class_3486.field_15517) || !world.method_8316(blockPosEast).method_15767(class_3486.field_15517) || !world.method_8316(blockPosWest).method_15767(class_3486.field_15517);
    }

    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        if (!ModSpreadableBlock.canSurvive(state, (class_4538)world, pos)) {
            world.method_8501(pos, ModBlocks.BLOCK_ONE.method_9564());
        } else if (world.method_22339(pos.method_10084()) >= 0) {
            class_2680 blockState = this.method_9564();
            for (int i = 0; i < 4; ++i) {
                class_2338 blockPos = pos.method_10069(random.method_43048(3) - 1, random.method_43048(5) - 3, random.method_43048(3) - 1);
                if (!world.method_8320(blockPos).method_27852(class_2246.field_10219) || !ModSpreadableBlock.canSpread(blockState, (class_4538)world, blockPos)) continue;
                world.method_8501(blockPos, (class_2680)blockState.method_11657((class_2769)field_11522, (Comparable)Boolean.valueOf(world.method_8320(blockPos.method_10084()).method_27852(class_2246.field_10477))));
            }
        }
    }
}

