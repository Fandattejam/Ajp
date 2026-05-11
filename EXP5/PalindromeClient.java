import java.rmi.*; import java.util.*;
public class PalindromeClient {
 public static void main(String args[]) {
try { Scanner sc = new Scanner(System.in);
 Palindrome p = (Palindrome) Naming.lookup("rmi://localhost/pal");
 System.out.print("Enter String or Number: ");
String str = sc.nextLine(); String result = p.check(str);
 System.out.println("Result: " + result);
 } catch (Exception e) { System.out.println(e);}}}