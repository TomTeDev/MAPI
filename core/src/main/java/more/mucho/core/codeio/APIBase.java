package more.mucho.core.codeio;

import more.mucho.core.ConfigHandler;

public abstract class APIBase implements API {

    public APIBase(){}

    public more.mucho.core.ConfigHandler configHandler(String configName) {
        return new ConfigHandler(configName);
    }
}
