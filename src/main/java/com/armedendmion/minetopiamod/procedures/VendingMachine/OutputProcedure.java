package com.armedendmion.minetopiamod.procedures.VendingMachine;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.function.Supplier;

public class OutputProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack geld = ItemStack.EMPTY;
		double amount = 0;
		if (GmmModVariables.MapVariables.get(world).DevMode == false) {
			geld = new ItemStack(Blocks.DIAMOND_BLOCK);
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(geld) : false) {
				amount = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = geld;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) amount, _player.inventoryMenu.getCraftSlots());
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove(10);
					_player.containerMenu.broadcastChanges();
				}
			}
			geld = new ItemStack(Blocks.AIR);
		}
	}
}
