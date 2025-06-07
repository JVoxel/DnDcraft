package gm3w.dndcraft.block;

import gm3w.dndcraft.DnDcraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DnDcraft.MOD_ID);

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties STORAGE_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().sound(SoundType.METAL);

    // Ores
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(ORE_PROPERTIES.strength(2f)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", () -> new Block(ORE_PROPERTIES.strength(2f)));
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new Block(ORE_PROPERTIES.strength(3f)));
    public static final RegistryObject<Block> VANADIUM_ORE = BLOCKS.register("vanadium_ore", () -> new Block(ORE_PROPERTIES.strength(4f)));
    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore", () -> new Block(ORE_PROPERTIES.strength(5f)));
    public static final RegistryObject<Block> ADAMANT_ORE = BLOCKS.register("adamant_ore", () -> new Block(ORE_PROPERTIES.strength(6f)));

    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(STORAGE_BLOCK_PROPERTIES.strength((3f))));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new Block(STORAGE_BLOCK_PROPERTIES.strength(5f)));
    public static final RegistryObject<Block> VANADIUM_BLOCK = BLOCKS.register("vanadium_block", () -> new Block(STORAGE_BLOCK_PROPERTIES.strength(6f)));
    public static final RegistryObject<Block> MITHRIL_BLOCK = BLOCKS.register("mithril_block", () -> new Block(STORAGE_BLOCK_PROPERTIES.strength(7f)));
    public static final RegistryObject<Block> ADAMANTINE_BLOCK = BLOCKS.register("adamantine_block", () -> new Block(STORAGE_BLOCK_PROPERTIES.strength(8f)));

    public static void init(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}

