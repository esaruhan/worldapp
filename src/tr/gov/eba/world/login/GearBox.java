package tr.gov.eba.world.login;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * * * @author Abdullah Battal <abdullah.battal at eba.gov.tr>
 */
public class GearBox {

    public static String detectIpAddress() {
        String ipAddress = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                        ipAddress = inetAddress.getHostAddress();
                        break;
                    }
                }
                if (ipAddress != null) {
                    break;
                }
            }
        } catch (SocketException ex) {
            System.err.println("SocketException occurred: " + ex.getMessage());
        }
        return ipAddress;
    }
}
