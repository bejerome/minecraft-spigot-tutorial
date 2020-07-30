package com.ben.firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	@Override
	
	public void onEnable() {
		
		System.out.println("First Plugin worked!");
		
		Entity zombie = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"),0,0,0), EntityType.ZOMBIE);
		
	}
	
}
