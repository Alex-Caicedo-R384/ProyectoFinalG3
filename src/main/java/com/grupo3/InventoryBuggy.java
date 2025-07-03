package com.grupo3;
// InventoryBuggy.java
import java.util.ArrayList;
import java.util.List;

public class InventoryBuggy {
    private List<String> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();

    public void addProduct(String p, int q, double price) {
        if (q < 0) {  // Bug: no manejo correcto, debería lanzar excepción o corregir
            System.out.println("Quantity can't be negative!");
        }
        products.add(p);
        quantities.add(q);
        prices.add(price);
    }

    public void printInventory() {
        for (int i = 0; i <= products.size(); i++) {  // Bug: <= causa ArrayIndexOutOfBoundsException
            System.out.println("Product: " + products.get(i) + ", Quantity: " + quantities.get(i) + ", Price: $" + prices.get(i));
        }
    }

    public static void main(String[] args) {
        InventoryBuggy inv = new InventoryBuggy();
        inv.addProduct("Mouse", -1, 25.0);
        inv.printInventory();
    }
}
