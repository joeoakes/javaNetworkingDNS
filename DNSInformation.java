import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSInformation {
    public static void main(String[] args) {
        String hostName = "example.com"; // Replace with the host you want to query

        try {
            InetAddress[] addresses = InetAddress.getAllByName(hostName);

            System.out.println("DNS information for host: " + hostName);

            for (InetAddress address : addresses) {
                System.out.println("Host Address: " + address.getHostAddress());
                System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
                System.out.println("--------------------------------------------");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + hostName);
        }
    }
}
