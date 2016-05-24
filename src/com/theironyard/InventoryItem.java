package com.theironyard;

/**
 * Created by Ben on 5/23/16.
 */
public class InventoryItem {
    String text;
    int quantity;
    String category;

    /*public InventoryItem(String text, int quantity) {
        this.text = text;
        this.quantity = quantity;
        this.category = null;
    }*/

    public InventoryItem() {
    }

    public InventoryItem(String text, int quantity, String category) {
        this.text = text;
        this.quantity = quantity;
        this.category = null;
    }
}
