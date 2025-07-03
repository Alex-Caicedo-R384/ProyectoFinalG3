package com.grupo3;

public class UserManager {
    public void doStuff(String x, String y) {
        // Método largo con nombres confusos
        if (x != null && y != null) {
            System.out.println("User " + x + " logged in");
            // Lógica simulada
            for (int i = 0; i < 10; i++) {
                System.out.println("Processing " + i);
                if (x.equals("admin")) {
                    System.out.println("Admin access");
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
