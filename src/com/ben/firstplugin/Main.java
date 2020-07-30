package com.ben.firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		
		System.out.println("Test Plug in enabled!");
		
		// register events
		// very important
		Bukkit.getPluginManager().registerEvents(this , this);
	}
	
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onThrow(PlayerEggThrowEvent e) {
		
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.RED + "Egg thrown by " + player.getName());
		
	}
	

}
