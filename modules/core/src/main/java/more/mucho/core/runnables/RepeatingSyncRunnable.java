package more.mucho.core.runnables;

import org.bukkit.Bukkit;

public abstract class RepeatingSyncRunnable extends CoreRunnable{


    public RepeatingSyncRunnable(long delayTicks,long periodTicks) {
        taskID = call(delayTicks,periodTicks);
    }

    private int call(long delay,long periodTicks){
        return Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, this,delay,periodTicks);
    }

}
