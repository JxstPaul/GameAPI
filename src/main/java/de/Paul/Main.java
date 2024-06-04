package de.Paul;

import de.Paul.impl.menus.KitSelection;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

import de.Paul.API.managers.*;
import de.Paul.impl.*;
import de.Paul.listeners.*;

public class Main extends JavaPlugin {
    private GamestateManagerImpl gamestateManager;
    private SidebarManagerImpl sidebarManager;
    private TeamManagerImpl teamManager;
    private MenuManagerImpl menuManager;
    private KitManagerImpl kitManager;

    @Override
    public void onEnable() {
        kitManager = new KitManagerImpl();
        gamestateManager = new GamestateManagerImpl(kitManager);
        gamestateManager.setState(gamestateManager.getStates().get("LobbyState"));
        sidebarManager = new SidebarManagerImpl();
        teamManager = new TeamManagerImpl();
        menuManager = new MenuManagerImpl();

        getServer().getServicesManager().register(GamestateManager.class, gamestateManager, this, ServicePriority.Highest);
        getServer().getServicesManager().register(SidebarManager.class, sidebarManager, this, ServicePriority.Highest);
        getServer().getServicesManager().register(TeamManager.class, teamManager, this, ServicePriority.Highest);
        getServer().getServicesManager().register(KitManager.class, kitManager, this, ServicePriority.Highest);

        menuManager.registerMenu(new KitSelection(kitManager));
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
        getServer().getPluginManager().registerEvents(new InventoryClick(menuManager), this);
    }

    public GamestateManagerImpl getGamestateManager() { return gamestateManager; }
    public SidebarManagerImpl getSidebarManager() { return sidebarManager; }
    public TeamManagerImpl getTeamManager() { return teamManager; }
    public MenuManagerImpl getMenuManager() { return menuManager; }
    public KitManagerImpl getKitManager() { return kitManager; }

    public void toggleKits(boolean toggle) { kitManager.toggleKits(toggle); }
}
