/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_174
 *  net.minecraft.class_1799
 *  net.minecraft.class_1887
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_1928
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3222
 *  net.minecraft.class_4466
 *  net.minecraft.class_4482
 *  net.minecraft.class_4482$class_4484
 *  net.minecraft.class_4970$class_2251
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.summon;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_174;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1928;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_4466;
import net.minecraft.class_4482;
import net.minecraft.class_4970;
import org.jetbrains.annotations.Nullable;

public class BeeInfestedBlock
extends class_2248 {
    private final class_2248 regularBlock;
    private static final Map<class_2248, class_2248> REGULAR_TO_BEE_INFESTED_BLOCK = Maps.newIdentityHashMap();
    private static final Map<class_2680, class_2680> REGULAR_TO_BEE_INFESTED_STATE = Maps.newIdentityHashMap();
    private static final Map<class_2680, class_2680> BEE_INFESTED_TO_REGULAR_STATE = Maps.newIdentityHashMap();

    public void method_9556(class_1937 world, class_1657 player, class_2338 pos, class_2680 state, @Nullable class_2586 blockEntity, class_1799 stack) {
        super.method_9556(world, player, pos, state, blockEntity, stack);
        if (!world.field_9236 && blockEntity instanceof class_4482) {
            class_4482 beehiveBlockEntity = (class_4482)blockEntity;
            if (class_1890.method_8225((class_1887)class_1893.field_9099, (class_1799)stack) == 0) {
                beehiveBlockEntity.method_21850(player, state, class_4482.class_4484.field_21052);
                world.method_8455(pos, (class_2248)this);
                this.angerNearbyBees(world, pos);
            }
            class_174.field_21629.method_23875((class_3222)player, state, stack, beehiveBlockEntity.method_23903());
        }
    }

    private void angerNearbyBees(class_1937 world, class_2338 pos) {
        List list = world.method_18467(class_4466.class, new class_238(pos).method_1009(8.0, 6.0, 8.0));
        if (!list.isEmpty()) {
            List list2 = world.method_18467(class_1657.class, new class_238(pos).method_1009(8.0, 6.0, 8.0));
            int i = list2.size();
            for (class_4466 beeEntity : list) {
                if (beeEntity.method_5968() != null) continue;
                beeEntity.method_5980((class_1309)list2.get(world.field_9229.method_43048(i)));
            }
        }
    }

    public BeeInfestedBlock(class_2248 regularBlock, class_4970.class_2251 settings) {
        super(settings.method_36557(regularBlock.method_36555() / 2.0f).method_36558(0.75f));
        this.regularBlock = regularBlock;
        REGULAR_TO_BEE_INFESTED_BLOCK.put(regularBlock, this);
    }

    public class_2248 getRegularBlock() {
        return this.regularBlock;
    }

    public static boolean isInfestable(class_2680 block) {
        return REGULAR_TO_BEE_INFESTED_BLOCK.containsKey(block.method_26204());
    }

    private void spawnSilverfish(class_3218 world, class_2338 pos) {
        class_4466 beeEntity = (class_4466)class_1299.field_20346.method_5883((class_1937)world);
        beeEntity.method_5808((double)pos.method_10263() + 0.5, (double)pos.method_10264(), (double)pos.method_10260() + 0.5, 0.0f, 0.0f);
        world.method_8649((class_1297)beeEntity);
        beeEntity.method_5990();
    }

    public void method_9565(class_2680 state, class_3218 world, class_2338 pos, class_1799 stack, boolean dropExperience) {
        super.method_9565(state, world, pos, stack, dropExperience);
        if (world.method_8450().method_8355(class_1928.field_19392) && class_1890.method_8225((class_1887)class_1893.field_9099, (class_1799)stack) == 0) {
            this.spawnSilverfish(world, pos);
        }
    }

    public static class_2680 fromRegularState(class_2680 regularState) {
        return BeeInfestedBlock.copyProperties(REGULAR_TO_BEE_INFESTED_STATE, regularState, () -> REGULAR_TO_BEE_INFESTED_BLOCK.get(regularState.method_26204()).method_9564());
    }

    public class_2680 toRegularState(class_2680 infestedState) {
        return BeeInfestedBlock.copyProperties(BEE_INFESTED_TO_REGULAR_STATE, infestedState, () -> this.getRegularBlock().method_9564());
    }

    private static class_2680 copyProperties(Map<class_2680, class_2680> stateMap, class_2680 fromState, Supplier<class_2680> toStateSupplier) {
        return stateMap.computeIfAbsent(fromState, infestedState -> {
            class_2680 blockState = (class_2680)toStateSupplier.get();
            for (class_2769 property : infestedState.method_28501()) {
                blockState = blockState.method_28498(property) ? blockState : blockState;
            }
            return blockState;
        });
    }
}

