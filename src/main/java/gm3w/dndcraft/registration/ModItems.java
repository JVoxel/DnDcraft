package gm3w.dndcraft.registration;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.setup.ModSetup;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DnDcraft.MOD_ID);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);


    public static final RegistryObject<Item> SILVER_ORE = registerBlock(ModBlocks.SILVER_ORE);
    public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = registerBlock(ModBlocks.DEEPSLATE_SILVER_ORE);
    public static final RegistryObject<Item> TITANIUM_ORE = registerBlock(ModBlocks.TITANIUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_TITANIUM_ORE = registerBlock(ModBlocks.DEEPSLATE_TITANIUM_ORE);
    public static final RegistryObject<Item> MITHRIL_ORE = registerBlock(ModBlocks.MITHRIL_ORE);
    public static final RegistryObject<Item> ADAMANT_ORE = registerBlock(ModBlocks.ADAMANT_ORE);

    public static final RegistryObject<Item> SILVER_BLOCK = registerBlock(ModBlocks.SILVER_BLOCK);
    public static final RegistryObject<Item> TITANIUM_BLOCK = registerBlock(ModBlocks.TITANIUM_BLOCK);
    public static final RegistryObject<Item> MITHRIL_BLOCK = registerBlock(ModBlocks.MITHRIL_BLOCK);
    public static final RegistryObject<Item> ADAMANTINE_BLOCK = registerBlock(ModBlocks.ADAMANTINE_BLOCK);

    public static final RegistryObject<Item> COPPER_NUGGET = registerItem("copper_nugget");

    public static final RegistryObject<Item> RAW_SILVER = registerItem("raw_silver");
    public static final RegistryObject<Item> SILVER_INGOT = registerItem("silver_ingot");
    public static final RegistryObject<Item> SILVER_NUGGET = registerItem("silver_nugget");

    public static final RegistryObject<Item> RAW_TITANIUM = registerItem("raw_titanium");
    public static final RegistryObject<Item> TITANIUM_INGOT = registerItem("titanium_ingot");
    public static final RegistryObject<Item> TITANIUM_NUGGET = registerItem("titanium_nugget");

    public static final RegistryObject<Item> RAW_MITHRIL = registerItem("raw_mithril");
    public static final RegistryObject<Item> MITHRIL_INGOT = registerItem("mithril_ingot");
    public static final RegistryObject<Item> MITHRIL_NUGGET = registerItem("mithril_nugget");

    public static final RegistryObject<Item> RAW_ADAMANT = registerItem("raw_adamant");
    public static final RegistryObject<Item> ADAMANTINE_INGOT = registerItem("adamantine_ingot");
    public static final RegistryObject<Item> ADAMANTINE_NUGGET = registerItem("adamantine_nugget");

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
