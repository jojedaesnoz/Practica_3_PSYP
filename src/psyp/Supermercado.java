package psyp;

import psyp.hilos.Cliente;

public class Supermercado {

    public static void main(String[] args) {
        Control control = new Control();
        Cliente[] clientes = new Cliente[10];

        // Arrancar clientes
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente(control);
            clientes[i].start();
        }

        // Arrancar cajas

    }
}
