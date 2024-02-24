package net.tmc.dragonsdescent;

import net.fabricmc.api.ModInitializer;

import net.tmc.dragonsdescent.item.ModsItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Modifier;

public class DragonsDescent implements ModInitializer {
	public static final String MOD_ID = "dragonsdescent";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModsItems.registerModItems();
	}
}