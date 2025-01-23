package gm3w.dndcraft.mixin;

import net.minecraft.world.item.HoeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(HoeItem.class)
public abstract class HoeItemMixin {

    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/DiggerItem;<init>(FFLnet/minecraft/world/item/Tier;Lnet/minecraft/tags/TagKey;Lnet/minecraft/world/item/Item$Properties;)V"), index = 1)
    private static float changeHoeDamage(float pAttackDamageModifier) {
        return 1.0F;
    }
}
