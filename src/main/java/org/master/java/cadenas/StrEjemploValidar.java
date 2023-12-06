package org.master.java.cadenas;

public class StrEjemploValidar {
    public static void main(String[] args) {
        String curso = null;

        //valodar si contiene null
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if (esNulo)
            curso = " ";//"Java";
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio1 = curso.isEmpty();
        System.out.println("esVacio1 = " + esVacio1);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        System.out.println(curso.toLowerCase());
        System.out.println("Bienvenido al curso de "  + curso);
    }
}
