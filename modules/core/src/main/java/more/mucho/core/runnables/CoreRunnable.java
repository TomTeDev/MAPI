package more.mucho.core.runnables;

import more.mucho.core.Core;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public abstract class CoreRunnable implements Runnable {
    public static final Plugin plugin = Core.getClientPlugin();
    protected int taskID = -1;
    private boolean isCancelled = false;


    public void cancel() {
        Bukkit.getScheduler().cancelTask(taskID);
        isCancelled = true;
    }
    public boolean isCancelled(){
        return isCancelled;
    }
    public Plugin getOwner(){
        return plugin;
    }
    public int getTaskID(){
        return this.taskID;
    }
}
