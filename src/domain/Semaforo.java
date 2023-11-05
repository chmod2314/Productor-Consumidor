/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author j14so
 */
public class Semaforo {
    private int s = 1;

    public Semaforo(int inicial) {
        s = inicial;
    }

    public synchronized void espera() {
        while (s <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // lo ignora
            }
        }
        s = s - 1;
    }

    public synchronized void signal() {
        s = s + 1;
        notify();
    }
    
    public void sleep(int time){
        sleep(time);
    }
    

}