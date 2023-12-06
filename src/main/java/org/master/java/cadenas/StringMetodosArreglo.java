package org.master.java.cadenas;

public class StringMetodosArreglo {
    public static void main(String[] args) {
        String trabajenguas = "trabalenguas";
        char[] array = trabajenguas.toCharArray();
        System.out.println("trabajenguas.toCharArray() = " + trabajenguas.toCharArray());
        for(char caracter : array) {
            System.out.print( caracter);
        }
        System.out.println();
        // el split retorna un array de cadenas separadas por el delimitador regex que separa la cadena
        System.out.println("trabajenguas.split(\"a\") = " + trabajenguas.split("a"));
        
        String[] split = trabajenguas.split("a");
        for (String split2 : split) {
        System.out.println("split = " + split2);
        }

        String archivo = "imagen.formato.jpeg";
        String[] array2 = archivo.split("\\.");
        for (String nom:
             array2) {
            System.out.println("nom = " + nom);
        }
    }
}
