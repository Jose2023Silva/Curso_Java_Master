package org.master.java.cadenas;

public class CadenasString {
    public static void main(String[] args) {
        String curso = "Curso de Java";
        String curso2 = new String("Curso de Java");
        String curso3 = "curso de java";

        boolean esCursoIguales = (curso == curso2);
        System.out.println("esCursoIguales = " + esCursoIguales);

        boolean tieneMismoContenido = ( curso.equals(curso2) );
        System.out.println("tieneMismoContenido = " + tieneMismoContenido);
        
        boolean tieneMismoContenidoPeroignoraCase = (curso.equalsIgnoreCase(curso3));
        System.out.println("tieneMismoContenidoPeroignoraCase = " + tieneMismoContenidoPeroignoraCase);
    }
}
