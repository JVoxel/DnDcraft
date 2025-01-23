package gm3w.dndcraft.mixin;

import net.minecraft.world.item.Tiers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Tiers.class)
public abstract class TiersMixin {

    // WOOD

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(floatValue = 2.0F, ordinal = 0))
    private static float changeWoodSpeed(float constant) {
        return 1.0F;
    }

    // STONE

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(floatValue = 4.0F, ordinal = 0))
    private static float changeStoneSpeed(float constant) {
        return 2.0F;
    }

    // IRON

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(intValue = 2, ordinal = 1))
    private static int changeIronLevel(int constant) {
        return 3;
    }

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(intValue = 250, ordinal = 0))
    private static int changeIronUses(int constant) {
        return 505;
    }

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(floatValue = 6.0F, ordinal = 0))
    private static float changeIronSpeed(float constant) {
        return 4.0F;
    }

    // DIAMOND

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(intValue = 3, ordinal = 1))
    private static int changeDiamondLevel(int constant) {
        return 5;
    }

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(floatValue = 8.0F, ordinal = 0))
    private static float changeDiamondSpeed(float constant) {
        return 6.0F;
    }

    // NETHERITE

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(intValue = 4, ordinal = 1))
    private static int changeNetheriteLevel(int constant) {
         return 6;
    }

    @ModifyConstant(method = {"<clinit>()V"}, constant = @Constant(floatValue = 9.0F, ordinal = 0))
    private static float changeNetheriteSpeed(float constant) {
        return 8.0F;
    }

}
