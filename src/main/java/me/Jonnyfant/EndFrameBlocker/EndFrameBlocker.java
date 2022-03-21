package me.Jonnyfant.EndFrameBlocker;

import org.bukkit.plugin.java.JavaPlugin;

public class EndFrameBlocker extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EndFrameListener(),this);
    }
}
