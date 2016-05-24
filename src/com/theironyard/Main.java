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
        int index = -1;
        System.out.println("Enter the item to be removed: ");
        String text = scanner.nextLine();

        int i = 0;
        for (InventoryItem temp : items) {

            temp = items.get(i);
            if (temp.text.equals(text)) {
                index = i;
            }


            i++;
        }
        items.remove(index);
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
                    int index = -1;
                    int i = 0;
                    for (InventoryItem temp : items) {

                        temp = items.get(i);
                        if (temp.text.equals(text)) {
                            index = i;
                        }


                        i++;
                    }
                    items.set(index, item );
                    break;
                }
            }
        }
    }
}

