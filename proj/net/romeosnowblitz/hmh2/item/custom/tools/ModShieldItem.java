/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1657
 *  net.minecraft.class_1738
 *  net.minecraft.class_1746
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1836
 *  net.minecraft.class_1839
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2315
 *  net.minecraft.class_2357
 *  net.minecraft.class_2561
 *  net.minecraft.class_3489
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.item.custom.tools;

import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1657;
import net.minecraft.class_1738;
import net.minecraft.class_1746;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1836;
import net.minecraft.class_1839;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2315;
import net.minecraft.class_2357;
import net.minecraft.class_2561;
import net.minecraft.class_3489;
import org.jetbrains.annotations.Nullable;

public class ModShieldItem
extends class_1792 {
    public static final int field_30918 = 5;
    public static final float MIN_DAMAGE_AMOUNT_TO_BREAK = 3.0f;
    public static final String BASE_KEY = "Base";

    public ModShieldItem(class_1792.class_1793 settings) {
        super(settings);
        class_2315.method_10009((class_1935)this, (class_2357)class_1738.field_7879);
    }

    public String method_7866(class_1799 stack) {
        if (class_1747.method_38072((class_1799)stack) != null) {
            String var10000 = this.method_7876();
            return var10000;
        }
        return super.method_7866(stack);
    }

    public void method_7851(class_1799 stack, @Nullable class_1937 world, List<class_2561> tooltip, class_1836 context) {
        class_1746.method_7705((class_1799)stack, tooltip);
    }

    public class_1839 method_7853(class_1799 stack) {
        return class_1839.field_8949;
    }

    public int method_7881(class_1799 stack) {
        return 72000;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_1799 itemStack = user.method_5998(hand);
        user.method_6019(hand);
        return class_1271.method_22428((Object)itemStack);
    }

    public boolean method_7878(class_1799 stack, class_1799 ingredient) {
        return ingredient.method_31573(class_3489.field_15537) || super.method_7878(stack, ingredient);
    }
}

