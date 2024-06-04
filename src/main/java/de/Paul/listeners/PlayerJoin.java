package de.Paul.listeners;

import de.Paul.Main;
import de.Paul.API.managers.TeamManager;
import de.Paul.API.utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    private Main plugin;

    public PlayerJoin(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void event(PlayerJoinEvent event) {
        TeamManager teamManager = plugin.getTeamManager();
        if (teamManager.areTeamsEnabled()) {
            teamManager.assignTeam(event.getPlayer());
            String teamName = teamManager.getAssignedTeams().get(event.getPlayer()).getName();
        }

        int currentPlayers = plugin.getServer().getOnlinePlayers().size();
        int maxPlayers = plugin.getServer().getMaxPlayers();
        String plrName = event.getPlayer().getName();
        event.setJoinMessage(Utils.msg("&e" + plrName + " has joined (&b" + currentPlayers + "&e/&b" + maxPlayers + "&e)!"));
    }
}
