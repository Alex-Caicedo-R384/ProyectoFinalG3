package com.grupo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    @Test
    void testDoStuff() {
        UserManager um = new UserManager();
        um.doStuff("test", "pass");
        assertTrue(true); // Prueba básica
    }
}