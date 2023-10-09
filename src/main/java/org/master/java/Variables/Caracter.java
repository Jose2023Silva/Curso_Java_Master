package org.master.java.Variables;

public class Caracter {
    public static void main(String[] args) {
        char carac = 'a';
        System.out.println("carac = " + carac);
        char unicode = '\u0040'; // @
        System.out.println("unicode = " + unicode);
        char unicodeAri = '\u28FF';
        System.out.println("unicodeAri = " + unicodeAri);
        char numero = 64;
        System.out.println("numero = " + numero);

        System.out.println();
        System.out.println("Byte:" + Character.BYTES);
        System.out.println("Bits: " + Character.SIZE);
        System.out.println("Valor maximo: " + Character.MAX_VALUE);
        System.out.println("Valor minimo: " + Character.MIN_VALUE);
        System.out.println();

        /*
        Caracteres especiales

         */
        char espacio = ' ';
        char espacio2 = '\u0020';
        char retroseso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("Hola jose" + espacio2 + 23);
        System.out.println("Hola jose" + retroseso + 23);
        System.out.println("Hola jose" + tabulador + 23);
        System.out.println("Hola jose" + nuevaLinea + 23);
        System.out.println("Hola jose" + retornoCarro + 23);

    }
}
