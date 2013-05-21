/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AnalizadorControlador;
import java.awt.event.InputEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
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
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirMenuItem = new javax.swing.JMenuItem();
        guardarHTMLMenuItem = new javax.swing.JMenuItem();
        guardarLEXMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YucaLexer");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        htmlTextArea.setColumns(20);
        htmlTextArea.setRows(5);
        htmlTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(htmlTextArea);

        lexTextArea.setEditable(false);
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

        jLabel3.setText("Agregue o Edite Codigo HTML, Guarde y Genere el Analisis");

        jMenu1.setText("Archivo");

        abrirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        abrirMenuItem.setText("Abrir HTML");
        abrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(abrirMenuItem);

        guardarHTMLMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        guardarHTMLMenuItem.setText("Guardar HTML");
        guardarHTMLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarHTMLMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(guardarHTMLMenuItem);

        guardarLEXMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        guardarLEXMenuItem.setText("Guardar Archivo lex");
        guardarLEXMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarLEXMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(guardarLEXMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(abrirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutBtn))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(abrirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(generarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(imprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(aboutBtn))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filtro);
        chooser.setDialogTitle("Seleccione un archivo HTML *.html");
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
        if (!(htmlTextArea.getText().equals(""))) {
            try {
                // TODO add your handling code here:
                yucalexControl.analizar(lexTextArea);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Cargue primero un html.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        chooser.setDialogTitle("Guardar Archivo tipo lex");
        chooser.setFileFilter(new ExtensionFileFilter("Archivo lexico *.lex", "lex"));
        int showSaveDialog = chooser.showSaveDialog(this);
        try {
            if (!(lexTextArea.getText().equals(""))) {
                yucalexControl.imprimirLex(chooser.getSelectedFile().getPath(), lexTextArea.getText());
                JOptionPane.showMessageDialog(this, "Archivo Guardado", "", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "No se a analizado el HTML", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_imprimirBtnActionPerformed

    private void abrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filtro);
        chooser.setDialogTitle("Seleccione un archivo HTML *.html");
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
    }//GEN-LAST:event_abrirMenuItemActionPerformed

    private void guardarHTMLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarHTMLMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        chooser.setDialogTitle("Guardar Archivo HTML");
        chooser.setFileFilter(new ExtensionFileFilter("Archivo HTML *.html", "html"));
        int showSaveDialog = chooser.showSaveDialog(this);
        try {
            if (!(htmlTextArea.getText().equals(""))) {
                yucalexControl.imprimirLex(chooser.getSelectedFile().getPath(), htmlTextArea.getText());
                JOptionPane.showMessageDialog(this, "Archivo Guardado", "", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "Escriba Codido HTML", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        yucalexControl.setRutaArchivo(chooser.getSelectedFile().getPath());
    }//GEN-LAST:event_guardarHTMLMenuItemActionPerformed

    private void guardarLEXMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarLEXMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        chooser.setDialogTitle("Guardar Archivo tipo lex");
        chooser.setFileFilter(new ExtensionFileFilter("Archivo lexico *.lex", "lex"));
        int showSaveDialog = chooser.showSaveDialog(this);
        try {
            if (!(lexTextArea.getText().equals(""))) {
                yucalexControl.imprimirLex(chooser.getSelectedFile().getPath(), lexTextArea.getText());
                JOptionPane.showMessageDialog(this, "Archivo Guardado", "", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "No se a analizado el HTML", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarLEXMenuItemActionPerformed

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
            @Override
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
    private javax.swing.JMenuItem abrirMenuItem;
    private javax.swing.JButton generarBtn;
    private javax.swing.JMenuItem guardarHTMLMenuItem;
    private javax.swing.JMenuItem guardarLEXMenuItem;
    private javax.swing.JTextArea htmlTextArea;
    private javax.swing.JButton imprimirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea lexTextArea;
    // End of variables declaration//GEN-END:variables
}
