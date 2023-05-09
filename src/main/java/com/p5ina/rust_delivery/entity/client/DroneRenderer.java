package com.p5ina.rust_delivery.entity.client;

import com.p5ina.rust_delivery.RustDelivery;
import com.p5ina.rust_delivery.entity.custom.DroneEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DroneRenderer extends GeoEntityRenderer<DroneEntity> {

    public DroneRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new DroneModel());
    }

    @Override
    public Identifier getTextureLocation(DroneEntity animatable) {
        return new Identifier(RustDelivery.MOD_ID, "textures/entity/drone.png");
    }

    @Override
    public void render(DroneEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
