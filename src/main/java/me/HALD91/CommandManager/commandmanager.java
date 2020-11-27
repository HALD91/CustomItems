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
                        p.sendMessage(ChatColor.GRAY + "-----------------" + ChatColor.GOLD + "Help" + ChatColor.GRAY + "---------------");
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.AQUA + "/CustomItem help" + ChatColor.WHITE + " " + "To see how you use this command");
                        p.sendMessage(ChatColor.AQUA + "/CustomItem <Itemtype> List" + ChatColor.WHITE + " " + "To see what type of items are available");
                        p.sendMessage(ChatColor.AQUA + "/CustomItem <ItemType> <ItemName>" + ChatColor.WHITE + " " + "To teleport to a warp (Opens a GUI)");
                        p.sendMessage(ChatColor.AQUA + "/CustomItem reload" + ChatColor.WHITE + " " + "To reload the config");
                        p.sendMessage(" ");
                        p.sendMessage("-----------------------------------------------------");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("Reload")) {
                        main.reloadConfig();
                        p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "The Config has been reloaded"));
                    }
                }
                if (args.length == 2) {
                    if (args[0].equalsIgnoreCase("Axe")) {
                        if (args[1].equalsIgnoreCase("List")) {
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "The available Axe's, Poison, Blindness, Nausea, Wither."));
                        }
                        if (args[1].equalsIgnoreCase("Poison")) {
                            p.getInventory().addItem(new ItemStack[]{Poison_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_PURPLE + " " + PAXE));
                        }
                        if (args[1].equalsIgnoreCase("Nausea")) {
                            p.getInventory().addItem(new ItemStack[]{Nausea_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_AQUA + " " + NAXE));
                        }
                        if (args[1].equalsIgnoreCase("Blindness")) {
                            p.getInventory().addItem(new ItemStack[]{Blindness_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.GOLD + " " + BAXE));
                        }
                        if (args[1].equalsIgnoreCase("Wither")) {
                            p.getInventory().addItem(new ItemStack[]{Wither_Axe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_PURPLE  + " " + WAXE));
                        }
                    }
                    if (args[0].equalsIgnoreCase("Sword")) {
                        if (args[1].equalsIgnoreCase("list")) {
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.BLUE + "The available Sword's, Poison, Blindness, Nausea, Wither."));
                        }
                        if (args[1].equalsIgnoreCase("Poison")) {
                            p.getInventory().addItem(new ItemStack[]{Poison_Sword()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_PURPLE + " " + "Poison Axe."));
                        }
                        if (args[1].equalsIgnoreCase("Nausea")) {
                            p.getInventory().addItem(new ItemStack[]{Nausea_Sword()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_AQUA + " " + "Nausea Axe."));
                        }
                        if (args[1].equalsIgnoreCase("Blindness")) {
                            p.getInventory().addItem(new ItemStack[]{Blindness_Sword()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.GOLD + " " + "Blindness Axe."));
                        }
                        if (args[1].equalsIgnoreCase("Wither")) {
                            p.getInventory().addItem(new ItemStack[]{Wither_Sword()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_PURPLE  + " " + "Wither Axe."));
                        }
                    }
                    if (args[0].equalsIgnoreCase("Pickaxe")) {
                        if (args[1].equalsIgnoreCase("Explosive")) {
                            p.getInventory().addItem(new ItemStack[]{Explosive_Pickaxe()});
                            p.updateInventory();
                            p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.GRAY + "You've received 1x" + ChatColor.DARK_RED  + " " + "Explosive Pickaxe."));
                        }
                    }
                }
            }
        }

        return false;
    }
}
