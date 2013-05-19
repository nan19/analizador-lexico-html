/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AnalizadorControlador;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.ExtensionFileFilter;
/**
 *
 * @author ArandiLopez
 */
public class VistaAnalizador extends javax.swing.JFrame {

    /**
     * Creates new form VistaAnalizador
     */
    public VistaAnalizador() {
        initComponents();
        yucalexControl = new AnalizadorControlador();
        filtro = new ExtensionFileFilter("Archivo HTML", "html");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        htmlTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        lexTextArea = new javax.swing.JTextArea();
        abrirBtn = new javax.swing.JButton();
        generarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imprimirBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YucaLexer");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        htmlTextArea.setEditable(false);
        htmlTextArea.setColumns(20);
        htmlTextArea.setRows(5);
        jScrollPane2.setViewportView(htmlTextArea);

        lexTextArea.setColumns(20);
        lexTextArea.setRows(5);
        jScrollPane1.setViewportView(lexTextArea);

        abrirBtn.setText("Abrir HTML");
        abrirBtn.setToolTipText("Abrir un archivo Html para analizar");
        abrirBtn.setName("abrirBtn"); // NOI18N
        abrirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirBtnActionPerformed(evt);
            }
        });

        generarBtn.setText("Generar Analisis");
        generarBtn.setToolTipText("Iniciar el analisis lexico");
        generarBtn.setName("generarBtn"); // NOI18N
        generarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N
        jLabel1.setName("iconLb"); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/text3230-1.png"))); // NOI18N
        jLabel2.setName("logoLb"); // NOI18N

        imprimirBtn.setText("Generar Lex");
        imprimirBtn.setToolTipText("Genera un archivo con la salida del analizador lexico");
        imprimirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBtnActionPerformed(evt);
            }
        });

        aboutBtn.setText("About Us");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(abrirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(generarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imprimirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutBtn))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(aboutBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(abrirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(generarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(imprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filtro);
        chooser.setDialogTitle("Seleccione un archivo HTML");
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int showOpenDialog = chooser.showOpenDialog(this);

        yucalexControl.setRutaArchivo(chooser.getSelectedFile().getPath());
        try {
            yucalexControl.abrirArchivo(htmlTextArea);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_abrirBtnActionPerformed

    private void generarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarBtnActionPerformed
        try {
            // TODO add your handling code here:

            yucalexControl.analizar(lexTextArea);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_generarBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
        Licencia lic = new Licencia(this, false);
        lic.setVisible(true);
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void imprimirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        chooser.setFileFilter(new ExtensionFileFilter("Archivo lexico", "lex"));
        int showSaveDialog = chooser.showSaveDialog(this);
        try {
            yucalexControl.imprimirLex(chooser.getSelectedFile().getPath(), lexTextArea.getText());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_imprimirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAnalizador().setVisible(true);
            }
        });
    }
    
    //Variables propias
    private AnalizadorControlador yucalexControl;
    private ExtensionFileFilter filtro;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton abrirBtn;
    private javax.swing.JButton generarBtn;
    private javax.swing.JTextArea htmlTextArea;
    private javax.swing.JButton imprimirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea lexTextArea;
    // End of variables declaration//GEN-END:variables
}
