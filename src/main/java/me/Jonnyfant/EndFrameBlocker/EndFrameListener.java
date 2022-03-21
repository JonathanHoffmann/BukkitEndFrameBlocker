package me.Jonnyfant.EndFrameBlocker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class EndFrameListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction()== Action.RIGHT_CLICK_BLOCK)
        {
            if(e.getClickedBlock().getType().equals(Material.END_PORTAL_FRAME)) {
                e.setCancelled(true);
                p.sendMessage(ChatColor.BLUE + "<Greger>" + ChatColor.WHITE + " The end isn't ready yet. We are waiting for the Nullscape datapack to be updated to 1.18.2.");
            }
        }

    }
}