package org.trident.net.packet.impl;

import org.trident.net.packet.Packet;
import org.trident.net.packet.PacketListener;
import org.trident.world.entity.player.Player;

/**
 * This packet listener is called when a packet should not execute
 * any particular action or event, but will also not print out
 * any debug information.
 * 
 * @author relex lawl
 */

public class SilencedPacketListener implements PacketListener {

	@Override
	public void execute(Player player, Packet packet) {
	}

}
