
package com.armedendmion.minetopiamod.network.atm;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.gui.atm.AtmwithdrawMenu;
import com.armedendmion.minetopiamod.procedures.atm.*;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;

import java.util.HashMap;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtmwithdrawButtonMessage {
	private final int buttonID, x, y, z;

	public AtmwithdrawButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AtmwithdrawButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AtmwithdrawButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AtmwithdrawButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AtmwithdrawMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AtmWithdraw50Procedure.execute(entity);
		}
		if (buttonID == 1) {

			AtmWithdraw5Procedure.execute(entity);
		}
		if (buttonID == 2) {

			AtmWithdraw10Procedure.execute(entity);
		}
		if (buttonID == 3) {

			AtmWithdraw20Procedure.execute(entity);
		}
		if (buttonID == 4) {

			AtmWithdraw100Procedure.execute(entity);
		}
		if (buttonID == 5) {

			AtmWithdraw1000Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MineTopiaMod.addNetworkMessage(AtmwithdrawButtonMessage.class, AtmwithdrawButtonMessage::buffer, AtmwithdrawButtonMessage::new, AtmwithdrawButtonMessage::handler);
	}
}
