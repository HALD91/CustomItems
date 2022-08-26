package me.HALD91;

import me.HALD91.CommandManager.commandmanager;
import me.HALD91.listener.listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        this.getCommand("WeaponKit").setExecutor(new commandmanager());
        this.getServer().getPluginManager().registerEvents(new listener(), this);
        this.getServer().getPluginManager().registerEvents(new commandmanager(), this);
    }



    @Override
    public void onDisable() {

    }
}
