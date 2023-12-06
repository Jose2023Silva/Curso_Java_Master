package org.master.java.cadenas;

public class EjemploStrExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen.archivo.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = "
                + archivo.substring(archivo.length()-4));
        // adaptar la extencion
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i + 1));
    }
}
