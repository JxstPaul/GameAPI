package de.Paul.API;

import org.bukkit.command.CommandSender;

public interface Command {
    void execute(CommandSender sender);
    String getName();
}