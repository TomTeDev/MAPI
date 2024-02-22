package more.mucho.mapi;

import more.mucho.mapi.base.API;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class MAPI extends JavaPlugin {

    private static Plugin clientPlugin;
    private static Plugin instance;
    private static VERSION version;

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        instance = null;
    }

    private static API api;

    public static API init(Plugin yourPlugin, VERSION version) {
        clientPlugin = yourPlugin;
        MAPI.version = version;
        switch (version) {
            case V1_19_2:
                api = new more.mucho.v1_19_2.Api();
                break;
            case V1_20_4:
                api = new more.mucho.v1_20_4.Api();
                break;
            default:
                api = null;
                throw new IllegalArgumentException("Api is not supported for this version " + version.name());
        }
        return api;
    }

    public static API get() {
        return api;
    }

    public static Plugin getClientPlugin() {
        return clientPlugin;
    }

    public static void log(Level level, String message) {
        instance.getLogger().log(level, message);
    }

}
