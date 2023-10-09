package org.master.java.Variables;

import javax.swing.*;

public class SistemaNumerico {
    public static void main(String[] args) {
        int numeroDecimal = Integer.parseInt(
                solDato("Ingresa un numero")
        );
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de "
                + numeroDecimal
                + " = "
                + Integer.toBinaryString(numeroDecimal));

        //int numeroBinario = 0b0001111;
        //System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de "
                + numeroDecimal
                + " = "
                + Integer.toOctalString(numeroDecimal));
        //int numeroOctal = 0754;
        //System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numero hexadeximal de "
                + numeroDecimal
                + " = "
                + Integer.toHexString(numeroDecimal));

        /*int numeroHexa = 0xf;
        System.out.println("numeroHexa = " + numeroHexa);
        System.out.println("numero binario de "
                + Integer.toHexString(numeroHexa)
                + " = "
                + Integer.toBinaryString(numeroHexa));

         */
    }

    public static String solDato(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
}
