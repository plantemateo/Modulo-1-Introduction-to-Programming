/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gui;

import ar.com.model.Caminera;
import ar.com.model.Multa;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class JDNuevaMulta extends javax.swing.JDialog {

    private Caminera oCaminera;

    /**
     * Creates new form JDNuevaMulta
     */
    public JDNuevaMulta(java.awt.Frame parent, boolean modal, Caminera oCaminera) {
        super(parent, modal);
        this.oCaminera = oCaminera;
        this.setLocationRelativeTo(null);
        initComponents();
    }

    private JDNuevaMulta(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLActa = new javax.swing.JLabel();
        JLabelMonto = new javax.swing.JLabel();
        JLCodigo = new javax.swing.JLabel();
        JTectMonto = new javax.swing.JTextField();
        JTextActa = new javax.swing.JTextField();
        BttRegistrarMulta = new javax.swing.JButton();
        BttCancelar = new javax.swing.JButton();
        JCBoxCodigo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Nueva Multa");

        JLActa.setText("N Acta:");

        JLabelMonto.setText("Monto:");

        JLCodigo.setText("Codigo:");

        JTectMonto.setToolTipText("");
        JTectMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTectMontoActionPerformed(evt);
            }
        });
        JTectMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTectMontoKeyTyped(evt);
            }
        });

        JTextActa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextActaActionPerformed(evt);
            }
        });
        JTextActa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextActaKeyTyped(evt);
            }
        });

        BttRegistrarMulta.setText("Registrar");
        BttRegistrarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttRegistrarMultaActionPerformed(evt);
            }
        });

        BttCancelar.setText("Cancelar");
        BttCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttCancelarActionPerformed(evt);
            }
        });

        JCBoxCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el codigo", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", " ", " ", " ", " " }));
        JCBoxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBoxCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BttCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BttRegistrarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTectMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(JLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JCBoxCodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLActa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JTextActa, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLActa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextActa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBoxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTectMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttRegistrarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BttCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextActaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextActaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextActaActionPerformed

    private void JTectMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTectMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTectMontoActionPerformed

    private void BttRegistrarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttRegistrarMultaActionPerformed
        //Definimos las variables de instancia;
        int acta, codigo;
        float monto;

        //Validacion de carga de datos!
        if (JTextActa.getText().equals(" ")
                || JTectMonto.getText().equals(" ")
                || JCBoxCodigo.getSelectedIndex() <= 0) {

            JOptionPane.showMessageDialog(this, "Olvido ingresar un valor", "Validacion de datos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Parseo de los datos sacados de los campos te texto y los JCBOX;
        acta = Integer.parseInt(JTextActa.getText());
        codigo = Integer.parseInt(JCBoxCodigo.getSelectedItem().toString());
        monto = Float.parseFloat(JTectMonto.getText());
        Multa oMulta = new Multa(acta, codigo, monto);
        boolean exito = oCaminera.registrarMulta(oMulta);

        //Confirmacion del registro de la multa;
        if (exito == true) {
            JOptionPane.showMessageDialog(this, "Multa Registrada!", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar la multa!", "Validacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BttRegistrarMultaActionPerformed

    private void BttCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BttCancelarActionPerformed

    private void JTextActaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextActaKeyTyped
        validarKeyPressNumber(evt);
    }//GEN-LAST:event_JTextActaKeyTyped

    private void JTectMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTectMontoKeyTyped
        validarKeyPressNumber(evt);
    }//GEN-LAST:event_JTectMontoKeyTyped

    //Definimos un metodo propio para validar los numeros ingresados por teclado y no letras;
    private void validarKeyPressNumber(java.awt.event.KeyEvent evt) {
        char tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla)) {
            evt.consume();
        }
    }


    private void JCBoxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBoxCodigoActionPerformed

    }//GEN-LAST:event_JCBoxCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(JDNuevaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDNuevaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDNuevaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDNuevaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDNuevaMulta dialog = new JDNuevaMulta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttCancelar;
    private javax.swing.JButton BttRegistrarMulta;
    private javax.swing.JComboBox<String> JCBoxCodigo;
    private javax.swing.JLabel JLActa;
    private javax.swing.JLabel JLCodigo;
    private javax.swing.JLabel JLabelMonto;
    private javax.swing.JTextField JTectMonto;
    private javax.swing.JTextField JTextActa;
    // End of variables declaration//GEN-END:variables
}