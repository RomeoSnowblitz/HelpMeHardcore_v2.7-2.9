/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_1959
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2256
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_238
 *  net.minecraft.class_247
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2975
 *  net.minecraft.class_3218
 *  net.minecraft.class_4538
 *  net.minecraft.class_4638
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5281
 *  net.minecraft.class_5819
 *  net.minecraft.class_6796
 *  net.minecraft.class_6819
 *  net.minecraft.class_6880
 *  net.minecraft.class_7924
 */
package net.romeosnowblitz.hmh2.block.custom;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_1959;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2256;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_247;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2975;
import net.minecraft.class_3218;
import net.minecraft.class_4538;
import net.minecraft.class_4638;
import net.minecraft.class_4970;
import net.minecraft.class_5281;
import net.minecraft.class_5819;
import net.minecraft.class_6796;
import net.minecraft.class_6819;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.romeosnowblitz.hmh2.block.custom.ModSpreadableBlock;

public class BlockOne
extends ModSpreadableBlock
implements class_2256 {
    static Random random = new Random();
    static class_2248 y = BlockOne.randomBlocks();

    public BlockOne(class_4970.class_2251 settings) {
        super(settings);
    }

    public boolean method_9651(class_4538 world, class_2338 pos, class_2680 state, boolean isClient) {
        return world.method_8320(pos.method_10084()).method_26215();
    }

    public boolean method_9650(class_1937 world, class_5819 random, class_2338 pos, class_2680 state) {
        return true;
    }

    public void method_9652(class_3218 world, class_5819 random, class_2338 pos, class_2680 state) {
        class_2338 blockPos = pos.method_10084();
        class_2338 blockPos3 = pos.method_10074();
        class_2680 blockState = class_2246.field_10479.method_9564();
        Optional optional = world.method_30349().method_30530(class_7924.field_41245).method_40264(class_6819.field_36173);
        block0: for (int i = 0; i < 128; ++i) {
            class_6880 registryEntry;
            List list;
            class_2680 blockState4;
            int j;
            class_2338 blockPos2 = blockPos;
            class_2338 blockPos4 = blockPos3;
            for (j = 0; j < i / 16; ++j) {
                if (!world.method_8320((blockPos2 = blockPos2.method_10069(random.method_43048(3) - 1, (random.method_43048(3) - 1) * random.method_43048(3) / 2, random.method_43048(3) - 1)).method_10074()).method_27852((class_2248)this) || world.method_8320(blockPos2).method_26234((class_1922)world, blockPos2)) continue block0;
            }
            for (j = 0; j < i / 16; ++j) {
                if (!world.method_8320((blockPos4 = blockPos4.method_10069(random.method_43048(3) - 1, (random.method_43048(3) - 1) * random.method_43048(3) / 2, random.method_43048(3) - 1)).method_10074()).method_27852((class_2248)this) || world.method_8320(blockPos4).method_26234((class_1922)world, blockPos4)) continue block0;
            }
            class_2680 blockState2 = world.method_8320(blockPos2);
            if (blockState2.method_27852(blockState.method_26204()) && random.method_43048(10) == 0) {
                ((class_2256)blockState.method_26204()).method_9652(world, random, blockPos2, blockState2);
            }
            if ((blockState4 = world.method_8320(blockPos4)).method_27852(blockState.method_26204()) && random.method_43048(10) == 0) {
                ((class_2256)blockState.method_26204()).method_9652(world, random, blockPos4, blockState2);
            }
            if (blockState2.method_26215()) {
                if (random.method_43048(8) == 0) {
                    list = ((class_1959)world.method_23753(blockPos2).comp_349()).method_30970().method_30982();
                    if (list.isEmpty()) continue;
                    registryEntry = ((class_4638)((class_2975)list.get(0)).comp_333()).comp_155();
                } else {
                    if (!optional.isPresent()) continue;
                    registryEntry = (class_6880)optional.get();
                }
                ((class_6796)registryEntry.comp_349()).method_39644((class_5281)world, world.method_14178().method_12129(), random, blockPos2);
            }
            if (!blockState4.method_27852(class_2246.field_10340)) continue;
            if (random.method_43048(8) == 0) {
                list = ((class_1959)world.method_23753(blockPos4).comp_349()).method_30970().method_30982();
                if (list.isEmpty()) continue;
                registryEntry = ((class_4638)((class_2975)list.get(0)).comp_333()).comp_155();
            } else {
                if (!optional.isPresent()) continue;
                registryEntry = (class_6880)optional.get();
            }
            ((class_6796)registryEntry.comp_349()).method_39644((class_5281)world, world.method_14178().method_12129(), random, blockPos4);
        }
    }

    public static class_2248 randomBlocks() {
        int i = random.nextInt(9);
        if (i == 1) {
            y = class_2246.field_10085;
        }
        if (i == 2) {
            y = class_2246.field_10441;
        }
        if (i == 3) {
            y = class_2246.field_27159;
        }
        if (i == 4) {
            y = class_2246.field_10166;
        }
        if (i == 5) {
            y = class_2246.field_10540;
        }
        if (i == 6) {
            y = class_2246.field_10201;
        }
        if (i == 7) {
            y = class_2246.field_10234;
        }
        if (i == 8) {
            y = class_2246.field_10205;
        }
        return y;
    }

    public void method_9591(class_1937 world, class_2338 pos, class_2680 state, class_1297 entity) {
        if (!world.field_9236) {
            BlockOne.randomBlocks();
            BlockOne.setToRandom(state, world, pos);
        }
    }

    public static void setToRandom(class_2680 state, class_1937 world, class_2338 pos) {
        world.method_8501(pos, BlockOne.pushEntitiesUpBeforeBlockChange(state, y.method_9564(), (class_1936)world, pos));
    }

    public static class_2680 pushEntitiesUpBeforeBlockChange(class_2680 from, class_2680 to, class_1936 world, class_2338 pos) {
        class_265 voxelShape = class_259.method_1082((class_265)from.method_26220((class_1922)world, pos), (class_265)to.method_26220((class_1922)world, pos), (class_247)class_247.field_16893).method_1096((double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
        if (voxelShape.method_1110()) {
            return to;
        }
        List list = world.method_8335((class_1297)null, voxelShape.method_1107());
        for (class_1297 entity : list) {
            double d = class_259.method_1085((class_2350.class_2351)class_2350.class_2351.field_11052, (class_238)entity.method_5829().method_989(0.0, 1.0, 0.0), List.of(voxelShape), (double)-1.0);
            entity.method_45166(0.0, 1.0 + d, 0.0);
        }
        return to;
    }
}

