package proyectoresoluciones.vista;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import proyectoresoluciones.negocio.UIFrameCrearSolicitud;

public class FrameCrearSolicitud extends javax.swing.JFrame {

    private UIFrameCrearSolicitud uiFrameCrearSolicitud = new UIFrameCrearSolicitud();
    private JFileChooser file = null;
    public FrameCrearSolicitud() {
        initComponents();
        uiFrameCrearSolicitud.cargarCursos(this);
        uiFrameCrearSolicitud.cargarSituaciones(this);
        this.setVisible(true);
    }

    public JSpinner getTxtFecha(){
        
        return jSpinnerFecha;
    
    }
    
    public JTextField getTxtIdSolicitante(){
        
        return txtIdSolicitante;
    
    }
    
    
    
    
    public JComboBox getComboGrupo(){
        
        return comboGrupo;
        
    }
    
    public JComboBox getComboCodigoCurso(){
        
        return comboCodigoCurso;
      
    }
    
    public JTextField getTxtPeriodo(){
        
        return txtPeriodo;
    
    }
    
    public JComboBox getComboSituacion(){
        
        return comboSituacion;
      
    }
    
    public JTextArea getTxtDescripcion(){
        
        return txtDescripcion;
        
    }
    
    public JTextField getTxtNombre(){
        
        return txtNombre;
    
    }
    
    public JTextField getTxtIdentificacion(){
        
        return txtIdentificacion;
    
    }
    
    public JTextField getTxtProfesor(){
        
        return txtProfesor;
    
    }
    
    public JTextField getTxtCorreoElectronico(){
        
        return txtCorreoElectronico;
    
    }
    
    public JTextField getTxtTelefono(){
        
        return txtTelefono;
    
    }
    
    public JFileChooser getFile(){
        return file; 
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPeriodo = new javax.swing.JTextField();
        comboSituacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        comboCodigoCurso = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        lblCodigoCurso = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblSituacion = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblIdSolicitante = new javax.swing.JLabel();
        txtIdSolicitante = new javax.swing.JTextField();
        btnCrearSolicitud = new javax.swing.JButton();
        lblGrupo = new javax.swing.JLabel();
        lblProfesor = new javax.swing.JLabel();
        comboGrupo = new javax.swing.JComboBox<>();
        txtProfesor = new javax.swing.JTextField();
        btnCargarProfesor = new javax.swing.JButton();
        btnCrearArchivo = new javax.swing.JButton();
        btnCargarGrupos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jSpinnerFecha = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelIntruccion = new javax.swing.JLabel();
        jLabelInstruccionArchivo = new javax.swing.JLabel();
        jLabelInstruccionGrupos = new javax.swing.JLabel();
        jLabelIcono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");

        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });

        comboSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSituacionActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        comboCodigoCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCodigoCursoItemStateChanged(evt);
            }
        });
        comboCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodigoCursoActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblFecha.setText("Fecha:");

        lblCodigoCurso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCodigoCurso.setText("Código del curso en cuestión:");

        lblPeriodo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblPeriodo.setText("Período en que se dio el problema:");

        lblSituacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblSituacion.setText("Tipo de situación:");

        lblDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción de lo sucedido:");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Datos del estudiante");

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblIdentificacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblIdentificacion.setText("Identificación:");

        lblCorreoElectronico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCorreoElectronico.setText("Correo electrónico:");

        lblTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblTelefono.setText("Teléfono:");

        lblIdSolicitante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblIdSolicitante.setText("Identificación del Solicitante:");

        btnCrearSolicitud.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnCrearSolicitud.setText("Crear Solicitud");
        btnCrearSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSolicitudActionPerformed(evt);
            }
        });

        lblGrupo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblGrupo.setText("Grupo de curso indicado:");

        lblProfesor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblProfesor.setText("ID Profesor (Automático):");

        comboGrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboGrupoItemStateChanged(evt);
            }
        });
        comboGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGrupoActionPerformed(evt);
            }
        });

        txtProfesor.setEditable(false);

        btnCargarProfesor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnCargarProfesor.setText("Cargar profesor");
        btnCargarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarProfesorActionPerformed(evt);
            }
        });

        btnCrearArchivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnCrearArchivo.setText("Cargar archivo");
        btnCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoActionPerformed(evt);
            }
        });

        btnCargarGrupos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnCargarGrupos.setText("Cargar Grupos");
        btnCargarGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarGruposActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnVolver.setText(" <<< Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jSpinnerFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 51));

        jLabelIntruccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelIntruccion.setForeground(new java.awt.Color(0, 153, 51));
        jLabelIntruccion.setText("Favor completar el siguiente formulario para hacer efectiva su solicitud");

        jLabelInstruccionArchivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelInstruccionArchivo.setText("Seleccione el archivo que desee adjuntar:");

        jLabelInstruccionGrupos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelInstruccionGrupos.setText("Al seleccionar un grupo, podrá cargar el profesor respectivo:");

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoR.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelIcono)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelIntruccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)))
                .addGap(0, 437, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdentificacion)
                            .addComponent(lblNombre))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion)
                    .addComponent(jLabelInstruccionGrupos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGrupo)
                                .addGap(69, 69, 69)
                                .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProfesor)
                                    .addComponent(lblSituacion))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCargarGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPeriodo)
                            .addComponent(lblFecha)
                            .addComponent(lblCodigoCurso))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPeriodo)
                            .addComponent(jSpinnerFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdSolicitante)
                                .addGap(53, 53, 53)
                                .addComponent(txtIdSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabelInstruccionArchivo))
                            .addComponent(lblCorreoElectronico)
                            .addComponent(lblTelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(btnCrearSolicitud)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabelIntruccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jLabelIcono)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdSolicitante)
                    .addComponent(txtIdSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearArchivo)
                    .addComponent(jLabelInstruccionArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCurso)
                    .addComponent(comboCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeriodo)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrupo)
                    .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarGrupos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstruccionGrupos)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfesor)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarProfesor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituacion)
                    .addComponent(comboSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoElectronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnCrearSolicitud))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoActionPerformed

    private void comboSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSituacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSituacionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCrearSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSolicitudActionPerformed

        uiFrameCrearSolicitud.crearSolicitud(this);
    }//GEN-LAST:event_btnCrearSolicitudActionPerformed

    private void comboCodigoCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCodigoCursoItemStateChanged

        
        
        
    }//GEN-LAST:event_comboCodigoCursoItemStateChanged

    private void comboCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCodigoCursoActionPerformed

    private void comboGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGrupoActionPerformed
        
    }//GEN-LAST:event_comboGrupoActionPerformed

    
    
    private void comboGrupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboGrupoItemStateChanged
        
    }//GEN-LAST:event_comboGrupoItemStateChanged

    private void btnCargarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarProfesorActionPerformed

        uiFrameCrearSolicitud.cargarProfesores(this);
    }//GEN-LAST:event_btnCargarProfesorActionPerformed

    private void btnCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArchivoActionPerformed
        file = new JFileChooser();
        file.showOpenDialog(this);
    }//GEN-LAST:event_btnCrearArchivoActionPerformed

    private void btnCargarGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarGruposActionPerformed
        // TODO add your handling code here:
        uiFrameCrearSolicitud.cargarGrupos(this);
    }//GEN-LAST:event_btnCargarGruposActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCrearSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCrearSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCrearSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCrearSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCrearSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarGrupos;
    private javax.swing.JButton btnCargarProfesor;
    private javax.swing.JButton btnCrearArchivo;
    private javax.swing.JButton btnCrearSolicitud;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboCodigoCurso;
    private javax.swing.JComboBox<String> comboGrupo;
    private javax.swing.JComboBox<String> comboSituacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelInstruccionArchivo;
    private javax.swing.JLabel jLabelInstruccionGrupos;
    private javax.swing.JLabel jLabelIntruccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblIdSolicitante;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JLabel lblSituacion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdSolicitante;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtProfesor;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
