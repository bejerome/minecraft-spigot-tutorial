package com.ben.firstplugin;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;


public class PingListener implements Listener {
	
	@EventHandler
	
	public void onPing(ServerListPingEvent e) {
		e.setMaxPlayers(20000);
		e.setMotd(ChatColor.YELLOW  + "Dad's Server! "+ "\n" + ChatColor.BLUE + "Come Join us!");
		try {
			e.setServerIcon(Bukkit.loadServerIcon(new File("icon.png")));
		} catch (Exception e1) {
			e1.printStackTrace();

		}
		
	}
	
	
	
}

