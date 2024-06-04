package de.Paul.API.managers;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public interface SidebarManager {
    void createSidebar(Player player, String title);
    void setSidebarLine(Player player, int line, String content);
    void updateSidebar(Player player, Scoreboard sidebar);
}