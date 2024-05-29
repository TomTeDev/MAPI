package more.mucho.api;

import more.mucho.core.Core;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.A;

public final class Api extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private static APIImp apiImp;
    public static void initialize(VERSION version, Plugin plugin) {
        Api.version = version;
        Core.setClientPlugin(plugin);
        Core.registerGuiListener();
        apiImp = new APIImp();
    }

    public APIImp getApi(){
        return apiImp;
    }

    private static VERSION version;

    public static VERSION getVersion() {
        return version;
    }


}
