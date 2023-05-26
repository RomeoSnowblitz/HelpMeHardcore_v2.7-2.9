/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder
 *  net.minecraft.class_1299
 *  net.minecraft.class_1311
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_4048
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.class_1299;
import net.minecraft.class_1311;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_4048;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.entity.mob.CalEntity;
import net.romeosnowblitz.hmh2.entity.mob.HellmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.MagmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.PenguinEntity;
import net.romeosnowblitz.hmh2.entity.mob.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import net.romeosnowblitz.hmh2.entity.mob.TheGreatHungerEntity;

public class MobEntities {
    public static final class_1299<PenguinEntity> PENGUIN = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "penguin"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6294, PenguinEntity::new).dimensions(class_4048.method_18385((float)0.4f, (float)0.3f)).build());
    public static final class_1299<ShadowCreatureEntity> SHADOW_CREATURE = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "shadow_creature"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, ShadowCreatureEntity::new).dimensions(class_4048.method_18385((float)0.8f, (float)1.6f)).build());
    public static final class_1299<SoldierBeeEntity> SOLDIER_BEE = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "soldier_bee"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, SoldierBeeEntity::new).dimensions(class_4048.method_18385((float)1.5f, (float)3.0f)).build());
    public static final class_1299<TheGreatHungerEntity> THE_GREAT_HUNGER = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "the_great_hunger"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6294, TheGreatHungerEntity::new).dimensions(class_4048.method_18385((float)0.6f, (float)0.6f)).build());
    public static final class_1299<QueenBeeEntity> QUEEN_BEE = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "queen_bee"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, QueenBeeEntity::new).dimensions(class_4048.method_18385((float)1.5f, (float)3.0f)).build());
    public static final class_1299<HellmiteEntity> HELLMITE = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "hellmite"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, HellmiteEntity::new).dimensions(class_4048.method_18385((float)0.7f, (float)0.3f)).build());
    public static final class_1299<MagmiteEntity> MAGMITE = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "magmite"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, MagmiteEntity::new).dimensions(class_4048.method_18385((float)0.7f, (float)0.3f)).build());
    public static final class_1299<CalEntity> CAL = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "cal"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, CalEntity::new).dimensions(class_4048.method_18385((float)0.9f, (float)1.8f)).build());
    public static final class_1299<SculkmiteEntity> SCULKMITE = (class_1299)class_2378.method_10230((class_2378)class_7923.field_41177, (class_2960)new class_2960("hmh2", "sculkmite"), (Object)FabricEntityTypeBuilder.create((class_1311)class_1311.field_6302, SculkmiteEntity::new).dimensions(class_4048.method_18385((float)0.7f, (float)0.3f)).build());
}

