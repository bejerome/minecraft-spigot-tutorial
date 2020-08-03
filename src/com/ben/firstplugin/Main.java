package com.ben.firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	@Override
	
	public void onEnable() {
		
		System.out.println("First Plugin worked!");
		
		//create icon and title for server
		
		Bukkit.getPluginManager().registerEvents(new PingListener(), this);
		
		// create an hologram
		
		Bukkit.getPluginManager().registerEvents(new ToggleListener(), this);
		
		
	}
	
	
	
}
