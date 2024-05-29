package more.mucho.core.codeio;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.List;

public abstract class ItemBuilderBase implements ItemBuilder{

    protected ItemStack itemStack;
    private int amount;

    public ItemBuilderBase(ItemStack itemStack){
        this.itemStack = itemStack;
        this.amount = itemStack.getAmount();
    }

    public ItemBuilderBase(Material material){
        this.itemStack = new ItemStack(material);
    }
    public ItemBuilderBase(MaterialData materialData){
        this.itemStack = new ItemStack(materialData.getItemType(),1,(short)0,materialData.getData());
    }

    public abstract TagHandler getTagHandler();



    private class TagSomething implements TagHandler{
        private ItemMeta meta;
        public TagSomething(ItemMeta _meta){
            this.meta = _meta;

        }

        @Override
        public boolean hasKey(String key) {

            return false;
        }

        @Override
        public void removeKey(String key) {

        }

        @Override
        public List<String> getKeys() {
            return null;
        }
    }
}
