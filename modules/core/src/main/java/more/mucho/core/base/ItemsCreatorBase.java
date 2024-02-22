package more.mucho.core.base;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public abstract class ItemsCreatorBase implements ItemsCreator{

    protected ItemStack itemStack;
    private int amount;

    public ItemsCreatorBase(ItemStack itemStack){
        this.itemStack = itemStack;
        this.amount = itemStack.getAmount();
    }

    public ItemsCreatorBase(Material material){
        this.itemStack = new ItemStack(material);
    }
    public ItemsCreatorBase(MaterialData materialData){
        this.itemStack = new ItemStack(materialData.getItemType(),1,(short)0,materialData.getData());
    }

    public abstract TagHandler getTagHandler();

}
