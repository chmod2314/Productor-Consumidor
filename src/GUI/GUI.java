/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import domain.Embotellador;
import domain.Empaquetador;
import domain.Entero;
import domain.Semaforo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author j14so
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    int tiempo = 1;
    Thread h1;
    Thread h2;
    Thread h3;
    
    public GUI() {

        initComponents();

    }

    public void colocarCajaGUI() {

        System.out.println("Colocando caja");
        // System.out.println(eti.getLocation().x + "--"+eti.getLocation().y );
        caja.setLocation(503, 31);
        while (caja.getLocation().y != 446) {
            caja.setLocation(caja.getLocation().x, caja.getLocation().y + 1);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (caja.getLocation().x != 58) {
            caja.setLocation(caja.getLocation().x - 1, caja.getLocation().y);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void retirarCajaGUI() {
        System.out.println("Retirando Caja");
        caja.setLocation(58, 440);
        while (caja.getLocation().x != 860) {
            caja.setLocation(caja.getLocation().x + 1, caja.getLocation().y);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void preparaBotellaGUI(JLabel eti) {
        int botellaPy = 228;
        if (eti.getText() == "1") {
            if (this.getBotella1().getLocation().y != botellaPy) {
                eti.setLocation(116, 228);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else if (eti.getText() == "2") {
            if (this.getBotella2().getLocation().y != botellaPy) {
                eti.setLocation(250, 228);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void colocaBotellaGUI(JLabel eti) {
        System.out.println("Colocando Botella" + " - " + Thread.currentThread().getName());
        if (this.getBotella1().getLocation().y == 228) {//El 228 es el valor y de ambas botellas
            while (eti.getLocation().y <= 490) {
                eti.setLocation(116, eti.getLocation().y + 1);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else if (this.getBotella2().getLocation().y == 228) {
           
                int cont=0;
            while (eti.getLocation().y <= 490) {
                eti.setLocation(250, eti.getLocation().y + 1);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Embotellador.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            }

             eti.setLocation(250, 228);

        }
    }

    public JLabel getBotella1() {
        return botella1;
    }

    public JLabel getBotella2() {
        return botella2;
    }

    public JLabel getCaja() {
        return caja;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jOptionPane1 = new javax.swing.JOptionPane();
        cinta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iniciarProceso = new javax.swing.JButton();
        botella1 = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        botella2 = new javax.swing.JLabel();
        caja = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 900));
        setResizable(false);

        cinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/cinta.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/EmbotelladoraG (1) (1).png"))); // NOI18N

        iniciarProceso.setText("Iniciar");
        iniciarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarProcesoActionPerformed(evt);
            }
        });

        botella1.setForeground(new java.awt.Color(255, 255, 255));
        botella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/botella.png"))); // NOI18N
        botella1.setText("1");

        stop.setText("STOP");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        botella2.setForeground(new java.awt.Color(255, 255, 255));
        botella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/botella.png"))); // NOI18N
        botella2.setText("2");

        caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/caja (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(botella2)))
                        .addGap(67, 67, 67)
                        .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)))
                .addGap(388, 388, 388))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(iniciarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(botella1)
                    .addContainerGap(977, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(botella2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)))
                .addGap(301, 301, 301)
                .addComponent(cinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1618, 1618, 1618))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addComponent(botella1)
                    .addContainerGap(2089, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void iniciarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarProcesoActionPerformed

        Semaforo mutexEmbotellador = new Semaforo(1);
        Semaforo cajaVacia = new Semaforo(0);
        Semaforo cajaLlena = new Semaforo(0);
        Entero contBotellas = new Entero(0);
        Embotellador E2 = new Embotellador(mutexEmbotellador, cajaVacia, cajaLlena, contBotellas, botella2, this);
        Embotellador E1 = new Embotellador(mutexEmbotellador, cajaVacia, cajaLlena, contBotellas, botella1, this);
        
        Empaquetador h = new Empaquetador(cajaVacia, cajaLlena, caja, this);
        h1 = new Thread(E1);
        h2 = new Thread(E2);
        h3 = new Thread(h);
        h1.start();
        h2.start();
        h3.start();
        cinta.setLocation(6, 629);
        iniciarProceso.setLocation(200, 757);
        caja.setLocation(503, 31);
        botella1.setLocation(116, 228);
        botella2.setLocation(250, 228);
        stop.setLocation(400, 757);
        iniciarProceso.setEnabled(false);
    }//GEN-LAST:event_iniciarProcesoActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        iniciarProceso.setEnabled(true);
        h1.stop();
        h2.stop();
        h3.stop();
        cinta.setLocation(6, 629);
        iniciarProceso.setLocation(200, 757);
        caja.setLocation(503, 31);
        botella1.setLocation(116, 228);
        botella2.setLocation(250, 228);
        stop.setLocation(400, 757);
    }//GEN-LAST:event_stopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botella1;
    private javax.swing.JLabel botella2;
    private javax.swing.JLabel caja;
    private javax.swing.JLabel cinta;
    private javax.swing.JButton iniciarProceso;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}