package more.mucho.mapi.apis;

import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

public class ConfigHandler {
    private final String configName;
    protected File file;
    private FileConfiguration cfg;
    public ConfigHandler(String configName){
        this.configName = configName;

    }


    public void save(){}

    public void reload(){}

}
