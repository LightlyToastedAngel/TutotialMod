package net.toast.taat.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.toast.taat.TAaT;
import net.toast.taat.block.ModBlocks;


public class ModItemGroups {
    public static final ItemGroup ULTIMITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TAaT.MOD_ID, "ultimite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ultimite"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AETHERIUM_INGOT);
                        entries.add(ModItems.RAW_AETHERIUM);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RUBY_SHARD);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.SAPPHIRE_SHARD);

                        entries.add(ModBlocks.AETHERIUM_BLOCK);
                        entries.add(ModBlocks.RAW_AETHERIUM_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);

                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.RUBY_ORE);

                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_SWORD);

                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);


                        entries.add(ModItems.AETHERIUM_PICKAXE);
                        entries.add(ModItems.AETHERIUM_AXE);
                        entries.add(ModItems.AETHERIUM_SHOVEL);
                        entries.add(ModItems.AETHERIUM_HOE);
                        entries.add(ModItems.AETHERIUM_SWORD);

                        entries.add(ModItems.AETHERIUM_HELMET);
                        entries.add(ModItems.AETHERIUM_CHESTPLATE);
                        entries.add(ModItems.AETHERIUM_LEGGINGS);
                        entries.add(ModItems.AETHERIUM_BOOTS);


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
                        entries.add(ModItems.ULTIMITE_BOOTS);

                    }).build());


    public static void registerItemGroups() {
        net.toast.taat.TAaT.LOGGER.info("Registering Item Groups for " + net.toast.taat.TAaT.MOD_ID);
    }
}