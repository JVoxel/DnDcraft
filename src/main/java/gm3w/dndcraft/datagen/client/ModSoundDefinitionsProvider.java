package gm3w.dndcraft.datagen.client;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.sound.ModSoundEvents;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import net.minecraftforge.registries.RegistryObject;

public abstract class ModSoundDefinitionsProvider extends SoundDefinitionsProvider {

    public ModSoundDefinitionsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, DnDcraft.MOD_ID, helper);
    }

    public void registerSounds() {
        simpleSound(ModSoundEvents.ARMOR_EQUIP_WOOD);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_COPPER_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_GOLD_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_COPPER);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_SILVER_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_SILVER);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_DINO);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_TITANIUM_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_TITANIUM);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_DWARVEN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_VANADIUM_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_VANADIUM);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_DRAGON);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_MITHRIL_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_MITHRIL);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_AZER);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_ADAMANTINE_CHAIN);
        simpleSound(ModSoundEvents.ARMOR_EQUIP_ADAMANTINE);
    }

    private void simpleSound(RegistryObject<SoundEvent> sound) {
        add(sound.get(), definition()
                .subtitle(sound.getId().toString())
                .with(sound(new ResourceLocation(DnDcraft.MOD_ID, sound.getId().getPath()))));
    }
}
