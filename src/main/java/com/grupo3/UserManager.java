package com.grupo3;

public class UserManager {
    public void doStuff(String x, String y) {
        if (x != null && y != null) {
            System.out.println("Processing " + x + " and " + y);
        } else {
            System.out.println("Error");
        }
    }
}