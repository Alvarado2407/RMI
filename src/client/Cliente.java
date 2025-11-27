package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.math.BigDecimal;
import compute.ComputeTask;
public class Cliente {

    public static void main(String[] args) {

            try {
                String name = "Compute";

                String host = (args.length < 1) ? "10.22.13.224" : args[0];
                int decimales = (args.length < 2) ? 20 : Integer.parseInt(args[1]);

                System.out.println("Conectando a: " + host + " para calcular " + decimales + " decimales.");


                Registry registry = LocateRegistry.getRegistry(host);


                ComputeTask comp = (ComputeTask) registry.lookup(name);


                Pi task = new Pi(decimales);


                BigDecimal pi = comp.executeTask(task);

                System.out.println("Resultado: " + pi);

            } catch (Exception e) {
                System.err.println("ComputePi exception:");
                e.printStackTrace();
            }
        }

    }