package com.theironyard;

/**
 * Created by Ben on 5/24/16.
 */
public class Armor extends InventoryItem {
    public Armor (String text, int quantity) {
        this.text = text;
        this.quantity = quantity;
        this.category = "Armor";
    }
}
