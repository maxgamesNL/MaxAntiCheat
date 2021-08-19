package me.maxmods.maxanticheat;


import me.maxmods.maxanticheat.antiExploids.NoNoCom;
import org.bukkit.plugin.java.JavaPlugin;

public final class MaxAntiCheat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new NoNoCom(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
