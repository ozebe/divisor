/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.bulenkov.darcula.DarculaLaf;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author Wesley
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tensaoEntrada = new javax.swing.JTextField();
        resistor1 = new javax.swing.JTextField();
        resistor2 = new javax.swing.JTextField();
        tensaoSaida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo de divisão de tensão");
        setMinimumSize(new java.awt.Dimension(476, 193));
        setResizable(false);
        getContentPane().setLayout(null);

        tensaoEntrada.setNextFocusableComponent(resistor1);
        getContentPane().add(tensaoEntrada);
        tensaoEntrada.setBounds(140, 30, 80, 24);

        resistor1.setNextFocusableComponent(resistor2);
        getContentPane().add(resistor1);
        resistor1.setBounds(140, 60, 80, 24);

        resistor2.setNextFocusableComponent(tensaoSaida);
        getContentPane().add(resistor2);
        resistor2.setBounds(140, 90, 80, 24);

        tensaoSaida.setNextFocusableComponent(calcular);
        getContentPane().add(tensaoSaida);
        tensaoSaida.setBounds(140, 120, 80, 24);

        jLabel1.setText("Tensão de entrada");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 106, 16);

        jLabel2.setText("                  R1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 60, 70, 16);

        jLabel3.setText("                  R2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(55, 90, 70, 16);

        jLabel4.setText("Tensão de saída");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 93, 16);

        calcular.setText("Calcular");
        calcular.setNextFocusableComponent(jButton2);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        calcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcularKeyPressed(evt);
            }
        });
        getContentPane().add(calcular);
        calcular.setBounds(270, 20, 77, 32);

        jButton2.setText("Limpar");
        jButton2.setNextFocusableComponent(tensaoEntrada);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 60, 77, 32);

        jLabel5.setText("Volts");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 30, 29, 16);

        jLabel6.setText("ohms");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 60, 32, 16);

        jLabel7.setText("ohms");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 90, 32, 16);

        jLabel8.setText("Volts");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 120, 29, 16);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/100px-Voltage_divider.svg.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 30, 100, 130);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        Calc.calcular();
    }//GEN-LAST:event_calcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Calc.limpar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void calcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Calc.calcular();
        }
    }//GEN-LAST:event_calcularKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Calc.limpar();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                BasicLookAndFeel darcula = new DarculaLaf();

                javax.swing.UIManager.setLookAndFeel(darcula);

            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton calcular;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField resistor1;
    public static javax.swing.JTextField resistor2;
    public static javax.swing.JTextField tensaoEntrada;
    public static javax.swing.JTextField tensaoSaida;
    // End of variables declaration//GEN-END:variables
}
