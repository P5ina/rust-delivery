package com.p5ina.rust_delivery.block;

import com.p5ina.rust_delivery.RustDelivery;
import com.p5ina.rust_delivery.block.custom.TradingMachineBlock;
import com.p5ina.rust_delivery.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TRADING_MACHINE = registerBlock("trading_machine",
            new TradingMachineBlock(FabricBlockSettings.of(Material.METAL).strength(4f).nonOpaque()),
            ModItemGroup.RUST_DELIVERY);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(RustDelivery.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RustDelivery.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        RustDelivery.LOGGER.info("Registering Mod Blocks for " + RustDelivery.MOD_ID);
    }
}
