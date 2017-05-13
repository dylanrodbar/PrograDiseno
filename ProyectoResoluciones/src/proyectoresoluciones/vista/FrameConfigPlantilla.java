package proyectoresoluciones.vista;

import javax.swing.JTextField;
import proyectoresoluciones.negocio.DTOSolicitud;
import proyectoresoluciones.negocio.UIFrameConfigPlantilla;

public class FrameConfigPlantilla extends javax.swing.JFrame {
    UIFrameConfigPlantilla uiFrameConfigPlantilla = new UIFrameConfigPlantilla();

    public FrameConfigPlantilla(DTOSolicitud dtoSolicitud) {
        
        initComponents();
        uiFrameConfigPlantilla.cargarDatos(this, dtoSolicitud);
        
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
        lblAsunto1 = new javax.swing.JLabel();
        lblAsunto3 = new javax.swing.JLabel();
        txtAsunto1 = new javax.swing.JTextField();
        txtAsunto3 = new javax.swing.JTextField();
        txtNumeroSolicitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFecha.setText("Fecha:");

        lblNombreGestor.setText("Nombre gestor:");

        lblNombreDirectorEscuela.setText("Nombre del director de la escuela:");

        txtNombreDirectorEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDirectorEscuelaActionPerformed(evt);
            }
        });

        lblNombreDirectorAYR.setText("Nombre del director de AYR:");

        txtNombreDirectorAYR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDirectorAYRActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblNumeroResolucion.setText("Numero de resolución:");

        jLabel1.setText("Hora:");

        lblEstudiante.setText("Estudiante:");

        lblCarnet.setText("Carnet:");

        txtCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarnetActionPerformed(evt);
            }
        });

        lblCurso.setText("Curso:");

        lblNumeroGrupo.setText("Número de grupo:");

        lblPeriodo.setText("Período:");

        lblProfesor.setText("Profesor:");

        lblAsunto1.setText("Asunto 1:");

        lblAsunto3.setText("Asunto 2:");

        txtAsunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsunto1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de solicitud:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblNumeroResolucion)
                                    .addGap(58, 58, 58))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNombreDirectorAYR)
                                    .addGap(29, 29, 29)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblFecha)
                                    .addComponent(jLabel2))
                                .addGap(131, 131, 131)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtNumeroResolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreDirectorAYR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addComponent(txtNumeroSolicitud)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreDirectorEscuela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreDirectorEscuela))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstudiante)
                            .addComponent(lblCarnet)
                            .addComponent(lblCurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstudiante)
                            .addComponent(txtCarnet)
                            .addComponent(txtCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroGrupo)
                            .addComponent(lblPeriodo)
                            .addComponent(lblProfesor)
                            .addComponent(lblAsunto1)
                            .addComponent(lblAsunto3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAsunto1)
                            .addComponent(txtAsunto3)
                            .addComponent(txtNumeroGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfesor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreGestor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroResolucion)
                    .addComponent(txtNumeroResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroGrupo)
                    .addComponent(txtNumeroGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDirectorAYR)
                    .addComponent(txtNombreDirectorAYR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfesor)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAsunto1)
                        .addComponent(txtAsunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFecha))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDirectorEscuela)
                    .addComponent(txtNombreDirectorEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsunto3)
                    .addComponent(txtAsunto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiante)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreGestor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarnet))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDirectorEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDirectorEscuelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDirectorEscuelaActionPerformed

    private void txtCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarnetActionPerformed

    private void txtAsunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsunto1ActionPerformed
        
    }//GEN-LAST:event_txtAsunto1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreDirectorAYRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDirectorAYRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDirectorAYRActionPerformed


    
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
    
    public JTextField getTxtAsunto1(){
        return txtAsunto1;
    }

    public JTextField getTxtAsunto3(){
        return txtAsunto3;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAsunto1;
    private javax.swing.JLabel lblAsunto3;
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
    private javax.swing.JTextField txtAsunto1;
    private javax.swing.JTextField txtAsunto3;
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
