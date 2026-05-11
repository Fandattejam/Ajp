import java.net.InetAddress;
public class EXP6 {
 public static void main(String[] args) {
 try {
 // 1. getLocalHost()
 InetAddress localHost = InetAddress.getLocalHost();
 System.out.println("Local Host:");
 System.out.println("Host Name: " + localHost.getHostName());
 System.out.println("IP Address: " + localHost.getHostAddress());
System.out.println();
 // 2. getByName()
 InetAddress google = InetAddress.getByName("www.google.com");
 System.out.println("Using getByName():");
 System.out.println("Host Name: " + google.getHostName());
 System.out.println("IP Address: " + google.getHostAddress());
 System.out.println();
 // 3. getAllByName()
 InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
System.out.println("Using getAllByName():"); for (InetAddress addr :
addresses) {
 System.out.println(addr);
 }
 System.out.println();
// 4. getByAddress()
byte[] ip = {8, 8, 8, 8};
 InetAddress addressByIP = InetAddress.getByAddress(ip);
 System.out.println("Using getByAddress():");
 System.out.println(addressByIP);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
} 