package view;

import Service.Validar;
import controller.ControladorCliente;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Id;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.EnumTipoServicio;

public class ComercialView extends javax.swing.JPanel {

    DefaultTableModel modeloTablaClientes = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    ControladorCliente controlCliente = new ControladorCliente();

    public ComercialView() {
        initComponents();
        cargarCombo();
        cabecerasTablaClientes();
        cargarTablaClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        tfBusqueda = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCuit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfRazonSocial = new javax.swing.JTextField();
        BtEliminar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbTipoServicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        rbEstado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        cbEditar = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comercial");

        btBuscar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btBuscar.setText("Buscar CUIT");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tfBusqueda.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });

        tfId.setEditable(false);
        tfId.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Cuit");

        tfCuit.setEditable(false);
        tfCuit.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCuitKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Razon Social");

        tfRazonSocial.setEditable(false);
        tfRazonSocial.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRazonSocialKeyTyped(evt);
            }
        });

        BtEliminar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        btNuevo.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de Servicio");

        cbTipoServicio.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        cbTipoServicio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("Dirección");

        tfDireccion.setEditable(false);
        tfDireccion.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setText("Teléfono");

        tfTelefono.setEditable(false);
        tfTelefono.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setText("Mail");

        tfMail.setEditable(false);
        tfMail.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        rbEstado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        rbEstado.setText("Estado");
        rbEstado.setEnabled(false);

        tbClientes.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        cbEditar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        cbEditar.setText("Editar");
        cbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNuevo)
                        .addGap(113, 113, 113)
                        .addComponent(BtEliminar)
                        .addGap(120, 120, 120)
                        .addComponent(btGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rbEstado)
                                        .addGap(71, 71, 71)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDireccion)
                                    .addComponent(cbEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfMail)
                                    .addComponent(cbTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(38, 38, 38)
                                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfRazonSocial)
                                            .addComponent(tfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addGap(12, 12, 12)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEditar)
                            .addComponent(rbEstado))
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo)
                    .addComponent(BtEliminar)
                    .addComponent(btGuardar))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void tfCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCuitKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfCuitKeyTyped

    private void tfRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRazonSocialKeyTyped
        Validar.esLetra(evt);
    }//GEN-LAST:event_tfRazonSocialKeyTyped

    private void tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfTelefonoKeyTyped

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        int rowSelect = tbClientes.getSelectedRow();
        if (rowSelect != -1) {
            int idCliente = (int) tbClientes.getValueAt(rowSelect, 0);
            Cliente cliente = controlCliente.buscarClientePorId(idCliente);
            if (cliente != null) {
                tfId.setText(String.valueOf(cliente.getIdCliente()));
                tfCuit.setText(cliente.getCuit());
                tfRazonSocial.setText(cliente.getRazonSocial());
                cbTipoServicio.setSelectedItem(cliente.getTipoServicio());
                tfDireccion.setText(cliente.getDireccion());
                tfTelefono.setText(cliente.getTelefono());
                tfMail.setText(cliente.getMail());
                rbEstado.setSelected(cliente.isEstado());
            }
        }
        desactivarCampos();
    }//GEN-LAST:event_tbClientesMouseClicked

    private void cbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditarActionPerformed
        if (cbEditar.isSelected()) {
            activarCampos();
        } else {
            desactivarCampos();
        }
    }//GEN-LAST:event_cbEditarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        List<Cliente> listaCliente = controlCliente.buscarClientePorCuit(tfBusqueda.getText());
        if (listaCliente != null && !listaCliente.isEmpty()) {//puede ser nula o estar vacia...
            limpiarTabla();
            for (Cliente cliente : listaCliente) {
                modeloTablaClientes.addRow(new Object[]{cliente.getIdCliente(),
                    cliente.getRazonSocial(),
                    cliente.getCuit(),
                    cliente.getTipoServicio().toString()});
            }
        } else {
            limpiarTabla();
            cargarTablaClientes();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "No se encontro el CUIT.");

        }
        desactivarCampos();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        limpiarCampos();
        activarCampos();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        String idSeleccionado = tfId.getText();
        if (!idSeleccionado.isEmpty()) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro de que desea eliminar este cliente?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                controlCliente.eliminarCliente(Integer.parseInt(idSeleccionado));
                limpiarCampos();
                cargarTablaClientes();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Cliente.");
        }
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (cbEditar.isSelected()) {//Si esta seleccionado Edito...
            Cliente cliente = mapeoCliente();
            if (cliente != null) {
                try {
                    controlCliente.actualizarCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente Actualizado Correctamente.");
                    limpiarCampos();
                    cbEditar.setSelected(false);
                    desactivarCampos();
                    limpiarTabla();
                    cargarTablaClientes();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se encontro...123" + ex.getMessage());
                    return;
                }
            }
        } else {//Si esta deseleccionado se crea un Cliente nuevo en la BD...
            Cliente cliente = mapeoCliente();
            if (cliente != null) {
                try {
                    controlCliente.crearCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente Agregado Correctamente");
                    limpiarCampos();
                    desactivarCampos();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Registro Duplicado");
                    limpiarCampos();
                    desactivarCampos();
                }
            }
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void tfBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyPressed
    }//GEN-LAST:event_tfBusquedaKeyPressed

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JComboBox<EnumTipoServicio> cbTipoServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfCuit;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfRazonSocial;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        EnumTipoServicio[] tipoServicio = EnumTipoServicio.values();
        DefaultComboBoxModel<EnumTipoServicio> comboBoxModel = new DefaultComboBoxModel<>(tipoServicio);
        cbTipoServicio.setModel(comboBoxModel);
    }

    private void cabecerasTablaClientes() {
        modeloTablaClientes.addColumn("ID");
        modeloTablaClientes.addColumn("RazonSocial");
        modeloTablaClientes.addColumn("Cuit");
        modeloTablaClientes.addColumn("TipoServicio");
        tbClientes.setModel(modeloTablaClientes);
    }

    private void limpiarTabla() {
        modeloTablaClientes.setRowCount(0);
    }

    private void cargarTablaClientes() {
        limpiarTabla();
        List<Cliente> listaClientes = controlCliente.listarClientes();
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                modeloTablaClientes.addRow(new Object[]{cliente.getIdCliente(), cliente.getRazonSocial(), cliente.getCuit(), cliente.getTipoServicio().toString()});
            }
        }
        TableColumnModel columnModel = tbClientes.getColumnModel();
        columnModel.getColumn(0).setMaxWidth(40);
    }

    private void activarCampos() {
        tfCuit.setEditable(true);
        tfRazonSocial.setEditable(true);
        cbTipoServicio.setEnabled(true);
        tfDireccion.setEditable(true);
        tfTelefono.setEditable(true);
        tfMail.setEditable(true);
        rbEstado.setEnabled(true);
    }

    private void desactivarCampos() {
        tfCuit.setEditable(false);
        tfRazonSocial.setEditable(false);
        cbTipoServicio.setEnabled(false);
        tfDireccion.setEditable(false);
        tfTelefono.setEditable(false);
        tfMail.setEditable(false);
        rbEstado.setEnabled(false);
    }

    private void limpiarCampos() {
        tfId.setText("");
        tfCuit.setText("");
        tfRazonSocial.setText("");
        cbTipoServicio.setSelectedIndex(-1);
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfMail.setText("");
        rbEstado.setSelected(false);
    }

    private Cliente mapeoCliente() {
        Cliente cliente = new Cliente();

        String cuit = tfCuit.getText();
        String razonSocial = tfRazonSocial.getText();
        EnumTipoServicio tipoServicio = (EnumTipoServicio) cbTipoServicio.getSelectedItem();
        String direccion = tfDireccion.getText();
        String telefono = tfTelefono.getText();
        String mail = tfMail.getText();
        //Verificación
        if (cuit.isEmpty() || razonSocial.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || mail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios, excepto ID y Estado.");
            return null;//Si falta algun campo devuelve NULL...
        }
        //Setteo del Cliente
        if (cbEditar.isSelected()) {
            String idCliente = tfId.getText();
            if (!idCliente.isEmpty()) {
                cliente.setIdCliente(Integer.parseInt(tfId.getText()));
            }
        }
        cliente.setCuit(cuit);
        cliente.setRazonSocial(razonSocial);
        cliente.setTipoServicio(tipoServicio);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setMail(mail);

        cliente.setEstado(rbEstado.isSelected());

        return cliente;
    }

}