package more.mucho.core.runnables;

import org.bukkit.Bukkit;

public abstract class DelayedAsyncRunnable extends CoreRunnable {

    public DelayedAsyncRunnable(long delayTicks) {
        taskID = call(delayTicks);
    }

    private int call(long delay) {
        return Bukkit.getScheduler().scheduleAsyncDelayedTask(plugin, this, delay);
    }

}