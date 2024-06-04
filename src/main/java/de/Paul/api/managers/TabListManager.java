package de.Paul.API.managers;

import org.bukkit.entity.Player;

public interface TabListManager {
    void setHeaderFooter(Player player, String header, String footer);
    void setHeaderFooterForAll(String header, String footer);
}