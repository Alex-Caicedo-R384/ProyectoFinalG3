package com.grupo3;
// InventoryStyle.java
import java.util.ArrayList;
import java.util.List;

public class InventoryStyle {
    private List products = new ArrayList<>();
    private List quantities = new ArrayList<>();
    private List prices = new ArrayList<>();

    // Método con nombre poco claro y sin validaciones para violar reglas de estilo
    public void addProducto(String p, int q, double price) {
        products.add(p);
        quantities.add(q);
        prices.add(price);
        System.out.println("Product added.");
    }

    // Método con línea muy larga y sin formateo correcto
    public void printInventory() {
        for (int i = 0; i < products.size(); i++) { System.out.println("Product: " + products.get(i) + ", Quantity: " + quantities.get(i) + ", Price: $" + prices.get(i)); }
    }

    public static void main(String[] args) {
        InventoryStyle inv = new InventoryStyle();
        inv.addProducto("Laptop", 5, 1000.0);
        inv.printInventory();
    }
}
