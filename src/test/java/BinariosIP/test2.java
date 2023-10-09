package BinariosIP;

public class test2 {
    public static void main(String[] args) {
        String ipNet = "192.168.1.11";
        String[] octetos_ipNet = ipNet.split("\\.");
        String[] octetos_binarios = new String[octetos_ipNet.length];

        for (int i = 0; i < octetos_ipNet.length; i++) {
            int octeto_decimal = Integer.parseInt(octetos_ipNet[i]);
            String octeto_binario = Integer.toBinaryString(octeto_decimal);

            // Asegúrate de que el resultado tenga 8 caracteres agregando ceros a la izquierda si es necesario
            while (octeto_binario.length() < 8) {
                octeto_binario = "0" + octeto_binario;
            }

            octetos_binarios[i] = octeto_binario;
        }

        for (String binario : octetos_binarios) {
            System.out.println("Binario = " + binario);
        }

    }
}
