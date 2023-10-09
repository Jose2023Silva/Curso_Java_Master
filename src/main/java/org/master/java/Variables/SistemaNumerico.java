package org.master.java.Variables;

import javax.swing.*;
import java.util.Scanner;

public class SistemaNumerico {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        int numeroDecimal = Integer.parseInt(
                solDatoConsola("Ingresa un numero: ")
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

    /**
     *
     * @param mensaje
     * @return String data
     */
    public static String solDato(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    public static String solDatoConsola(String mensaje){
        System.out.print(mensaje);
        return input.nextLine();
    }
}
