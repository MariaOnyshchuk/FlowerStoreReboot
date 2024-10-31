package ua.edu.ucu;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                '}';
    }
}

