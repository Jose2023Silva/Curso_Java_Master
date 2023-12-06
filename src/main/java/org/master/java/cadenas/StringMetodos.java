package org.master.java.cadenas;

public class StringMetodos {
    public static void main(String[] args) {
        String nombre = "Jose Angel";

        // largo de cadena
        System.out.println("nombre.length() = " + nombre.length());
        //Mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        // minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        // igualdad de valor
        System.out.println("nombre.equals(\"Jose Angel\") = " + nombre.equals("Jose Angel"));
        System.out.println("nombre.equals(\"jose angel\") = " + nombre.equals("jose angel"));
        System.out.println("nombre.equalsIgnoreCase(\"Jose angel\") = " + nombre.equalsIgnoreCase("Jose angel"));
        // comparacion basado a unicode con canda valor unicode de la cadena
        // retorna 0 si es igual, < 0 cuando la cadena a comparar es mejor o >0 si la candena lexicografico es mayo a la candena comparada (caracteres)
        System.out.println("nombre.compareTo(\"Jose Angel\") = " + nombre.compareTo("Jose Angel"));
        System.out.println("nombre.compareTo(\"Angel\") = " + nombre.compareTo("Angel"));
        
        // obtener el caracter de la cadena
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

        // Obtener un frag del string de un index especificado hasta el final o especificado pero no se imprime el
        // caracter especificado
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0,4) = " + nombre.substring(0,4));

        System.out.println();

        String trabajenguas = "trabalenguas";
        System.out.println("trabajenguas = " + trabajenguas);
        // remplazar caracter por otro
        System.out.println("trabajenguas.replace(\"a\",\".\") = " + trabajenguas.replace("a","."));
        // buscar el primer caracter que coincide al paremtro y retorna el indice donde esta
        System.out.println("trabajenguas.indexOf(\"a\") = " + trabajenguas.indexOf("a"));
        // buscar el ultimo ocurrencia que coincide al parametro y retorna el indice donde esta, retoran <0 cuando no hay coincidencia
        System.out.println("trabajenguas.lastIndexOf('a') = " + trabajenguas.lastIndexOf('a'));
        // tambien acepta cadenas
        System.out.println("trabajenguas.indexOf(\"lengua\") = " + trabajenguas.indexOf("lengua"));
        
        // se envia un str  y retorna un boleano
        System.out.println("trabajenguas.contains() = " + trabajenguas.contains("t"));
        System.out.println("trabajenguas.contains(\"lengua\") = " + trabajenguas.contains("lengua"));
        System.out.println("trabajenguas.contains(\"Trab\") = " + trabajenguas.contains("Trab"));
        
        // validar si empieza con un valor
        System.out.println("trabajenguas.startsWith(\"tra\") = " + trabajenguas.startsWith("tra"));
        System.out.println("trabajenguas.startsWith(\"lengua\") = " + trabajenguas.startsWith("lengua"));
        
        // validar si termina con un valor en especifico
        System.out.println("trabajenguas.endsWith(\"lengua\") = " + trabajenguas.endsWith("lengua"));
        System.out.println("trabajenguas.endsWith(\"as\") = " + trabajenguas.endsWith("as"));

        System.out.println("    trabajenguas     ");
        // quita los espacios que inicia y finaliza la cadena
        System.out.println("    trabajenguas     ".trim());
        // no quita los espacios que tiene entre caracteres
        System.out.println("    traba j enguas     ".trim());

    }
}
