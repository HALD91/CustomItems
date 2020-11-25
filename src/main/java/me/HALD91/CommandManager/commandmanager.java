package me.HALD91.CommandManager;

import me.HALD91.Main;
import me.HALD91.listener.itemstack;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class commandmanager extends itemstack implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if ((sender instanceof Player)){
            Main main = JavaPlugin.getPlugin(Main.class);
            Player p = (Player)sender;

            String prefix = main.getConfig().getString("Prefix");

            if (command.getName().equalsIgnoreCase("CustomItem")) {
                if (args.length == 0) {
                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've type a wrong command, please use /CustomItem help to see the command list."));
                }
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("Help")) {
                        p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.BLUE + "The available items, ...."));
                        p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " "  + ChatColor.WHITE + "To get an CustomItem use /CustomItem <ItemType> <ItemName>"));
                    }
                    if (args[0].equalsIgnoreCase("Reload")) {
                        main.reloadConfig();
                        p.sendMessage(prefix + ChatColor.WHITE + "The Config has been reloaded");
                    }
                }
                if (args.length == 2) {
                    if (args[0].equalsIgnoreCase("Axe")) {
                        if (args[1].equalsIgnoreCase("List")) {
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.BLUE + "The available Axe's, Poison, Blindness, Nausea, Wither."));
                        }
                        if (args[1].equalsIgnoreCase("Poison")) {
                            p.getInventory().addItem(new ItemStack[]{Poison_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_PURPLE + "Poison Axe."));
                        }
                        if (args[1].equalsIgnoreCase("Nausea")) {
                            p.getInventory().addItem(new ItemStack[]{Poison_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_AQUA + "Nausea Axe."));
                        }
                        if (args[1].equalsIgnoreCase("Blindness")) {
                            p.getInventory().addItem(new ItemStack[]{Poison_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.GOLD + "Blindness Axe."));
                        }
                        if (args[1].equalsIgnoreCase("Wither")) {
                            p.getInventory().addItem(new ItemStack[]{Poison_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_PURPLE  + "Wither Axe."));
                        }
                    }
                    if (args[0].equalsIgnoreCase("Sword")) {
                        if (args[1].equalsIgnoreCase("list")) {
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.BLUE + "The available Sword's, Poison, Blindness, Nausea, Wither."));
                        }
                    }
                }
            }
        }

        return false;
    }
}
