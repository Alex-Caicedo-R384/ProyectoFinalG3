package com.grupo3;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();

    public boolean addProduct(String productName, int quantity, double price) {
        if (productName == null || productName.isEmpty()) {
            System.out.println("Error: product name is empty.");
            return false;
        }
        if (quantity <= 0) {
            System.out.println("Error: quantity must be positive.");
            return false;
        }
        if (price < 0) {
            System.out.println("Error: price cannot be negative.");
            return false;
        }
        if (products.contains(productName)) {
            System.out.println("Error: product already exists.");
            return false;
        }
        products.add(productName);
        quantities.add(quantity);
        prices.add(price);
        System.out.println("Product added successfully.");
        return true;
    }

    public void printInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory list:");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("Product: %s, Quantity: %d, Price: $%.2f%n",
                    products.get(i), quantities.get(i), prices.get(i));
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Laptop", 5, 1000.0);
        inventory.printInventory();
    }
}
