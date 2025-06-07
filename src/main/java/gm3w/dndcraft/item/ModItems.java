package gm3w.dndcraft.item;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.block.ModBlocks;
import gm3w.dndcraft.setup.ModSetup;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DnDcraft.MOD_ID);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    // Raw Materials

//    public static final RegistryObject<Item> DINOSAUR_HIDE = registerItem("dinosaur_hide");
//    public static final RegistryObject<Item> DRAGON_HIDE = registerItem("dragon_hide");

    public static final RegistryObject<Item> SILVER_ORE = registerBlock(ModBlocks.SILVER_ORE);
    public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = registerBlock(ModBlocks.DEEPSLATE_SILVER_ORE);
    public static final RegistryObject<Item> TITANIUM_ORE = registerBlock(ModBlocks.TITANIUM_ORE);
    public static final RegistryObject<Item> VANADIUM_ORE = registerBlock(ModBlocks.VANADIUM_ORE);
    public static final RegistryObject<Item> MITHRIL_ORE = registerBlock(ModBlocks.MITHRIL_ORE);
    public static final RegistryObject<Item> ADAMANT_ORE = registerBlock(ModBlocks.ADAMANT_ORE);

    public static final RegistryObject<Item> SILVER_BLOCK = registerBlock(ModBlocks.SILVER_BLOCK);
    public static final RegistryObject<Item> TITANIUM_BLOCK = registerBlock(ModBlocks.TITANIUM_BLOCK);
    public static final RegistryObject<Item> VANADIUM_BLOCK = registerBlock(ModBlocks.VANADIUM_BLOCK);
    public static final RegistryObject<Item> MITHRIL_BLOCK = registerBlock(ModBlocks.MITHRIL_BLOCK);
    public static final RegistryObject<Item> ADAMANTINE_BLOCK = registerBlock(ModBlocks.ADAMANTINE_BLOCK);

    public static final RegistryObject<Item> RAW_SILVER = registerItem("raw_silver");
    public static final RegistryObject<Item> RAW_TITANIUM = registerItem("raw_titanium");
    public static final RegistryObject<Item> RAW_VANADIUM = registerItem("raw_vanadium");
    public static final RegistryObject<Item> RAW_MITHRIL = registerItem("raw_mithril");
    public static final RegistryObject<Item> RAW_ADAMANT = registerItem("raw_adamant");

    public static final RegistryObject<Item> COPPER_NUGGET = registerItem("copper_nugget");
    public static final RegistryObject<Item> SILVER_NUGGET = registerItem("silver_nugget");
    public static final RegistryObject<Item> TITANIUM_NUGGET = registerItem("titanium_nugget");
    public static final RegistryObject<Item> VANADIUM_NUGGET = registerItem("vanadium_nugget");
    public static final RegistryObject<Item> MITHRIL_NUGGET = registerItem("mithril_nugget");
    public static final RegistryObject<Item> ADAMANTINE_NUGGET = registerItem("adamantine_nugget");

    public static final RegistryObject<Item> SILVER_INGOT = registerItem("silver_ingot");
    public static final RegistryObject<Item> TITANIUM_INGOT = registerItem("titanium_ingot");
    public static final RegistryObject<Item> VANADIUM_INGOT = registerItem("vanadium_ingot");
    public static final RegistryObject<Item> MITHRIL_INGOT = registerItem("mithril_ingot");
    public static final RegistryObject<Item> ADAMANTINE_INGOT = registerItem("adamantine_ingot");

    public static final RegistryObject<Item> COPPER_CHAINMAIL_PLATE = registerItem("copper_chainmail_plate");
    public static final RegistryObject<Item> IRON_CHAINMAIL_PLATE = registerItem("iron_chainmail_plate");
    public static final RegistryObject<Item> SILVER_CHAINMAIL_PLATE = registerItem("silver_chainmail_plate");
    public static final RegistryObject<Item> GOLD_CHAINMAIL_PLATE = registerItem("gold_chainmail_plate");
    public static final RegistryObject<Item> TITANIUM_CHAINMAIL_PLATE = registerItem("titanium_chainmail_plate");
    public static final RegistryObject<Item> VANADIUM_CHAINMAIL_PLATE = registerItem("vanadium_chainmail_plate");
    public static final RegistryObject<Item> MITHRIL_CHAINMAIL_PLATE = registerItem("mithril_chainmail_plate");
    public static final RegistryObject<Item> ADAMANTINE_CHAINMAIL_PLATE = registerItem("adamantine_chainmail_plate");

    // Tools

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword", () -> new SwordItem(ModTiers.BONE, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel", () -> new ShovelItem(ModTiers.BONE, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () -> new PickaxeItem(ModTiers.BONE, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe", () -> new AxeItem(ModTiers.BONE, 6, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe", () -> new HoeItem(ModTiers.BONE, 0, -1.0F, ITEM_PROPERTIES));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModTiers.COPPER, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModTiers.COPPER, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModTiers.COPPER, 6.0F, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModTiers.COPPER, 0, -1.0F, ITEM_PROPERTIES));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(Tiers.IRON, 6.0F, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, ITEM_PROPERTIES));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(ModTiers.TITANIUM, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(ModTiers.TITANIUM, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(ModTiers.TITANIUM, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(ModTiers.TITANIUM, 6.0F, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new HoeItem(ModTiers.TITANIUM, 0, -1.0F, ITEM_PROPERTIES));

    public static final RegistryObject<Item> VANADIUM_SWORD = ITEMS.register("vanadium_sword", () -> new SwordItem(ModTiers.VANADIUM, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_SHOVEL = ITEMS.register("vanadium_shovel", () -> new ShovelItem(ModTiers.VANADIUM, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_PICKAXE = ITEMS.register("vanadium_pickaxe", () -> new PickaxeItem(ModTiers.VANADIUM, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_AXE = ITEMS.register("vanadium_axe", () -> new AxeItem(ModTiers.VANADIUM, 6.0F, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_HOE = ITEMS.register("vanadium_hoe", () -> new HoeItem(ModTiers.VANADIUM, 0, -1.0F, ITEM_PROPERTIES));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(Tiers.NETHERITE, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(Tiers.NETHERITE, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(Tiers.NETHERITE, 6.0F, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(Tiers.NETHERITE, 0, -1.0F, ITEM_PROPERTIES));

    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword", () -> new SwordItem(ModTiers.ADAMANTINE, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel", () -> new ShovelItem(ModTiers.ADAMANTINE, 1.5F, -3F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe", () -> new PickaxeItem(ModTiers.ADAMANTINE, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe", () -> new AxeItem(ModTiers.ADAMANTINE, 6.0F, -3.1F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_HOE = ITEMS.register("adamantine_hoe", () -> new HoeItem(ModTiers.ADAMANTINE, 0, -1.0F, ITEM_PROPERTIES));

    // Armor
    public static final RegistryObject<Item> WOODEN_HELMET = ITEMS.register("wooden_helmet", () -> new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> WOODEN_CHESTPLATE = ITEMS.register("wooden_chestplate", () -> new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> WOODEN_LEGGINGS = ITEMS.register("wooden_leggings", () -> new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> WOODEN_BOOTS = ITEMS.register("wooden_boots", () -> new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> COPPER_CHAINMAIL_HELMET = ITEMS.register("copper_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_CHAINMAIL_CHESTPLATE = ITEMS.register("copper_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_CHAINMAIL_LEGGINGS = ITEMS.register("copper_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_CHAINMAIL_BOOTS = ITEMS.register("copper_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.COPPER_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> GOLD_CHAINMAIL_HELMET = ITEMS.register("gold_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.GOLD_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> GOLD_CHAINMAIL_CHESTPLATE = ITEMS.register("gold_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.GOLD_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> GOLD_CHAINMAIL_LEGGINGS = ITEMS.register("gold_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.GOLD_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> GOLD_CHAINMAIL_BOOTS = ITEMS.register("gold_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.GOLD_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> SILVER_CHAINMAIL_HELMET = ITEMS.register("silver_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.SILVER_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_CHAINMAIL_CHESTPLATE = ITEMS.register("silver_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.SILVER_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_CHAINMAIL_LEGGINGS = ITEMS.register("silver_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.SILVER_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_CHAINMAIL_BOOTS = ITEMS.register("silver_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.SILVER_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET, ITEM_PROPERTIES));

//    public static final RegistryObject<Item> DINO_HELMET = ITEMS.register("dino_helmet", () -> new ArmorItem(ModArmorMaterials.DINO, EquipmentSlot.HEAD, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DINO_CHESTPLATE = ITEMS.register("dino_chestplate", () -> new ArmorItem(ModArmorMaterials.DINO, EquipmentSlot.CHEST, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DINO_LEGGINGS = ITEMS.register("dino_leggings", () -> new ArmorItem(ModArmorMaterials.DINO, EquipmentSlot.LEGS, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DINO_BOOTS = ITEMS.register("dino_boots", () -> new ArmorItem(ModArmorMaterials.DINO, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> TITANIUM_CHAINMAIL_HELMET = ITEMS.register("titanium_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.TITANIUM_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_CHAINMAIL_CHESTPLATE = ITEMS.register("titanium_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.TITANIUM_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_CHAINMAIL_LEGGINGS = ITEMS.register("titanium_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.TITANIUM_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_CHAINMAIL_BOOTS = ITEMS.register("titanium_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.TITANIUM_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () -> new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", () -> new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", () -> new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () -> new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.FEET, ITEM_PROPERTIES));

//    public static final RegistryObject<Item> DWARVEN_HELMET = ITEMS.register("dwarven_helmet", () -> new ArmorItem(ModArmorMaterials.DWARVEN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DWARVEN_CHESTPLATE = ITEMS.register("dwarven_chestplate", () -> new ArmorItem(ModArmorMaterials.DWARVEN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DWARVEN_LEGGINGS = ITEMS.register("dwarven_leggings", () -> new ArmorItem(ModArmorMaterials.DWARVEN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DWARVEN_BOOTS = ITEMS.register("dwarven_boots", () -> new ArmorItem(ModArmorMaterials.DWARVEN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> VANADIUM_CHAINMAIL_HELMET = ITEMS.register("vanadium_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.VANADIUM_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_CHAINMAIL_CHESTPLATE = ITEMS.register("vanadium_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.VANADIUM_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_CHAINMAIL_LEGGINGS = ITEMS.register("vanadium_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.VANADIUM_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_CHAINMAIL_BOOTS = ITEMS.register("vanadium_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.VANADIUM_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> VANADIUM_HELMET = ITEMS.register("vanadium_helmet", () -> new ArmorItem(ModArmorMaterials.VANADIUM, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_CHESTPLATE = ITEMS.register("vanadium_chestplate", () -> new ArmorItem(ModArmorMaterials.VANADIUM, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_LEGGINGS = ITEMS.register("vanadium_leggings", () -> new ArmorItem(ModArmorMaterials.VANADIUM, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> VANADIUM_BOOTS = ITEMS.register("vanadium_boots", () -> new ArmorItem(ModArmorMaterials.VANADIUM, EquipmentSlot.FEET, ITEM_PROPERTIES));

//    public static final RegistryObject<Item> DRAGON_HELMET = ITEMS.register("dragon_helmet", () -> new ArmorItem(ModArmorMaterials.DRAGON, EquipmentSlot.HEAD, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DRAGON_CHESTPLATE = ITEMS.register("dragon_chestplate", () -> new ArmorItem(ModArmorMaterials.DRAGON, EquipmentSlot.CHEST, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DRAGON_LEGGINGS = ITEMS.register("dragon_leggings", () -> new ArmorItem(ModArmorMaterials.DRAGON, EquipmentSlot.LEGS, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> DRAGON_BOOTS = ITEMS.register("dragon_boots", () -> new ArmorItem(ModArmorMaterials.DRAGON, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> MITHRIL_CHAINMAIL_HELMET = ITEMS.register("mithril_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_CHAINMAIL_CHESTPLATE = ITEMS.register("mithril_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_CHAINMAIL_LEGGINGS = ITEMS.register("mithril_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_CHAINMAIL_BOOTS = ITEMS.register("mithril_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.FEET, ITEM_PROPERTIES));

//    public static final RegistryObject<Item> AZER_HELMET = ITEMS.register("azer_helmet", () -> new ArmorItem(ModArmorMaterials.AZER, EquipmentSlot.HEAD, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> AZER_CHESTPLATE = ITEMS.register("azer_chestplate", () -> new ArmorItem(ModArmorMaterials.AZER, EquipmentSlot.CHEST, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> AZER_LEGGINGS = ITEMS.register("azer_leggings", () -> new ArmorItem(ModArmorMaterials.AZER, EquipmentSlot.LEGS, ITEM_PROPERTIES));
//    public static final RegistryObject<Item> AZER_BOOTS = ITEMS.register("azer_boots", () -> new ArmorItem(ModArmorMaterials.AZER, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> ADAMANTINE_CHAINMAIL_HELMET = ITEMS.register("adamantine_chainmail_helmet", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE_CHAIN, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_CHAINMAIL_CHESTPLATE = ITEMS.register("adamantine_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE_CHAIN, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_CHAINMAIL_LEGGINGS = ITEMS.register("adamantine_chainmail_leggings", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE_CHAIN, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_CHAINMAIL_BOOTS = ITEMS.register("adamantine_chainmail_boots", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE_CHAIN, EquipmentSlot.FEET, ITEM_PROPERTIES));

    public static final RegistryObject<Item> ADAMANTINE_HELMET = ITEMS.register("adamantine_helmet", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_CHESTPLATE = ITEMS.register("adamantine_chestplate", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_LEGGINGS = ITEMS.register("adamantine_leggings", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> ADAMANTINE_BOOTS = ITEMS.register("adamantine_boots", () -> new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.FEET, ITEM_PROPERTIES));

    // Methods
    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    public static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(ITEM_PROPERTIES));
    }

    public static <B extends Block> RegistryObject<Item> registerBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
