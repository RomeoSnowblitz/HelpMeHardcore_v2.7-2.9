/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_181
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2237
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_2415
 *  net.minecraft.class_2470
 *  net.minecraft.class_2586
 *  net.minecraft.class_259
 *  net.minecraft.class_2591
 *  net.minecraft.class_265
 *  net.minecraft.class_2667
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2753
 *  net.minecraft.class_2754
 *  net.minecraft.class_2769
 *  net.minecraft.class_3726
 *  net.minecraft.class_3965
 *  net.minecraft.class_47$class_48
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5558
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.piston;

import java.util.Collections;
import java.util.List;
import net.minecraft.class_10;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_181;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2237;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2586;
import net.minecraft.class_259;
import net.minecraft.class_2591;
import net.minecraft.class_265;
import net.minecraft.class_2667;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_47;
import net.minecraft.class_4970;
import net.minecraft.class_5558;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlockEntity;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonType;
import net.romeosnowblitz.hmh2.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class ModPistonExtensionBlock
extends class_2237 {
    public static final class_2753 FACING = ModPistonHeadBlock.field_10927;
    public static final class_2754<ModPistonType> TYPE = ModPistonHeadBlock.TYPE;

    public ModPistonExtensionBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)FACING, (Comparable)class_2350.field_11043)).method_11657(TYPE, (Comparable)((Object)ModPistonType.DEFAULT)));
    }

    @Nullable
    public class_2586 method_10123(class_2338 pos, class_2680 state) {
        return null;
    }

    public static class_2586 createBlockEntityPiston(class_2338 pos, class_2680 state, class_2680 pushedBlock, class_2350 facing, boolean extending, boolean source) {
        return new ModPistonBlockEntity(pos, state, pushedBlock, facing, extending, source);
    }

    @Nullable
    public <T extends class_2586> class_5558<T> method_31645(class_1937 world, class_2680 state, class_2591<T> type) {
        return class_2667.method_31618(type, ModBlockEntities.MOD_PISTON, ModPistonBlockEntity::tick);
    }

    public void method_9536(class_2680 state, class_1937 world, class_2338 pos, class_2680 newState, boolean moved) {
        if (state.method_27852(newState.method_26204())) {
            return;
        }
        class_2586 blockEntity = world.method_8321(pos);
        if (blockEntity instanceof ModPistonBlockEntity) {
            ((ModPistonBlockEntity)blockEntity).finish();
        }
    }

    public void method_9585(class_1936 world, class_2338 pos, class_2680 state) {
        class_2338 blockPos = pos.method_10093(((class_2350)state.method_11654((class_2769)FACING)).method_10153());
        class_2680 blockState = world.method_8320(blockPos);
        if (blockState.method_26204() instanceof ModPistonBlock && ((Boolean)blockState.method_11654((class_2769)ModPistonBlock.EXTENDED)).booleanValue()) {
            world.method_8650(blockPos, false);
        }
    }

    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
        if (!world.field_9236 && world.method_8321(pos) == null) {
            world.method_8650(pos, false);
            return class_1269.field_21466;
        }
        return class_1269.field_5811;
    }

    public List<class_1799> method_9560(class_2680 state, class_47.class_48 builder) {
        ModPistonBlockEntity pistonBlockEntity = this.getPistonBlockEntity((class_1922)builder.method_313(), class_2338.method_49638((class_2374)((class_2374)builder.method_308(class_181.field_24424))));
        return pistonBlockEntity == null ? Collections.emptyList() : pistonBlockEntity.getPushedBlock().method_26189(builder);
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return class_259.method_1073();
    }

    public class_265 method_9549(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        ModPistonBlockEntity pistonBlockEntity = this.getPistonBlockEntity(world, pos);
        if (pistonBlockEntity != null) {
            return pistonBlockEntity.getCollisionShape(world, pos);
        }
        return class_259.method_1073();
    }

    @Nullable
    private ModPistonBlockEntity getPistonBlockEntity(class_1922 world, class_2338 pos) {
        class_2586 blockEntity = world.method_8321(pos);
        if (blockEntity instanceof ModPistonBlockEntity) {
            return (ModPistonBlockEntity)blockEntity;
        }
        return null;
    }

    public class_1799 method_9574(class_1922 world, class_2338 pos, class_2680 state) {
        return class_1799.field_8037;
    }

    public class_2680 method_9598(class_2680 state, class_2470 rotation) {
        return (class_2680)state.method_11657((class_2769)FACING, (Comparable)rotation.method_10503((class_2350)state.method_11654((class_2769)FACING)));
    }

    public class_2680 method_9569(class_2680 state, class_2415 mirror) {
        return state.method_26186(mirror.method_10345((class_2350)state.method_11654((class_2769)FACING)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{FACING, TYPE});
    }

    public boolean method_9516(class_2680 state, class_1922 world, class_2338 pos, class_10 type) {
        return false;
    }
}

