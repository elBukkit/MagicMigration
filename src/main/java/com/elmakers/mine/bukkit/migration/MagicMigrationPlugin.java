package com.elmakers.mine.bukkit.migration;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MagicMigrationPlugin extends JavaPlugin {
    private ItemListener itemListener;

    public void onEnable() {
        itemListener = new ItemListener(this);
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(itemListener, this);
    }
}
