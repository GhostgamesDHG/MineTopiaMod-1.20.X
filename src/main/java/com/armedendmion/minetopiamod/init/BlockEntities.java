package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.tileentity.SafeBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MineTopiaMod.MOD_ID);
 //   public static final RegistryObject<BlockEntityType<?>> VENDING_MACHINE = register("vending_machine", ModBlocks.VENDING_MACHINE, VendingMachineBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> SAFE = register(SafeBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register("safe", () -> BlockEntityType.Builder.of(supplier, ModBlocks.SAFE.get()).build(null));
    }
}
