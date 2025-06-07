package gm3w.dndcraft.mixin;

import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.CombatRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(CombatRules.class)
public class CombatRulesMixin {

    @Overwrite()
    public static float getDamageAfterAbsorb(float pDamage, float pTotalArmor, float pToughnessAttribute) {
        float minFraction = 10.0F / (10.0F + pTotalArmor);
        float cutoff = 10.0F * ((float) Math.pow(1.2F, pTotalArmor / 4.0F) - 1.0F);
        return pDamage * Mth.clamp(minFraction + 0.1F * (pDamage - cutoff), minFraction, 1.0F);
    }
}
