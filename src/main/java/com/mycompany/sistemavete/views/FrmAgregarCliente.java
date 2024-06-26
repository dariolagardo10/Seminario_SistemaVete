/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemavete.views;

import com.mycompany.sistemavete.logica.Cliente;
import com.mycompany.sistemavete.logica.Controladora;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.logica.Usuario;
import com.mycompany.sistemavete.persistencia.ControladoraPersistencia;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.awt.HeadlessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dario
 */
public class FrmAgregarCliente extends JFrame {
    Controladora ctrl = new Controladora();
    String bandera="";
    public FrmAgregarCliente() {
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
        txtbuscarCli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtemailcli4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtlocalidadcli4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtedadcli4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtdnicli4 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtnombrecli4 = new javax.swing.JTextField();
        txtemcliente4 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtnacionalidadcli4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Buscar Cliente por DNI :");

        txtbuscarCli.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jButton1.setText("Buscar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lista Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblclientes.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N
        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblclientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblclientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setText("Datos De Cliente");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtemailcli4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setText("Dni Cliente :");

        txtlocalidadcli4.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jLabel36.setText("Nombre Cliente :");

        txtedadcli4.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jLabel37.setText("Edad Cliente :");

        txtdnicli4.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jLabel38.setText("Email Cliente :");

        txtnombrecli4.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        txtemcliente4.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        jLabel39.setText("Localidad :");

        jLabel40.setText("Nacionalidad :");

        txtnacionalidadcli4.setFont(new java.awt.Font("Albertus Extra Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout txtemailcli4Layout = new javax.swing.GroupLayout(txtemailcli4);
        txtemailcli4.setLayout(txtemailcli4Layout);
        txtemailcli4Layout.setHorizontalGroup(
            txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtemailcli4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(txtemailcli4Layout.createSequentialGroup()
                        .addComponent(txtdnicli4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtlocalidadcli4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtemailcli4Layout.createSequentialGroup()
                        .addComponent(txtnombrecli4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemcliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(txtemailcli4Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtnacionalidadcli4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtemailcli4Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtedadcli4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        txtemailcli4Layout.setVerticalGroup(
            txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtemailcli4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(txtnombrecli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemcliente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtnacionalidadcli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtemailcli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdnicli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txtlocalidadcli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel37)
                    .addComponent(txtedadcli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtemailcli4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(txtemailcli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton3.setText("Guardar");
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

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Nuevo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Antique Olive", 1, 12)); // NOI18N
        jTextField1.setText("Gestion Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton7)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton6)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton5))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void limpiar() {
        txtnombrecli4.setText("");
        txtedadcli4.setText("");
        txtdnicli4.setText("");
        txtemcliente4.setText("");
        txtlocalidadcli4.setText("");
        txtnacionalidadcli4.setText("");
        txtbuscarCli.setText("");
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (this.bandera.equals("nuevo")) { // Verifica si la bandera indica que se debe crear un nuevo cliente
            // Verifica que los campos obligatorios no estén vacíos
            if (!txtdnicli4.getText().isEmpty() && !txtedadcli4.getText().isEmpty()
                    && !txtnombrecli4.getText().isEmpty() && !txtemcliente4.getText().isEmpty()) {
                // Busca un cliente por su DNI
                Cliente c = this.ctrl.buscarClientePorDni(txtdnicli4.getText());
                if (c != null) { // Si el cliente ya existe, muestra un mensaje
                    JOptionPane.showMessageDialog(null, "Cliente existente");
                } else { // Si el cliente no existe, crea uno nuevo
                    String nombre = txtnombrecli4.getText();
                    int edad = Integer.parseInt(txtedadcli4.getText());
                    String dni = txtdnicli4.getText();
                    String email = txtemcliente4.getText();
                    String localidad = txtlocalidadcli4.getText();
                    String nacionalidad = txtnacionalidadcli4.getText();
                    // Guarda el nuevo cliente
                    ctrl.guardarCliente(nombre, edad, email, dni, localidad, nacionalidad);
                    JOptionPane.showMessageDialog(null, "Se creó un cliente correctamente");
                }
            }
        } else if (this.bandera.equals("editar")) { // Verifica si la bandera indica que se debe editar un cliente existente
            if (tblclientes.getSelectedRow() > -1 && tblclientes.getSelectedRowCount() == 1) { // Verifica que haya una fila seleccionada en la tabla
                String dni1 = (String) tblclientes.getValueAt(tblclientes.getSelectedRow(), 3);
                Cliente c = this.ctrl.buscarClientePorDni(dni1);
                if (c != null) { // Si el cliente existe, actualiza sus datos
                    if (!txtdnicli4.getText().isEmpty() && !txtedadcli4.getText().isEmpty()
                            && !txtnombrecli4.getText().isEmpty() && !txtemcliente4.getText().isEmpty()) {
                        String nombre = txtnombrecli4.getText();
                        int edad = Integer.parseInt(txtedadcli4.getText());
                        String dni = txtdnicli4.getText();
                        String email = txtemcliente4.getText();
                        String localidad = txtlocalidadcli4.getText();
                        String nacionalidad = txtnacionalidadcli4.getText();
                        // Actualiza los datos del cliente
                        c.setDni(dni);
                        c.setEdad(edad);
                        c.setEmail(email);
                        c.setLocalidad(localidad);
                        c.setNacionalidad(nacionalidad);
                        c.setNombre(nombre);
                        try {
                            this.ctrl.editarCliente(c); // Guarda los cambios
                        } catch (Exception ex) {
                            // Maneja excepciones
                        }
                    }
                }
            }
        } else if (this.bandera.equals("eliminar")) { // Verifica si la bandera indica que se debe eliminar un cliente
            int id = 0;
            if (tblclientes.getSelectedRow() > -1 && tblclientes.getSelectedRowCount() == 1) { // Verifica que haya una fila seleccionada en la tabla
                String dni = (String) tblclientes.getValueAt(tblclientes.getSelectedRow(), 3);
                Cliente clienteseleccionado = this.ctrl.obtenerClientePorDni(dni);
                List<Mascota> m = this.ctrl.listaMascotas(clienteseleccionado.getId_cliente());

                if (m != null) { // Si el cliente tiene mascotas, las elimina
                    try {
                        ctrl.eliminarListaMascPorC(clienteseleccionado.getId_cliente());
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
                if (clienteseleccionado != null) { // Si el cliente existe, lo elimina
                    id = clienteseleccionado.getId_cliente();
                    try {
                        ctrl.eliminarClientePorId(clienteseleccionado.getId_cliente());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            } else { // Si no hay un cliente seleccionado, muestra un mensaje
                JOptionPane.showMessageDialog(null, "Debe buscar un cliente a eliminar y seleccionar");
            }
        }

// Limpia el modelo de la tabla y los campos de entrada
        DefaultTableModel modelo = (DefaultTableModel) tblclientes.getModel();
        modelo.setRowCount(0); // Esto limpia todas las filas del modelo actual
        this.limpiar();
        
    }//GEN-LAST:event_jButton3ActionPerformed
    public void CargarTabla(Cliente cliente) {
        DefaultTableModel tabla = new DefaultTableModel();
        String cabecera[] = {"IdCliente", "Nombre", "Edad", "Dni", "Nacionalidad"};
        tabla.setColumnIdentifiers(cabecera);
        Object fila[] = new Object[tabla.getColumnCount()];
        if (cliente != null) {
            
            fila[0] = cliente.getId_cliente();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getEdad();
            fila[3] = cliente.getDni();
            fila[4] = cliente.getNacionalidad();
            
            tabla.addRow(fila);
            
            tblclientes.setModel(tabla);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dni = txtbuscarCli.getText();
        Cliente c = ctrl.obtenerClientePorDni(dni);
        if (c != null) {
            CargarTabla(c);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente Aun no existe");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void CargarT(List<Cliente> clientes) {
        DefaultTableModel tabla = new DefaultTableModel();
        String cabecera[] = {"IdCliente", "Nombre", "Edad", "Dni", "Nacionalidad"};
        tabla.setColumnIdentifiers(cabecera);
        Object fila[] = new Object[tabla.getColumnCount()];
        if (clientes != null) {
            for (Cliente c : clientes) {
                fila[0] = c.getId_cliente();
                fila[1] = c.getNombre();
                fila[2] = c.getEdad();
                fila[3] = c.getDni();
                fila[4] = c.getNacionalidad();
                
                tabla.addRow(fila);
            }
            
            tblclientes.setModel(tabla);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<Cliente> c = ctrl.listaClientes();
        this.CargarT(c);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.bandera = "eliminar";
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.bandera = "editar";
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.bandera = "nuevo";
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tblclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblclientesMouseClicked
        try {
            if (tblclientes.getSelectedRow() > -1 && tblclientes.getSelectedRowCount() == 1) {
                String seleccionado = (String) tblclientes.getValueAt(tblclientes.getSelectedRow(), 3);
                Cliente u = ctrl.obtenerClientePorDni(seleccionado);
                
                if (u != null) {
                    txtnombrecli4.setText(u.getNombre());
                    txtdnicli4.setText(u.getDni());
                    txtemcliente4.setText(u.getEmail());
                    txtlocalidadcli4.setText(u.getLocalidad());
                    txtnacionalidadcli4.setText(u.getNacionalidad());
                    txtedadcli4.setText(String.valueOf(u.getEdad()));
                }
            }
        } catch (ClassCastException e) {
            e.printStackTrace();  // Imprime el stack trace para ver más detalles del error
        } catch (Exception e) {
            e.printStackTrace();  // Maneja cualquier otra excepción
        }
    }//GEN-LAST:event_tblclientesMouseClicked

    /**
     * @param args the command line arguments
     */
   

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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblclientes;
    private javax.swing.JTextField txtbuscarCli;
    private javax.swing.JTextField txtdnicli4;
    private javax.swing.JTextField txtedadcli4;
    private javax.swing.JPanel txtemailcli4;
    private javax.swing.JTextField txtemcliente4;
    private javax.swing.JTextField txtlocalidadcli4;
    private javax.swing.JTextField txtnacionalidadcli4;
    private javax.swing.JTextField txtnombrecli4;
    // End of variables declaration//GEN-END:variables
}
