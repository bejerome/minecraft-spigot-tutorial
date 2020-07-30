package com.ben.firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		
		System.out.println("Test Plugin enabled!");
		Bukkit.getPluginManager().registerEvents(this , this);
	}
	
	
	@EventHandler

	public void onMove(PlayerMoveEvent e) {
		
		//create player object
		
		Player player = e.getPlayer();
		
		// check if player has moving permission
		
		if (!player.hasPermission("testplugin.allowmove")) {
			
			// cancel player permission to move
			
			e.setCancelled(true);
			
		}
		
	}

}
