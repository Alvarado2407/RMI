import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ComputeTask extends Remote {
    //interfaz remota

    String mensaje() throws RemoteException;
}
