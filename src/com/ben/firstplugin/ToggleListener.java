package com.ben.firstplugin;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class ToggleListener implements Listener {
	
	ArrayList<Player> enabled = new ArrayList<Player>();

	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		
		if (player.getItemInHand().getType().equals(Material.NETHER_STAR)) {
			
			if (enabled.contains(player)) {
				player.sendMessage("You have disabled it");
				enabled.remove(player);
			} else {
				
				player.sendMessage("You have enabled it");
				enabled.add(player);
			}
			
		}
	}
	
	@EventHandler
	public void  onChat(AsyncPlayerChatEvent e) {
		if (enabled.contains(e.getPlayer())) {
			e.setCancelled(true);
			e.getPlayer().sendMessage("Disabled!");
			
		}
	}

}
