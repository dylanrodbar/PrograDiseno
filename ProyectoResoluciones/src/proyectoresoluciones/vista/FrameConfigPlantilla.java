package proyectoresoluciones.vista;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyectoresoluciones.datos.Considerando;
import proyectoresoluciones.negocio.DTOResolucion;
import proyectoresoluciones.negocio.UIFrameConfigPlantilla;

public class FrameConfigPlantilla extends javax.swing.JFrame {
    UIFrameConfigPlantilla uiFrameConfigPlantilla = new UIFrameConfigPlantilla();
    private DefaultTableModel modelo;
    String[] titulos = {"Considerandos"};

    public FrameConfigPlantilla(DTOResolucion dtoResolucion) {
        
        initComponents();
        uiFrameConfigPlantilla.cargarDatos(this, dtoResolucion);
        modelo = new DefaultTableModel(null, titulos);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        lblNombreGestor = new javax.swing.JLabel();
        txtNombreGestor = new javax.swing.JTextField();
        lblNombreDirectorEscuela = new javax.swing.JLabel();
        txtNombreDirectorEscuela = new javax.swing.JTextField();
        lblNombreDirectorAYR = new javax.swing.JLabel();
        txtNombreDirectorAYR = new javax.swing.JTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        btnGuardar = new javax.swing.JButton();
        lblNumeroResolucion = new javax.swing.JLabel();
        txtNumeroResolucion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblEstudiante = new javax.swing.JLabel();
        txtEstudiante = new javax.swing.JTextField();
        lblCarnet = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        lblNumeroGrupo = new javax.swing.JLabel();
        txtNumeroGrupo = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        lblProfesor = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        txtNumeroSolicitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelInstrucciones = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRedaccion = new javax.swing.JTextArea();
        jLabelIcono = new javax.swing.JLabel();
        jButtonCopiarSolicitud = new javax.swing.JButton();
        jButtonCopiarNumResolucion = new javax.swing.JButton();
        jButtonCopiarDirector = new javax.swing.JButton();
        jButtonCopiarHora = new javax.swing.JButton();
        CopiarFecha = new javax.swing.JButton();
        CopiarNombreDirEscuela = new javax.swing.JButton();
        jButtonCopiarEstudiante = new javax.swing.JButton();
        jButtonCopiarCarnet = new javax.swing.JButton();
        jButtonCopiarCurso = new javax.swing.JButton();
        jButtonCopiarGrupo = new javax.swing.JButton();
        jButtonCopiarPeriodo = new javax.swing.JButton();
        jButtonCopiarProf = new javax.swing.JButton();
        jButtonGestor = new javax.swing.JButton();
        jButtonCopiarConsiderandos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsiderandos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");
        setPreferredSize(new java.awt.Dimension(1400, 775));
        setSize(new java.awt.Dimension(7, 200));

        lblFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblFecha.setText("Fecha:");

        lblNombreGestor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNombreGestor.setText("Nombre gestor:");

        lblNombreDirectorEscuela.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNombreDirectorEscuela.setText("Nombre del director de la escuela:");

        txtNombreDirectorEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDirectorEscuelaActionPerformed(evt);
            }
        });

        lblNombreDirectorAYR.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNombreDirectorAYR.setText("Nombre del director de AYR:");

        txtNombreDirectorAYR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDirectorAYRActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblNumeroResolucion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNumeroResolucion.setText("Numero de resolución:");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Hora:");

        lblEstudiante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        lblCarnet.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCarnet.setText("Carnet:");

        txtCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarnetActionPerformed(evt);
            }
        });

        lblCurso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCurso.setText("Curso:");

        lblNumeroGrupo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNumeroGrupo.setText("Número de grupo:");

        lblPeriodo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblPeriodo.setText("Período:");

        lblProfesor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblProfesor.setText("Profesor:");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Número de solicitud:");

        jSeparator1.setForeground(new java.awt.Color(0, 153, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelInstrucciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelInstrucciones.setText("Complete los siguientes datos para facilitar su uso en la redacción. Utilice los botones respectivos para insertar el texto en la redacción del lado izquierdo de esta pantalla.");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Redacte el documento");

        jTextAreaRedaccion.setColumns(20);
        jTextAreaRedaccion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRedaccion);

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoR.png"))); // NOI18N

        jButtonCopiarSolicitud.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarSolicitud.setText("Copiar");
        jButtonCopiarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarSolicitudActionPerformed(evt);
            }
        });

        jButtonCopiarNumResolucion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarNumResolucion.setText("Copiar");
        jButtonCopiarNumResolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarNumResolucionActionPerformed(evt);
            }
        });

        jButtonCopiarDirector.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarDirector.setText("Copiar");
        jButtonCopiarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarDirectorActionPerformed(evt);
            }
        });

        jButtonCopiarHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarHora.setText("Copiar");
        jButtonCopiarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarHoraActionPerformed(evt);
            }
        });

        CopiarFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        CopiarFecha.setText("Copiar");
        CopiarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarFechaActionPerformed(evt);
            }
        });

        CopiarNombreDirEscuela.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        CopiarNombreDirEscuela.setText("Copiar");
        CopiarNombreDirEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarNombreDirEscuelaActionPerformed(evt);
            }
        });

        jButtonCopiarEstudiante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarEstudiante.setText("Copiar");
        jButtonCopiarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarEstudianteActionPerformed(evt);
            }
        });

        jButtonCopiarCarnet.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarCarnet.setText("Copiar");
        jButtonCopiarCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarCarnetActionPerformed(evt);
            }
        });

        jButtonCopiarCurso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarCurso.setText("Copiar");
        jButtonCopiarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarCursoActionPerformed(evt);
            }
        });

        jButtonCopiarGrupo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarGrupo.setText("Copiar");
        jButtonCopiarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarGrupoActionPerformed(evt);
            }
        });

        jButtonCopiarPeriodo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarPeriodo.setText("Copiar");
        jButtonCopiarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarPeriodoActionPerformed(evt);
            }
        });

        jButtonCopiarProf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarProf.setText("Copiar");
        jButtonCopiarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarProfActionPerformed(evt);
            }
        });

        jButtonGestor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonGestor.setText("Copiar");
        jButtonGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestorActionPerformed(evt);
            }
        });

        jButtonCopiarConsiderandos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButtonCopiarConsiderandos.setText("Copiar Considerandos");
        jButtonCopiarConsiderandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarConsiderandosActionPerformed(evt);
            }
        });

        tablaConsiderandos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tablaConsiderandos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Considerando"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaConsiderandos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroResolucion)
                                    .addComponent(lblNombreDirectorAYR)
                                    .addComponent(jLabel1)
                                    .addComponent(lblFecha)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreDirectorAYR)
                                        .addComponent(txtHora)
                                        .addComponent(txtNumeroResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreDirectorEscuela)
                                    .addComponent(lblEstudiante)
                                    .addComponent(lblCarnet)
                                    .addComponent(lblCurso)
                                    .addComponent(lblNombreGestor)
                                    .addComponent(lblPeriodo)
                                    .addComponent(lblNumeroGrupo)
                                    .addComponent(lblProfesor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumeroGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtProfesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreGestor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreDirectorEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCopiarProf)
                                    .addComponent(jButtonGestor)
                                    .addComponent(jButtonCopiarPeriodo)
                                    .addComponent(jButtonCopiarGrupo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CopiarFecha)
                                        .addComponent(jButtonCopiarCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonCopiarHora)
                                        .addComponent(jButtonCopiarDirector)
                                        .addComponent(jButtonCopiarNumResolucion))
                                    .addComponent(CopiarNombreDirEscuela)
                                    .addComponent(jButtonCopiarEstudiante)
                                    .addComponent(jButtonCopiarCarnet))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCopiarSolicitud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCopiarConsiderandos)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelIcono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInstrucciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(611, 611, 611)
                        .addComponent(btnGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIcono)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelInstrucciones)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNumeroSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCopiarSolicitud))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNumeroResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNumeroResolucion)
                                        .addComponent(jButtonCopiarNumResolucion))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombreDirectorAYR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNombreDirectorAYR)
                                        .addComponent(jButtonCopiarDirector))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonCopiarHora)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CopiarFecha))
                                                    .addGap(16, 16, 16))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(16, 16, 16)
                                                    .addComponent(lblFecha)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtNombreDirectorEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNombreDirectorEscuela)
                                                .addComponent(CopiarNombreDirEscuela))
                                            .addGap(18, 18, 18)
                                            .addComponent(lblEstudiante)
                                            .addGap(15, 15, 15)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblCarnet))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblCurso)
                                                .addComponent(jButtonCopiarCurso)
                                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonCopiarEstudiante))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonCopiarCarnet)
                                            .addGap(34, 34, 34)))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumeroGrupo)
                                        .addComponent(txtNumeroGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(lblPeriodo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblProfesor))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNombreGestor)
                                        .addComponent(txtNombreGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonCopiarGrupo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonCopiarPeriodo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonCopiarProf)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButtonGestor)
                                    .addGap(2, 2, 2))))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCopiarConsiderandos)
                        .addGap(31, 31, 31)
                        .addComponent(btnGuardar)
                        .addGap(74, 74, 74))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDirectorEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDirectorEscuelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDirectorEscuelaActionPerformed

    private void txtCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarnetActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreDirectorAYRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDirectorAYRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDirectorAYRActionPerformed

    private void jButtonCopiarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarSolicitudActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtNumeroSolicitud.getText());
    }//GEN-LAST:event_jButtonCopiarSolicitudActionPerformed

    private void jButtonCopiarNumResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarNumResolucionActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtNumeroResolucion.getText());
    }//GEN-LAST:event_jButtonCopiarNumResolucionActionPerformed

    private void jButtonCopiarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarDirectorActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtNombreDirectorAYR.getText());
    }//GEN-LAST:event_jButtonCopiarDirectorActionPerformed

    private void jButtonCopiarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarHoraActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtHora.getText());
    }//GEN-LAST:event_jButtonCopiarHoraActionPerformed

    private void CopiarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarFechaActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtFecha.getText());
    }//GEN-LAST:event_CopiarFechaActionPerformed

    private void CopiarNombreDirEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarNombreDirEscuelaActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtNombreDirectorEscuela.getText());
    }//GEN-LAST:event_CopiarNombreDirEscuelaActionPerformed

    private void jButtonCopiarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarEstudianteActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtEstudiante.getText());
    }//GEN-LAST:event_jButtonCopiarEstudianteActionPerformed

    private void jButtonCopiarCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarCarnetActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtCarnet.getText());
    }//GEN-LAST:event_jButtonCopiarCarnetActionPerformed

    private void jButtonCopiarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarCursoActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtCurso.getText());
    }//GEN-LAST:event_jButtonCopiarCursoActionPerformed

    private void jButtonCopiarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarGrupoActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtNumeroGrupo.getText());
    }//GEN-LAST:event_jButtonCopiarGrupoActionPerformed

    private void jButtonCopiarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarPeriodoActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtPeriodo.getText());
    }//GEN-LAST:event_jButtonCopiarPeriodoActionPerformed

    private void jButtonCopiarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarProfActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtProfesor.getText());
    }//GEN-LAST:event_jButtonCopiarProfActionPerformed

    private void jButtonGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestorActionPerformed
        // TODO add your handling code here:
        jTextAreaRedaccion.setText(jTextAreaRedaccion.getText()+ " " + txtNombreGestor.getText());
    }//GEN-LAST:event_jButtonGestorActionPerformed

    private void jButtonCopiarConsiderandosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarConsiderandosActionPerformed
        // TODO add your handling code here:
        String texto = jTextAreaRedaccion.getText()+"\nCONSIDERANDOS:\n";
         TableModel tableModel = tablaConsiderandos.getModel();
        int columnas = tableModel.getColumnCount();
        int filas = tableModel.getRowCount();
        for(int i=0; i<filas; i++) {
            for(int j=0; j<columnas; j++){
                texto+="•"+ (String) tableModel.getValueAt(i,j) + "\n";
            }
       
        }
        jTextAreaRedaccion.setText(texto);
    }//GEN-LAST:event_jButtonCopiarConsiderandosActionPerformed


    
    public JTextField getTxtNumeroResolucion(){
        return txtNumeroResolucion;
    }
    
    public JTextField getTxtNombreDirectorAYR(){
        return txtNombreDirectorAYR;
    }
    
    public JTextField getTxtNumeroSolicitud(){
        return txtNumeroSolicitud;
    }
    
    public JTextField getTxtHora(){
        return txtHora;
    }
    
    public JTextField getTxtFecha(){
        return txtFecha;
    }
    
    public void setTxtFecha(String texto){
        txtFecha.setText(texto);
        txtFecha.setEditable(false);
    }
    
    public JTextField getTxtNombreDirectorEscuela(){
        return txtNombreDirectorEscuela;
    }
    
    public JTextField getTxtEstudiante(){
        return txtEstudiante;
    }
    
    public void setTxtEstudiante(String texto){
        txtEstudiante.setText(texto);
        txtEstudiante.setEditable(false);
    }
    
    public JTextField getTxtCarnet(){
        return txtCarnet;
    }
    
    public void setTxtCarnet(String texto){
        txtCarnet.setText(texto);
        txtCarnet.setEditable(false);
    }
    
    public void setTxtNumeroSolicitud(String texto){
        txtNumeroSolicitud.setText(texto);
    }
    
    public JTextField getTxtCurso(){
        return txtCurso;
    }
    
    public void setTxtCurso(String texto){
        txtCurso.setText(texto);
        txtCurso.setEditable(false);
    }
    
    public JTextField getTxtNumeroGrupo(){
        return txtNumeroGrupo;
    }
    
    public void setTxtNumeroGrupo(String texto){
        txtNumeroGrupo.setText(texto);
        txtNumeroGrupo.setEditable(false);
    }
    
    public JTextField getTxtPeriodo(){
        return txtPeriodo;
    }
    
    public void setTxtPeriodo(String texto){
        txtPeriodo.setText(texto);
        txtPeriodo.setEditable(false);
    }
    
    public JTextField getTxtProfesor(){
        return txtProfesor;
    }
    
    public void setTxtProfesor(String texto){
        txtProfesor.setText(texto);
        txtProfesor.setEditable(false);
    }
    
    public void setConsiderandos(ArrayList<String> considerandos){
        String[] fila = new String[1];
        for(int i = 0; i < considerandos.size(); i++){
            fila[0] = considerandos.get(i);
            modelo.addRow(fila);
        
        tablaConsiderandos.setModel(modelo);
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CopiarFecha;
    private javax.swing.JButton CopiarNombreDirEscuela;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButtonCopiarCarnet;
    private javax.swing.JButton jButtonCopiarConsiderandos;
    private javax.swing.JButton jButtonCopiarCurso;
    private javax.swing.JButton jButtonCopiarDirector;
    private javax.swing.JButton jButtonCopiarEstudiante;
    private javax.swing.JButton jButtonCopiarGrupo;
    private javax.swing.JButton jButtonCopiarHora;
    private javax.swing.JButton jButtonCopiarNumResolucion;
    private javax.swing.JButton jButtonCopiarPeriodo;
    private javax.swing.JButton jButtonCopiarProf;
    private javax.swing.JButton jButtonCopiarSolicitud;
    private javax.swing.JButton jButtonGestor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelInstrucciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaRedaccion;
    private javax.swing.JLabel lblCarnet;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombreDirectorAYR;
    private javax.swing.JLabel lblNombreDirectorEscuela;
    private javax.swing.JLabel lblNombreGestor;
    private javax.swing.JLabel lblNumeroGrupo;
    private javax.swing.JLabel lblNumeroResolucion;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JTable tablaConsiderandos;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEstudiante;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreDirectorAYR;
    private javax.swing.JTextField txtNombreDirectorEscuela;
    private javax.swing.JTextField txtNombreGestor;
    private javax.swing.JTextField txtNumeroGrupo;
    private javax.swing.JTextField txtNumeroResolucion;
    private javax.swing.JTextField txtNumeroSolicitud;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
