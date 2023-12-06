package org.master.java.Variables;

public class ConversionPrimitivos {
    public static void main(String[] args) {
        int in = 5000;
        System.out.println("in = " + in);

        // conversion de un estero int etre otros tipos enteros
        // byte noByte = in; por el jvm, no lo reconoce y necesita castearla
        byte noByte = (byte) in;
        // no se almacena el numero como tal ya que hay desborde de datos y hay inconsistencias
        System.out.println("noByte = " + noByte);

        short noShort = (short) in;
        System.out.println("noShort = " + noShort);

        long noLong = (long) in;
        System.out.println("noLong = " + noLong);
        // el tipo char acepta numeros enteros pero casteados y lo identifica como un tipo unicode
        char caracter = (char) in;
        System.out.println("caracter = " + caracter);

        // Conversion a tipos flotantes de un int
        float noFloat = (float) in;
        System.out.println("noFloat = " + noFloat);

        double noDouble = (double) in;
        System.out.println("noDouble = " + noDouble);


    }
}
