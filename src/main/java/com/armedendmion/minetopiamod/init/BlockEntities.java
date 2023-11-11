package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.blocks.blockentity.SafeBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.VendingmachineBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MineTopiaMod.MOD_ID);
    public static final RegistryObject<BlockEntityType<?>> VENDINGMACHINE = register("vendingmachine", ModBlocks.VENDINGMACHINE, VendingmachineBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> SAFE = register("safe", ModBlocks.SAFE, SafeBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }
}
