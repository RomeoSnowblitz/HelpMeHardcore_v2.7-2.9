/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  net.minecraft.class_1293
 */
package net.romeosnowblitz.hmh2.item.custom.food;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import net.minecraft.class_1293;

public class ModFoodComponent {
    private final int hunger;
    private final float saturationModifier;
    private final boolean meat;
    private final boolean alwaysEdible;
    private final boolean snack;
    private final List<Pair<class_1293, Float>> statusEffects;

    ModFoodComponent(int hunger, float saturationModifier, boolean meat, boolean alwaysEdible, boolean snack, List<Pair<class_1293, Float>> statusEffects) {
        this.hunger = hunger;
        this.saturationModifier = saturationModifier;
        this.meat = meat;
        this.alwaysEdible = alwaysEdible;
        this.snack = snack;
        this.statusEffects = statusEffects;
    }

    public int getHunger() {
        return this.hunger;
    }

    public float getSaturationModifier() {
        return this.saturationModifier;
    }

    public boolean isMeat() {
        return this.meat;
    }

    public boolean isAlwaysEdible() {
        return this.alwaysEdible;
    }

    public boolean isSnack() {
        return this.snack;
    }

    public List<Pair<class_1293, Float>> getStatusEffects() {
        return this.statusEffects;
    }

    public static class Builder {
        private int hunger;
        private float saturationModifier;
        private boolean meat;
        private boolean alwaysEdible;
        private boolean snack;
        private final List<Pair<class_1293, Float>> statusEffects = Lists.newArrayList();

        public Builder hunger(int hunger) {
            this.hunger = hunger;
            return this;
        }

        public Builder saturationModifier(float saturationModifier) {
            this.saturationModifier = saturationModifier;
            return this;
        }

        public Builder meat() {
            this.meat = true;
            return this;
        }

        public Builder alwaysEdible() {
            this.alwaysEdible = true;
            return this;
        }

        public Builder snack() {
            this.snack = true;
            return this;
        }

        public Builder statusEffect(class_1293 effect, float chance) {
            this.statusEffects.add((Pair<class_1293, Float>)Pair.of((Object)effect, (Object)Float.valueOf(chance)));
            return this;
        }

        public ModFoodComponent build() {
            return new ModFoodComponent(this.hunger, this.saturationModifier, this.meat, this.alwaysEdible, this.snack, this.statusEffects);
        }

        public Builder addStatusEffect(class_1293 effect) {
            return this.addStatusEffect(effect);
        }
    }
}

