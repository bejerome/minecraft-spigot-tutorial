package com.ben.firstplugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	@Override
	
	public void onEnable() {
		
		System.out.println("First Plugin worked!");
		
		getCommand("number").setExecutor(new CustomCommand());
		
		
	}
	
}
