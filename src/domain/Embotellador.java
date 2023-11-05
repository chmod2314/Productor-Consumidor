package domain;

import GUI.GUI;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author j14so
 */
public class Embotellador implements Runnable {

    private Semaforo mutexEmbotellador, cajaVacia, cajaLlena;
    private Entero contBotellas;
    private JLabel eti;
    private GUI gui;
    int cont;
    int tiempo=1;

    public Embotellador(Semaforo mutexEmbotellador, Semaforo cajaVacia, Semaforo cajaLlena, Entero contBotellas, JLabel eti, GUI gui) {
        this.mutexEmbotellador = mutexEmbotellador;
        this.cajaVacia = cajaVacia;
        this.cajaLlena = cajaLlena;
        this.contBotellas = contBotellas;
        this.eti = eti;
        this.gui = gui;
    }

    @Override

    public void run() {
        while (true) {
            
            mutexEmbotellador.espera();
          
            preparaBotella();
            contBotellas.setValor(contBotellas.getValor() + 1);

                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
            if (contBotellas.getValor() == 1) {
                cajaVacia.espera();
            }
            cont++;
            if (cont>20) {
                cont=0;
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                colocaBotella();
            } catch (InterruptedException ex) {
                Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
            }
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
            if (contBotellas.getValor() == 10) {
                contBotellas.setValor(0);
                cajaLlena.signal();
            }
            mutexEmbotellador.signal();
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }

    private void preparaBotella() {
         gui.preparaBotellaGUI(eti);
         
    }

    private void colocaBotella() throws InterruptedException {
         gui.colocaBotellaGUI(eti);
    }

}
