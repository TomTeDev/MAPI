package more.mucho.v1_19_2;


import more.mucho.core.codeio.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemBuilder_1_19_2 implements ItemBuilder {

    public ItemStack craftItem(Material material){
        return new ItemStack(material,23);
    }
}
