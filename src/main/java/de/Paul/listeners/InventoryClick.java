package de.Paul.listeners;

import de.Paul.API.Menu;
import de.Paul.API.managers.MenuManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {
    private final MenuManager menuManager;

    public InventoryClick(MenuManager menuManager) {
        this.menuManager = menuManager;
    }

    @EventHandler
    public void event(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) return;
        if (!(event.getWhoClicked() instanceof Player)) return;

        Player player = (Player) event.getWhoClicked();
        Menu menu = menuManager.getMenuViaInv(event.getClickedInventory());

        if (menu != null) event.setCancelled(true);

        Material clickedItem = event.getCurrentItem().getType();
        menu.handleClick(player, clickedItem);
    }
}