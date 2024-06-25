package net.toast.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.toast.tutorialmod.TutorialMod;
import net.toast.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHROMIUM_INGOT);

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);


                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_SWORD);

                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);


                        entries.add(ModItems.CHROMIUM_PICKAXE);
                        entries.add(ModItems.CHROMIUM_AXE);
                        entries.add(ModItems.CHROMIUM_SHOVEL);
                        entries.add(ModItems.CHROMIUM_HOE);
                        entries.add(ModItems.CHROMIUM_SWORD);

                        entries.add(ModItems.CHROMIUM_HELMET);
                        entries.add(ModItems.CHROMIUM_CHESTPLATE);
                        entries.add(ModItems.CHROMIUM_LEGGINGS);
                        entries.add(ModItems.CHROMIUM_BOOTS);


                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_SWORD);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);


                        entries.add(ModItems.ENDIUM_PICKAXE);
                        entries.add(ModItems.ENDIUM_AXE);
                        entries.add(ModItems.ENDIUM_SHOVEL);
                        entries.add(ModItems.ENDIUM_HOE);
                        entries.add(ModItems.ENDIUM_SWORD);

                        entries.add(ModItems.ENDIUM_HELMET);
                        entries.add(ModItems.ENDIUM_CHESTPLATE);
                        entries.add(ModItems.ENDIUM_LEGGINGS);
                        entries.add(ModItems.ENDIUM_BOOTS);


                        entries.add(ModItems.ULTIMITE_PICKAXE);
                        entries.add(ModItems.ULTIMITE_AXE);
                        entries.add(ModItems.ULTIMITE_SHOVEL);
                        entries.add(ModItems.ULTIMITE_HOE);
                        entries.add(ModItems.ULTIMITE_SWORD);

                        entries.add(ModItems.ULTIMITE_HELMET);
                        entries.add(ModItems.ULTIMITE_CHESTPLATE);
                        entries.add(ModItems.ULTIMITE_LEGGINGS);
                        entries.add(ModItems.CHROMIUM_BOOTS);

                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
