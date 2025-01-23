package gm3w.dndcraft.mixin;

import net.minecraftforge.common.TierSortingRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(TierSortingRegistry.class)
public abstract class TierSortingRegistryMixin {

    @ModifyConstant(method = {"isCorrectTierVanilla(Lnet/minecraft/world/item/Tier;Lnet/minecraft/world/level/block/state/BlockState;)Z"}, constant = @Constant(intValue = 3), remap = false)
    private static int changeIronLevel(int constant) {
        return 5;
    }
    @ModifyConstant(method = {"isCorrectTierVanilla(Lnet/minecraft/world/item/Tier;Lnet/minecraft/world/level/block/state/BlockState;)Z"}, constant = @Constant(intValue = 2), remap = false)
    private static int changeDiamondLevel(int constant) {
        return 3;
    }

}
