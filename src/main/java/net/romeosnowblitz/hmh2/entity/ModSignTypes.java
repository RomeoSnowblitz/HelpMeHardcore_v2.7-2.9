package net.romeosnowblitz.hmh2.entity;

import net.minecraft.util.SignType;
import net.romeosnowblitz.hmh2.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType BANANA = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("banana"));
    public static final SignType CHERRY = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry"));
    public static final SignType JACARANDA= SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("jacaranda"));
    public static final SignType MAHOE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("mahoe"));
    public static final SignType MANGO = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("mango"));
    public static final SignType WILLOW = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("willow"));
}
