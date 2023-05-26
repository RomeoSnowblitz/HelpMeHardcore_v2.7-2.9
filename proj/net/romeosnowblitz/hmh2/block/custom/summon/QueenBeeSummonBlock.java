/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_174
 *  net.minecraft.class_1750
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2383
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2694
 *  net.minecraft.class_2697
 *  net.minecraft.class_2700
 *  net.minecraft.class_2700$class_2702
 *  net.minecraft.class_2710
 *  net.minecraft.class_2715
 *  net.minecraft.class_2753
 *  net.minecraft.class_2769
 *  net.minecraft.class_3222
 *  net.minecraft.class_3614
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5151
 */
package net.romeosnowblitz.hmh2.block.custom.summon;

import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_174;
import net.minecraft.class_1750;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2694;
import net.minecraft.class_2697;
import net.minecraft.class_2700;
import net.minecraft.class_2710;
import net.minecraft.class_2715;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3222;
import net.minecraft.class_3614;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5151;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.mob.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;

public class QueenBeeSummonBlock
extends class_2383
implements class_5151 {
    public static final class_2753 FACING = class_2383.field_11177;
    private class_2700 soldierBeePattern;
    private class_2700 queenBeePattern;
    private static final Predicate<class_2680> IS_GOLEM_HEAD_PREDICATE = state -> state != null && state.method_27852(ModBlocks.HONEY_HIVE);

    public QueenBeeSummonBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)FACING, (Comparable)class_2350.field_11043));
    }

    public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean notify) {
        if (oldState.method_27852(state.method_26204())) {
            return;
        }
        this.trySpawnEntity(world, pos);
    }

    private void trySpawnEntity(class_1937 world, class_2338 pos) {
        block9: {
            class_2700.class_2702 result;
            block8: {
                result = this.getSoldierBeePattern().method_11708((class_4538)world, pos);
                if (result == null) break block8;
                for (int i = 0; i < this.getSoldierBeePattern().method_11713(); ++i) {
                    class_2694 cachedBlockPosition = result.method_11717(0, i, 0);
                    world.method_8652(cachedBlockPosition.method_11683(), class_2246.field_10124.method_9564(), 2);
                    world.method_20290(2001, cachedBlockPosition.method_11683(), class_2248.method_9507((class_2680)cachedBlockPosition.method_11681()));
                }
                SoldierBeeEntity soldierBeeEntity = (SoldierBeeEntity)MobEntities.SOLDIER_BEE.method_5883(world);
                class_2338 blockPos = result.method_11717(0, 2, 0).method_11683();
                soldierBeeEntity.method_5808((double)blockPos.method_10263() + 0.5, (double)blockPos.method_10264() + 0.05, (double)blockPos.method_10260() + 0.5, 0.0f, 0.0f);
                world.method_8649((class_1297)soldierBeeEntity);
                for (class_3222 serverPlayerEntity : world.method_18467(class_3222.class, soldierBeeEntity.method_5829().method_1014(5.0))) {
                    class_174.field_1182.method_9124(serverPlayerEntity, (class_1297)soldierBeeEntity);
                }
                for (int j = 0; j < this.getSoldierBeePattern().method_11713(); ++j) {
                    class_2694 cachedBlockPosition2 = result.method_11717(0, j, 0);
                    world.method_8408(cachedBlockPosition2.method_11683(), class_2246.field_10124);
                }
                break block9;
            }
            result = this.getQueenBeePattern().method_11708((class_4538)world, pos);
            if (result == null) break block9;
            for (int i = 0; i < this.getQueenBeePattern().method_11710(); ++i) {
                for (int k = 0; k < this.getQueenBeePattern().method_11713(); ++k) {
                    class_2694 cachedBlockPosition3 = result.method_11717(i, k, 0);
                    world.method_8652(cachedBlockPosition3.method_11683(), class_2246.field_10124.method_9564(), 2);
                    world.method_20290(2001, cachedBlockPosition3.method_11683(), class_2248.method_9507((class_2680)cachedBlockPosition3.method_11681()));
                }
            }
            class_2338 blockPos2 = result.method_11717(1, 2, 0).method_11683();
            QueenBeeEntity summoningEntity = (QueenBeeEntity)MobEntities.QUEEN_BEE.method_5883(world);
            summoningEntity.method_5808((double)blockPos2.method_10263() + 0.5, (double)blockPos2.method_10264() + 0.05, (double)blockPos2.method_10260() + 0.5, 0.0f, 0.0f);
            world.method_8649((class_1297)summoningEntity);
            for (class_3222 serverPlayerEntity : world.method_18467(class_3222.class, summoningEntity.method_5829().method_1014(5.0))) {
                class_174.field_1182.method_9124(serverPlayerEntity, (class_1297)summoningEntity);
            }
            for (int j = 0; j < this.getQueenBeePattern().method_11710(); ++j) {
                for (int l = 0; l < this.getQueenBeePattern().method_11713(); ++l) {
                    class_2694 cachedBlockPosition4 = result.method_11717(j, l, 0);
                    world.method_8408(cachedBlockPosition4.method_11683(), class_2246.field_10124);
                }
            }
        }
    }

    public class_2680 method_9605(class_1750 ctx) {
        return (class_2680)this.method_9564().method_11657((class_2769)FACING, (Comparable)ctx.method_8042().method_10153());
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{FACING});
    }

    private class_2700 getSoldierBeePattern() {
        if (this.soldierBeePattern == null) {
            this.soldierBeePattern = class_2697.method_11701().method_11702(new String[]{"^", "#", "~"}).method_11700('^', class_2694.method_11678(IS_GOLEM_HEAD_PREDICATE)).method_11700('#', class_2694.method_11678((Predicate)class_2715.method_11758((class_2248)ModBlocks.ROYAL_JELLY))).method_11700('~', class_2694.method_11678((Predicate)class_2715.method_11758((class_2248)class_2246.field_10124))).method_11704();
        }
        return this.soldierBeePattern;
    }

    private class_2700 getQueenBeePattern() {
        if (this.queenBeePattern == null) {
            this.queenBeePattern = class_2697.method_11701().method_11702(new String[]{"^", "#", "#", "#"}).method_11700('^', class_2694.method_11678(IS_GOLEM_HEAD_PREDICATE)).method_11700('#', class_2694.method_11678((Predicate)class_2715.method_11758((class_2248)ModBlocks.ROYAL_JELLY))).method_11700('~', class_2694.method_11678((Predicate)class_2710.method_11746((class_3614)class_3614.field_15959))).method_11704();
        }
        return this.queenBeePattern;
    }

    public class_1304 method_7685() {
        return class_1304.field_6169;
    }
}

