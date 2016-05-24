package com.theironyard;

/**
 * Created by Ben on 5/24/16.
 */
public class Potions extends InventoryItem {
    public Potions (String text, int quantity) {
        this.text = text;
        this.quantity = quantity;
        this.category = "Potions";
    }
}
