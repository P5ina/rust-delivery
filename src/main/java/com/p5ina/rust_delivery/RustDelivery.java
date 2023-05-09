package com.p5ina.rust_delivery;

import com.p5ina.rust_delivery.block.ModBlocks;
import com.p5ina.rust_delivery.block.entity.ModBlockEntities;
import com.p5ina.rust_delivery.entity.ModEntities;
import com.p5ina.rust_delivery.entity.custom.DroneEntity;
import com.p5ina.rust_delivery.item.ModItemGroup;
import com.p5ina.rust_delivery.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
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
        ModBlockEntities.registerBlockEntities();

        FabricDefaultAttributeRegistry.register(ModEntities.DRONE, DroneEntity.setAttributes());
    }
}