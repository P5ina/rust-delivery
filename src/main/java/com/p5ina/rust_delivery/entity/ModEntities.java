package com.p5ina.rust_delivery.entity;

import com.p5ina.rust_delivery.RustDelivery;
import com.p5ina.rust_delivery.entity.custom.DroneEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<DroneEntity> DRONE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RustDelivery.MOD_ID, "drone"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, DroneEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 0.5f)).build());
}
