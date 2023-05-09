package com.p5ina.rust_delivery;

import com.p5ina.rust_delivery.block.ModBlocks;
import com.p5ina.rust_delivery.item.ModItemGroup;
import com.p5ina.rust_delivery.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RustDelivery implements ModInitializer {
    public static final String MOD_ID = "rust_delivery";
    public static final Logger LOGGER = LoggerFactory.getLogger("rust_delivery");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModeItems();
        ModBlocks.registerModBlocks();
    }
}