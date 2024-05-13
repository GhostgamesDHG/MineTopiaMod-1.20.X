package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimerPlayersProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (GmmModVariables.MapVariables.get(world).timeMin >= GmmModVariables.MapVariables.get(world).LoanTimerAmount) {
			MineTopiaMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance + GmmModVariables.MapVariables.get(world).LoanAmount;
					entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76You just received your loan!"), false);
			});
		}
	}
}
