package com.theironyard;

/**
 * Created by Ben on 5/24/16.
 */
public class Weapons extends InventoryItem {
    public Weapons (String text, int quantity) {
        this.text = text;
        this.quantity = quantity;
        this.category = "Weapons";
    }
}
