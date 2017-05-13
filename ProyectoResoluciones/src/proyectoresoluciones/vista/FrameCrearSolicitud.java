package proyectoresoluciones.vista;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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

    public JTextField getTxtFecha(){
        
        return txtFecha;
    
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

        txtFecha = new javax.swing.JFormattedTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblFecha.setText("Fecha:");

        lblCodigoCurso.setText("Código curso:");

        lblPeriodo.setText("Período:");

        lblSituacion.setText("Situación:");

        lblDescripcion.setText("Descripción:");

        jLabel1.setText("Datos del estudiante:");

        lblNombre.setText("Nombre:");

        lblIdentificacion.setText("Identificación:");

        lblCorreoElectronico.setText("Correo electrónico:");

        lblTelefono.setText("Teléfono:");

        lblIdSolicitante.setText("Identificación:");

        btnCrearSolicitud.setText("Crear una solicitud");
        btnCrearSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSolicitudActionPerformed(evt);
            }
        });

        lblGrupo.setText("Grupo:");

        lblProfesor.setText("Profesor:");

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

        btnCargarProfesor.setText("Cargar profesor");
        btnCargarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarProfesorActionPerformed(evt);
            }
        });

        btnCrearArchivo.setText("Cargar archivo");
        btnCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoActionPerformed(evt);
            }
        });

        btnCargarGrupos.setText("Cargar Grupos");
        btnCargarGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarGruposActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdSolicitante)
                                    .addComponent(lblCodigoCurso)
                                    .addComponent(lblPeriodo)
                                    .addComponent(lblSituacion)
                                    .addComponent(lblDescripcion)
                                    .addComponent(lblFecha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtIdSolicitante, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comboCodigoCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comboSituacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtFecha)
                                                    .addComponent(txtPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                        .addGap(18, 76, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblProfesor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnCrearArchivo)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btnCargarGrupos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnCargarProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(100, 100, 100))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblIdentificacion)
                                    .addComponent(lblCorreoElectronico)
                                    .addComponent(lblTelefono)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel1))
                                    .addComponent(lblGrupo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnCrearSolicitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdSolicitante)
                    .addComponent(txtIdSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearArchivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoCurso)
                            .addComponent(lblProfesor)
                            .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblGrupo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargarProfesor)
                            .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo)
                    .addComponent(btnCargarGrupos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSituacion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDescripcion)
                        .addGap(29, 29, 29)))
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoElectronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearSolicitud)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(23, 23, 23))))
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
        System.out.println(""+txtPeriodo.getText());
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
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtIdSolicitante;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtProfesor;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
