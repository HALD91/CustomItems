package me.HALD91;

import me.HALD91.CommandManager.commandmanager;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.jar.JarEntry;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        this.getCommand("CustomItem").setExecutor(new commandmanager());
    }

    @Override
    public void onDisable() {

    }
}
