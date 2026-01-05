package net.minecraftweter.colorfulbricks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraftweter.colorfulbricks.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorfulBricks implements ModInitializer {
	public static final String MOD_ID = "colorfulbricks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}