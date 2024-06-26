/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemavete.views;

import com.mycompany.sistemavete.logica.Controladora;
import com.mycompany.sistemavete.logica.HistoriaClinica;
import com.mycompany.sistemavete.logica.Mascota;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dario
 */
public class FrmHistoriaClinica extends javax.swing.JFrame {
Controladora ctrl=new Controladora();
String bandera="";
    /**
     * Creates new form FrmHistoriaClinica
     */
    public FrmHistoriaClinica() {
          initComponents();
        setLocationRelativeTo(this);
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtProc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar Mascota Por nombre");

        txtNom.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jButton1.setText("Buscar Mascota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblmascotas.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N
        tblmascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblmascotas);

        jLabel2.setText("Datos Mascota");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Motivo Consulta :");

        txtMotivo.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jLabel4.setText("Procedimiento :");

        txtProc.setColumns(20);
        txtProc.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N
        txtProc.setRows(5);
        jScrollPane3.setViewportView(txtProc);

        jLabel5.setText("Fecha :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Lista");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Antique Olive", 1, 12)); // NOI18N
        jTextField1.setText("Gestion Historia Clinica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton7)))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void CargarT(List<Mascota> mascotas){
    DefaultTableModel tabla=new DefaultTableModel();
    String cabecera[] = {"Id","Nombre","Raza","Edad","Nombre Dueño"};
    tabla.setColumnIdentifiers(cabecera);
    Object fila[]=new Object[tabla.getColumnCount()];
    if(mascotas!=null){
       for(Mascota c : mascotas){
           fila[0]=c.getId_Mascota();
            fila[1]=c.getNombre();
            fila[2]=c.getEdad();
            fila[3]=c.getRaza();
            fila[4]=c.getUnDuenio().getNombre();
            
            tabla.addRow(fila);
       }
           
        
        tblmascotas.setModel(tabla);
    }
 }
public void CargarT2(List<HistoriaClinica> h){
     DefaultTableModel tabla = new DefaultTableModel();
    String cabecera[] = {"Id", "Descripcion", "Fecha", "Motivo", "Mascota"};
    tabla.setColumnIdentifiers(cabecera);
    Object fila[] = new Object[tabla.getColumnCount()];
    if (h != null) {
        for (HistoriaClinica c : h) {
            
            fila[0] = c.getId();
            fila[1] = c.getDescripcion();
            fila[2] = c.getFecha();
            fila[3] = c.getMotivo();
            fila[4] = c.getMascota().getNombre();
            
            tabla.addRow(fila);
        }

        tblmascotas.setModel(tabla);
        tabla.fireTableDataChanged(); // Notificar cambios en el modelo de la tabla
    }
 }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            Date fechaSeleccionada = txtData.getDate();
    String motivo = txtMotivo.getText();
    String proced = txtProc.getText();

    if (fechaSeleccionada == null) {
        JOptionPane.showMessageDialog(null, "Seleccione una fecha válida para la cita.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    switch (bandera) {
        case "nuevo":
            if (tblmascotas.getSelectedRow() > -1 && tblmascotas.getSelectedRowCount() == 1) {
                int id = (Integer) tblmascotas.getValueAt(tblmascotas.getSelectedRow(), 0);
                Mascota m = this.ctrl.buscarMascotaxId(id);

                if (m != null) {
                    // Verificar si la mascota ya tiene una historia clínica en la fecha seleccionada
                    HistoriaClinica hcExistente = ctrl.existeHistoriaClinicaParaMascotaEnFecha(m, fechaSeleccionada);
                    if (hcExistente != null) {
                        JOptionPane.showMessageDialog(null, "La mascota ya tiene una historia clínica en la fecha seleccionada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        // Crear nueva historia clínica para la mascota
                        HistoriaClinica nuevaHistoria = new HistoriaClinica(m, fechaSeleccionada, motivo, proced);
                        ctrl.agregarHistoriaClinica(nuevaHistoria);
                        JOptionPane.showMessageDialog(null, "Historia clínica creada para la mascota.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mascota no existe.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota para crear una historia clínica.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            break;

        case "editar":
            if (tblmascotas.getSelectedRow() > -1 && tblmascotas.getSelectedRowCount() == 1) {
                int id = (Integer) tblmascotas.getValueAt(tblmascotas.getSelectedRow(), 0);
                Mascota m = this.ctrl.buscarMascotaxId(id);

                if (m != null) {
                    // Buscar la historia clínica existente de la mascota en la fecha seleccionada
                    HistoriaClinica historiaExistente = ctrl.buscarHistoriaClinicaPorMascotaYFecha(m, fechaSeleccionada);
                    if (historiaExistente != null) {
                        // Modificar la historia clínica existente
                        historiaExistente.setMotivo(motivo);
                        historiaExistente.setDescripcion(proced);
                        ctrl.actualizarHistoriaClinica(historiaExistente);
                        JOptionPane.showMessageDialog(null, "Historia clínica actualizada para la mascota.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe una historia clínica para la mascota en la fecha seleccionada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mascota no existe.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota para editar una historia clínica.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            break;

        case "eliminar":
            if (tblmascotas.getSelectedRow() > -1 && tblmascotas.getSelectedRowCount() == 1) {
                int id = (Integer) tblmascotas.getValueAt(tblmascotas.getSelectedRow(), 0);
                Mascota m = this.ctrl.buscarMascotaxId(id);

                if (m != null) {
                    // Buscar la historia clínica existente de la mascota en la fecha seleccionada
                    HistoriaClinica historiaExistente = ctrl.buscarHistoriaClinicaPorMascotaYFecha(m, fechaSeleccionada);
                    if (historiaExistente != null) {
                        // Eliminar la historia clínica existente
                        ctrl.eliminarHistoriaClinica(historiaExistente);
                        JOptionPane.showMessageDialog(null, "Historia clínica eliminada para la mascota.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe una historia clínica para la mascota en la fecha seleccionada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mascota no existe.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota para eliminar una historia clínica.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            break;

        default:
            JOptionPane.showMessageDialog(null, "Operación no válida.");
            break;
    }
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          FrmPrincipal frm=new FrmPrincipal();
          frm.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Mascota> m = ctrl.listaMascotas();
        if (m == null) {
            JOptionPane.showMessageDialog(null, "Vacio");
        } else {
            this.CargarT(m);
           
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.bandera="nuevo";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.bandera="editar";
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.bandera="eliminar";
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      List<HistoriaClinica>h=this.ctrl.traerListaHistoriaC2();
      this.CargarT2(h);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHistoriaClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblmascotas;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextArea txtProc;
    // End of variables declaration//GEN-END:variables
}
