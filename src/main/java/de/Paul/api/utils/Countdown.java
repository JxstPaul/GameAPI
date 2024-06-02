package de.Paul.api.utils;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Countdown extends BukkitRunnable {
    private JavaPlugin plugin;
    private int countdownTime;
    private Runnable onCountdownEnd;

    public Countdown(JavaPlugin plugin, int countdownTime, Runnable onCountdownEnd) {
        this.plugin = plugin;
        this.countdownTime = countdownTime;
        this.onCountdownEnd = onCountdownEnd;
    }

    @Override
    public void run() {
        if (countdownTime > 0) {
            countdownTime--;
        } else {
            onCountdownEnd.run();
            cancel();
        }
    }

    public void start() {
        this.runTaskTimer(plugin, 0L, 20L);
    }
}