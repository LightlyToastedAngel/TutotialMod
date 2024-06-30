package net.toast.taat.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.toast.taat.TAaT;

import static net.minecraft.item.Items.DIAMOND;
import static net.minecraft.item.Items.IRON_INGOT;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SHARD = registerItem("ruby_shard", new Item(new FabricItemSettings()));

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_SHARD = registerItem("sapphire_shard", new Item(new FabricItemSettings()));

    public static final Item ENDIUM_INGOT = registerItem("endium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDIUM = registerItem("raw_endium", new Item(new FabricItemSettings()));

    public static final Item AETHERIUM_INGOT = registerItem("aetherium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_AETHERIUM = registerItem("raw_aetherium", new Item(new FabricItemSettings()));

    public static final Item ULTIMITE_CRYSTAL = registerItem("ultimite_crystal", new Item(new FabricItemSettings()));


    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterial.SAPPHIRE, 2, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterial.SAPPHIRE, 5.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterial.SAPPHIRE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterial.SAPPHIRE, -3, 0.0f, new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterial.SAPPHIRE, 3, -2.4f, new FabricItemSettings().maxCount(1)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item AETHERIUM_PICKAXE = registerItem("aetherium_pickaxe",
            new PickaxeItem(ModToolMaterial.AETHERIUM, 2, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item AETHERIUM_AXE = registerItem("aetherium_axe",
            new AxeItem(ModToolMaterial.AETHERIUM, 5.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item AETHERIUM_SHOVEL = registerItem("aetherium_shovel",
            new ShovelItem(ModToolMaterial.AETHERIUM, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item AETHERIUM_HOE = registerItem("aetherium_hoe",
            new HoeItem(ModToolMaterial.AETHERIUM, -3, 0.0f, new FabricItemSettings().maxCount(1)));
    public static final Item AETHERIUM_SWORD = registerItem("aetherium_sword",
            new SwordItem(ModToolMaterial.AETHERIUM, 3, -2.4f, new FabricItemSettings().maxCount(1)));

    public static final Item AETHERIUM_HELMET = registerItem("aetherium_helmet",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AETHERIUM_CHESTPLATE = registerItem("aetherium_chestplate",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AETHERIUM_LEGGINGS = registerItem("aetherium_leggings",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AETHERIUM_BOOTS = registerItem("aetherium_boots",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 5.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, -3, 0.0f, new FabricItemSettings().maxCount(1)));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, new FabricItemSettings().maxCount(1)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item ENDIUM_PICKAXE = registerItem("endium_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDIUM, 2, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_AXE = registerItem("endium_axe",
            new AxeItem(ModToolMaterial.ENDIUM, 5.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_SHOVEL = registerItem("endium_shovel",
            new ShovelItem(ModToolMaterial.ENDIUM, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_HOE = registerItem("endium_hoe",
            new HoeItem(ModToolMaterial.ENDIUM, -3, 0.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_SWORD = registerItem("endium_sword",
            new SwordItem(ModToolMaterial.ENDIUM, 3, -2.4f, new FabricItemSettings().maxCount(1)));

    public static final Item ENDIUM_HELMET = registerItem("endium_helmet",
            new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDIUM_CHESTPLATE = registerItem("endium_chestplate",
            new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDIUM_LEGGINGS = registerItem("endium_leggings",
            new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDIUM_BOOTS = registerItem("endium_boots",
            new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item ULTIMITE_PICKAXE = registerItem("ultimite_pickaxe",
            new PickaxeItem(ModToolMaterial.ULTIMITE, 2, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item ULTIMITE_AXE = registerItem("ultimite_axe",
            new AxeItem(ModToolMaterial.ULTIMITE, 5.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ULTIMITE_SHOVEL = registerItem("ultimite_shovel",
            new ShovelItem(ModToolMaterial.ULTIMITE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ULTIMITE_HOE = registerItem("ultimite_hoe",
            new HoeItem(ModToolMaterial.ULTIMITE, -3, 0.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ULTIMITE_SWORD = registerItem("ultimite_sword",
            new SwordItem(ModToolMaterial.ULTIMITE, 3, -2.4f, new FabricItemSettings().maxCount(1)));

    public static final Item ULTIMITE_HELMET = registerItem("ultimite_helmet",
            new ArmorItem(ModArmorMaterials.ULTIMITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ULTIMITE_CHESTPLATE = registerItem("ultimite_chestplate",
            new ArmorItem(ModArmorMaterials.ULTIMITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ULTIMITE_LEGGINGS = registerItem("ultimite_leggings",
            new ArmorItem(ModArmorMaterials.ULTIMITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ULTIMITE_BOOTS = registerItem("ultimite_boots",
            new ArmorItem(ModArmorMaterials.ULTIMITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.addAfter(DIAMOND, RUBY);
        entries.addAfter(RUBY, SAPPHIRE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TAaT.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TAaT.LOGGER.info("Registering Mod Items for " + TAaT.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
