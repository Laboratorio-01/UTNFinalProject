package view;

import Service.Validar;
import controller.ControladorTecnico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.EnumTipoServicio;
import model.Tecnico;
import persistencia.exceptions.NonexistentEntityException;

public class RrhhView extends javax.swing.JPanel {

    private ControladorTecnico controlTecnico = new ControladorTecnico();

    DefaultTableModel modeloTablaTecnicos = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public RrhhView() {
        initComponents();
        cargaCombo();
        cabeceraTablaTecnico();
        cargarTablaTecnico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pGestion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellidoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tfCuil = new javax.swing.JTextField();
        rbEstado = new javax.swing.JRadioButton();
        rbDisponibilidad = new javax.swing.JRadioButton();
        btNuevo = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTecnicos = new javax.swing.JTable();
        cbEditar = new javax.swing.JCheckBox();
        pIncidentes = new javax.swing.JPanel();
        pRanking = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1024, 740));

        lbTitulo.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gestion de RRHH ");

        pGestion.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion de Técnicos");

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton1.setText("Buscar ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfBusqueda.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("ID");

        tfId.setEditable(false);
        tfId.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Apellido y Nombre");

        tfApellidoNombre.setEditable(false);
        tfApellidoNombre.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfApellidoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoNombreKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Especialidad");

        cbEspecialidad.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        cbEspecialidad.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("Cuil");

        tfCuil.setEditable(false);
        tfCuil.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfCuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCuilKeyTyped(evt);
            }
        });

        rbEstado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        rbEstado.setText("Estado");
        rbEstado.setEnabled(false);

        rbDisponibilidad.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        rbDisponibilidad.setText("Disponibilidad");
        rbDisponibilidad.setEnabled(false);

        btNuevo.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        tbTecnicos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTecnicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTecnicos);

        cbEditar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cbEditar.setText("Editar");
        cbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditarActionPerformed(evt);
            }
        });
        cbEditar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbEditarPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pGestionLayout = new javax.swing.GroupLayout(pGestion);
        pGestion.setLayout(pGestionLayout);
        pGestionLayout.setHorizontalGroup(
            pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGestionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pGestionLayout.createSequentialGroup()
                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(pGestionLayout.createSequentialGroup()
                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pGestionLayout.createSequentialGroup()
                                .addComponent(rbDisponibilidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbEditar))
                            .addComponent(rbEstado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGestionLayout.createSequentialGroup()
                                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGestionLayout.createSequentialGroup()
                                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(19, 19, 19))
                                    .addGroup(pGestionLayout.createSequentialGroup()
                                        .addComponent(btNuevo)
                                        .addGap(86, 86, 86)))
                                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pGestionLayout.createSequentialGroup()
                                        .addComponent(btEliminar)
                                        .addGap(78, 78, 78)
                                        .addComponent(btGuardar))
                                    .addComponent(tfApellidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pGestionLayout.createSequentialGroup()
                                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        pGestionLayout.setVerticalGroup(
            pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGestionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pGestionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfApellidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pGestionLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbDisponibilidad)
                                    .addComponent(cbEditar))
                                .addGap(37, 37, 37)
                                .addComponent(rbEstado))
                            .addGroup(pGestionLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btGuardar)
                                    .addComponent(btEliminar)
                                    .addComponent(btNuevo)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(118, 118, 118))
        );

        jTabbedPane1.addTab("Gestion de Personal", pGestion);

        pIncidentes.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout pIncidentesLayout = new javax.swing.GroupLayout(pIncidentes);
        pIncidentes.setLayout(pIncidentesLayout);
        pIncidentesLayout.setHorizontalGroup(
            pIncidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        pIncidentesLayout.setVerticalGroup(
            pIncidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estado Incidentes", pIncidentes);

        pRanking.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout pRankingLayout = new javax.swing.GroupLayout(pRanking);
        pRanking.setLayout(pRankingLayout);
        pRankingLayout.setHorizontalGroup(
            pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        pRankingLayout.setVerticalGroup(
            pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ranking Tecnicos", pRanking);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaKeyTyped

    private void tfCuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCuilKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfCuilKeyTyped

    private void tfApellidoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoNombreKeyTyped
        Validar.esLetra(evt);
    }//GEN-LAST:event_tfApellidoNombreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //busqueda
        String idBuscado = tfBusqueda.getText();
        if (!idBuscado.isEmpty()) {
            Tecnico tecnico = controlTecnico.buscarTecnicoPorID(Integer.parseInt(tfBusqueda.getText()));
            if (tecnico != null) {
                limpiarTabla();
                String disponibilidad = tecnico.isDisponibilidad() ? "Disponible" : "Ocupado";
                modeloTablaTecnicos.addRow(new Object[]{tecnico.getIdTecnico(),
                    tecnico.getApellidoNombre(),
                    tecnico.getCategoria(),
                    disponibilidad});
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Técnico no encontrado.");
            }
        } else
            JOptionPane.showMessageDialog(null, "Campo vacio.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbTecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTecnicosMouseClicked
        int rowSelect = tbTecnicos.getSelectedRow();
        if (rowSelect != -1) {
            int idTecnico = (int) tbTecnicos.getValueAt(rowSelect, 0);
            Tecnico tecnico = controlTecnico.buscarTecnicoPorID(idTecnico);
            if (tecnico != null) {
                cargaCamposTecnico(tecnico);
                desactivarCampos();
                cbEditar.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó una fila.");

        }
    }//GEN-LAST:event_tbTecnicosMouseClicked

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        limpiarCampos();
        activarCampos();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void cbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditarActionPerformed
        if (cbEditar.isSelected()) {
            activarCampos();
        } else {
            desactivarCampos();
        }
    }//GEN-LAST:event_cbEditarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Eliminar
        String idSeleccionado = tfId.getText();
        if (!idSeleccionado.isEmpty()) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro de que desea eliminar este cliente?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    controlTecnico.eliminarTecnico(Integer.parseInt(idSeleccionado));
                    limpiarCampos();
                    cargarTablaTecnico();
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(RrhhView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalStateException ex) {
                    JOptionPane.showMessageDialog(null, "El ID ya esta dado de baja.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Técnico.");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void cbEditarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbEditarPropertyChange

    }//GEN-LAST:event_cbEditarPropertyChange

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Guardar
        if (cbEditar.isSelected()) {//Modo edit
            Tecnico tecnico = mapeoTecnico();
            if (tecnico != null) {
                try {
                    controlTecnico.actualizarTecnico(tecnico);
                    JOptionPane.showMessageDialog(null, "Técnico Acualizado Correctamente.");
                    limpiarCampos();
                    cbEditar.setSelected(false);
                    desactivarCampos();
                    limpiarTabla();
                    cargarTablaTecnico();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Falló la actualización. " + e.getMessage());
                }
            }
        } else {//Modo agregar nuevo...
            Tecnico tecnico = mapeoTecnico();
            if (tecnico != null) {
                try {
                    controlTecnico.crearTecnico(tecnico);
                    JOptionPane.showMessageDialog(null, "Técnico agregado Correctamente.");
                    limpiarCampos();
                    desactivarCampos();
                    cargarTablaTecnico();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Registro duplicado"+e.getMessage());
                    limpiarCampos();
                    desactivarCampos();
                }
            }
        }
    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JComboBox<EnumTipoServicio> cbEspecialidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pGestion;
    private javax.swing.JPanel pIncidentes;
    private javax.swing.JPanel pRanking;
    private javax.swing.JRadioButton rbDisponibilidad;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTable tbTecnicos;
    private javax.swing.JTextField tfApellidoNombre;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfCuil;
    private javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables

    private void cargaCamposTecnico(Tecnico tecnico) {
        //setteo de Campos
        tfId.setText(String.valueOf(tecnico.getIdTecnico()));
        tfCuil.setText(tecnico.getCuil());
        tfApellidoNombre.setText(tecnico.getApellidoNombre());
        cbEspecialidad.setSelectedItem(tecnico.getCategoria());
        rbEstado.setSelected(tecnico.isEstado());
        rbDisponibilidad.setSelected(tecnico.isDisponibilidad());
    }

    private void cargaCombo() {
        EnumTipoServicio[] enumCategoria = EnumTipoServicio.values();
        DefaultComboBoxModel<EnumTipoServicio> comboBoxModel = new DefaultComboBoxModel<>(enumCategoria);
        cbEspecialidad.setModel(comboBoxModel);
    }

    private void cabeceraTablaTecnico() {
        modeloTablaTecnicos.addColumn("ID");
        modeloTablaTecnicos.addColumn("ApeNombre");
        modeloTablaTecnicos.addColumn("Especialidad");
        modeloTablaTecnicos.addColumn("Disponibilidad");
        tbTecnicos.setModel(modeloTablaTecnicos);
    }

    private void limpiarTabla() {
        modeloTablaTecnicos.setRowCount(0);
    }

    private void cargarTablaTecnico() {
        limpiarTabla();
        List<Tecnico> listaTecnico = controlTecnico.listarTecnicos();
        if (listaTecnico != null) {
            for (Tecnico tecnico : listaTecnico) {
                String disponibilidad = tecnico.isDisponibilidad() ? "Disponible" : "Ocupado";
                modeloTablaTecnicos.addRow(new Object[]{tecnico.getIdTecnico(),
                    tecnico.getApellidoNombre(),
                    tecnico.getCategoria(),
                    disponibilidad});
            }
        }
        TableColumnModel columnModel = tbTecnicos.getColumnModel();
        columnModel.getColumn(0).setMaxWidth(40);
    }

    private void limpiarCampos() {
        tfBusqueda.setText("");
        tfId.setText("");
        tfCuil.setText("");
        tfApellidoNombre.setText("");
        cbEspecialidad.setSelectedIndex(-1);
        rbDisponibilidad.setSelected(false);
        rbEstado.setSelected(false);
        cbEditar.setSelected(false);
    }

    private void activarCampos() {
        tfCuil.setEditable(true);
        tfApellidoNombre.setEditable(true);
        cbEspecialidad.setEnabled(true);
        rbDisponibilidad.setEnabled(true);
        rbEstado.setEnabled(true);
    }

    private void desactivarCampos() {
        tfCuil.setEditable(false);
        tfApellidoNombre.setEditable(false);
        cbEspecialidad.setEnabled(false);
        rbDisponibilidad.setEnabled(false);
        rbEstado.setEnabled(false);
    }

    private Tecnico mapeoTecnico() {
        Tecnico tecnico = new Tecnico();
        String cuit = tfCuil.getText();
        String apellidoNombre = tfApellidoNombre.getText();
        EnumTipoServicio especialidad = (EnumTipoServicio) cbEspecialidad.getSelectedItem();
        //Comprobar contenido
        int espeIndex=cbEspecialidad.getSelectedIndex();
        if (cuit.isEmpty() || apellidoNombre.isEmpty() || espeIndex==-1) {
            JOptionPane.showMessageDialog(null, "No se aceptan campos nulos.");
            return null;
        }
        //Setteo del Tecnico
        if (cbEditar.isSelected()) {
            String idTecnico = tfId.getText();
            if (!idTecnico.isEmpty()) {
                tecnico.setIdTecnico(Integer.parseInt(idTecnico));
            }
        }
        tecnico.setCuil(cuit);
        tecnico.setApellidoNombre(apellidoNombre);
        tecnico.setCategoria(especialidad);
        tecnico.setDisponibilidad(rbDisponibilidad.isSelected());
        tecnico.setEstado(rbEstado.isSelected());

        return tecnico;
    }
}
