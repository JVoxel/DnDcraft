package gm3w.dndcraft.mixin;

import gm3w.dndcraft.item.ModItems;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.function.Supplier;

@Mixin(ArmorMaterials.class)
public abstract class ArmorMaterialsMixin {

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ArmorMaterials;<init>(Ljava/lang/String;ILjava/lang/String;I[IILnet/minecraft/sounds/SoundEvent;FFLjava/util/function/Supplier;)V", ordinal = 1), index = 9)
    private static Supplier<Ingredient> changeChainmailRepairIngredient(Supplier<Ingredient> old) {
        return () -> Ingredient.of(ModItems.IRON_CHAINMAIL_PLATE.get());
    }
}
