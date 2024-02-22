package more.mucho.core.runnables;

import org.bukkit.Bukkit;

public abstract class RepeatingAsyncRunnable extends CoreRunnable{

    public RepeatingAsyncRunnable(long delayTicks,long periodTicks) {
        taskID = call(delayTicks,periodTicks);
    }

    private int call(long delay,long periodTicks){
        return Bukkit.getScheduler().scheduleAsyncRepeatingTask(plugin, this,delay,periodTicks);
    }

}
