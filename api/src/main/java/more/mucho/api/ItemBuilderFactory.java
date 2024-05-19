package more.mucho.api;

import more.mucho.v1_19_2.ItemBuilder_1_19_2;
import org.bukkit.Material;

public class ItemBuilderFactory {
    public static more.mucho.core.codeio.ItemBuilder getItemBuilder(String version) {
        switch (version) {
            case "1.19.2":
                return new ItemBuilder_1_19_2();
            default:
                throw new IllegalArgumentException("Unsupported version: " + version);
        }
    }
}
