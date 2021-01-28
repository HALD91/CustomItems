package me.HALD91.listener;

import me.HALD91.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.enchantments.Enchantment.FIRE_ASPECT;

public class itemstack implements Listener {
    Main main = JavaPlugin.getPlugin(Main.class);
    // Axe's Names
    public String PAXE = main.getConfig().getString("PoisonAxeConfig.Name");
    public String NAXE = main.getConfig().getString("NauseaAxeConfig.Name");
    public String BAXE = main.getConfig().getString("BlindnessAxeConfig.Name");
    public String WAXE = main.getConfig().getString("WitherAxeConfig.Name");

    // Sword's names
    public String PSW = main.getConfig().getString("PoisonSwordConfig.Name");
    public String NSW = main.getConfig().getString("NauseaSwordConfig.Name");
    public String BSW = main.getConfig().getString("BlindnessSwordConfig.Name");
    public String WSW = main.getConfig().getString("WitherSwordConfig.Name");


    // Axe's
    public ItemStack Poison_Axe() {
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta Im = I.getItemMeta();
        if (main.getConfig().getBoolean("PoisonAxeConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
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
        if (main.getConfig().getBoolean("NauseaAxeConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
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
        if (main.getConfig().getBoolean("BlindnessAxeConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', BAXE));
        if (main.getConfig().getBoolean("BlindnessAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    public ItemStack Wither_Axe() {
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta Im = I.getItemMeta();
        if (main.getConfig().getBoolean("WitherAxeConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', WAXE));
        if (main.getConfig().getBoolean("WitherAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    // Sword's
    public ItemStack Poison_Sword() {
        ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta Im = I.getItemMeta();
        if (main.getConfig().getBoolean("PoisonAxeConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', PSW));
        if (main.getConfig().getBoolean("PoisonAxeConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    public ItemStack Nausea_Sword() {
        ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta Im = I.getItemMeta();
        if (main.getConfig().getBoolean("NauseaSwordConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', NSW));
        if (main.getConfig().getBoolean("NauseaSwordConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    public ItemStack Blindness_Sword() {
        ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta Im = I.getItemMeta();
        if (main.getConfig().getBoolean("BlindnessSwordConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', BSW));
        if (main.getConfig().getBoolean("BlindnessSwordConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }

    public ItemStack Wither_Sword() {
        ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta Im = I.getItemMeta();
        if (main.getConfig().getBoolean("WitherSwordConfig.Enchantments")) {
            Im.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
            Im.addEnchant(Enchantment.DURABILITY, 3, true);
        }
        Im.setDisplayName(ChatColor.translateAlternateColorCodes('&', WSW));
        if (main.getConfig().getBoolean("WitherSwordConfig.Soulbound")) {
            ArrayList Nau = new ArrayList();
            Nau.add("Soulbound");
            Im.setLore(Nau);
        }
        I.setItemMeta(Im);
        return I;
    }


}
