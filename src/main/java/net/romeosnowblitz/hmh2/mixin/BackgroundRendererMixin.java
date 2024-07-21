package net.romeosnowblitz.hmh2.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {

    @WrapOperation(
            method = "applyFog",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;isSpectator()Z")
    )
    private static boolean isSpectator(Entity entity, Operation<Boolean> original){
        return entity instanceof PlayerEntity player && player.getEquippedStack(EquipmentSlot.HEAD).isOf(WarfareItems.SUMOLTERITE_HELMET) || original.call(entity);
    }

}
