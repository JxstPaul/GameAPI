package de.Paul.impl.kits;

import de.Paul.API.Kit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class WarriorKit implements Kit {
    private static final String name = "Warrior Kit";

    @Override
    public void apply(Player player) {
        PlayerInventory inv = player.getInventory();
        inv.clear();

        inv.setHelmet(new ItemStack(Material.LEATHER_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));

        inv.setItem(36, new ItemStack(Material.IRON_SWORD));
        inv.setItem(37, new ItemStack(Material.COOKED_BEEF, 32));
        inv.setItem(45, new ItemStack(Material.SHIELD));
    }

    @Override
    public String getName() {
        return name;
    }
}
