package net.minecraftweter.colorfulbricks.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraftweter.colorfulbricks.ColorfulBricks;

public class ModItems {
    public static final Item RED_BRICK = registerItem("red_brick", new Item(new Item.Settings()));
    public static final Item ORANGE_BRICK = registerItem("orange_brick", new Item(new Item.Settings()));
    public static final Item YELLOW_BRICK = registerItem("yellow_brick", new Item(new Item.Settings()));
    public static final Item LIME_BRICK = registerItem("lime_brick", new Item(new Item.Settings()));
    public static final Item GREEN_BRICK = registerItem("green_brick", new Item(new Item.Settings()));
    public static final Item CYAN_BRICK = registerItem("cyan_brick", new Item(new Item.Settings()));
    public static final Item LIGHTBLUE_BRICK = registerItem("lightblue_brick", new Item(new Item.Settings()));
    public static final Item BLUE_BRICK = registerItem("blue_brick", new Item(new Item.Settings()));
    public static final Item PURPLE_BRICK = registerItem("purple_brick", new Item(new Item.Settings()));
    public static final Item MAGENTA_BRICK = registerItem("magenta_brick", new Item(new Item.Settings()));
    public static final Item PINK_BRICK = registerItem("pink_brick", new Item(new Item.Settings()));
    public static final Item BLACK_BRICK = registerItem("black_brick", new Item(new Item.Settings()));
    public static final Item LIGHTGRAY_BRICK = registerItem("lightgray_brick", new Item(new Item.Settings()));
    public static final Item GRAY_BRICK = registerItem("gray_brick", new Item(new Item.Settings()));
    public static final Item WHITE_BRICK = registerItem("white_brick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ColorfulBricks.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ColorfulBricks.LOGGER.info("Registering Mod Items for " + ColorfulBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addBefore(LIGHTGRAY_BRICK, WHITE_BRICK);
            entries.addBefore(GRAY_BRICK, LIGHTGRAY_BRICK);
            entries.addBefore(BLACK_BRICK, GRAY_BRICK);
            entries.addBefore(Items.BRICK, BLACK_BRICK);
            entries.addBefore(RED_BRICK, Items.BRICK);
            entries.addBefore(ORANGE_BRICK, RED_BRICK);
            entries.addBefore(YELLOW_BRICK, ORANGE_BRICK);
            entries.addBefore(LIME_BRICK, YELLOW_BRICK);
            entries.addBefore(GREEN_BRICK, LIME_BRICK);
            entries.addBefore(CYAN_BRICK, GREEN_BRICK);
            entries.addBefore(LIGHTBLUE_BRICK, CYAN_BRICK);
            entries.addBefore(BLUE_BRICK, LIGHTBLUE_BRICK);
            entries.addBefore(PURPLE_BRICK, BLUE_BRICK);
            entries.addBefore(MAGENTA_BRICK, PURPLE_BRICK);
            entries.addBefore(PINK_BRICK, MAGENTA_BRICK);
            entries.add(PINK_BRICK);
        });
    }
}
