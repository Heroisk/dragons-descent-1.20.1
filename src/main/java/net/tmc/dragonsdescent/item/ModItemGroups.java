package net.tmc.dragonsdescent.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tmc.dragonsdescent.DragonsDescent;

public class ModItemGroups {
    public static final ItemGroup DRAGONDESCENT_GROUP = Registry.register(Registries.ITEM_GROUP,
            // DisplayName = What shows when you hover over item group, if the group name changes, chang in land
            // .icon(() -> new ItemStack(ModsItems.TESTITEM)) is what item shows, with TESTITEM being it
            // can add vanilla items with entries.add(Items.DIAMOND);
            // the order they are in is the order they are in the tab
            // can run even with the Statement lambda can be replaced with expression lambda. haha idk what that means!
            new Identifier(DragonsDescent.MOD_ID, "dragonsdescent"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dragonsdescent"))
                .icon(() -> new ItemStack(ModsItems.TESTITEM)).entries((displayContext, entries) -> {
                        entries.add(ModsItems.TESTITEM);
                }).build());
    public static void registerItemGroup(){
        DragonsDescent.LOGGER.info("Registering Item Groups for " + DragonsDescent.MOD_ID);
    }
}
