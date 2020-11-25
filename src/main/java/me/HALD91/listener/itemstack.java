package me.HALD91.listener;

import me.HALD91.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class itemstack implements Listener {
    Main main = JavaPlugin.getPlugin(Main.class);
    public String PAXE = main.getConfig().getString("PoisonAxeConfig.Name");
    public String NAXE = main.getConfig().getString("NauseaAxeConfig.Name");
    public String BAXE = main.getConfig().getString("Name");
    public String WAXE = main.getConfig().getString("Name");

    // Axe's
    public ItemStack Poison_Axe() {
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta Im = I.getItemMeta();
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', PAXE));
        if (main.getConfig().getBoolean("PoisonAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    public ItemStack Nausea_Axe() {
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta Im = I.getItemMeta();
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', NAXE));
        if (main.getConfig().getBoolean("NauseaAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    public ItemStack Blindness_Axe() {
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta Im = I.getItemMeta();
        assert Im != null;
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', BAXE));
        if (main.getConfig().getBoolean("NauseaAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        return I;
    }

    public ItemStack Wither_Axe() {
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta Im = I.getItemMeta();
        assert Im != null;
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', WAXE));
        if (main.getConfig().getBoolean("NauseaAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
            return I;
        }
        return I;
    }
}
