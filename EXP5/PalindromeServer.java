import java.rmi.*;
import java.rmi.server.*;
interface Palindrome extends Remote {
 String check(String str) throws RemoteException; }
public class PalindromeServer extends UnicastRemoteObject implements Palindrome {
 PalindromeServer() throws RemoteException { super(); }
 public String check(String str) throws RemoteException {
 String rev = new StringBuilder(str).reverse().toString();
 if (str.equals(rev))
 return "Palindrome";
 else
 return "Not Palindrome"; }
 public static void main(String args[]) { try {
 PalindromeServer obj = new PalindromeServer();
 Naming.rebind("rmi://localhost/pal", obj);
 System.out.println("Server Ready...");
 } catch (Exception e) {System.out.println(e);}}}