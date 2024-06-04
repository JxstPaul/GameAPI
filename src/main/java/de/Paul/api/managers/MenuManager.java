package de.Paul.API.managers;

import de.Paul.API.Menu;
import org.bukkit.inventory.Inventory;

public interface MenuManager {
    void registerMenu(Menu menu);
    Menu getMenuViaInv(Inventory inv);
    Menu getMenuViaID(int ID);
}