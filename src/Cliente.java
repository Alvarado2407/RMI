import java.rmi.Naming;

public class Cliente {

    public static void main(String[] args) {
        try {
            String nombre = "rmi://localhost:8080/SaludoServicio";

            ComputeTask objetoRemoto = (ComputeTask) Naming.lookup(nombre);

            String envio = objetoRemoto.mensaje();

            System.out.println("Mensaje recibido desde el servidor RMI: " + envio);

        }catch (Exception e){
            System.err.println("Excepcion del cliente: " + e.toString());
            e.printStackTrace();
        }

    }
}
