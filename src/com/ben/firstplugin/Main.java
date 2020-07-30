package com.ben.firstplugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		
		System.out.println("First Plugin worked!");
		
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("time").setExecutor(new HealCommand());
		
	}
	



}
