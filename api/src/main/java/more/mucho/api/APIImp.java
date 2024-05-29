package more.mucho.api;

import more.mucho.core.codeio.ItemBuilder;

public class APIImp {

    public ItemBuilder getItemBuilder(){
        return ItemBuilderFactory.getItemBuilder(Api.getVersion());
    }
}
