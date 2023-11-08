package com.armedendmion.minetopiamod.procedures.safe;

import com.armedendmion.minetopiamod.gui.safe.SAFEINVENTORYMenu;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiMenu;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiSetPasswordMenu;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;
import org.jetbrains.annotations.NotNull;

public class SafeOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
            public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity != null)
                    return blockEntity.getPersistentData().getBoolean(tag);
                return false;
            }
        }.getValue(world, BlockPos.containing(x, y, z), "modidBlockHasPassword"))) {
			if ((new Object() {
                public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
                    BlockEntity blockEntity = world.getBlockEntity(pos);
                    if (blockEntity != null)
                        return blockEntity.getPersistentData().getBoolean(tag);
                    return false;
                }
            }.getValue(world, BlockPos.containing(x, y, z), "modidBlockLocked"))) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public @NotNull Component getDisplayName() {
								return Component.literal("SafeGui");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, @NotNull Inventory inventory, @NotNull Player player) {
								return new SafeGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			} else {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public @NotNull Component getDisplayName() {
								return Component.literal("SAFEINVENTORY");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, @NotNull Inventory inventory, @NotNull Player player) {
								return new SAFEINVENTORYMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
		} else {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public @NotNull Component getDisplayName() {
							return Component.literal("SafeGuiSetPassword");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, @NotNull Inventory inventory, @NotNull Player player) {
							return new SafeGuiSetPasswordMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
