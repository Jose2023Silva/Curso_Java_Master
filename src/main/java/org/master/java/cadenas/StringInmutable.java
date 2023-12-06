package org.master.java.cadenas;

public class StringInmutable {
    public static void main(String[] args) {
        String curso = "Curso de programacion Java";
        String nombre = "Andres Guzmán";

        String resultado = curso.concat(" " +nombre); // este retorna una nueva cadena y no altera a la original
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);
        String nombreCurso = curso.transform(c ->{
            return c + " con " + nombre;
        });
        System.out.println("nombreCurso = " + nombreCurso);
        
        // remplazando con un caracter y siempre se tiene que almacenar a una cadena nueva
        String result2 = nombreCurso.replace('a', 'A');
        System.out.println("result2 = " + result2);

        //
    }
}
