import java.rmi.*;

public interface CalculatorInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}