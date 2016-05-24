package com.theironyard;

/**
 * Created by Ben on 5/24/16.
 */
public class Scrolls extends InventoryItem {
    public Scrolls(String text, int quantity) {
        this.text = text;
        this.quantity = quantity;
        this.category = "Scrolls";
    }
}
