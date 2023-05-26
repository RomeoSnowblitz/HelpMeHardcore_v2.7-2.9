/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1672
 *  net.minecraft.class_174
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_3218
 *  net.minecraft.class_3222
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3468
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3965
 *  net.minecraft.class_5712
 *  net.minecraft.class_5712$class_7397
 */
package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1672;
import net.minecraft.class_174;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5712;
import net.romeosnowblitz.hmh2.tag.ModStructureTags;

public class FortressSeeker
extends class_1792 {
    public FortressSeeker(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_3218 serverWorld;
        class_2338 blockPos;
        class_1799 itemStack = user.method_5998(hand);
        class_3965 hitResult = FortressSeeker.method_7872((class_1937)world, (class_1657)user, (class_3959.class_242)class_3959.class_242.field_1348);
        if (hitResult.method_17783() == class_239.class_240.field_1332 && world.method_8320(hitResult.method_17777()).method_27852(class_2246.field_10398)) {
            return class_1271.method_22430((Object)itemStack);
        }
        user.method_6019(hand);
        if (world instanceof class_3218 && (blockPos = (serverWorld = (class_3218)world).method_8487(ModStructureTags.NETHER_CORE, user.method_24515(), 100, false)) != null) {
            class_1672 eyeOfEnderEntity = new class_1672(world, user.method_23317(), user.method_23323(0.5), user.method_23321());
            eyeOfEnderEntity.method_16933(itemStack);
            eyeOfEnderEntity.method_7478(blockPos);
            world.method_32888(class_5712.field_28161, eyeOfEnderEntity.method_19538(), class_5712.class_7397.method_43285((class_1297)user));
            world.method_8649((class_1297)eyeOfEnderEntity);
            if (user instanceof class_3222) {
                class_174.field_1186.method_9157((class_3222)user, blockPos);
            }
            world.method_43128((class_1657)null, user.method_23317(), user.method_23318(), user.method_23321(), class_3417.field_15155, class_3419.field_15254, 0.5f, 0.4f / (world.method_8409().method_43057() * 0.4f + 0.8f));
            world.method_8444((class_1657)null, 1003, user.method_24515(), 0);
            if (!user.method_31549().field_7477) {
                itemStack.method_7934(1);
            }
            user.method_7259(class_3468.field_15372.method_14956((Object)this));
            user.method_23667(hand, true);
            return class_1271.method_22427((Object)itemStack);
        }
        return class_1271.method_22428((Object)itemStack);
    }
}

