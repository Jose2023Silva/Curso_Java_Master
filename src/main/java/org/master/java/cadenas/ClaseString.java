package org.master.java.cadenas;

public class ClaseString {
    public static void main(String[] args) {
        // Los String son objetos de tipo referencia
        /*
        un String es una cadena de caracteres usando unicode y que son inmutables, es decir,
        que no se modifican para nada el contenido de un String.
         */
        // declarando e instanciando el objeto
        String nombre =  new String("Jose Angel");
        System.out.println("nombre = " + nombre);
        // declarando con literal
        String apellidos = "Silva Cruz";
        System.out.println("apellidos = " + apellidos);
        
        // Concatenacion de cadenas
        String nombreCompleto = nombre + " " + apellidos;
        System.out.println("nombreCompleto = " + nombreCompleto);

        /*
        En las comparaciones el operador "==" se compara la referencia, mientras el el metodo
        "equals" compara el valor de la cadena, es decir, el contenido.
         */
        // comparando si son el mismo objeto
        System.out.println("Son el mismo objeto? " + (nombre == apellidos));
        // comparando si tiene el mismo valor
        System.out.println("Tiene el mismo valor? " +   (nombre.equals( apellidos)) );
    }
}
