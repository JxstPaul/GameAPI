package de.Paul.API.managers;

import de.Paul.API.Gamestate;

import java.util.Map;

public interface GamestateManager {
    void setState(Gamestate state);
    Gamestate getCurrentState();
    Map<String, Gamestate> getStates();
    void setMaxPlayers(int maxPlayers);
    int getMaxPlayers();
}