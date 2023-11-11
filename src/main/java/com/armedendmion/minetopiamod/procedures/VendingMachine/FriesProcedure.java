package com.armedendmion.minetopiamod.procedures.VendingMachine;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import com.armedendmion.minetopiamod.init.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.function.Supplier;

public class FriesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double count = 0;
		ItemStack output = ItemStack.EMPTY;
		count = 3*8;
		output = new ItemStack(ModItems.WHEELCOIN.get());
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
			_setstack.setCount((int) count);
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() >= count
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ModItems.MONEY2.get())) : false)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = output;
				_setstack.setCount(10);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount(10);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		GmmModVariables.MapVariables.get(world).paycheck = output;
		GmmModVariables.MapVariables.get(world).syncData(world);
	}
}
