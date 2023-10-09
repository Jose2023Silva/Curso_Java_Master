package org.master.java.Variables;

public class VariablesJava {
    /*
    Una variable es una declaracion de espacio de almacenamiento de dato
    que contine dos partes, tipo de dato de la variable y su nombre

     */
    public static void main(String[] args) {
        /*
        Exiten dos tipos de variables, de tipo primitivo y de referencia.
        Primitivo son datos que solo contiene un solo valor con enteros, flotantes,
        caracteres, boleanos, etc
        Referencia es una entidad que contiene atributos y metodos, ademas hay enums e interfaces
        [tipo de dato] [nombre de la variable]
         */
        String saludar = "hola mundo";
        System.out.println(saludar); // se usa la variable saludar

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor  = true;
        if (valor) {
            System.out.println("valor = " + valor);
            int no2 = 1; // este valor solo se puede usar en el bloque del if
        }

        var numero3 = 15; // se declara una variable flexible

        /**
         * Las reglas de la declaracion de las variables
         * 1. no deben que tener nombre con palabra reservada del lenguaje
         * 2. validar si no necesitan inicializar las variables
         * 3. que no comience el nombre de la variable con un numero
         * 4. puede usar letra, $ _
         * 5. siempre los metodos, variables, convencion, se usa camellCase
         * 6. nunca usar el caracter ñ
         */
        byte edadPersona = 45;
    }
}
