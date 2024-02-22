package more.mucho.core.base;

public abstract class APIBase implements API{

    public APIBase(){}

    public ConfigHandler configHandler(String configName) {
        return new ConfigHandler(configName);
    }
}
