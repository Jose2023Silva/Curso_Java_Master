package org.master.java.Variables;

public class ConversionStringToPrimitivos {
    public static void main(String[] args) {
        String nuString = "50";

        // tipo int
        int  noInt = Integer.parseInt(nuString);
        System.out.println("noInt = " + noInt);

        // Tipo double
        String noStringDouble = "456.656e-1";
        double noDouble = Double.parseDouble(noStringDouble);
        System.out.println("noDouble = " + noDouble);
        
        
        // tipo boolean
        String texBoolean = "True";
        boolean esVerdad = Boolean.parseBoolean(texBoolean);
        System.out.println("esVerdad = " + esVerdad);
        
        // tipo char
        String text = "D";
        char caracter = text.charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
