package com.theironyard;

/**
 * Created by Ben on 5/24/16.
 */
public class Food extends InventoryItem {
    public Food (String text, int quantity) {
        this.text = text;
        this.quantity = quantity;
        this.category = "Food";
    }
}
