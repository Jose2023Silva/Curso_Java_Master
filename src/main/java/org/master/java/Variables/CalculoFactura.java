package org.master.java.Variables;

import java.util.Scanner;

public class CalculoFactura {
    public static void main(String[] args) {
        /**
         * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
         * se requiere desarrollar un programa que reciba datos de la factura utilizando
         * la clase Scanner de la siguiente manera:
         * 1. Reciba el nombre de la factura o descripción, utilizar método nextLine()
         * para obtener el nombre de la factura con espacios.
         * 2. Reciba 2 precios de productos de tipo double, utilizar método nextDouble()
         * para obtener precios con decimales (,).
         * 3.Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
         *
         */
        String nombreFactura = inputCosola("Ingrese el nombre de la factura: ");
        double precio1 = Double.parseDouble(
                inputCosola("Ingresa el primer precio: ")
        );
        double precio2 = Double.parseDouble(
                inputCosola("Ingresa el Segundo precio: ")
        );

        double total_bruto = precio1 + precio2;
        double impuesto = total_bruto * 0.19;
        double total = total_bruto + impuesto;

        String mensaje = String.format(
                "La factura %s tiene un total bruto de %.2f, con inpuesto de %.2f " +
                        "y el monto despues de impuesto es de %.2f ",
                nombreFactura, total_bruto, impuesto, total
        );
        System.out.println(mensaje);
    }

    static Scanner input = new Scanner(System.in);
    private static String inputCosola(String mensaje){
        System.out.print(mensaje);
        return input.nextLine();
    }
}
