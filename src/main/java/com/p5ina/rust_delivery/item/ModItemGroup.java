package com.p5ina.rust_delivery.item;

import com.p5ina.rust_delivery.RustDelivery;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup RUST_DELIVERY;

    public static void registerItemGroups() {
        RUST_DELIVERY = FabricItemGroup.builder(new Identifier(RustDelivery.MOD_ID, "rust_delivery"))
                .displayName(Text.translatable("itemgroup.rust_delivery"))
                .icon(() -> new ItemStack(ModItems.CITRINE))
                .build();
    }
}
