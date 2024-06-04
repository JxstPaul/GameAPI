package de.Paul.API;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public interface Menu {
    void setupMenu();
    void addItem(Material material, int slot, String name, String... lore);
    void handleClick(Player player, Material item);
    Inventory getInventory();
    Integer getID();
}