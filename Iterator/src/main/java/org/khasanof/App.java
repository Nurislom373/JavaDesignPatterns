package org.khasanof;

import lombok.extern.slf4j.Slf4j;

import static org.khasanof.ItemType.*;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 12/6/2023 11:43 PM
 */
public class App {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
        System.out.println("------------------------");
        System.out.println("Item Iterator for ItemType " + itemType + ": ");
        var itemIterator = TREASURE_CHEST.iterator(itemType);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().toString());
        }
    }

    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
        demonstrateTreasureChestIteratorForType(WEAPON);
        demonstrateTreasureChestIteratorForType(ANY);
    }

}
