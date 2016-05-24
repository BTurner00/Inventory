package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    static ArrayList<InventoryItem> items = new ArrayList<>();

    public static void listInventory(ArrayList<InventoryItem> items) {
        for (InventoryItem inventoryItem : items) {
            System.out.println("[" + inventoryItem.quantity + "] " + inventoryItem.text);

        }
    }

    public static void createItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Enter the item to be created: ");
        String text = scanner.nextLine();
        InventoryItem item = new InventoryItem(text, 1);
        items.add(item);
    }

    public static void removeItem(Scanner scanner, ArrayList<InventoryItem> items) {
        int i = 0;
        System.out.println("Enter the item to be removed: ");
        String text = scanner.nextLine();

        /*for (InventoryItem item : items) {
            if (items[0].equals(text)) {

            }
        }*/
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            listInventory(items);


            System.out.println("Options:");
            System.out.println("[1] Create a new item");
            System.out.println("[2] Remove an item");
            System.out.println("[3] Update an item's quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1": {
                    createItem(scanner, items);
                    break;
                }
                case "2": {
                    removeItem(scanner, items);
                    break;
                }
                case "3": {
                    System.out.println("Enter the item for quantity update: ");
                    String text = scanner.nextLine();
                    System.out.println("Enter the updated quantity: ");
                    String quantityStr = scanner.nextLine();
                    int quantity = Integer.valueOf(quantityStr);
                    InventoryItem item = new InventoryItem(text, quantity);
                    items.set(items.indexOf(item), item);
                    break;
                }
            }
        }
    }
}

