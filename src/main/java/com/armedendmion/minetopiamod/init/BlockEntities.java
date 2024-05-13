package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.blocks.blockentity.GreenBagBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.BrowncabinetBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.OilCanBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.SafeBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MineTopiaMod.MOD_ID);
    public static final RegistryObject<BlockEntityType<?>> SAFE = register("safe", ModBlocks.SAFE, SafeBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BROWN_CABINET = register("brown_cabinet", ModBlocks.DARK_OAK_KITCHEN_CABINET, BrowncabinetBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> GREEN_BAG = register("green_bag", ModBlocks.GREEN_BAG, GreenBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> OILCAN = register("oilcan", ModBlocks.OIL_CAN, OilCanBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }
}
