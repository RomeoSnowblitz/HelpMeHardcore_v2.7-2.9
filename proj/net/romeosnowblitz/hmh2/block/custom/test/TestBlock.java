/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1301
 *  net.minecraft.class_1309
 *  net.minecraft.class_1452
 *  net.minecraft.class_1538
 *  net.minecraft.class_1541
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1676
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_1927
 *  net.minecraft.class_1928
 *  net.minecraft.class_1935
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_1937$class_7867
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2263
 *  net.minecraft.class_2276
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_2404
 *  net.minecraft.class_243
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_2784
 *  net.minecraft.class_2975
 *  net.minecraft.class_3218
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3468
 *  net.minecraft.class_3486
 *  net.minecraft.class_3532
 *  net.minecraft.class_3545
 *  net.minecraft.class_3610
 *  net.minecraft.class_3614
 *  net.minecraft.class_3965
 *  net.minecraft.class_4051
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5281
 *  net.minecraft.class_5321
 *  net.minecraft.class_5362
 *  net.minecraft.class_5712
 *  net.minecraft.class_5819
 *  net.minecraft.class_6880
 *  net.minecraft.class_7924
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.test;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1301;
import net.minecraft.class_1309;
import net.minecraft.class_1452;
import net.minecraft.class_1538;
import net.minecraft.class_1541;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_1927;
import net.minecraft.class_1928;
import net.minecraft.class_1935;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2263;
import net.minecraft.class_2276;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_2784;
import net.minecraft.class_2975;
import net.minecraft.class_3218;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3545;
import net.minecraft.class_3610;
import net.minecraft.class_3614;
import net.minecraft.class_3965;
import net.minecraft.class_4051;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5281;
import net.minecraft.class_5321;
import net.minecraft.class_5362;
import net.minecraft.class_5712;
import net.minecraft.class_5819;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import org.jetbrains.annotations.Nullable;

public class TestBlock
extends class_2248 {
    public static final class_2758 AGE = class_2741.field_12498;
    public static final int MAX_AGE = 15;
    protected static final int field_31045 = 1;
    private final class_5321<class_2975<?, ?>> featureKey;

    public TestBlock(class_4970.class_2251 settings, class_5321<class_2975<?, ?>> featureKey) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)AGE, (Comparable)Integer.valueOf(0)));
        this.featureKey = featureKey;
    }

    public void method_9567(class_1937 world, class_2338 pos, class_2680 state, class_1309 placer, class_1799 itemStack) {
        if (world.method_8608()) {
            class_2350 north = class_2350.field_11043;
            class_2350 south = class_2350.field_11035;
            class_2350 east = class_2350.field_11034;
            class_2350 class_23502 = class_2350.field_11039;
        }
        if (world.method_8597().comp_644()) {
            world.method_8652(pos, class_2246.field_10258.method_9564(), 3);
            world.method_20290(2009, pos, 0);
            world.method_8396((class_1657)null, pos, class_3417.field_15102, class_3419.field_15245, 1.0f, (1.0f + world.method_8409().method_43057() * 0.2f) * 0.7f);
        }
    }

    private static boolean isLapisNearby(class_4538 world, class_2338 pos) {
        class_2338 blockPos;
        Iterator var2 = class_2338.method_10097((class_2338)pos.method_10069(-4, 0, -4), (class_2338)pos.method_10069(4, 1, 4)).iterator();
        do {
            if (var2.hasNext()) continue;
            return false;
        } while (!world.method_8320(blockPos = (class_2338)var2.next()).method_27852(class_2246.field_10441));
        return true;
    }

    private static boolean isRedstoneNearby(class_4538 world, class_2338 pos) {
        class_2338 blockPos;
        Iterator var2 = class_2338.method_10097((class_2338)pos.method_10069(-4, 0, -4), (class_2338)pos.method_10069(4, 1, 4)).iterator();
        do {
            if (var2.hasNext()) continue;
            return false;
        } while (!world.method_8320(blockPos = (class_2338)var2.next()).method_27852(class_2246.field_10002));
        return true;
    }

    private static boolean isCoalNearby(class_4538 world, class_2338 pos) {
        class_2338 blockPos;
        Iterator var2 = class_2338.method_10097((class_2338)pos.method_10069(-4, 0, -4), (class_2338)pos.method_10069(4, 1, 4)).iterator();
        do {
            if (var2.hasNext()) continue;
            return false;
        } while (!world.method_8320(blockPos = (class_2338)var2.next()).method_27852(class_2246.field_10381));
        return true;
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (!state.method_26184((class_4538)world, pos)) {
            world.method_39279(pos, (class_2248)this, 1);
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 sourceBlock, class_2338 sourcePos, boolean notify) {
        this.update(world, pos);
        super.method_9612(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(class_1937 world, class_2338 pos) {
        if (this.absorbWater(world, pos)) {
            world.method_8652(pos, class_2246.field_10562.method_9564(), 2);
            world.method_20290(2001, pos, class_2248.method_9507((class_2680)class_2246.field_10164.method_9564()));
        }
    }

    private boolean absorbWater(class_1937 world, class_2338 pos) {
        LinkedList queue = Lists.newLinkedList();
        queue.add(new class_3545((Object)pos, (Object)0));
        int i = 0;
        while (!queue.isEmpty()) {
            class_3545 pair = (class_3545)queue.poll();
            class_2338 blockPos = (class_2338)pair.method_15442();
            int j = (Integer)pair.method_15441();
            for (class_2350 direction : class_2350.values()) {
                class_2338 blockPos2 = blockPos.method_10093(direction);
                class_2680 blockState = world.method_8320(blockPos2);
                class_3610 fluidState = world.method_8316(blockPos2);
                class_3614 material = blockState.method_26207();
                if (!fluidState.method_15767(class_3486.field_15518)) continue;
                if (blockState.method_26204() instanceof class_2263 && !((class_2263)blockState.method_26204()).method_9700((class_1936)world, blockPos2, blockState).method_7960()) {
                    ++i;
                    if (j >= 100000) continue;
                    queue.add(new class_3545((Object)blockPos2, (Object)(j + 1)));
                    continue;
                }
                if (blockState.method_26204() instanceof class_2404) {
                    world.method_8652(blockPos2, class_2246.field_10124.method_9564(), 3);
                    ++i;
                    if (j >= 100000) continue;
                    queue.add(new class_3545((Object)blockPos2, (Object)(j + 1)));
                    continue;
                }
                if (material != class_3614.field_15947 && material != class_3614.field_15926) continue;
                class_2586 blockEntity = blockState.method_31709() ? world.method_8321(blockPos2) : null;
                TestBlock.method_9610((class_2680)blockState, (class_1936)world, (class_2338)blockPos2, (class_2586)blockEntity);
                world.method_8652(blockPos2, class_2246.field_10124.method_9564(), 3);
                ++i;
                if (j >= 100000) continue;
                queue.add(new class_3545((Object)blockPos2, (Object)(j + 1)));
            }
            if (i <= 1000000) continue;
            break;
        }
        return i > 0;
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        if (world instanceof class_3218 && entity instanceof class_1657) {
            world.method_8651(new class_2338((class_2382)pos), true, entity);
        }
    }

    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
        class_1799 itemStack = player.method_5998(hand);
        if (player.method_7294()) {
            player.method_6092(new class_1293(class_1294.field_16595, 1000));
            world.method_8396(player, pos, class_3417.field_26982, class_3419.field_15245, 1.0f, 0.5f + world.field_9229.method_43057() * 1.2f);
            class_1542 itemEntity = new class_1542(world, (double)pos.method_10263() + 0.5, (double)pos.method_10264() + 1.0, (double)pos.method_10260() + 0.5, new class_1799((class_1935)class_1802.field_8324));
            world.method_8649((class_1297)itemEntity);
        }
        if (itemStack.method_31574(class_1802.field_8868) && !world.field_9236) {
            class_2350 direction = hit.method_17780();
            class_2350 direction2 = direction.method_10166() == class_2350.class_2351.field_11052 ? player.method_5735().method_10153() : direction;
            world.method_8396((class_1657)null, pos, class_3417.field_14619, class_3419.field_15245, 1.0f, 1.0f);
            world.method_8652(pos, (class_2680)class_2246.field_10147.method_9564().method_11657((class_2769)class_2276.field_10748, (Comparable)direction2), 11);
            class_1542 itemEntity = new class_1542(world, (double)pos.method_10263() + 0.5 + (double)direction2.method_10148() * 0.65, (double)pos.method_10264() + 0.1, (double)pos.method_10260() + 0.5 + (double)direction2.method_10165() * 0.65, new class_1799((class_1935)class_1802.field_8706, 4));
            itemEntity.method_18800(0.05 * (double)direction2.method_10148() + world.field_9229.method_43058() * 0.02, 0.05, 0.05 * (double)direction2.method_10165() + world.field_9229.method_43058() * 0.02);
            world.method_8649((class_1297)itemEntity);
            itemStack.method_7956(1, (class_1309)player, playerx -> playerx.method_20236(hand));
            world.method_33596((class_1297)player, class_5712.field_28730, pos);
            player.method_7259(class_3468.field_15372.method_14956((Object)class_1802.field_8868));
        }
        return class_1269.field_5812;
    }

    public void method_9591(class_1937 world, class_2338 pos, class_2680 state, class_1297 entity) {
        if (entity instanceof class_1309) {
            ((class_1309)entity).method_6025(1.0f);
            entity.method_5717(pos);
        }
        super.method_9591(world, pos, state, entity);
    }

    public void method_9554(class_1937 world, class_2680 state, class_2338 pos, class_1297 entity, float fallDistance) {
        if (!world.field_9236 && world.field_9229.method_43057() < fallDistance - 0.5f && entity instanceof class_1309 && (entity instanceof class_1657 || world.method_8450().method_8355(class_1928.field_19388)) && entity.method_17681() * entity.method_17681() * entity.method_17682() > 0.512f) {
            TestBlock.primeTnt(world, pos);
        }
        super.method_9554(world, state, pos, entity, fallDistance);
    }

    public void method_19286(class_1937 world, class_2680 state, class_3965 hit, class_1676 projectile) {
        class_2248 shiny = class_2246.field_10205;
        class_3414 twinkle = class_3417.field_26982;
        class_1268 hand = class_1268.field_5810;
        class_1538 lightningEntity = (class_1538)class_1299.field_6112.method_5883(world);
        class_2338 blockPos = hit.method_17777();
        class_1657 player = world.method_8604((double)blockPos.method_10263(), (double)blockPos.method_10264(), (double)blockPos.method_10260(), 100.0, class_1301.field_6154);
        class_238 box = projectile.method_5829().method_1009((double)(blockPos.method_10263() + 100), (double)(blockPos.method_10264() + 100), (double)(blockPos.method_10260() + 100));
        class_1452 nearestPig = (class_1452)projectile.field_6002.method_21726(class_1452.class, class_4051.field_18092, null, projectile.method_23317(), projectile.method_23318(), projectile.method_23321(), box);
        if (!world.field_9236 && projectile.method_5809()) {
            world.method_8501(blockPos.method_10084(), shiny.method_9564());
            world.method_8396(null, blockPos, twinkle, class_3419.field_15245, 1.0f, 0.5f + world.field_9229.method_43057() * 1.2f);
            lightningEntity.method_29495(class_243.method_24955((class_2382)blockPos.method_10084()));
            world.method_8649((class_1297)lightningEntity);
        }
        if (projectile.method_5809() || !projectile.method_5809()) {
            player.method_7316(1);
            this.teleport(state, world, blockPos);
            if (player.method_5998(hand).method_31574(class_1802.field_8601)) {
                player.method_6092(new class_1293(class_1294.field_5912, 100, 9));
                nearestPig.method_6092(new class_1293(class_1294.field_5912, 100, 9));
            }
            if (player.method_5998(hand).method_31574(class_1802.field_8634)) {
                player.method_20620((double)blockPos.method_10263(), (double)blockPos.method_10264(), (double)blockPos.method_10260());
            }
        }
    }

    public void method_9606(class_2680 state, class_1937 world, class_2338 pos, class_1657 player) {
        super.method_9606(state, world, pos, player);
    }

    public void method_9585(class_1936 world, class_2338 pos, class_2680 state) {
        class_2338 blockPos = pos.method_10084();
        SoldierBeeEntity soldierBeeEntity = (SoldierBeeEntity)MobEntities.SOLDIER_BEE.method_5883((class_1937)world);
        if (world.method_22347(blockPos)) {
            soldierBeeEntity.method_5808((double)pos.method_10263() + 0.5, pos.method_10264(), (double)pos.method_10260() + 0.5, 0.0f, 0.0f);
            world.method_8649((class_1297)soldierBeeEntity);
        }
        if (TestBlock.isCoalNearby((class_4538)world, pos)) {
            this.explode(state, (class_1937)world, pos);
        }
    }

    public void method_9556(class_1937 world, class_1657 player, class_2338 pos, class_2680 state, @Nullable class_2586 blockEntity, class_1799 stack) {
        player.method_7259(class_3468.field_15427.method_14956((Object)this));
        player.method_6092(new class_1293(class_1294.field_5925, 100));
        player.method_7322(0.005f);
        TestBlock.method_9511((class_2680)state, (class_1937)world, (class_2338)pos, (class_2586)blockEntity, (class_1297)player, (class_1799)stack);
    }

    public void method_9586(class_1937 world, class_2338 pos, class_1927 explosion) {
        this.method_9583((class_3218)world, pos, 10000);
    }

    public void method_9588(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        class_2248 x = class_2246.field_10085;
        class_2338 blockPos = pos.method_10084();
        if (!world.method_22347(blockPos)) {
            world.method_8501(pos.method_10095(), x.method_9564());
        }
    }

    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        Optional optional;
        class_2338 blockPos = pos.method_10074();
        class_2248 y = class_2246.field_10147;
        class_2248 x = class_2246.field_10085;
        if (world.method_8320(pos.method_10074()).method_27852(class_2246.field_10201)) {
            int i = 1;
            while (world.method_8320(pos.method_10087(i)).method_27852((class_2248)this)) {
                ++i;
            }
            if (i < 3) {
                int j = (Integer)state.method_11654((class_2769)AGE);
                if (j == 15) {
                    world.method_8501(pos, x.method_9564());
                    world.method_8501(pos.method_10084(), x.method_9564());
                    world.method_8501(pos.method_10084().method_10095(), x.method_9564());
                    world.method_8501(pos.method_10084().method_10072(), x.method_9564());
                    world.method_8501(pos.method_10084().method_10084(), y.method_9564());
                } else {
                    world.method_8652(pos, (class_2680)state.method_11657((class_2769)AGE, (Comparable)Integer.valueOf(j + 1)), 4);
                }
            }
        }
        if (world.method_22347(blockPos) || !world.method_22347(blockPos)) {
            // empty if block
        }
        if (TestBlock.isLapisNearby((class_4538)world, pos)) {
            world.method_8503().method_30002().method_29199(6000L);
        }
        if (TestBlock.isRedstoneNearby((class_4538)world, pos) && !(optional = world.method_30349().method_30530(class_7924.field_41239).method_40264(this.featureKey)).isEmpty()) {
            world.method_8650(pos, false);
            if (!((class_2975)((class_6880)optional.get()).comp_349()).method_12862((class_5281)world, world.method_14178().method_12129(), random, pos)) {
                world.method_8652(pos, state, 3);
            }
        }
        super.method_9514(state, world, pos, random);
    }

    public boolean method_9506(class_2680 state) {
        return true;
    }

    public int method_9524(class_2680 state, class_1922 world, class_2338 pos, class_2350 direction) {
        return 15;
    }

    private static void spawnParticles(class_1937 world, class_2338 pos) {
        class_5819 random = world.field_9229;
        for (class_2350 direction : class_2350.values()) {
            class_2338 blockPos = pos.method_10093(direction);
            if (world.method_8320(blockPos).method_26216((class_1922)world, blockPos)) continue;
            class_2350.class_2351 axis = direction.method_10166();
            double e = axis == class_2350.class_2351.field_11048 ? 0.5 + 0.5625 * (double)direction.method_10148() : (double)random.method_43057();
            double f = axis == class_2350.class_2351.field_11052 ? 0.5 + 0.5625 * (double)direction.method_10164() : (double)random.method_43057();
            double g = axis == class_2350.class_2351.field_11051 ? 0.5 + 0.5625 * (double)direction.method_10165() : (double)random.method_43057();
            world.method_8406((class_2394)class_2398.field_11211, (double)pos.method_10263() + e, (double)pos.method_10264() + f, (double)pos.method_10260() + g, 0.0, 0.0, 0.0);
        }
    }

    private void explode(class_2680 state, class_1937 world, final class_2338 explodedPos) {
        world.method_8650(explodedPos, false);
        Objects.requireNonNull(explodedPos);
        final boolean bl2 = world.method_8316(explodedPos.method_10084()).method_15767(class_3486.field_15518);
        class_5362 explosionBehavior = new class_5362(){

            public Optional<Float> method_29555(class_1927 explosion, class_1922 world, class_2338 pos, class_2680 blockState, class_3610 fluidState) {
                return pos.equals((Object)explodedPos) && bl2 ? Optional.of(Float.valueOf(class_2246.field_10164.method_9520())) : super.method_29555(explosion, world, pos, blockState, fluidState);
            }
        };
        class_243 vec3d = explodedPos.method_46558();
        world.method_46407((class_1297)null, world.method_48963().method_48808(vec3d), explosionBehavior, vec3d, 2.0f, true, class_1937.class_7867.field_40889);
    }

    public static void primeTnt(class_1937 world, class_2338 pos) {
        TestBlock.primeTnt(world, pos, null);
    }

    private static void primeTnt(class_1937 world, class_2338 pos, @Nullable class_1309 igniter) {
        if (!world.field_9236) {
            class_1541 tntEntity = new class_1541(world, (double)pos.method_10263() + 0.5, (double)pos.method_10264(), (double)pos.method_10260() + 0.5, igniter);
            world.method_8649((class_1297)tntEntity);
            world.method_43128((class_1657)null, tntEntity.method_23317(), tntEntity.method_23318(), tntEntity.method_23321(), class_3417.field_15079, class_3419.field_15245, 1.0f, 1.0f);
            world.method_33596((class_1297)igniter, class_5712.field_28727, pos);
        }
    }

    private void teleport(class_2680 state, class_1937 world, class_2338 pos) {
        class_2784 worldBorder = world.method_8621();
        for (int i = 0; i < 1000; ++i) {
            class_2338 blockPos = pos.method_10069(world.field_9229.method_43048(16) - world.field_9229.method_43048(16), world.field_9229.method_43048(8) - world.field_9229.method_43048(8), world.field_9229.method_43048(16) - world.field_9229.method_43048(16));
            if (!world.method_8320(blockPos).method_26215() || !worldBorder.method_11952(blockPos)) continue;
            if (world.field_9236) {
                for (int j = 0; j < 128; ++j) {
                    double d = world.field_9229.method_43058();
                    float f = (world.field_9229.method_43057() - 0.5f) * 0.2f;
                    float g = (world.field_9229.method_43057() - 0.5f) * 0.2f;
                    float h = (world.field_9229.method_43057() - 0.5f) * 0.2f;
                    double e = class_3532.method_16436((double)d, (double)blockPos.method_10263(), (double)pos.method_10263()) + (world.field_9229.method_43058() - 0.5) + 0.5;
                    double k = class_3532.method_16436((double)d, (double)blockPos.method_10264(), (double)pos.method_10264()) + world.field_9229.method_43058() - 0.5;
                    double l = class_3532.method_16436((double)d, (double)blockPos.method_10260(), (double)pos.method_10260()) + (world.field_9229.method_43058() - 0.5) + 0.5;
                    world.method_8406((class_2394)class_2398.field_11214, e, k, l, (double)f, (double)g, (double)h);
                }
            } else {
                world.method_8652(blockPos, state, 2);
                world.method_8650(pos, false);
            }
            return;
        }
    }

    public boolean method_9542(class_2680 state) {
        return false;
    }

    public void method_9496(class_2680 state, class_1937 world, class_2338 pos, class_5819 random) {
        TestBlock.spawnParticles(world, pos);
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{AGE});
    }
}

