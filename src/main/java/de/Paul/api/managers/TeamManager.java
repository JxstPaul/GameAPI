package de.Paul.API.managers;

import de.Paul.API.Team;
import de.Paul.API.utils.Priority;
import de.Paul.API.utils.TripleKeyMap;
import org.bukkit.entity.Player;

import java.util.Map;

public interface TeamManager {
    void toggleTeams(boolean toggle);
    boolean areTeamsEnabled();
    void assignTeam(Player player);
    void incrementTeamSize(Team team);
    Map<Player, Team> getAssignedTeams();
    TripleKeyMap<String, Integer, Priority, Team> getTeams();
}
