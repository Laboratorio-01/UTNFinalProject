package view;

import Service.Validar;
import controller.ControladorIncidente;
import controller.ControladorTecnico;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.EnumTipoServicio;
import model.Incidente;
import model.Tecnico;
import persistencia.exceptions.NonexistentEntityException;
import Service.CustomJTable;

public class RrhhView extends javax.swing.JPanel {

    private ControladorTecnico controlTecnico = new ControladorTecnico();
    private ControladorIncidente controlIncidente = new ControladorIncidente();
    //Formato para mostrar la fecha y hora 
    private DateFormat dateFormat = new SimpleDateFormat("EEEEE, dd/MM/yyyy HH:mm:ss");

    DefaultTableModel modeloTablaTecnicos = crearDefaultTableModel();
    DefaultTableModel modeloTablaListadoIncidentes = crearDefaultTableModel();
    DefaultTableModel modeloTablaTecnicoMasRapido = crearDefaultTableModel();
    DefaultTableModel modeloTablaMasIncidentesEnNDias = crearDefaultTableModel();
    DefaultTableModel modeloTablaMasIncidentesPorCategoria = crearDefaultTableModel();
    DefaultTableModel modeloTablaTecnicosMasIncidentes = crearDefaultTableModel();

    public RrhhView() {
        initComponents();
        cargaCombo();
        cabeceraTablaTecnico();
        cargarTablaTecnico();
        cargarCabeceraTablaListadoIncidentes();
        cargarCabeceraTablaRankTecnico();
        cabeceraTablaTecnicosMasInci();
        cargaComboRanking();
        cabeceraTablaMasIncidentesXCategoria();
        setupComboBox();
//cargarTecnicosMasIncidentesEnCategoriaYNDias();
    }

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
        tbTecnicos = new CustomJTable();
        cbEditar = new javax.swing.JCheckBox();
        pIncidentes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListadoIncidentes = new CustomJTable();
        jLabel1 = new javax.swing.JLabel();
        pRanking = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTecnicoMasRapido = new CustomJTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTecnicosConMasIncidentes = new CustomJTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbMasIncidentesPorCategoria = new CustomJTable();
        jLabel8 = new javax.swing.JLabel();
        cbNDias = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        cbNDias2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 740));

        lbTitulo.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gestion de RRHH ");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))
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

        tbListadoIncidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbListadoIncidentes);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estado de Incidentes");

        javax.swing.GroupLayout pIncidentesLayout = new javax.swing.GroupLayout(pIncidentes);
        pIncidentes.setLayout(pIncidentesLayout);
        pIncidentesLayout.setHorizontalGroup(
            pIncidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIncidentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pIncidentesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        pIncidentesLayout.setVerticalGroup(
            pIncidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIncidentesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );

        jTabbedPane1.addTab("Estado Incidentes", pIncidentes);

        tbTecnicoMasRapido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbTecnicoMasRapido);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ranking de Técnicos");

        tbTecnicosConMasIncidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbTecnicosConMasIncidentes);

        tbMasIncidentesPorCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tbMasIncidentesPorCategoria);

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<-- Tecnico más Rapido");

        cbNDias.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cbNDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "15", "30", "60" }));
        cbNDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNDiasActionPerformed(evt);
            }
        });
        cbNDias.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbNDiasPropertyChange(evt);
            }
        });

        cbCategoria.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });
        cbCategoria.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbCategoriaPropertyChange(evt);
            }
        });

        cbNDias2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cbNDias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNDias2ActionPerformed(evt);
            }
        });
        cbNDias2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbNDias2PropertyChange(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel9.setText("Tecnicos con más Incidentes resueltos en N dias.");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel10.setText("Incidentes resueltos por categoria seleccioanda en N dias");

        javax.swing.GroupLayout pRankingLayout = new javax.swing.GroupLayout(pRanking);
        pRanking.setLayout(pRankingLayout);
        pRankingLayout.setHorizontalGroup(
            pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRankingLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5))
                .addGroup(pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRankingLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pRankingLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbNDias, 0, 90, Short.MAX_VALUE)
                            .addComponent(cbNDias2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pRankingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(pRankingLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRankingLayout.setVerticalGroup(
            pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRankingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRankingLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(pRankingLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)
                        .addGap(160, 160, 160)
                        .addComponent(cbNDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(cbNDias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        jTabbedPane1.addTab("Ranking Tecnicos", pRanking);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, Short.MAX_VALUE)
                .addGap(31, 31, 31))
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
                    JOptionPane.showMessageDialog(null, "Registro duplicado" + e.getMessage());
                    limpiarCampos();
                    desactivarCampos();
                }
            }
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        cargarTablaListadoIncidentes();
        cargarTecnicoMasRapido();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void cbNDiasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbNDiasPropertyChange

    }//GEN-LAST:event_cbNDiasPropertyChange

    private void cbNDias2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbNDias2PropertyChange

    }//GEN-LAST:event_cbNDias2PropertyChange

    private void cbCategoriaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbCategoriaPropertyChange
    }//GEN-LAST:event_cbCategoriaPropertyChange

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        System.out.println("Lamado en CATEGORIAS en actionPerform");
        cargarTecnicosMasIncidentesEnCategoriaYNDias();//V
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbNDias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNDias2ActionPerformed
        System.out.println("Llamdao en numero de DIAS");//V
        cargarTecnicosMasIncidentesEnCategoriaYNDias();
    }//GEN-LAST:event_cbNDias2ActionPerformed

    private void cbNDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNDiasActionPerformed
        cargarTecnicosMasIncidentesResueltosEnUltimosNDias();//V
    }//GEN-LAST:event_cbNDiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox<EnumTipoServicio> cbCategoria;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JComboBox<EnumTipoServicio> cbEspecialidad;
    private javax.swing.JComboBox<String> cbNDias;
    private javax.swing.JComboBox<Integer> cbNDias2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pGestion;
    private javax.swing.JPanel pIncidentes;
    private javax.swing.JPanel pRanking;
    private javax.swing.JRadioButton rbDisponibilidad;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTable tbListadoIncidentes;
    private javax.swing.JTable tbMasIncidentesPorCategoria;
    private javax.swing.JTable tbTecnicoMasRapido;
    private javax.swing.JTable tbTecnicos;
    private javax.swing.JTable tbTecnicosConMasIncidentes;
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
        int espeIndex = cbEspecialidad.getSelectedIndex();
        if (cuit.isEmpty() || apellidoNombre.isEmpty() || espeIndex == -1) {
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

    private void cargarCabeceraTablaListadoIncidentes() {
        modeloTablaListadoIncidentes.addColumn("ID");
        modeloTablaListadoIncidentes.addColumn("Cliente");
        modeloTablaListadoIncidentes.addColumn("TipoServicio");
        modeloTablaListadoIncidentes.addColumn("Tecnico");
        modeloTablaListadoIncidentes.addColumn("Detalle");
        modeloTablaListadoIncidentes.addColumn("Obs.Técnico");
        modeloTablaListadoIncidentes.addColumn("FechaAlta");
        modeloTablaListadoIncidentes.addColumn("FechaFin");
        modeloTablaListadoIncidentes.addColumn("Estado");
        tbListadoIncidentes.setModel(modeloTablaListadoIncidentes);
    }

    private void cargarCabeceraTablaRankTecnico() {
        modeloTablaTecnicoMasRapido.addColumn("idTecnico");
        modeloTablaTecnicoMasRapido.addColumn("ApellidoNombre");
        modeloTablaTecnicoMasRapido.addColumn("Categoria");
        modeloTablaTecnicoMasRapido.addColumn("Promedio en Minutos");
        tbTecnicoMasRapido.setModel(modeloTablaTecnicoMasRapido);
    }

    private void cargarTecnicoMasRapido() {
        limpiarTablaX(modeloTablaTecnicoMasRapido);
        List<Tecnico> listaTodosLosTecnicos = controlTecnico.listarTecnicos();//traigo todos los tecnicos
        double mejorPromedio = Double.MAX_VALUE; // Inicializar con el valor maximo de double
        Tecnico tecMejorPromedio = null;//mejor tecnico en null

        for (Tecnico tecnico : listaTodosLosTecnicos) {//1) recorro todos los Tecnicos
            //traigo todos los incidentes.
            List<Incidente> listaIncidentes = controlIncidente.listarIncidentesPorTecnico(tecnico);
            int contadorIncidente = 0;//contador para incidentes finalizados de un tecnico en particular.
            long acumTiempoResolucion = 0;//acumulador de timepo de resolucion para promedio.

            for (Incidente incidente : listaIncidentes) {//Recorro todos los Incidentes que coincidan con el tecnico y que esten finalizados
                if (!incidente.isEstado() && incidente.getFechaFinalizacion() != null) {
                    contadorIncidente++;//agrego 1 al contador
                    acumTiempoResolucion += incidente.getFechaFinalizacion().getTime() - incidente.getFechaAlta().getTime();//agrego tiempo al acumulador
                    //test consola
                    /*System.out.println("Tecnico: "+tecnico.getApellidoNombre());
                    System.out.println("cont: " + contadorIncid);
                    System.out.println("Acumulador tiempo: " + acumTiempoResolucion);*/
                }
            }
            if (contadorIncidente > 0) { // Evitar error aritmetico (/0)
                //obtengo el promedio de tiempo en Milisegundos desde lo acumulado
                double promedio = (double) acumTiempoResolucion / contadorIncidente;

                if (promedio < mejorPromedio) {
                    mejorPromedio = promedio;//guardo el menor valor en variable mejorPromedio
                    tecMejorPromedio = tecnico;//guardo el tecnico mas rapido
                }
            }
        }

        if (tecMejorPromedio != null) {
            double mejorPromedioMinutos = mejorPromedio / 60000;//convierto Milisegundoa a Minutos

            // Formateo el resultado de la conversion a dos decimales en un String
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String mejorPromedioFormateado = decimalFormat.format(mejorPromedioMinutos);

            modeloTablaTecnicoMasRapido.addRow(new Object[]{//agrego el tecnico mas rapido a la tabla.
                tecMejorPromedio.getIdTecnico(),
                tecMejorPromedio.getApellidoNombre(),
                tecMejorPromedio.getCategoria(),
                mejorPromedioFormateado + " min"//Fin del Metodo...
            });
        }
    }

    private void limpiarTablaListadoIncidentes() {
        modeloTablaListadoIncidentes.setRowCount(0);
    }

    private void cargarTablaListadoIncidentes() {
        limpiarTablaListadoIncidentes();
        List<Incidente> listaIncidentes = controlIncidente.listarIncidentes();
        if (listaIncidentes != null) {
            for (Incidente incidente : listaIncidentes) {
                String estado = incidente.isEstado() ? "Activo" : "Finalizado";
                modeloTablaListadoIncidentes.addRow(new Object[]{incidente.getIdIncidente(),
                    incidente.getCliente().getRazonSocial(),
                    incidente.getCategoriaServicio().toString(),
                    incidente.getTecnico().getApellidoNombre(),
                    incidente.getDetalle(),
                    incidente.getObservacionesTecnico(),
                    dateFormat.format(incidente.getFechaAlta()),
                    (incidente.getFechaFinalizacion() != null) ? dateFormat.format(incidente.getFechaFinalizacion()) : "En proceso",
                    estado});
            }
        }
        TableColumnModel columnModel2 = tbListadoIncidentes.getColumnModel();
        columnModel2.getColumn(0).setMaxWidth(30);
    }

    //Metodo general para crear instancias de DafaultTableModel...
    private DefaultTableModel crearDefaultTableModel() {
        return new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    private void limpiarTablaX(DefaultTableModel modelTabla) {
        modelTabla.setRowCount(0);
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    //RANKING 2: Tecnicos con mas incidentes resultos en N dias
    private void cabeceraTablaTecnicosMasInci() {
        modeloTablaMasIncidentesEnNDias.addColumn("IdTecnico");
        modeloTablaMasIncidentesEnNDias.addColumn("ApellidoNombre");
        modeloTablaMasIncidentesEnNDias.addColumn("Categoria");
        modeloTablaMasIncidentesEnNDias.addColumn("Incidentes");
        tbTecnicosConMasIncidentes.setModel(modeloTablaMasIncidentesEnNDias);
    }

    private void cargarTecnicosMasIncidentesResueltosEnUltimosNDias() {
        limpiarTablaX(modeloTablaMasIncidentesEnNDias);
        int nDias = Integer.parseInt(cbNDias.getSelectedItem().toString());
        System.out.println("TOP TÉCNICOS POR INCIDENTES RESUELTOS EN LOS ÚLTIMOS " + nDias + " DÍAS");

        limpiarTablaX(modeloTablaTecnicosMasIncidentes);

        List<Tecnico> listaTecnicos = controlTecnico.listarTecnicos();

        // Estructura para almacenar el número de incidentes resueltos por cada técnico
        Map<Tecnico, Integer> tecnicosConIncidentes = new HashMap<>();

        // Obtener la fecha actual
        Date fechaActual = new Date();

        for (Tecnico tecnico : listaTecnicos) {
            // Obtener la lista de incidentes resueltos en los últimos N días para el técnico actual
            List<Incidente> incidentesResueltos = obtenerIncidentesResueltosEnUltimosNDias(tecnico, nDias, fechaActual);

            // Contar la cantidad de incidentes resueltos y almacenar en el mapa
            int cantidadIncidentesResueltos = incidentesResueltos.size();
            tecnicosConIncidentes.put(tecnico, cantidadIncidentesResueltos);
        }

        // Ordenar la lista de técnicos por la cantidad de incidentes resueltos (de mayor a menor)
        List<Tecnico> tecnicosOrdenados = tecnicosOrdenadosPorIncidentes(tecnicosConIncidentes);

        // Agregar los técnicos ordenados a la tabla
        for (Tecnico tecnico : tecnicosOrdenados) {
            int cantidadIncidentes = tecnicosConIncidentes.get(tecnico);
            modeloTablaMasIncidentesEnNDias.addRow(new Object[]{
                tecnico.getIdTecnico(),
                tecnico.getApellidoNombre(),
                tecnico.getCategoria(),
                cantidadIncidentes
            });
        }
    }

    private List<Incidente> obtenerIncidentesResueltosEnUltimosNDias(Tecnico tecnico, int nDias, Date fechaActual) {
        // Ejemplo de cómo calcular la fecha límite
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaActual);
        calendario.add(Calendar.DAY_OF_YEAR, -nDias);
        Date fechaLimite = calendario.getTime();

        // Obtener la lista de incidentes resueltos en el rango de fechas
        List<Incidente> incidentesResueltos = new ArrayList<>();

        // Obtener todos los incidentes del técnico
        List<Incidente> listaIncidentes = controlIncidente.listarIncidentesPorTecnico(tecnico);

        // Filtrar los incidentes resueltos en el rango de fechas
        for (Incidente incidente : listaIncidentes) {
            if (!incidente.isEstado() && incidente.getFechaFinalizacion() != null
                    && incidente.getFechaFinalizacion().after(fechaLimite)) {
                incidentesResueltos.add(incidente);
            }
        }
        return incidentesResueltos;
    }

    private List<Tecnico> tecnicosOrdenadosPorIncidentes(Map<Tecnico, Integer> tecnicosConIncidentes) {
        // Ordenar la lista de técnicos por la cantidad de incidentes resueltos (de mayor a menor)
        return tecnicosConIncidentes.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //RANKING 3 tecnicos
    private void cargaComboRanking() {
        EnumTipoServicio[] enumCategoria = EnumTipoServicio.values();
        DefaultComboBoxModel<EnumTipoServicio> comboBoxModel2 = new DefaultComboBoxModel<>(enumCategoria);
        cbCategoria.setModel(comboBoxModel2);
    }

    private void cabeceraTablaMasIncidentesXCategoria() {
        modeloTablaMasIncidentesPorCategoria.addColumn("IdTecnico");
        modeloTablaMasIncidentesPorCategoria.addColumn("ApellidoNombre");
        modeloTablaMasIncidentesPorCategoria.addColumn("Categoria");
        modeloTablaMasIncidentesPorCategoria.addColumn("Incidentes");
        tbMasIncidentesPorCategoria.setModel(modeloTablaMasIncidentesPorCategoria);
    }

    private void cargarTecnicosMasIncidentesEnCategoriaYNDias() {
        int nDiasCat = Integer.parseInt(cbNDias2.getSelectedItem().toString());
        System.out.println("nDias========= " + nDiasCat);
        EnumTipoServicio categoria = (EnumTipoServicio) cbCategoria.getSelectedItem();

        if (categoria != null && nDiasCat != 0) {
            limpiarTablaX(modeloTablaMasIncidentesPorCategoria);

            System.out.println("TOP TÉCNICOS POR INCIDENTES RESUELTOS EN LOS ÚLTIMOS " + nDiasCat + " DÍAS EN LA CATEGORÍA " + cbCategoria.getSelectedItem());

            List<Tecnico> listaTecnicos = controlTecnico.listarTecnicos();

            // Estructura HashMap para almacenar el número de incidentes resueltos por cada técnico
            Map<Tecnico, Integer> tecnicosConIncidentes = new HashMap<>();

            // Obtener la fecha actual
            Date fechaActual = new Date();

            // Obtener la categoría seleccionada del combo box
            for (Tecnico tecnico : listaTecnicos) {
                // Obtener la lista de incidentes resueltos en los últimos N días para el técnico actual y la categoría seleccionada
                List<Incidente> incidentesResueltos = obtenerIncidentesResueltosEnUltimosNDias(tecnico, nDiasCat, fechaActual, categoria);

                // Contar la cantidad de incidentes resueltos y almacenar en el mapa
                int cantidadIncidentesResueltos = incidentesResueltos.size();
                if (cantidadIncidentesResueltos > 0) {
                    tecnicosConIncidentes.put(tecnico, cantidadIncidentesResueltos);
                }
            }

            // Ordenar la lista de técnicos por la cantidad de incidentes resueltos (de mayor a menor)
            List<Tecnico> tecnicosOrdenados = tecnicosOrdenadosPorIncidentes(tecnicosConIncidentes);

            // Agregar los técnicos ordenados a la tabla
            for (Tecnico tecnico : tecnicosOrdenados) {
                int cantidadIncidentes = tecnicosConIncidentes.get(tecnico);
                modeloTablaMasIncidentesPorCategoria.addRow(new Object[]{
                    tecnico.getIdTecnico(),
                    tecnico.getApellidoNombre(),
                    tecnico.getCategoria(),
                    cantidadIncidentes
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar los dias y categoria.");
        }
    }

    private List<Incidente> obtenerIncidentesResueltosEnUltimosNDias(Tecnico tecnico, int nDias, Date fechaActual, EnumTipoServicio categoria) {
        // calcular la fecha límite
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaActual);
        calendario.add(Calendar.DAY_OF_YEAR, -nDias);
        Date fechaLimite = calendario.getTime();

        // Obtener la lista de incidentes resueltos en el rango de fechas y de la categoría seleccionada
        List<Incidente> incidentesResueltos = new ArrayList<>();

        // Obtener todos los incidentes del técnico
        List<Incidente> listaIncidentes = controlIncidente.listarIncidentesPorTecnico(tecnico);

        // Filtrar los incidentes resueltos en el rango de fechas y de la categoría seleccionada
        for (Incidente incidente : listaIncidentes) {
            if (!incidente.isEstado() && incidente.getFechaFinalizacion() != null
                    && incidente.getFechaFinalizacion().after(fechaLimite) && incidente.getCategoriaServicio() == categoria) {
                incidentesResueltos.add(incidente);
            }
        }
        return incidentesResueltos;
    }

    private List<Tecnico> tecnicosOrdenadosPorIncidentesYCategoria(Map<Tecnico, Integer> tecnicosConIncidentes) {
        // Ordenar la lista de técnicos por la cantidad de incidentes resueltos (de mayor a menor)
        return tecnicosConIncidentes.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private void setupComboBox() {
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,15,30,60};
        DefaultComboBoxModel<Integer> comboBoxModel = new DefaultComboBoxModel<>(numeros);
        // Configurar el modelo en el ComboBox
        cbNDias2.setModel(comboBoxModel);
        // Establecer un valor predeterminado en 1.
        cbNDias2.setSelectedItem(1);
    }
}
