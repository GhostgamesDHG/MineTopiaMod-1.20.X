package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimersProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (GmmModVariables.MapVariables.get(world).Stoptimer == 0) {
			GmmModVariables.MapVariables.get(world).timeSec = GmmModVariables.MapVariables.get(world).timeSec + 0.015;
			GmmModVariables.MapVariables.get(world).syncData(world);
			if (GmmModVariables.MapVariables.get(world).timeSec >= 60) {
				GmmModVariables.MapVariables.get(world).timeSec = 0;
				GmmModVariables.MapVariables.get(world).syncData(world);
				GmmModVariables.MapVariables.get(world).timeMin = GmmModVariables.MapVariables.get(world).timeMin + 1;
				GmmModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
