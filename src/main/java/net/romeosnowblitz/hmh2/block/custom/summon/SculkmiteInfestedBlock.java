/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1887
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_1928
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_4970$class_2251
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.summon;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1928;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import org.jetbrains.annotations.Nullable;

public class SculkmiteInfestedBlock
extends class_2248 {
    public SculkmiteInfestedBlock(class_4970.class_2251 settings) {
        super(settings);
    }

    public void method_9556(class_1937 world, class_1657 player, class_2338 pos, class_2680 state, @Nullable class_2586 blockEntity, class_1799 tool) {
        super.method_9556(world, player, pos, state, blockEntity, tool);
        if (world.method_8450().method_8355(class_1928.field_19392) && class_1890.method_8225((class_1887)class_1893.field_9099, (class_1799)tool) == 0) {
            SculkmiteEntity entity = (SculkmiteEntity)MobEntities.SCULKMITE.method_5883(world);
            entity.method_5808((double)pos.method_10263() + 0.5, pos.method_10264(), (double)pos.method_10260() + 0.5, 0.0f, 0.0f);
            world.method_8649((class_1297)entity);
            entity.method_5990();
        }
    }
}

