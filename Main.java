package de.Paul;

import de.Paul.api.managers.*;
import de.Paul.impl.*;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;
import de.Paul.listeners.*;

public class Main extends JavaPlugin {
    private GamestateManagerImpl gamestateManager;
    private SidebarManagerImpl sidebarManager;
    private TeamManagerImpl teamManager;
    private KitManagerImpl kitManager;

    @Override
    public void onEnable() {
        kitManager = new KitManagerImpl();
        gamestateManager = new GamestateManagerImpl(kitManager);
        gamestateManager.setState(gamestateManager.getStates().get("LobbyState"));
        sidebarManager = new SidebarManagerImpl();
        teamManager = new TeamManagerImpl();

        getServer().getServicesManager().register(GamestateManager.class, gamestateManager, this, ServicePriority.Highest);
        getServer().getServicesManager().register(SidebarManager.class, sidebarManager, this, ServicePriority.Highest);
        getServer().getServicesManager().register(TeamManager.class, teamManager, this, ServicePriority.Highest);
        getServer().getServicesManager().register(KitManager.class, kitManager, this, ServicePriority.Highest);
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
    }

    public GamestateManagerImpl getGamestateManager() {
        return gamestateManager;
    }

    public SidebarManagerImpl getSidebarManager() {
        return sidebarManager;
    }

    public TeamManagerImpl getTeamManager() {
        return teamManager;
    }

    public KitManagerImpl getKitManager() {
        return kitManager;
    }

    public void toggleKits(boolean toggle) {
        kitManager.toggleKits(toggle);
    }
}