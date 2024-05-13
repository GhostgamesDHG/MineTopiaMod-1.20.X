package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimeplayerszeroProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		MineTopiaMod.queueServerWork(1, () -> {
			if (GmmModVariables.MapVariables.get(world).timeMin >= GmmModVariables.MapVariables.get(world).LoanTimerAmount) {
				GmmModVariables.MapVariables.get(world).timeMin = 0;
				GmmModVariables.MapVariables.get(world).syncData(world);
			}
		});
	}
}
