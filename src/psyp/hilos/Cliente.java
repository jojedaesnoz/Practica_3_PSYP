package psyp.hilos;

import psyp.Control;

public class Cliente extends Thread {

    private Control control;
    private int idCliente;
    private static int autoincrement;

    public Cliente(Control control) {
        this.control = control;
        asignarId();
    }

    private void asignarId() {
        idCliente = autoincrement;
        autoincrement++;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public void run() {
        // Decir que esta comprando
        // Hacer el sleep
        // Ir a pagar
    }
}
