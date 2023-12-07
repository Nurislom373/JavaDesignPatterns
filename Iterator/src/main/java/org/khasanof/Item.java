package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 12/6/2023 11:30 PM
 */
public class Item {

    private ItemType type;
    private final String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
