/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  net.minecraft.class_1275
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  net.minecraft.class_2338
 *  net.minecraft.class_2487
 *  net.minecraft.class_2499
 *  net.minecraft.class_2520
 *  net.minecraft.class_2561
 *  net.minecraft.class_2561$class_2562
 *  net.minecraft.class_2582
 *  net.minecraft.class_2586
 *  net.minecraft.class_2591
 *  net.minecraft.class_2622
 *  net.minecraft.class_2680
 *  net.minecraft.class_6880
 *  net.minecraft.class_7446
 *  net.minecraft.class_7923
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1275;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_2520;
import net.minecraft.class_2561;
import net.minecraft.class_2582;
import net.minecraft.class_2586;
import net.minecraft.class_2591;
import net.minecraft.class_2622;
import net.minecraft.class_2680;
import net.minecraft.class_6880;
import net.minecraft.class_7446;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.block.custom.block.ModAbstractBannerBlock;
import net.romeosnowblitz.hmh2.block.custom.block.ModBannerBlock;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import org.jetbrains.annotations.Nullable;

public class ModBannerBlockEntity
extends class_2586
implements class_1275 {
    public static final int field_31296 = 6;
    public static final String PATTERNS_KEY = "Patterns";
    public static final String PATTERN_KEY = "Pattern";
    public static final String COLOR_KEY = "Color";
    @Nullable
    private class_2561 customName;
    private ModDyeColor baseColor;
    @Nullable
    private class_2499 patternListNbt;
    @Nullable
    private List<Pair<class_6880<class_2582>, ModDyeColor>> patterns;

    public ModBannerBlockEntity(class_2338 pos, class_2680 state) {
        super(class_2591.field_11905, pos, state);
        this.baseColor = ((ModAbstractBannerBlock)state.method_26204()).getColor();
    }

    public ModBannerBlockEntity(class_2338 pos, class_2680 state, ModDyeColor baseColor) {
        this(pos, state);
        this.baseColor = baseColor;
    }

    @Nullable
    public static class_2499 getPatternListNbt(class_1799 stack) {
        class_2499 nbtList = null;
        class_2487 nbtCompound = class_1747.method_38072((class_1799)stack);
        if (nbtCompound != null && nbtCompound.method_10573(PATTERNS_KEY, 9)) {
            nbtList = nbtCompound.method_10554(PATTERNS_KEY, 10).method_10612();
        }
        return nbtList;
    }

    public void readFrom(class_1799 stack, ModDyeColor baseColor) {
        this.baseColor = baseColor;
        this.readFrom(stack);
    }

    public void readFrom(class_1799 stack) {
        this.patternListNbt = ModBannerBlockEntity.getPatternListNbt(stack);
        this.patterns = null;
        this.customName = stack.method_7938() ? stack.method_7964() : null;
    }

    public class_2561 method_5477() {
        return this.customName != null ? this.customName : class_2561.method_43471((String)"block.minecraft.banner");
    }

    @Nullable
    public class_2561 method_5797() {
        return this.customName;
    }

    public void setCustomName(class_2561 customName) {
        this.customName = customName;
    }

    protected void method_11007(class_2487 nbt) {
        super.method_11007(nbt);
        if (this.patternListNbt != null) {
            nbt.method_10566(PATTERNS_KEY, (class_2520)this.patternListNbt);
        }
        if (this.customName != null) {
            nbt.method_10582("CustomName", class_2561.class_2562.method_10867((class_2561)this.customName));
        }
    }

    public void method_11014(class_2487 nbt) {
        super.method_11014(nbt);
        if (nbt.method_10573("CustomName", 8)) {
            this.customName = class_2561.class_2562.method_10877((String)nbt.method_10558("CustomName"));
        }
        this.patternListNbt = nbt.method_10554(PATTERNS_KEY, 10);
        this.patterns = null;
    }

    public class_2622 toUpdatePacket() {
        return class_2622.method_38585((class_2586)this);
    }

    public class_2487 method_16887() {
        return this.method_38244();
    }

    public static int getPatternCount(class_1799 stack) {
        class_2487 nbtCompound = class_1747.method_38072((class_1799)stack);
        return nbtCompound != null && nbtCompound.method_10545(PATTERNS_KEY) ? nbtCompound.method_10554(PATTERNS_KEY, 10).size() : 0;
    }

    public List<Pair<class_6880<class_2582>, ModDyeColor>> getPatterns() {
        if (this.patterns == null) {
            this.patterns = ModBannerBlockEntity.getPatternsFromNbt(this.baseColor, this.patternListNbt);
        }
        return this.patterns;
    }

    public static List<Pair<class_6880<class_2582>, ModDyeColor>> getPatternsFromNbt(ModDyeColor baseColor, @Nullable class_2499 patternListNbt) {
        ArrayList list = Lists.newArrayList();
        list.add(Pair.of((Object)class_7923.field_41165.method_40290(class_7446.field_39151), (Object)((Object)baseColor)));
        if (patternListNbt != null) {
            for (int i = 0; i < patternListNbt.size(); ++i) {
                class_2487 nbtCompound = patternListNbt.method_10602(i);
                class_6880 registryEntry = class_2582.method_10946((String)nbtCompound.method_10558(PATTERN_KEY));
                if (registryEntry == null) continue;
                int j = nbtCompound.method_10550(COLOR_KEY);
                list.add(Pair.of((Object)registryEntry, (Object)((Object)ModDyeColor.byId(j))));
            }
        }
        return list;
    }

    public static void loadFromItemStack(class_1799 stack) {
        class_2499 nbtList;
        class_2487 nbtCompound = class_1747.method_38072((class_1799)stack);
        if (nbtCompound != null && nbtCompound.method_10573(PATTERNS_KEY, 9) && !(nbtList = nbtCompound.method_10554(PATTERNS_KEY, 10)).isEmpty()) {
            nbtList.method_10536(nbtList.size() - 1);
            if (nbtList.isEmpty()) {
                nbtCompound.method_10551(PATTERNS_KEY);
            }
            class_1747.method_38073((class_1799)stack, (class_2591)class_2591.field_11905, (class_2487)nbtCompound);
        }
    }

    public class_1799 getPickStack() {
        class_1799 itemStack = new class_1799((class_1935)ModBannerBlock.getForColor(this.baseColor));
        if (this.patternListNbt != null && !this.patternListNbt.isEmpty()) {
            class_2487 nbtCompound = new class_2487();
            nbtCompound.method_10566(PATTERNS_KEY, (class_2520)this.patternListNbt.method_10612());
            class_1747.method_38073((class_1799)itemStack, (class_2591)this.method_11017(), (class_2487)nbtCompound);
        }
        if (this.customName != null) {
            itemStack.method_7977(this.customName);
        }
        return itemStack;
    }

    public ModDyeColor getColorForState() {
        return this.baseColor;
    }
}

