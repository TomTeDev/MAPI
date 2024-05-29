package more.mucho.core;

import more.mucho.core.gui.GUIListener;
import more.mucho.core.gui.GUIManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    private static Plugin clientPlugin;


    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void setClientPlugin(Plugin plugin_){
        clientPlugin = plugin_;
    }

    public static Plugin getClientPlugin() {
        return clientPlugin;
    }
    private static GUIManager guiManager;
    public static void registerGuiListener(){
        guiManager = new GUIManager();
        clientPlugin.getServer().getPluginManager().registerEvents(new GUIListener(guiManager), clientPlugin);
    }
}
