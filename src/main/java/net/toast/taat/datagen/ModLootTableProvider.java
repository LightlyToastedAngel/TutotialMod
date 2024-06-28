package net.toast.taat.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.toast.taat.block.ModBlocks;
import net.toast.taat.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.END_STONE_RUBY_ORE, oreDrops(ModBlocks.END_STONE_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, oreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY));

    }
}
