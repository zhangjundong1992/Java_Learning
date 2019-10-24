package lsn4_inheritace;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> items = new ArrayList<>();

    void add(Item item) {
        items.add(item);
    }

    void list() {
        items.forEach(Item::print);
    }
}
