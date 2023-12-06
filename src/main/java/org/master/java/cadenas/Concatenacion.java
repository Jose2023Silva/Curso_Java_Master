package org.master.java.cadenas;

public class Concatenacion {
    public static void main(String[] args) {
        String curso = "Curso de Java";
        String nombre = "Jorge";

        String detalle = curso + " con el instructor "  +nombre;
        System.out.println("detalle = " + detalle);

        int noA = 10;
        int noB = 5;

        // concatenar con numero y primero es la precedencia de izquierda a derecha,
        // por lo que ve primero el string y lo ve como cadena los demas
        System.out.println(detalle + noA + noB);
        // Dando prioridad de operador con parentesis
        System.out.println(detalle + (noA + noB) );
        // primero ve los numero y evalua, suma y despues concatena
        System.out.println(noB + noA + detalle);

        // concatenar otra forma
        String detalle2 = curso.concat(" con ".concat(nombre) );
        System.out.println("detalle2 = " + detalle2);
        detalle2 = curso.concat(" con ").concat(nombre);
        System.out.println("detalle2 = " + detalle2);
    }
}
