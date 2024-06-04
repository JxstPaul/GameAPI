package de.Paul.API.managers;

import de.Paul.API.Kit;
import org.bukkit.entity.Player;

public interface KitManager {
    void toggleKits(boolean toggle);
    void registerKit(Kit kit);
    boolean areKitsEnabled();
    void assignKit(Player player, Kit kit);
    void applyKits();
}