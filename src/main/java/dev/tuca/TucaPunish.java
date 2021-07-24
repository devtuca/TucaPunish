package dev.tuca;

import org.bukkit.plugin.java.JavaPlugin;

public final class TucaPunish extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
