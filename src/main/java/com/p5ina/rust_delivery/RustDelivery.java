package com.p5ina.rust_delivery;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RustDelivery implements ModInitializer {
    public static final String MOD_ID = "rust_delivery";
    public static final Logger LOGGER = LoggerFactory.getLogger("rust_delivery");

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
    }
}