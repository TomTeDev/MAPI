package more.mucho.api;

import more.mucho.core.codeio.ItemBuilder;
import more.mucho.v1_19_2.ItemBuilder_1_19_2;
import more.mucho.v1_20_4.ItemBuilder_1_20_4;
import org.bukkit.Material;

public class ItemBuilderFactory {
    public static ItemBuilder getItemBuilder(VERSION version) {
        switch (version) {
            case V1_19_2:
                return new ItemBuilder_1_19_2();
            case V1_20_4:
                return new ItemBuilder_1_20_4();
            default:
                throw new IllegalArgumentException("Unsupported version: " + version);
        }
    }
}
