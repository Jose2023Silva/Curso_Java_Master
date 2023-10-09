package org.master.java.Variables;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /**
         * Tipos primitivos en java
         *
         * boolean
         * solo tienen dos valores, true o false, solo ocupa 1 bit
         * Valor por defecto: false
         * Class Wrapper: Boolean
         *
         * char
         * se almacena caracteres unicode y ocupa para cada caracter 16 bits
         * Valor por defecto: u0000
         * Class Wrapper: Character
         *
         * Enteros
         * Son 4 tipos de datos numericos enteros, tiene cada uno un limite de almacenamiento
         * y pueden ser positivos - negativos
         *
         *
         * 1. byte
         *  vPD: 0
         *  Class Wrapper: Byte
         * 2. short
         *  vPD: 0
         *  Class Wrapper: Short
         * 3. int
         *  VPD: 0
         *  Class Wrapper: Integer
         * 4. long
         *  VPD: 0L
         *  Class Wrapper: Long
         *
         * Reales
         * son tipos de datos numerico decimal, solo se tiene con presision simple y doble
         * 1. float
         *  vPD: 0.0f
         *  Class Wrapper: Float
         * 2. double
         *  vPD: 0.0d
         *  Class Wrapper: Double
         */

        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Byte:" + Byte.BYTES);
        System.out.println("Bits: " + Byte.SIZE);
        System.out.println("Valor maximo: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo: " + Byte.MIN_VALUE);
        System.out.println();

        short numeroShort = 7000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Byte:" + Short.BYTES);
        System.out.println("Bits: " + Short.SIZE);
        System.out.println("Valor maximo: " + Short.MAX_VALUE);
        System.out.println("Valor minimo: " + Short.MIN_VALUE);
        System.out.println();

        int numeroInt = 3664025;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Byte:" + Integer.BYTES);
        System.out.println("Bits: " + Integer.SIZE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println();

        long numeroLong = 36640250000L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Byte:" + Long.BYTES);
        System.out.println("Bits: " + Long.SIZE);
        System.out.println("Valor maximo: " + Long.MAX_VALUE);
        System.out.println("Valor minimo: " + Long.MIN_VALUE);
        System.out.println();

        float numeroFloat = 7f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Byte:" + Float.BYTES);
        System.out.println("Bits: " + Float.SIZE);
        System.out.println("Valor maximo: " + Float.MAX_VALUE);
        System.out.println("Valor minimo: " + Float.MIN_VALUE);
        System.out.println();

        double numeroDouble = 3664025d;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Byte:" + Double.BYTES);
        System.out.println("Bits: " + Double.SIZE);
        System.out.println("Valor maximo: " + Double.MAX_VALUE);
        System.out.println("Valor minimo: " + Double.MIN_VALUE);
        System.out.println();

    }
}
