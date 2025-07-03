package com.grupo3;

import java.util.*;     // ← import con comodín (prohibido)

public class BadStyleExample {        // ← Falta Javadoc de clase

    public static int badConstant = 42;   // ← constante sin MAYÚSCULAS_SNAKE_CASE

    public void BADMethod ( String  a , String b ){
        int x,y,z=0;                      // ← varias vars en misma línea
        if(true){System.out.println(a+b);}  // ← espacios, if sin espacio, misma línea
    }
}
