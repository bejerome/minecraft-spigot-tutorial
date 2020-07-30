package com.ben.firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		
		System.out.println("First Plugin worked!");
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
		Bukkit.getPluginManager().registerEvents(this , this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equals("hello")) {
			
			//check if the sender is an instance of the player object
			
			if (sender instanceof Player) {
				
				// create an instance of player
				
				Player player = (Player) sender;
				
			// send message
				
			player.sendMessage(ChatColor.DARK_RED + "Hello, " + ChatColor.GREEN + player.getName() + ChatColor.DARK_GRAY + " You Fuzzy Head");
			
			// set player health to full
			
				player.setHealth(20.0);
			} else {
			System.out.println("You cannot use this command through console!");
			}
			
		}
		return false;
		
	}	

}
