package net.minecraftweter.colorfulbricks.Blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraftweter.colorfulbricks.ColorfulBricks;
public class ModBlocks {

    public static final Block RED_BRICKS = registerBlock("red_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block ORANGE_BRICKS = registerBlock("orange_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block YELLOW_BRICKS = registerBlock("yellow_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block LIME_BRICKS = registerBlock("lime_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block GREEN_BRICKS = registerBlock("green_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.DARK_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block CYAN_BRICKS = registerBlock("cyan_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block LIGHTBLUE_BRICKS = registerBlock("lightblue_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block BLUE_BRICKS = registerBlock("blue_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block PURPLE_BRICKS = registerBlock("purple_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block MAGENTA_BRICKS = registerBlock("magenta_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block PINK_BRICKS = registerBlock("pink_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block WHITE_BRICKS = registerBlock("white_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block LIGHTGRAY_BRICKS = registerBlock("lightgray_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block GRAY_BRICKS = registerBlock("gray_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );
    public static final Block BLACK_BRICKS = registerBlock("black_bricks", new Block(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F))
            );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ColorfulBricks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ColorfulBricks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ColorfulBricks.LOGGER.info("Registering Mod Blocks for " + ColorfulBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addBefore(ModBlocks.ORANGE_BRICKS, ModBlocks.WHITE_BRICKS);
            entries.addBefore(ModBlocks.YELLOW_BRICKS, ModBlocks.LIGHTGRAY_BRICKS);
            entries.addBefore(ModBlocks.BLACK_BRICKS, ModBlocks.GRAY_BRICKS);
            entries.addBefore(Items.BRICKS, ModBlocks.BLACK_BRICKS);
            entries.addBefore(ModBlocks.RED_BRICKS, Items.BRICKS);
            entries.addBefore(ModBlocks.ORANGE_BRICKS, ModBlocks.RED_BRICKS);
            entries.addBefore(ModBlocks.YELLOW_BRICKS, ModBlocks.ORANGE_BRICKS);
            entries.addBefore(ModBlocks.LIME_BRICKS, ModBlocks.YELLOW_BRICKS);
            entries.addBefore(ModBlocks.GREEN_BRICKS, ModBlocks.LIME_BRICKS);
            entries.addBefore(ModBlocks.CYAN_BRICKS, ModBlocks.GREEN_BRICKS);
            entries.addBefore(ModBlocks.LIGHTBLUE_BRICKS, ModBlocks.CYAN_BRICKS);
            entries.addBefore(ModBlocks.BLUE_BRICKS, ModBlocks.LIGHTBLUE_BRICKS);
            entries.addBefore(ModBlocks.PURPLE_BRICKS, ModBlocks.BLUE_BRICKS);
            entries.addBefore(ModBlocks.MAGENTA_BRICKS, ModBlocks.PURPLE_BRICKS);
            entries.addBefore(ModBlocks.PINK_BRICKS, ModBlocks.MAGENTA_BRICKS);
            entries.add(ModBlocks.PINK_BRICKS);
        });
    }
}
