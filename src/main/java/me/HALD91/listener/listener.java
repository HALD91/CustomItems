package me.HALD91.listener;

import com.sun.xml.internal.ws.api.message.Packet;
import me.HALD91.Main;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class listener implements Listener {
    Main main = JavaPlugin.getPlugin(Main.class);
    String prefix = main.getConfig().getString("Prefix");

    // Axe's names
    String PAXE = main.getConfig().getString("PoisonAxe");
    String NAXE = main.getConfig().getString("NauseaAxe");
    String BAXE = main.getConfig().getString("BlindnessAxe");
    String WAXE = main.getConfig().getString("WitherAxe");

    // Sword's names
    public String PSW = main.getConfig().getString("PoisonSwordConfig.Name");
    public String NSW = main.getConfig().getString("NauseaSwordConfig.Name");
    public String BSW = main.getConfig().getString("BlindnessSwordConfig.Name");
    public String WSW = main.getConfig().getString("WitherSwordConfig.Name");

    // Pickaxe's names
    public String EXPAXE = main.getConfig().getString("ExplosivePickaxeConfig.Name");

    public boolean onitem(ItemStack I, String Displayname, Material ItemType) {
        return (I != null) && (I.hasItemMeta()) && (I.getItemMeta().getDisplayName().equalsIgnoreCase(Displayname)) && (I.getType() == ItemType);
    }
    @EventHandler
    public void ondrop(PlayerDropItemEvent event){
        Player p = event.getPlayer();
        Item i = event.getItemDrop();
        if (i.getItemStack().getItemMeta().getLore().contains("Soulbound")) {
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

                // Axe's
                if (onitem(I, PAXE + "", Material.DIAMOND_AXE)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, NAXE + "", Material.DIAMOND_AXE)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, WAXE + "", Material.DIAMOND_AXE)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I,  BAXE + "", Material.DIAMOND_AXE)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }

                // Sword's
                if (onitem(I, PSW + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, NSW + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, WSW + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                if (onitem(I, BSW + "", Material.DIAMOND_SWORD)) {
                    P.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
                    P.getWorld().playEffect(P.getLocation(), Effect.POTION_BREAK, 0);
                    return;
                }
                return;
            }
        }
    }
    @EventHandler
    public void blockbreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();

        if (onitem(null, EXPAXE + "", Material.DIAMOND_PICKAXE)) {
            b.getLocation().getX();
            b.getLocation().getY();
            b.getLocation().getZ();
            return;
        }
    }
}
