package more.mucho.core.codeio;

import more.mucho.core.ConfigHandler;

public interface API {

    ConfigHandler configHandler(String configName);
    ItemBuilder getBuilder();

}
