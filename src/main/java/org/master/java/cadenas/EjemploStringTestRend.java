package org.master.java.cadenas;

public class EjemploStringTestRend {
    public static void main(String[] args) {
        String a  = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 : 3mls
            //c += a + b + "\n"; // 500: 12 mls
            sb.append(a).append(b).append("\n");// 500 : 0mls
        }
        long fin  = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio) );
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
