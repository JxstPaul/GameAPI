package de.Paul.API.managers;

import de.Paul.API.Command;
import org.bukkit.command.CommandSender;

import java.util.Map;

public interface CommandManager {
    void registerCommand(Command command);
    void executeCommand(Command command, CommandSender sender);
    Map<String, Command> getCommands();
}