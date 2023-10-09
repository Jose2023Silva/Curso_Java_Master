package org.master.java.Variables;

public class ConversionPrimitivos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "952.665e-1";
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println("numeroDouble = " + numeroDouble);

        String logicoFalse = "false";
        boolean esFalso = Boolean.parseBoolean(logicoFalse);
        System.out.println("esFalso = " + esFalso);

        int numero1 = 100;
        System.out.println("numero1 = " + numero1);
        String converNoToString = Integer.toString(numero1);
        System.out.println("converNoToString = " + converNoToString);

        String otroConversion = String.valueOf(converNoToString);
        System.out.println("otroConversion = " + otroConversion);
    }
}
