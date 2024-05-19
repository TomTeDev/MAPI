package more.mucho.core.runnables;

import org.bukkit.Bukkit;

public abstract class DelayedSyncRunnable extends CoreRunnable {
    public DelayedSyncRunnable(long delayTicks) {
        taskID = call(delayTicks);
    }

    private int call(long delay) {
        return Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, this, delay);
    }
}