package com.ben.firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	BossBar bossBar;
	@Override
	
	public void onEnable() {
		
		System.out.println("First Plugin worked!");
		
		//create icon and title for server
		
		Bukkit.getPluginManager().registerEvents(new PingListener(), this);
		
		// create an hologram
		
		Bukkit.getPluginManager().registerEvents(new HologramListener(this), this);
		
		
	}
	
	public void SpawnHologram(Player player) {
		String rawName = "This is a, small test to, see if this," + player.getPlayer().getName();
		String[] name = rawName.split(",");
		ChatColor[] colors = {ChatColor.BLUE, ChatColor.YELLOW, ChatColor.RED, ChatColor.DARK_PURPLE};
		for (int i=0; i< name.length; i++) {
			
			ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0,i+1,0),EntityType.ARMOR_STAND);
			stand.setVisible(false);
			stand.setGravity(false);
			stand.setInvulnerable(true);
			stand.setCustomNameVisible(true);
			stand.setCustomName(colors[i] + name[i]);
		}
		
		
	}
	
}
