import java.rmi.*;

public interface Palindrome extends Remote {
    String check(String str) throws RemoteException;
}