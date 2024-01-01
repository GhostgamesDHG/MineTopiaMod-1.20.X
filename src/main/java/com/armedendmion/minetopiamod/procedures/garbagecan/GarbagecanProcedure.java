package com.armedendmion.minetopiamod.procedures.garbagecan;

import com.armedendmion.minetopiamod.gui.garbagecan.GarbageGuiMenu;
import com.armedendmion.minetopiamod.init.GmmModVariables;
import io.netty.buffer.Unpooled;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.network.NetworkHooks;

public class GarbagecanProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (GmmModVariables.MapVariables.get(world).DevMode == false) {
				if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.BARRIER) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("This has already been searched"), true);
				} else {
					if (Math.random() < 0.3) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(0);
					} else if (Math.random() < 0.2) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.CREEPER_SPAWN_EGG);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Math.random() < 0.15) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.ANCIENT_DEBRIS);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Math.random() < 0.125) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.BEDROCK);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Math.random() < 0.125) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
					world.setBlock(BlockPos.containing(x, y - 5, z), Blocks.BARRIER.defaultBlockState(), 3);
				}
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(0);
				} else if (Math.random() < 0.2) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.CREEPER_SPAWN_EGG);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.15) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.ANCIENT_DEBRIS);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.125) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.BEDROCK);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.125) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		} else {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Garbage can");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GarbageGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
