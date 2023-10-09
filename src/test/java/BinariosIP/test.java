package BinariosIP;

import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
    public static void main(String[] args) {
        try {
            // Dirección IP y máscara de subred en formato CIDR (ejemplo)
            String ipAddress = solDato("Ingrese la IP host");
            String subnetMask = solDato("Ingrese la mask subnet");

            // Convierte la dirección IP y la máscara de subred en InetAddress
            InetAddress ip = InetAddress.getByName(ipAddress);
            InetAddress mask = InetAddress.getByName(subnetMask);

            // Convierte las direcciones IP y máscara de subred en representaciones binarias
            byte[] ipBytes = ip.getAddress();
            byte[] maskBytes = mask.getAddress();

            // Realiza la operación AND bit a bit entre la dirección IP y la máscara de subred
            byte[] networkBytes = new byte[ipBytes.length];
            for (int i = 0; i < ipBytes.length; i++) {
                networkBytes[i] = (byte) (ipBytes[i] & maskBytes[i]);
            }

            // Convierte el resultado de la operación AND en una dirección IP
            InetAddress networkAddress = InetAddress.getByAddress(networkBytes);

            System.out.println("Dirección IP de la subred: " + networkAddress.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
    public static String solDato(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
}
