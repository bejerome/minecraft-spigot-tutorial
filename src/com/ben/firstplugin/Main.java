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
	

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		// create player object by casting sender
		Player player = (Player) sender;
		
		if (cmd.getName().equals("config")) {
			
			// get value from config yml file
			
			String word = this.getConfig().getString("Word");
			int number = this.getConfig().getInt("Number");
			
			player.sendMessage(ChatColor.GRAY + "The word is " + ChatColor.GREEN + word + Colors.RED +  " and the number is " + number);
			
			} else {
				
				System.out.println("You cannot use this command through console!");
			}
			
		
		return false;
		
	}	

}
