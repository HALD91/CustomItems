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

            if (command.getName().equalsIgnoreCase("WeaponKit")) {
                if (p.hasPermission("weaponkit.use")) {
                    if (args.length == 0) {
                        p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "Command error, please use " + ChatColor.GREEN + "/WeaponKit help" + " " + ChatColor.WHITE + "to see the command list."));
                    }
                    if (args.length == 1) {
                        if (args[0].equalsIgnoreCase("Help")) {
                            if (p.hasPermission("weaponkit.help.use")) {
                                p.sendMessage(ChatColor.GRAY + "-----------------" + ChatColor.GREEN + " Help " + ChatColor.GRAY + "---------------");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit help" + ChatColor.WHITE + " " + "To see how you use this command");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit List" + ChatColor.WHITE + " " + "To see what type of items are available");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit perms" + ChatColor.WHITE + " " + "To see all permissions");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit <ItemType> <ItemName>" + ChatColor.WHITE + " " + "To teleport to a warp (Opens a GUI)");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit reload" + ChatColor.WHITE + " " + "To reload the config");
                                p.sendMessage(ChatColor.GRAY + "-------------------------------------");
                                return true;
                            }
                        }
                        if (args[0].equalsIgnoreCase("Reload")) {
                            if (p.hasPermission("weaponkit.reload.use")) {
                                main.reloadConfig();
                                p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "The" + " " + ChatColor.GREEN + "Config" + " " + ChatColor.WHITE + "has been reloaded"));
                            }
                        }
                        if (args[0].equalsIgnoreCase("list")) {
                            if (p.hasPermission("weaponkit.list.use")) {
                                p.sendMessage(ChatColor.GRAY + "-------------" + ChatColor.GREEN + " List " + ChatColor.GRAY + "------------");
                                p.sendMessage(ChatColor.AQUA + "The available WeaponKit Item's");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit Axe list" + " " + ChatColor.WHITE + "To see a list of available axe's");
                                p.sendMessage(ChatColor.AQUA + "/WeaponKit Sword list" + " " + ChatColor.WHITE + "To see a list of available sword's");
                                p.sendMessage(ChatColor.GRAY + "-----------------------------");
                            }
                        }
                        if (args[0].equalsIgnoreCase("perms")) {
                            if (p.hasPermission("weaponkit.perms.use")) {
                                p.sendMessage(ChatColor.GRAY + "-------------" + ChatColor.GREEN + " List " + ChatColor.GRAY + "------------");
                                p.sendMessage(ChatColor.AQUA + "The list of permissions");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.use" + " " + ChatColor.WHITE + "- give access to use /WeaponKit");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.help.use" + " " + ChatColor.WHITE + "- give access to use /WeaponKit help");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.reload.use" + " " + ChatColor.WHITE + "- give access to use /WeaponKit reload");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.list.use" + " " + ChatColor.WHITE + "- give access to use /WeaponKit list and to use /WeaponKit Axe/Sword list");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.perms.use" + " " + ChatColor.WHITE + "- give access to use /Weaponkit perms");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.poison.axe.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit axe posion");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.Nausea.axe.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit axe neasea");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.blindness.axe.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit axe blindness");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.wither.axe.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit axe wither");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.poison.sword.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit sword wither");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.nausea.sword.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit sword neasea");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.blindness.sword.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit sword blindness");
                                p.sendMessage(ChatColor.YELLOW + "weaponkit.wither.sword.give" + " " + ChatColor.WHITE + "- give access to use /WeaponKit sword blindness");
                                p.sendMessage(ChatColor.GRAY + "-----------------------------");
                            }
                        }
                    }
                    if (args.length == 2) {
                        if (args[0].equalsIgnoreCase("Axe")) {
                            if (args[1].equalsIgnoreCase("List")) {
                                if (p.hasPermission("weaponkit.list.use")) {
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.AQUA + "The available Axe's" + " " + ChatColor.WHITE + "Poison, Blindness, Nausea, Wither."));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Poison")) {
                                if (p.hasPermission("weaponkit.poison.axe.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Poison_Axe()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.DARK_PURPLE + " " + PAXE));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Nausea")) {
                                if (p.hasPermission("weaponkit.Nausea.axe.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Nausea_Axe()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.DARK_AQUA + " " + NAXE));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Blindness")) {
                                if (p.hasPermission("weaponkit.blindness.axe.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Blindness_Axe()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.GOLD + " " + BAXE));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Wither")) {
                                if (p.hasPermission("weaponkit.wither.axe.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Wither_Axe()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.DARK_PURPLE + " " + WAXE));
                                }
                            }
                        }
                        if (args[0].equalsIgnoreCase("Sword")) {
                            if (args[1].equalsIgnoreCase("list")) {
                                if (p.hasPermission("weaponkit.list.use")) {
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.AQUA + "The available Sword's" + " " + ChatColor.WHITE + "Poison, Blindness, Nausea, Wither."));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Poison")) {
                                if (p.hasPermission("weaponkit.poison.sword.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Poison_Sword()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.DARK_PURPLE + " " + "Poison Axe."));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Nausea")) {
                                if (p.hasPermission("weaponkit.nausea.sword.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Nausea_Sword()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.DARK_AQUA + " " + "Nausea Axe."));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Blindness")) {
                                if (p.hasPermission("weaponkit.blindness.sword.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Blindness_Sword()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.GOLD + " " + "Blindness Axe."));
                                }
                            }
                            if (args[1].equalsIgnoreCase("Wither")) {
                                if (p.hasPermission("weaponkit.wither.sword.give")) {
                                    p.getInventory().addItem(new ItemStack[]{Wither_Sword()});
                                    p.updateInventory();
                                    p.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("Prefix").toString() + " " + ChatColor.WHITE + "You've received 1x" + ChatColor.DARK_PURPLE + " " + "Wither Axe."));
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }
}
