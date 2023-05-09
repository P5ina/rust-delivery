package com.p5ina.rust_delivery;

import com.p5ina.rust_delivery.entity.ModEntities;
import com.p5ina.rust_delivery.entity.client.DroneRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RustDeliveryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.DRONE, DroneRenderer::new);
    }
}
