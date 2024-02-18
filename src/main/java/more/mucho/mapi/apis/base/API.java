package more.mucho.mapi;

import more.mucho.mapi.apis.ConfigHandler;

public interface API {

    ConfigHandler configHandler(String configName);
    ItemsCreator itemsCreator();

}
