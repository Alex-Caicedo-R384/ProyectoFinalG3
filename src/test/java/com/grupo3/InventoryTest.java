package com.grupo3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    private Inventory inventory;

    @BeforeEach
    public void setup() {
        inventory = new Inventory();
    }

    @Test
    public void testAddProductSuccess() {
        assertTrue(inventory.addProduct("Mouse", 10, 25.5));
    }

    @Test
    public void testAddProductDuplicate() {
        inventory.addProduct("Keyboard", 5, 45.0);
        assertFalse(inventory.addProduct("Keyboard", 3, 40.0));
    }

    @Test
    public void testAddProductInvalidQuantity() {
        assertFalse(inventory.addProduct("Monitor", 0, 200.0));
        assertFalse(inventory.addProduct("Monitor", -1, 200.0));
    }

    @Test
    public void testAddProductInvalidPrice() {
        assertFalse(inventory.addProduct("Desk", 1, -10.0));
    }

    @Test
    public void testAddProductEmptyName() {
        assertFalse(inventory.addProduct("", 1, 10.0));
        assertFalse(inventory.addProduct(null, 1, 10.0));
    }
}
