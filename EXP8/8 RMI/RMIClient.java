import java.rmi.*;
import java.util.*;

public class RMIClient {
    public static void main(String[] args) {
        try {
            CalculatorInterface obj =
                (CalculatorInterface) Naming.lookup("rmi://localhost/calc");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = obj.add(a, b);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}