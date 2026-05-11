import java.rmi.*;

public class RMIServer {
    public static void main(String[] args) {
        try {
            CalculatorImpl obj = new CalculatorImpl();
            Naming.rebind("rmi://localhost/calc", obj);
            System.out.println("Server Started...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}