import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ComputeEngine extends UnicastRemoteObject implements ComputeTask {
    //Implmentacion del servidor

    public ComputeEngine() throws RemoteException {
        super();
    }

    public String mensaje() throws RemoteException{
        System.out.println("Invocando mensaje desde el servidor RMI");
        return "Hola a todos. Mensaje desde el servidor RMI";
    }
}
