package gm3w.dndcraft.item;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.ModTags;
import gm3w.dndcraft.sound.ModSoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    WOOD("wooden", 4, new int[]{1, 1, 2, 1}, 7, ModSoundEvents.ARMOR_EQUIP_WOOD.get(), 0, 0, () -> {
        return Ingredient.of(ItemTags.LOGS);
    }),
    COPPER_CHAIN("copper_chainmail", 9, new int[]{1, 2, 3, 2}, 19, ModSoundEvents.ARMOR_EQUIP_COPPER_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.COPPER_CHAINMAIL_PLATE.get());
    }),
    GOLD_CHAIN("golden_chainmail", 7, new int[]{1, 2, 3, 2}, 27, ModSoundEvents.ARMOR_EQUIP_GOLD_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.GOLD_CHAINMAIL_PLATE.get());
    }),
    COPPER("copper", 9, new int[]{2, 3, 4, 3}, 17, ModSoundEvents.ARMOR_EQUIP_COPPER.get(), 0, 0, () -> {
        return Ingredient.of(Items.COPPER_INGOT);
    }),
    SILVER_CHAIN("silver_chainmail", 14, new int[]{2, 3, 4, 3}, 26, ModSoundEvents.ARMOR_EQUIP_SILVER_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.SILVER_CHAINMAIL_PLATE.get());
    }),
    SILVER("silver", 14, new int[]{3, 4, 5, 4}, 23, ModSoundEvents.ARMOR_EQUIP_SILVER.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT.get());
    }),
//    DINO("dino", 13, new int[] {3, 4, 5, 4}, 13, ModSoundEvents.ARMOR_EQUIP_DINO.get(), 0, 0, () -> {
//        return Ingredient.of(ModItems.DINOSAUR_HIDE.get());
//    }),
    TITANIUM_CHAIN("titanium_chainmail", 23, new int[]{4, 5, 6, 5}, 11, ModSoundEvents.ARMOR_EQUIP_TITANIUM_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.TITANIUM_CHAINMAIL_PLATE.get());
    }),
    TITANIUM("titanium", 23, new int[]{5, 7, 7, 6}, 8, ModSoundEvents.ARMOR_EQUIP_TITANIUM.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.TITANIUM_INGOT.get());
    }),
//    DWARVEN("dwarven", 26, new int[]{5, 7, 7, 6}, 20, ModSoundEvents.ARMOR_EQUIP_DWARVEN.get(), 0, 0, () -> {
//        return Ingredient.of(ModTags.Items.NOTHING);
//    }),
    VANADIUM_CHAIN("vanadium_chainmail", 31, new int[]{5, 7, 7, 6}, 9, ModSoundEvents.ARMOR_EQUIP_VANADIUM_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.VANADIUM_CHAINMAIL_PLATE.get());
    }),
    VANADIUM("vanadium", 31, new int[]{6, 8, 9, 7}, 6, ModSoundEvents.ARMOR_EQUIP_VANADIUM.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.VANADIUM_INGOT.get());
    }),
//    DRAGON("dragon", 34, new int[]{6, 8, 9, 7}, 0, ModSoundEvents.ARMOR_EQUIP_DRAGON.get(), 0, 0, () -> {
//        return Ingredient.of(ModItems.DRAGON_HIDE.get());
//    }),
    MITHRIL_CHAIN("mithril_chainmail", 40, new int[]{6, 8, 9, 7}, 8, ModSoundEvents.ARMOR_EQUIP_MITHRIL_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.MITHRIL_CHAINMAIL_PLATE.get());
    }),
    MITHRIL("mithril", 40, new int[]{7, 10, 10, 8}, 5, ModSoundEvents.ARMOR_EQUIP_MITHRIL.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.MITHRIL_INGOT.get());
    }),
//    AZER("azer", 44, new int[]{7, 10, 10, 8}, 16, ModSoundEvents.ARMOR_EQUIP_AZER.get(), 0, 0, () -> {
//        return Ingredient.of(ModTags.Items.NOTHING);
//    }),
    ADAMANTINE_CHAIN("adamantine_chainmail", 50, new int[]{7, 10, 10, 8}, 7, ModSoundEvents.ARMOR_EQUIP_ADAMANTINE_CHAIN.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.ADAMANTINE_CHAINMAIL_PLATE.get());
    }),
    ADAMANTINE("adamantine", 50, new int[]{8, 11, 12, 9}, 4, ModSoundEvents.ARMOR_EQUIP_ADAMANTINE.get(), 0, 0, () -> {
        return Ingredient.of(ModItems.ADAMANTINE_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return DnDcraft.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
