package net.toast.taat.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.toast.taat.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS,
                        ModItems.AETHERIUM_HELMET, ModItems.AETHERIUM_CHESTPLATE, ModItems.AETHERIUM_LEGGINGS, ModItems.AETHERIUM_BOOTS,
                        ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS,
                        ModItems.ENDIUM_HELMET, ModItems.ENDIUM_CHESTPLATE, ModItems.ENDIUM_LEGGINGS, ModItems.ENDIUM_BOOTS,
                        ModItems.ULTIMITE_HELMET, ModItems.ULTIMITE_CHESTPLATE, ModItems.ULTIMITE_LEGGINGS, ModItems.ULTIMITE_HELMET);
    }
}
