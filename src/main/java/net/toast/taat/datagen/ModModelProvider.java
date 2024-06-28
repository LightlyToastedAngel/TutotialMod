package net.toast.taat.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.toast.taat.block.ModBlocks;
import net.toast.taat.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AETHERIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_AETHERIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AETHERIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ENDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULTIMITE_CRYSTAL, Models.GENERATED);


        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));


        itemModelGenerator.register(ModItems.AETHERIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_BOOTS));


        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));


        itemModelGenerator.register(ModItems.ENDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDIUM_BOOTS));


        itemModelGenerator.register(ModItems.ULTIMITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ULTIMITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ULTIMITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ULTIMITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ULTIMITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ULTIMITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ULTIMITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ULTIMITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ULTIMITE_BOOTS));
    }
}
