package com.modelClass;
import java.util.ArrayList;
import java.util.List;

public class Shoopingcart {
    public class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

    }
        private List<Item> items;

        public Shoopingcart() {
            this.items = new ArrayList<>();
        }

        // Method for adding an item to the cart
        public void addItem(Item item) {
            items.add(item);
        }

        // Method for removing an item from the cart by name
        public boolean removeItem(String itemName) {
            for (Item item : items) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    items.remove(item);
                    return true;
                }
            }
            return false;
        }

        // Method for getting the total price of items in the cart
        public double getTotalPrice() {
            double total = 0.0;
            for (Item item : items) {
                total += item.getPrice();
            }
            return total;
        }

}
