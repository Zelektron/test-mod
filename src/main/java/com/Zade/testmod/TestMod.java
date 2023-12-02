package com.Zade.testmod;

import com.Zade.testmod.block.ModBlocks;
import com.Zade.testmod.item.ModItemGroups;
import com.Zade.testmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
	}
}