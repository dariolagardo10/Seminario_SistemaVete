/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemavete.views;

import com.mycompany.sistemavete.logica.Cita;
import com.mycompany.sistemavete.logica.Cliente;
import com.mycompany.sistemavete.logica.Controladora;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dario
 */
public class FrmCita extends javax.swing.JFrame {
 Controladora ctrl=new Controladora();
 String bandera;
    /**
     * Creates new form Cita
     */
  
    public FrmCita() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtBuscarM = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmascotas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar Mascota por dni Cliente :");

        jButton1.setText("Buscar Mascota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtBuscarM.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jButton2.setText("Lista Cita");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Cita :");

        jTextField1.setFont(new java.awt.Font("Antique Olive", 1, 12)); // NOI18N
        jTextField1.setText("Gestion Cita");

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
        jScrollPane1.setViewportView(tblmascotas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(BtnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(jButton7))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
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
 public void CargarT2(List<Cita> mascotas){
    DefaultTableModel tabla=new DefaultTableModel();
    String cabecera[] = {"Id","Fecha","Nombre Mascota"};
    tabla.setColumnIdentifiers(cabecera);
    Object fila[]=new Object[tabla.getColumnCount()];
    if(mascotas!=null){
       for(Cita c : mascotas){
           fila[0]=c.getId();
            fila[1]=c.getFechaCita();
            fila[2]=c.getMascota().getNombre();
             
            tabla.addRow(fila);
       }
           
        tblmascotas.setModel(tabla);
    }
 }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

     Date fechaSeleccionada = txtData.getDate();
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
                // Verificar si la mascota ya tiene una cita en la fecha seleccionada
                Cita c;
                c=ctrl.existeCitaParaMascotaEnFecha(m, fechaSeleccionada);
                if (c!=null) {
                    JOptionPane.showMessageDialog(null, "La mascota ya tiene una cita en la fecha seleccionada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Crear nueva cita para la mascota
                    
                    Cita nuevaCita = new Cita(m,fechaSeleccionada);
                    ctrl.agregarCita(nuevaCita);
                    JOptionPane.showMessageDialog(null, "Cita creada para la mascota.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mascota no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota para crear una cita.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        break;

    case "editar":
        if (tblmascotas.getSelectedRow() > -1 && tblmascotas.getSelectedRowCount() == 1) {
            int id = (Integer) tblmascotas.getValueAt(tblmascotas.getSelectedRow(), 0);
            Mascota m = this.ctrl.buscarMascotaxId(id);

            if (m != null) {
                // Buscar la cita existente de la mascota en la fecha seleccionada
                Cita citaExistente = ctrl.buscarCitaPorMascotaYFecha(m, fechaSeleccionada);
                if (citaExistente != null) {
                    // Aquí puedes implementar la lógica para editar la cita existente
                    // Por ejemplo, modificar la fecha o cualquier otro detalle de la cita
                    citaExistente.setFechaCita(fechaSeleccionada);
                    try {
                        ctrl.actualizarCita(citaExistente);
                        JOptionPane.showMessageDialog(null, "Cita actualizada para la mascota.");
                    } catch (Exception ex) {
                        Logger.getLogger(FrmCita.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No existe una cita para la mascota en la fecha seleccionada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mascota no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota para editar una cita.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        break;

    case "eliminar":
        if (tblmascotas.getSelectedRow() > -1 && tblmascotas.getSelectedRowCount() == 1) {
            int id = (Integer) tblmascotas.getValueAt(tblmascotas.getSelectedRow(), 0);
            Mascota m = this.ctrl.buscarMascotaxId(id);
            if (m != null) {
                // Buscar la cita existente de la mascota en la fecha seleccionada
                Cita citaExistente = ctrl.buscarCitaPorMascotaYFecha(m, fechaSeleccionada);
                if (citaExistente != null) {
                    try {
                        // Aquí puedes implementar la lógica para eliminar la cita existente
                        ctrl.eliminarCita(citaExistente);
                         JOptionPane.showMessageDialog(null, "Cita eliminada para la mascota.");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "Cita No eliminada para la mascota.");
                    }
                   
                } else {
                    JOptionPane.showMessageDialog(null, "No existe una cita para la mascota en la fecha seleccionada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mascota no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota para eliminar una cita.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        break;

    default:
        JOptionPane.showMessageDialog(null, "Operación no válida.");
        break;
}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         List<Mascota> m = ctrl.listaMascotas();
        if (m == null) {
            JOptionPane.showMessageDialog(null, "Vacio");
        } else {
            List<Cita> c;
             c=ctrl.existeCitaParaMascota(m);
              this.CargarT2(c);
           
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         FrmPrincipal frm=new FrmPrincipal();
         frm.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Cliente c = ctrl.obtenerClientePorDni(txtBuscarM.getText());
        if (c != null) {
            List<Mascota> m = ctrl.listaMascotasPorIdC(c.getId_cliente());
            if (m == null) {
                JOptionPane.showMessageDialog(null, "Vacio");
            } else {
                this.CargarT(m);
              
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cliente No existe");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       this.bandera="nuevo";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      this.bandera="editar";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        this.bandera="eliminar";
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblmascotas;
    private javax.swing.JTextField txtBuscarM;
    private com.toedter.calendar.JDateChooser txtData;
    // End of variables declaration//GEN-END:variables
}
