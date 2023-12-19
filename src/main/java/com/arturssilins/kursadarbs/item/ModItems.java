package com.arturssilins.kursadarbs.item;

import com.arturssilins.kursadarbs.KursaDarbs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KursaDarbs.MOD_ID);

    public static final RegistryObject<Item> LUMINITE_CRYSTAL = ITEMS.register("luminite_crystal",
            ()-> new Item(new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));

    public static final RegistryObject<Item> LUMINITE_SWORD = ITEMS.register("luminite_sword",
            () -> new SwordItem(ModItemTier.LUMINITE, 3, -2f,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_AXE = ITEMS.register("luminite_axe",
            () -> new AxeItem(ModItemTier.LUMINITE, 6, -3f,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_PICKAXE = ITEMS.register("luminite_pickaxe",
            () -> new PickaxeItem(ModItemTier.LUMINITE, -2, -1.9f,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_SHOVEL = ITEMS.register("luminite_shovel",
            () -> new ShovelItem(ModItemTier.LUMINITE, -2, -2f,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_HOE = ITEMS.register("luminite_hoe",
            () -> new HoeItem(ModItemTier.LUMINITE, -1, -2.1f,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));

    public static final RegistryObject<Item> LUMINITE_BOOTS = ITEMS.register("luminite_boots",
            () -> new ArmorItem(ModArmorMaterial.LUMINITE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_LEGGINGS = ITEMS.register("luminite_leggings",
            () -> new ArmorItem(ModArmorMaterial.LUMINITE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_CHESTPLATE = ITEMS.register("luminite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.LUMINITE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));
    public static final RegistryObject<Item> LUMINITE_HELMET = ITEMS.register("luminite_helmet",
            () -> new ArmorItem(ModArmorMaterial.LUMINITE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.KURSADARBS_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
