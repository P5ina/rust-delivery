package com.p5ina.rust_delivery.block.entity;

import com.p5ina.rust_delivery.RustDelivery;
import com.p5ina.rust_delivery.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<TradingMachineBlockEntity> TRADING_MACHINE;

    public static void registerBlockEntities() {
        TRADING_MACHINE = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                new Identifier(RustDelivery.MOD_ID, "trading_machine"),
                FabricBlockEntityTypeBuilder
                        .create(TradingMachineBlockEntity::new, ModBlocks.TRADING_MACHINE)
                        .build(null)
        );
    }
}
