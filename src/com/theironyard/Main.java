package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    static InventoryItem createItem(String text, int quantity, String category) throws Exception{
        switch (category) {
            case "Armor":
                return new Armor(text, quantity);
            case "Weapons":
                return new Weapons(text, quantity);
            case "Food":
                return new Food(text, quantity);
            case "Potions":
                return new Potions(text, quantity);
            case "Scrolls":
                return new Scrolls(text, quantity);
            default:
                //System.out.println("Invalid Category");
                //return new InventoryItem(text, quantity, "Invalid Category");

                throw new Exception("Invalid Category!");
        }


    }

    static ArrayList<InventoryItem> items = new ArrayList<>();

    public static void listInventory(ArrayList<InventoryItem> items) {
        for (InventoryItem inventoryItem : items) {
            System.out.printf("[%s] %s - Category: %s\n",inventoryItem.quantity, inventoryItem.text, inventoryItem.category);

        }
    }

    public static void create(Scanner scanner, ArrayList<InventoryItem> items) throws Exception {
        System.out.println("Enter the item to be created: ");
        String text = scanner.nextLine();
        System.out.println("Enter the item's category: [Armor/Weapons/Food/Potions/Scrolls]");
        String category = scanner.nextLine();
        int quantity = 1;
        //InventoryItem item = new InventoryItem(text, 1, category);
        InventoryItem item = createItem(text, quantity, category);
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

    public static void updateQuantity (Scanner scanner, ArrayList<InventoryItem> items) {
        String category = new String();
        System.out.println("Enter the item for quantity update: ");
        String text = scanner.nextLine();
        System.out.println("Enter the updated quantity: ");
        String quantityStr = scanner.nextLine();
        int quantity = Integer.valueOf(quantityStr);
        InventoryItem item =new InventoryItem(text, quantity, category);
        int index = -1;
        int i = 0;
        for (InventoryItem temp : items) {

            temp = items.get(i);
            if (temp.text.equals(text)) {
                index = i;
                category = temp.category;
            }


            i++;
        }
        item.category = category;
        items.set(index, item );
    }

    public static void main(String[] args) throws Exception {

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
                    create(scanner, items);
                    break;
                }
                case "2": {
                    removeItem(scanner, items);
                    break;
                }
                case "3": {
                    updateQuantity(scanner, items);
                    break;
                }
            }
        }
    }
}

