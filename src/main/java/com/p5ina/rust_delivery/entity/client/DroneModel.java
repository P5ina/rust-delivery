package com.p5ina.rust_delivery.entity.client;

import com.p5ina.rust_delivery.RustDelivery;
import com.p5ina.rust_delivery.entity.custom.DroneEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class DroneModel extends GeoModel<DroneEntity> {

    @Override
    public Identifier getModelResource(DroneEntity animatable) {
        return new Identifier(RustDelivery.MOD_ID, "geo/drone.geo.json");
    }

    @Override
    public Identifier getTextureResource(DroneEntity animatable) {
        return new Identifier(RustDelivery.MOD_ID, "textures/entity/drone.png");
    }

    @Override
    public Identifier getAnimationResource(DroneEntity animatable) {
        return new Identifier(RustDelivery.MOD_ID, "animations/drone.animation.json");
    }
}
