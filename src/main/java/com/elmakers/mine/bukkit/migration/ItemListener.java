package com.elmakers.mine.bukkit.migration;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class ItemListener implements Listener {
    private final Plugin plugin;

    public ItemListener(Plugin plugin) {
        this.plugin = plugin;
    }
}
