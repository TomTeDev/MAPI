package more.mucho.core;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    private static Plugin clientPlugin;
    private static Plugin instance;


    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getClientPlugin() {
        return clientPlugin;
    }
}
