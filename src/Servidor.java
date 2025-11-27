import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {

    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(8080);
            System.out.println("Servidor RMI iniciado en puerto 8080");
            ComputeEngine obj = new ComputeEngine();

            String nombre = "rmi://localhost:8080/SaludoServicio";
            Naming.rebind(nombre, obj);

            System.out.println("Objeto SaludoServicio enlazado. Servidor RMI listo");

        }catch (Exception e){
            System.err.println("Excepcion del servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
