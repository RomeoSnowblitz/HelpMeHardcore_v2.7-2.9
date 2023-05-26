/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1313
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2512
 *  net.minecraft.class_2520
 *  net.minecraft.class_2586
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2741
 *  net.minecraft.class_2769
 *  net.minecraft.class_3222
 *  net.minecraft.class_3532
 *  net.minecraft.class_3619
 *  net.minecraft.class_4623
 *  net.minecraft.class_7225$class_7226
 *  net.minecraft.class_7871
 *  net.minecraft.class_7923
 *  net.minecraft.class_7924
 */
package net.romeosnowblitz.hmh2.block.custom.piston;

import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1313;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2512;
import net.minecraft.class_2520;
import net.minecraft.class_2586;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2769;
import net.minecraft.class_3222;
import net.minecraft.class_3532;
import net.minecraft.class_3619;
import net.minecraft.class_4623;
import net.minecraft.class_7225;
import net.minecraft.class_7871;
import net.minecraft.class_7923;
import net.minecraft.class_7924;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonType;
import net.romeosnowblitz.hmh2.entity.ModBlockEntities;

public class ModPistonBlockEntity
extends class_2586 {
    private static final int field_31382 = 2;
    private static final double field_31383 = 0.01;
    public static final double field_31381 = 0.51;
    private class_2680 pushedBlock = class_2246.field_10124.method_9564();
    private class_2350 facing;
    private boolean extending;
    private boolean source;
    private static final ThreadLocal<class_2350> field_12205 = ThreadLocal.withInitial(() -> null);
    private float progress;
    private float lastProgress;
    private long savedWorldTime;
    private int field_26705;

    public ModPistonBlockEntity(class_2338 pos, class_2680 state) {
        super(ModBlockEntities.MOD_PISTON, pos, state);
    }

    public ModPistonBlockEntity(class_2338 pos, class_2680 state, class_2680 pushedBlock, class_2350 facing, boolean extending, boolean source) {
        this(pos, state);
        this.pushedBlock = pushedBlock;
        this.facing = facing;
        this.extending = extending;
        this.source = source;
    }

    public class_2487 method_16887() {
        return this.method_38244();
    }

    public boolean isExtending() {
        return this.extending;
    }

    public class_2350 getFacing() {
        return this.facing;
    }

    public boolean isSource() {
        return this.source;
    }

    public float getProgress(float tickDelta) {
        if (tickDelta > 1.0f) {
            tickDelta = 1.0f;
        }
        return class_3532.method_16439((float)tickDelta, (float)this.lastProgress, (float)this.progress);
    }

    public float getRenderOffsetX(float tickDelta) {
        return (float)this.facing.method_10148() * this.getAmountExtended(this.getProgress(tickDelta));
    }

    public float getRenderOffsetY(float tickDelta) {
        return (float)this.facing.method_10164() * this.getAmountExtended(this.getProgress(tickDelta));
    }

    public float getRenderOffsetZ(float tickDelta) {
        return (float)this.facing.method_10165() * this.getAmountExtended(this.getProgress(tickDelta));
    }

    private float getAmountExtended(float progress) {
        return this.extending ? progress - 1.0f : 1.0f - progress;
    }

    private class_2680 getHeadBlockState() {
        if (!this.isExtending() && this.isSource() && this.pushedBlock.method_26204() instanceof ModPistonBlock) {
            return (class_2680)((class_2680)((class_2680)ModBlocks.MOD_PISTON_HEAD.method_9564().method_11657((class_2769)ModPistonHeadBlock.SHORT, (Comparable)Boolean.valueOf(this.progress > 0.25f))).method_11657(ModPistonHeadBlock.TYPE, (Comparable)((Object)(this.pushedBlock.method_27852(ModBlocks.GLUEY_PISTON) ? ModPistonType.GLUEY : ModPistonType.DEFAULT)))).method_11657((class_2769)ModPistonHeadBlock.field_10927, (Comparable)((class_2350)this.pushedBlock.method_11654((class_2769)ModPistonBlock.field_10927)));
        }
        return this.pushedBlock;
    }

    private static void pushEntities(class_1937 world, class_2338 pos, float f, ModPistonBlockEntity blockEntity) {
        class_2350 direction = blockEntity.getMovementDirection();
        double d = f - blockEntity.progress;
        class_265 voxelShape = blockEntity.getHeadBlockState().method_26220((class_1922)world, pos);
        if (voxelShape.method_1110()) {
            return;
        }
        class_238 box = ModPistonBlockEntity.offsetHeadBox(pos, voxelShape.method_1107(), blockEntity);
        List list = world.method_8335(null, class_4623.method_23362((class_238)box, (class_2350)direction, (double)d).method_991(box));
        if (list.isEmpty()) {
            return;
        }
        List list2 = voxelShape.method_1090();
        boolean bl = blockEntity.pushedBlock.method_27852(class_2246.field_10030);
        for (class_1297 entity : list) {
            class_238 box4;
            class_238 box2;
            class_238 box3;
            if (entity.method_5657() == class_3619.field_15975) continue;
            if (bl) {
                if (entity instanceof class_3222) continue;
                class_243 vec3d = entity.method_18798();
                double e = vec3d.field_1352;
                double g = vec3d.field_1351;
                double h = vec3d.field_1350;
                switch (direction.method_10166()) {
                    case field_11048: {
                        e = direction.method_10148();
                        break;
                    }
                    case field_11052: {
                        g = direction.method_10164();
                        break;
                    }
                    case field_11051: {
                        h = direction.method_10165();
                    }
                }
                entity.method_18800(e, g, h);
            }
            double i = 0.0;
            Iterator iterator = list2.iterator();
            while (!(!iterator.hasNext() || (box3 = class_4623.method_23362((class_238)ModPistonBlockEntity.offsetHeadBox(pos, box2 = (class_238)iterator.next(), blockEntity), (class_2350)direction, (double)d)).method_994(box4 = entity.method_5829()) && (i = Math.max(i, ModPistonBlockEntity.getIntersectionSize(box3, direction, box4))) >= d)) {
            }
            if (i <= 0.0) continue;
            i = Math.min(i, d) + 0.01;
            ModPistonBlockEntity.moveEntity(direction, entity, i, direction);
            if (blockEntity.extending || !blockEntity.source) continue;
            ModPistonBlockEntity.push(pos, entity, direction, d);
        }
    }

    private static void moveEntity(class_2350 direction, class_1297 entity, double d, class_2350 direction2) {
        field_12205.set(direction);
        entity.method_5784(class_1313.field_6310, new class_243(d * (double)direction2.method_10148(), d * (double)direction2.method_10164(), d * (double)direction2.method_10165()));
        field_12205.set(null);
    }

    private static void moveEntitiesInHoneyBlock(class_1937 world, class_2338 pos, float f, ModPistonBlockEntity blockEntity) {
        if (!blockEntity.isPushingHoneyBlock()) {
            return;
        }
        class_2350 direction = blockEntity.getMovementDirection();
        if (!direction.method_10166().method_10179()) {
            return;
        }
        double d = blockEntity.pushedBlock.method_26220((class_1922)world, pos).method_1105(class_2350.class_2351.field_11052);
        class_238 box = ModPistonBlockEntity.offsetHeadBox(pos, new class_238(0.0, d, 0.0, 1.0, 1.5000000999999998, 1.0), blockEntity);
        double e = f - blockEntity.progress;
        List list = world.method_8333(null, box, entity -> ModPistonBlockEntity.canMoveEntity(box, entity));
        for (class_1297 entity2 : list) {
            ModPistonBlockEntity.moveEntity(direction, entity2, e, direction);
        }
    }

    private static boolean canMoveEntity(class_238 box, class_1297 entity) {
        return entity.method_5657() == class_3619.field_15974 && entity.method_24828() && entity.method_23317() >= box.field_1323 && entity.method_23317() <= box.field_1320 && entity.method_23321() >= box.field_1321 && entity.method_23321() <= box.field_1324;
    }

    private boolean isPushingHoneyBlock() {
        return this.pushedBlock.method_27852(class_2246.field_21211);
    }

    public class_2350 getMovementDirection() {
        return this.extending ? this.facing : this.facing.method_10153();
    }

    private static double getIntersectionSize(class_238 box, class_2350 direction, class_238 box2) {
        switch (direction) {
            case field_11034: {
                return box.field_1320 - box2.field_1323;
            }
            case field_11039: {
                return box2.field_1320 - box.field_1323;
            }
            default: {
                return box.field_1325 - box2.field_1322;
            }
            case field_11033: {
                return box2.field_1325 - box.field_1322;
            }
            case field_11035: {
                return box.field_1324 - box2.field_1321;
            }
            case field_11043: 
        }
        return box2.field_1324 - box.field_1321;
    }

    private static class_238 offsetHeadBox(class_2338 pos, class_238 box, ModPistonBlockEntity blockEntity) {
        double d = blockEntity.getAmountExtended(blockEntity.progress);
        return box.method_989((double)pos.method_10263() + d * (double)blockEntity.facing.method_10148(), (double)pos.method_10264() + d * (double)blockEntity.facing.method_10164(), (double)pos.method_10260() + d * (double)blockEntity.facing.method_10165());
    }

    private static void push(class_2338 pos, class_1297 entity, class_2350 direction, double amount) {
        class_238 box2;
        class_238 box = entity.method_5829();
        if (box.method_994(box2 = class_259.method_1077().method_1107().method_996(pos))) {
            double d;
            double d2;
            class_2350 direction2 = direction.method_10153();
            double d3 = ModPistonBlockEntity.getIntersectionSize(box2, direction2, box) + 0.01;
            double e = ModPistonBlockEntity.getIntersectionSize(box2, direction2, box.method_999(box2)) + 0.01;
            if (Math.abs(d2 - d) < 0.01) {
                d3 = Math.min(d3, amount) + 0.01;
                ModPistonBlockEntity.moveEntity(direction, entity, d3, direction2);
            }
        }
    }

    public class_2680 getPushedBlock() {
        return this.pushedBlock;
    }

    public void finish() {
        if (this.field_11863 != null && (this.lastProgress < 1.0f || this.field_11863.field_9236)) {
            this.progress = 1.0f;
            this.lastProgress = 1.0f;
            this.field_11863.method_8544(this.field_11867);
            this.method_11012();
            if (this.field_11863.method_8320(this.field_11867).method_27852(ModBlocks.MOD_MOVING_PISTON)) {
                class_2680 blockState = this.source ? class_2246.field_10124.method_9564() : class_2248.method_9510((class_2680)this.pushedBlock, (class_1936)this.field_11863, (class_2338)this.field_11867);
                this.field_11863.method_8652(this.field_11867, blockState, 3);
                this.field_11863.method_8492(this.field_11867, blockState.method_26204(), this.field_11867);
            }
        }
    }

    public static void tick(class_1937 world, class_2338 pos, class_2680 state, ModPistonBlockEntity blockEntity) {
        blockEntity.savedWorldTime = world.method_8510();
        blockEntity.lastProgress = blockEntity.progress;
        if (blockEntity.lastProgress >= 1.0f) {
            if (world.field_9236 && blockEntity.field_26705 < 5) {
                ++blockEntity.field_26705;
                return;
            }
            world.method_8544(pos);
            blockEntity.method_11012();
            if (world.method_8320(pos).method_27852(ModBlocks.MOD_MOVING_PISTON)) {
                class_2680 blockState = class_2248.method_9510((class_2680)blockEntity.pushedBlock, (class_1936)world, (class_2338)pos);
                if (blockState.method_26215()) {
                    world.method_8652(pos, blockEntity.pushedBlock, 84);
                    class_2248.method_30094((class_2680)blockEntity.pushedBlock, (class_2680)blockState, (class_1936)world, (class_2338)pos, (int)3);
                } else {
                    if (blockState.method_28498((class_2769)class_2741.field_12508) && ((Boolean)blockState.method_11654((class_2769)class_2741.field_12508)).booleanValue()) {
                        blockState = (class_2680)blockState.method_11657((class_2769)class_2741.field_12508, (Comparable)Boolean.valueOf(false));
                    }
                    world.method_8652(pos, blockState, 67);
                    world.method_8492(pos, blockState.method_26204(), pos);
                }
            }
            return;
        }
        float f = blockEntity.progress + 0.5f;
        ModPistonBlockEntity.pushEntities(world, pos, f, blockEntity);
        ModPistonBlockEntity.moveEntitiesInHoneyBlock(world, pos, f, blockEntity);
        blockEntity.progress = f;
        if (blockEntity.progress >= 1.0f) {
            blockEntity.progress = 1.0f;
        }
    }

    public void method_11014(class_2487 nbt) {
        super.method_11014(nbt);
        class_7225.class_7226 registryEntryLookup = this.field_11863 != null ? this.field_11863.method_45448(class_7924.field_41254) : class_7923.field_41175.method_46771();
        this.pushedBlock = class_2512.method_10681((class_7871)registryEntryLookup, (class_2487)nbt.method_10562("blockState"));
        this.facing = class_2350.method_10143((int)nbt.method_10550("facing"));
        this.lastProgress = this.progress = nbt.method_10583("progress");
        this.extending = nbt.method_10577("extending");
        this.source = nbt.method_10577("source");
    }

    protected void method_11007(class_2487 nbt) {
        super.method_11007(nbt);
        nbt.method_10566("blockState", (class_2520)class_2512.method_10686((class_2680)this.pushedBlock));
        nbt.method_10569("facing", this.facing.method_10146());
        nbt.method_10548("progress", this.lastProgress);
        nbt.method_10556("extending", this.extending);
        nbt.method_10556("source", this.source);
    }

    public class_265 getCollisionShape(class_1922 world, class_2338 pos) {
        class_265 voxelShape = !this.extending && this.source && this.pushedBlock.method_26204() instanceof ModPistonBlock ? ((class_2680)this.pushedBlock.method_11657((class_2769)ModPistonBlock.EXTENDED, (Comparable)Boolean.valueOf(true))).method_26220(world, pos) : class_259.method_1073();
        class_2350 direction = field_12205.get();
        if ((double)this.progress < 1.0 && direction == this.getMovementDirection()) {
            return voxelShape;
        }
        class_2680 blockState = this.isSource() ? (class_2680)((class_2680)ModBlocks.MOD_PISTON_HEAD.method_9564().method_11657((class_2769)ModPistonHeadBlock.field_10927, (Comparable)this.facing)).method_11657((class_2769)ModPistonHeadBlock.SHORT, (Comparable)Boolean.valueOf(this.extending != 1.0f - this.progress < 0.25f)) : this.pushedBlock;
        float f = this.getAmountExtended(this.progress);
        double d = (float)this.facing.method_10148() * f;
        double e = (float)this.facing.method_10164() * f;
        double g = (float)this.facing.method_10165() * f;
        return class_259.method_1084((class_265)voxelShape, (class_265)blockState.method_26220(world, pos).method_1096(d, e, g));
    }

    public long getSavedWorldTime() {
        return this.savedWorldTime;
    }
}

