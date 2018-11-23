package psyp.hilos;

import psyp.Control;

public class Caja extends Thread {

    private Control control;
    private boolean estaAbierta;
    private int idCaja;
    private static int autoincrement;

    public Caja(Control control) {
        this.control = control;
        asignarId();
    }

    @Override
    public void run() {
        // Decir que esta operativa
        System.out.println("[Caja " + idCaja + "] Operativa");
        estaAbierta = true;

        // Coger hilos mientras este en ejecucion
            // Sleep

    }

    public int getIdCaja() {
        return idCaja;
    }

    private void asignarId() {
        idCaja = autoincrement;
        autoincrement++;
    }
}
