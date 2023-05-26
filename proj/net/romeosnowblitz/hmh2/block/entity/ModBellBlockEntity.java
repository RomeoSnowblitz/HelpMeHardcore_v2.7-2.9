/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1309
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_2586
 *  net.minecraft.class_2591
 *  net.minecraft.class_2680
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3532
 *  net.minecraft.class_4140
 *  net.minecraft.class_5253$class_5254
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package net.romeosnowblitz.hmh2.block.entity;

import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_2586;
import net.minecraft.class_2591;
import net.minecraft.class_2680;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_4140;
import net.minecraft.class_5253;
import org.apache.commons.lang3.mutable.MutableInt;

public class ModBellBlockEntity
extends class_2586 {
    private static final int MAX_RINGING_TICKS = 50;
    private static final int field_31317 = 60;
    private static final int field_31318 = 60;
    private static final int MAX_RESONATING_TICKS = 40;
    private static final int field_31320 = 5;
    private static final int field_31321 = 48;
    private static final int MAX_BELL_HEARING_DISTANCE = 32;
    private static final int field_31323 = 48;
    private long lastRingTime;
    public int ringTicks;
    public boolean ringing;
    public class_2350 lastSideHit;
    private List<class_1309> hearingEntities;
    private boolean resonating;
    private int resonateTime;

    public ModBellBlockEntity(class_2338 pos, class_2680 state) {
        super(class_2591.field_16413, pos, state);
    }

    public boolean method_11004(int type, int data) {
        if (type == 1) {
            this.notifyMemoriesOfBell();
            this.resonateTime = 0;
            this.lastSideHit = class_2350.method_10143((int)data);
            this.ringTicks = 0;
            this.ringing = true;
            return true;
        }
        return super.method_11004(type, data);
    }

    private static void tick(class_1937 world, class_2338 pos, ModBellBlockEntity blockEntity, Effect bellEffect) {
        ++blockEntity.ringTicks;
        blockEntity.ringing = false;
        blockEntity.ringTicks = 0;
        world.method_8396(null, pos, class_3417.field_19167, class_3419.field_15245, 1.0f, 1.0f);
        ++blockEntity.resonateTime;
        bellEffect.run(world, pos, blockEntity.hearingEntities);
    }

    public static void clientTick(class_1937 world, class_2338 pos, class_2680 state, ModBellBlockEntity blockEntity) {
        ModBellBlockEntity.tick(world, pos, blockEntity, ModBellBlockEntity::applyParticlesToRaiders);
    }

    public static void serverTick(class_1937 world, class_2338 pos, class_2680 state, ModBellBlockEntity blockEntity) {
        ModBellBlockEntity.tick(world, pos, blockEntity, ModBellBlockEntity::applyGlowToRaiders);
    }

    public void activate(class_2350 direction) {
        class_2338 blockPos = this.method_11016();
        this.lastSideHit = direction;
        if (this.ringing) {
            this.ringTicks = 0;
        } else {
            this.ringing = true;
        }
        this.field_11863.method_8427(blockPos, this.method_11010().method_26204(), 1, direction.method_10146());
    }

    private void notifyMemoriesOfBell() {
        class_2338 blockPos = this.method_11016();
        this.lastRingTime = this.field_11863.method_8510();
        class_238 box = new class_238(blockPos).method_1014(48.0);
        this.hearingEntities = this.field_11863.method_18467(class_1309.class, box);
        Iterator<class_1309> var4 = this.hearingEntities.iterator();
        class_1309 livingEntity = var4.next();
        livingEntity.method_18868().method_18878(class_4140.field_19009, (Object)this.field_11863.method_8510());
    }

    private static boolean raidersHearBell(class_2338 pos, List<class_1309> hearingEntities) {
        class_1309 livingEntity;
        Iterator<class_1309> var2 = hearingEntities.iterator();
        do {
            if (var2.hasNext()) continue;
            return false;
        } while (!(livingEntity = var2.next()).method_5805() || livingEntity.method_31481() || !pos.method_19769((class_2374)livingEntity.method_19538(), 32.0));
        return true;
    }

    private static void applyGlowToRaiders(class_1937 world, class_2338 pos, List<class_1309> hearingEntities) {
        hearingEntities.stream().filter(entity -> ModBellBlockEntity.isRaiderEntity(pos, entity)).forEach(ModBellBlockEntity::applyGlowToEntity);
    }

    private static void applyParticlesToRaiders(class_1937 world, class_2338 pos, List<class_1309> hearingEntities) {
        MutableInt mutableInt = new MutableInt(16700985);
        int i = (int)hearingEntities.stream().filter(entity -> pos.method_19769((class_2374)entity.method_19538(), 48.0)).count();
        hearingEntities.stream().filter(entity -> ModBellBlockEntity.isRaiderEntity(pos, entity)).forEach(entity -> {
            float f = 1.0f;
            double d = Math.sqrt((entity.method_23317() - (double)pos.method_10263()) * (entity.method_23317() - (double)pos.method_10263()) + (entity.method_23321() - (double)pos.method_10260()) * (entity.method_23321() - (double)pos.method_10260()));
            double e = (double)((float)pos.method_10263() + 0.5f) + 1.0 / d * (entity.method_23317() - (double)pos.method_10263());
            double g = (double)((float)pos.method_10260() + 0.5f) + 1.0 / d * (entity.method_23321() - (double)pos.method_10260());
            int j = class_3532.method_15340((int)((i - 21) / -2), (int)3, (int)15);
            for (int k = 0; k < j; ++k) {
                int l = mutableInt.addAndGet(5);
                double h = (double)class_5253.class_5254.method_27765((int)l) / 255.0;
                double m = (double)class_5253.class_5254.method_27766((int)l) / 255.0;
                double n = (double)class_5253.class_5254.method_27767((int)l) / 255.0;
                world.method_8406((class_2394)class_2398.field_11226, e, (double)((float)pos.method_10264() + 0.5f), g, h, m, n);
            }
        });
    }

    private static boolean isRaiderEntity(class_2338 pos, class_1309 entity) {
        return entity.method_5805() && !entity.method_31481() && pos.method_19769((class_2374)entity.method_19538(), 48.0);
    }

    private static void applyGlowToEntity(class_1309 entity) {
        entity.method_6092(new class_1293(class_1294.field_5912, 60));
    }

    @FunctionalInterface
    private static interface Effect {
        public void run(class_1937 var1, class_2338 var2, List<class_1309> var3);
    }
}

