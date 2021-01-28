package me.HALD91;

import me.HALD91.CommandManager.commandmanager;
import me.HALD91.listener.listener;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        this.getCommand("WeaponKit").setExecutor(new commandmanager());
        this.getServer().getPluginManager().registerEvents(new listener(), this);
    }



    @Override
    public void onDisable() {

    }
}
