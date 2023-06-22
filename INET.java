import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get IP address of a hostname
            InetAddress address = InetAddress.getByName("www.example.com");
            System.out.println("IP address of www.example.com: " + address.getHostAddress());

            // Get local host information
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Hostname of local host: " + localHost.getHostName());
            System.out.println("IP address of local host: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve hostname: " + e.getMessage());
        }
    }
}
