package gm3w.dndcraft.mixin;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Arrays;

@Mixin(ArmorMaterials.class)
public abstract class ArmorMaterialsMixin {

    private final int totalHealth;
    @Shadow
    private final int[] slotProtections;


    @Inject(method = "<init>", at = @At("TAIL"))
    private void constructorInjection(CallbackInfo ci) {
        this.totalHealth = Arrays.stream(slotProtections).sum();
    }
}
