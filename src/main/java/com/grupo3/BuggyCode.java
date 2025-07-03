package com.grupo3;

public class BuggyCode {

    private String nombre;

    public boolean isEmpty(String text) {
        return text == ""; // ❌ Comparación incorrecta con ==
    }

    public boolean compararObjetos(Object a, Object b) {
        return a.equals(b); // ❌ Posible NullPointerException si 'a' es null
    }

    public void metodoNuncaUsado() {
        int x = 5; // ❌ Variable no utilizada
    }

    public void bugNulo() {
        String temp = null;
        if (temp.length() > 0) { // ❌ NullPointerException asegurado
            System.out.println(temp);
        }
    }
}
