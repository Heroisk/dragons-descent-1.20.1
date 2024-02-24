package net.tmc.dragonsdescent.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tmc.dragonsdescent.DragonsDescent;

public class ModsItems {

    // Where you put new items added
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    // This makes them appear in creative inventory
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
    }

    // These two functions are used to register the items
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(DragonsDescent.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DragonsDescent.LOGGER.info("Registering Mod Items for " + DragonsDescent.MOD_ID);

        // used for creative tab inventory
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModsItems::addItemsToIngredientItemGroup);
    }

}
