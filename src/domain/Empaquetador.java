package domain;

import GUI.GUI;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author j14so
 */
public class Empaquetador implements Runnable {

    private Semaforo cajaVacia, cajaLlena;
    boolean controlEntrada = true;
    private JLabel eti;
    private GUI gui;
    int cont;
    int tiempo = 1;

    public Empaquetador(Semaforo cajaVacia, Semaforo cajaLlena, JLabel eti, GUI gui) {
        this.cajaVacia = cajaVacia;
        this.cajaLlena = cajaLlena;
        this.eti = eti;
        this.gui = gui;
    }

    private void colocarCaja() {
        // System.out.println(eti.getLocation().x + "--"+eti.getLocation().y );
        gui.colocarCajaGUI();

    }

    private void retirarCaja() {
        gui.retirarCajaGUI();

    }

    @Override
    public void run() {
        while (true) {

            colocarCaja();

            cajaVacia.signal();
            cajaLlena.espera();

            retirarCaja();

        }
    }

}
