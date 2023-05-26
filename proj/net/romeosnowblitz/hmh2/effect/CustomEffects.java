/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293$class_7247
 *  net.minecraft.class_1322$class_1323
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_4081
 *  net.minecraft.class_5134
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.effect;

import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1322;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_4081;
import net.minecraft.class_5134;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.effect.AnchoredEffect;
import net.romeosnowblitz.hmh2.effect.ConduitFailureEffect;
import net.romeosnowblitz.hmh2.effect.DolphinsCurseEffect;
import net.romeosnowblitz.hmh2.effect.EnderSkinEffect;
import net.romeosnowblitz.hmh2.effect.HealthShrikageEffect;
import net.romeosnowblitz.hmh2.effect.InsusceptibilityEffect;
import net.romeosnowblitz.hmh2.effect.KindlingEffect;
import net.romeosnowblitz.hmh2.effect.LunarWolfPerceptionEffect;
import net.romeosnowblitz.hmh2.effect.NormieEffect;
import net.romeosnowblitz.hmh2.effect.PoisonImmunityEffect;
import net.romeosnowblitz.hmh2.effect.SightlessnessEffect;

public class CustomEffects {
    public static class_1291 ANCHORED;
    public static class_1291 CONDUIT_FAILURE;
    public static class_1291 DOLPHINS_CURSE;
    public static class_1291 ENDER_SKIN;
    public static class_1291 HEALTH_SHRINKAGE;
    public static class_1291 NORMIE;
    public static class_1291 KINDLING;
    public static class_1291 LUNAR_WOLF_PERCEPTION;
    public static class_1291 POISON_IMMUNITY;
    public static class_1291 SIGHTLESSSNESS;
    public static class_1291 INSUSCEPTIBILITY;

    public static class_1291 registerAnchoredStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new AnchoredEffect(class_4081.field_18272, 1485372)));
    }

    public static class_1291 registerConduitFailureStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new ConduitFailureEffect(class_4081.field_18272, 1485372)));
    }

    public static class_1291 registerDolphinsCurseStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new DolphinsCurseEffect(class_4081.field_18272, 1485372)));
    }

    public static class_1291 registerEnderSkinStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new EnderSkinEffect(class_4081.field_18272, 1485372)));
    }

    public static class_1291 registerHealthShrinkageStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)new HealthShrikageEffect(class_4081.field_18272, 1485372).method_5566(class_5134.field_23716, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", -1.0, class_1322.class_1323.field_6328));
    }

    public static class_1291 registerInsusceptibilityStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new InsusceptibilityEffect(class_4081.field_18271, 1485372)));
    }

    public static class_1291 registerKindlingStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)new KindlingEffect(class_4081.field_18272, 1485372).method_42126(() -> new class_1293.class_7247(22)));
    }

    public static class_1291 registerLunarWolfPerceptionStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new LunarWolfPerceptionEffect(class_4081.field_18271, 1485372)));
    }

    public static class_1291 registerNormieStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new NormieEffect(class_4081.field_18273, 1485372)));
    }

    public static class_1291 registerPoisonImmunityStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new PoisonImmunityEffect(class_4081.field_18271, 1485372)));
    }

    public static class_1291 registerSightlessnessStatusEffect(String name) {
        return (class_1291)class_2378.method_10230((class_2378)class_7923.field_41174, (class_2960)new class_2960("hmh2", name), (Object)((Object)new SightlessnessEffect(class_4081.field_18272, 1485372)));
    }

    public static void registerEffects() {
        ANCHORED = CustomEffects.registerAnchoredStatusEffect("anchored");
        CONDUIT_FAILURE = CustomEffects.registerConduitFailureStatusEffect("conduit_failure");
        DOLPHINS_CURSE = CustomEffects.registerDolphinsCurseStatusEffect("dolphins_curse");
        ENDER_SKIN = CustomEffects.registerEnderSkinStatusEffect("ender_skin");
        HEALTH_SHRINKAGE = CustomEffects.registerHealthShrinkageStatusEffect("health_shrinkage");
        INSUSCEPTIBILITY = CustomEffects.registerInsusceptibilityStatusEffect("insusceptibility");
        KINDLING = CustomEffects.registerKindlingStatusEffect("kindling");
        LUNAR_WOLF_PERCEPTION = CustomEffects.registerLunarWolfPerceptionStatusEffect("lunar_wolf_perception");
        NORMIE = CustomEffects.registerNormieStatusEffect("normie");
        POISON_IMMUNITY = CustomEffects.registerPoisonImmunityStatusEffect("poison_immunity");
        SIGHTLESSSNESS = CustomEffects.registerSightlessnessStatusEffect("sightlessness");
    }
}

