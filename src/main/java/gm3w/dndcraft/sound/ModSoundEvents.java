package gm3w.dndcraft.sound;

import gm3w.dndcraft.DnDcraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DnDcraft.MOD_ID);

    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_WOOD = registerSoundEvents("armor.equip_wood");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_COPPER_CHAIN = registerSoundEvents("armor.equip_copper_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_GOLD_CHAIN = registerSoundEvents("armor.equip_gold_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_COPPER = registerSoundEvents("armor.equip_copper");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_SILVER_CHAIN = registerSoundEvents("armor.equip_silver_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_SILVER = registerSoundEvents("armor.equip_silver");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_DINO = registerSoundEvents("armor.equip_dino");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_TITANIUM_CHAIN = registerSoundEvents("armor.equip_titanium_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_TITANIUM = registerSoundEvents("armor.equip_titanium");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_DWARVEN = registerSoundEvents("armor.equip_dwarven");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_VANADIUM_CHAIN = registerSoundEvents("armor.equip_vanadium_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_VANADIUM = registerSoundEvents("armor.equip_vanadium");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_DRAGON = registerSoundEvents("armor.equip_dragon");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_MITHRIL_CHAIN = registerSoundEvents("armor.equip_mithril_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_MITHRIL = registerSoundEvents("armor.equip_mithril");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_AZER = registerSoundEvents("armor.equip_azer");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_ADAMANTINE_CHAIN = registerSoundEvents("armor.equip_adamantine_chain");
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_ADAMANTINE = registerSoundEvents("armor.equip_adamantine");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(DnDcraft.MOD_ID, name)));
    }

    public static void init(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
