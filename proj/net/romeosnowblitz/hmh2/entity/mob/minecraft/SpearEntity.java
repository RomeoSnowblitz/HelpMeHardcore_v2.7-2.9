/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1310
 *  net.minecraft.class_1538
 *  net.minecraft.class_1657
 *  net.minecraft.class_1665
 *  net.minecraft.class_1665$class_1666
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1890
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2520
 *  net.minecraft.class_2940
 *  net.minecraft.class_2941
 *  net.minecraft.class_2943
 *  net.minecraft.class_2945
 *  net.minecraft.class_3218
 *  net.minecraft.class_3222
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3966
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.entity.mob.minecraft;

import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1310;
import net.minecraft.class_1538;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1890;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2520;
import net.minecraft.class_2940;
import net.minecraft.class_2941;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3966;
import org.jetbrains.annotations.Nullable;

public class SpearEntity
extends class_1665 {
    private static final class_2940<Byte> LOYALTY = class_2945.method_12791(SpearEntity.class, (class_2941)class_2943.field_13319);
    private static final class_2940<Boolean> ENCHANTED = class_2945.method_12791(SpearEntity.class, (class_2941)class_2943.field_13323);
    private class_1799 spearStack = new class_1799((class_1935)class_1802.field_8547);
    private boolean dealtDamage;
    public int returnTimer;

    public SpearEntity(class_1937 world, class_1309 owner, class_1799 stack) {
        super(class_1299.field_6127, owner, world);
        this.spearStack = stack.method_7972();
        this.field_6011.method_12778(LOYALTY, (Object)((byte)class_1890.method_8206((class_1799)stack)));
        this.field_6011.method_12778(ENCHANTED, (Object)stack.method_7958());
    }

    public SpearEntity(class_1299<SpearEntity> entityEntityType, class_1937 world) {
        super(entityEntityType, world);
    }

    protected void method_5693() {
        super.method_5693();
        this.field_6011.method_12784(LOYALTY, (Object)0);
        this.field_6011.method_12784(ENCHANTED, (Object)false);
    }

    public void method_5773() {
        if (this.field_7576 > 4) {
            this.dealtDamage = true;
        }
        class_1297 entity = this.method_24921();
        byte i = (Byte)this.field_6011.method_12789(LOYALTY);
        if (i > 0 && (this.dealtDamage || this.method_7441()) && entity != null) {
            if (!this.isOwnerAlive()) {
                if (!this.field_6002.field_9236 && this.field_7572 == class_1665.class_1666.field_7593) {
                    this.method_5699(this.method_7445(), 0.1f);
                }
                this.method_31472();
            } else {
                this.method_7433(true);
                class_243 vec3d = entity.method_33571().method_1020(this.method_19538());
                this.method_23327(this.method_23317(), this.method_23318() + vec3d.field_1351 * 0.015 * (double)i, this.method_23321());
                if (this.field_6002.field_9236) {
                    this.field_5971 = this.method_23318();
                }
                double d = 0.05 * (double)i;
                this.method_18799(this.method_18798().method_1021(0.95).method_1019(vec3d.method_1029().method_1021(d)));
                if (this.returnTimer == 0) {
                    this.method_5783(class_3417.field_14698, 10.0f, 1.0f);
                }
                ++this.returnTimer;
            }
        }
        super.method_5773();
    }

    private boolean isOwnerAlive() {
        class_1297 entity = this.method_24921();
        if (entity != null && entity.method_5805()) {
            return !(entity instanceof class_3222) || !entity.method_7325();
        }
        return false;
    }

    protected class_1799 method_7445() {
        return this.spearStack.method_7972();
    }

    public boolean isEnchanted() {
        return (Boolean)this.field_6011.method_12789(ENCHANTED);
    }

    @Nullable
    protected class_3966 method_7434(class_243 currentPosition, class_243 nextPosition) {
        return this.dealtDamage ? null : super.method_7434(currentPosition, nextPosition);
    }

    protected void method_7454(class_3966 entityHitResult) {
        class_1538 lightningEntity;
        class_2338 blockPos;
        class_1297 entity = entityHitResult.method_17782();
        float f = 8.0f;
        if (entity instanceof class_1309) {
            class_1309 livingEntity = (class_1309)entity;
            f += class_1890.method_8218((class_1799)this.spearStack, (class_1310)livingEntity.method_6046());
        }
        class_1297 entity2 = this.method_24921();
        class_1282 damageSource = this.field_6002.method_48963().method_48799((class_1297)this, (class_1297)(entity2 == null ? this : entity2));
        this.dealtDamage = true;
        class_3414 soundEvent = class_3417.field_15213;
        if (entity.method_5643(damageSource, f)) {
            if (entity.method_5864() == class_1299.field_6091) {
                return;
            }
            if (entity instanceof class_1309) {
                class_1309 livingEntity2 = (class_1309)entity;
                if (entity2 instanceof class_1309) {
                    class_1890.method_8210((class_1309)livingEntity2, (class_1297)entity2);
                    class_1890.method_8213((class_1309)((class_1309)entity2), (class_1297)livingEntity2);
                }
                this.method_7450(livingEntity2);
            }
        }
        this.method_18799(this.method_18798().method_18805(-0.01, -0.1, -0.01));
        float g = 1.0f;
        if (this.field_6002 instanceof class_3218 && this.field_6002.method_8546() && this.hasChanneling() && this.field_6002.method_8311(blockPos = entity.method_24515()) && (lightningEntity = (class_1538)class_1299.field_6112.method_5883(this.field_6002)) != null) {
            lightningEntity.method_29495(class_243.method_24955((class_2382)blockPos));
            lightningEntity.method_6961(entity2 instanceof class_3222 ? (class_3222)entity2 : null);
            this.field_6002.method_8649((class_1297)lightningEntity);
            soundEvent = class_3417.field_14896;
            g = 5.0f;
        }
        this.method_5783(soundEvent, g, 1.0f);
    }

    public boolean hasChanneling() {
        return class_1890.method_8228((class_1799)this.spearStack);
    }

    protected boolean method_34713(class_1657 player) {
        return super.method_34713(player) || this.method_7441() && this.method_34714((class_1297)player) && player.method_31548().method_7394(this.method_7445());
    }

    protected class_3414 method_7440() {
        return class_3417.field_15104;
    }

    public void method_5694(class_1657 player) {
        if (this.method_34714((class_1297)player) || this.method_24921() == null) {
            super.method_5694(player);
        }
    }

    public void method_5749(class_2487 nbt) {
        super.method_5749(nbt);
        if (nbt.method_10573("Spear", 10)) {
            this.spearStack = class_1799.method_7915((class_2487)nbt.method_10562("Spear"));
        }
        this.dealtDamage = nbt.method_10577("DealtDamage");
        this.field_6011.method_12778(LOYALTY, (Object)((byte)class_1890.method_8206((class_1799)this.spearStack)));
    }

    public void method_5652(class_2487 nbt) {
        super.method_5652(nbt);
        nbt.method_10566("Spear", (class_2520)this.spearStack.method_7953(new class_2487()));
        nbt.method_10556("DealtDamage", this.dealtDamage);
    }

    public void method_7446() {
        byte i = (Byte)this.field_6011.method_12789(LOYALTY);
        if (this.field_7572 != class_1665.class_1666.field_7593 || i <= 0) {
            super.method_7446();
        }
    }

    protected float method_7436() {
        return 0.99f;
    }

    public boolean method_5727(double cameraX, double cameraY, double cameraZ) {
        return true;
    }
}

