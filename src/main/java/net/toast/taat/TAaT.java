package net.toast.taat;

import net.fabricmc.api.ModInitializer;

import net.toast.taat.block.ModBlocks;
import net.toast.taat.item.ModItemGroups;
import net.toast.taat.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TAaT implements ModInitializer {
    public static final String MOD_ID = "taat";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}