package me.HALD91.listener;

import me.HALD91.Main;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class listener implements Listener {
    Main main = JavaPlugin.getPlugin(Main.class);
    String prefix = main.getConfig().getString("Prefix");
    String PAXE = main.getConfig().getString("PoisonAxe");
    String NAXE = main.getConfig().getString("NauseaAxe");
    String BAXE = main.getConfig().getString("BlindnessAxe");
    String WAXE = main.getConfig().getString("WitherAxe");

    public boolean onitem(ItemStack I, String Displayname, Material ItemType) {
        return (I != null) && (I.hasItemMeta()) && (I.getItemMeta().getDisplayName().equalsIgnoreCase(Displayname)) && (I.getType() == ItemType);
    }
    @EventHandler
    public void ondrop(PlayerDropItemEvent event) {
        Player p = event.getPlayer();
        if (event.getItemDrop().getItemStack().getItemMeta().getLore().contains("Soulbound")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityHit(EntityDamageByEntityEvent e)
    {
        if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player)))
        {
            if (e.isCancelled()) {
                return;
            } else {
                Player P = (Player) e.getEntity();
                Player D = (Player) e.getDamager();
                ItemStack I = D.getItemInHand();
                if (onitem(I, PAXE + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, NAXE + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, WAXE + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I,  BAXE + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                return;
            }
        }
    }
}
