package proyectoresoluciones.vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyectoresoluciones.datos.Situacion;
import proyectoresoluciones.negocio.DTOResolucion;
import proyectoresoluciones.negocio.UIFrameSolicitud;

public class FrameSolicitud extends javax.swing.JFrame {
    private UIFrameSolicitud uiFrameSolicitud = new UIFrameSolicitud();
    private DefaultTableModel modelo;
    String[] titulos = {"Fecha", "Id solicitante", "Carnet", "Nombre estudiante", "Celular estudiante", "Periodo", "Curso", "Grupo", "Categoría", "Descripción", "N.Solicitud"}; 
    
    public FrameSolicitud() {
        initComponents();
        modelo = new DefaultTableModel(null, titulos);
        //uiFrameSolicitud.cargarSolicitudes(this);
        /*String[] fil = new String[10];
        fil[0] = "aa";
        fil[1] = "aa";
        fil[2] = "aa";
        fil[3] = "aa";
        fil[4] = "aa";
        fil[5] = "aa";
        fil[6] = "aa";
        fil[7] = "2";;
        fil[8] = "ERROR_NOTA";
        fil[9] = "aa";
        
        modelo.addRow(fil);
        tablaSolicitudes.setModel(modelo);*/
        //uiFrameSolicitud.cargarSolicitudes(this);
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolicitudes = new javax.swing.JTable();
        btnAplicarResolucion = new javax.swing.JButton();
        comboEstado = new javax.swing.JComboBox<>();
        btnAnularSolicitud = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");

        jLabel1.setText("Estas son todas las solicitudes en el sistema:");

        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Id solicitante", "Carnet", "Nombre estudiante", "Celular estudiante", "Periodo", "Curso", "Grupo", "Categoría", "Descripción", "Estado", "N.Solicitud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSolicitudes);

        btnAplicarResolucion.setText("Aplicar resolución");
        btnAplicarResolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarResolucionActionPerformed(evt);
            }
        });

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODAS", "PENDIENTE", "TRAMITADA", "ANULADA" }));
        comboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstadoItemStateChanged(evt);
            }
        });
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        btnAnularSolicitud.setText("Anular solicitud");
        btnAnularSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularSolicitudActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 354, Short.MAX_VALUE)
                        .addComponent(btnAnularSolicitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAplicarResolucion)
                        .addGap(300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultar)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAplicarResolucion)
                    .addComponent(btnAnularSolicitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstadoItemStateChanged
        
    }//GEN-LAST:event_comboEstadoItemStateChanged

    private void btnAnularSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularSolicitudActionPerformed
        uiFrameSolicitud.anularSolicitud(this);
    }//GEN-LAST:event_btnAnularSolicitudActionPerformed

    private void btnAplicarResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarResolucionActionPerformed
        // TODO add your handling code here:
        
        
        int fila = this.getTablaSolicitudes().getSelectedRow();
        
        
        String fecha = (String) this.getTablaSolicitudes().getValueAt(fila, 0);
        String idSolicitante= (String) this.getTablaSolicitudes().getValueAt(fila, 1);
        String carnet= (String) this.getTablaSolicitudes().getValueAt(fila, 2);
        String nombreEstudiante= (String) this.getTablaSolicitudes().getValueAt(fila, 3);
        String celularEstudiante= (String) this.getTablaSolicitudes().getValueAt(fila, 4);
        String periodo= (String) this.getTablaSolicitudes().getValueAt(fila, 5);
        String curso= (String) this.getTablaSolicitudes().getValueAt(fila, 6);
        String grupo= (String )this.getTablaSolicitudes().getValueAt(fila, 7);
        String categoria= (String) this.getTablaSolicitudes().getValueAt(fila, 8);
        
        String descripcion= (String) this.getTablaSolicitudes().getValueAt(fila, 9);
        int numeroSolicitud = Integer.parseInt((String) getTablaSolicitudes().getValueAt(fila, 10));

        DTOResolucion dtoResolucion = new DTOResolucion();
        dtoResolucion.setFecha(fecha);
        dtoResolucion.setCarnet(carnet);
        dtoResolucion.setEstudiante(nombreEstudiante);
        dtoResolucion.setPeriodo(periodo);
        dtoResolucion.setCurso(curso);
        dtoResolucion.setNumeroSolicitud(numeroSolicitud);  
        dtoResolucion.setNoGrupo(grupo);
  

        
        FrameResolucion frameResolucion = new FrameResolucion(dtoResolucion);
        this.dispose();
        
    }//GEN-LAST:event_btnAplicarResolucionActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        uiFrameSolicitud.cargarSolicitudes(this);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tablaSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSolicitudesMouseClicked
        
    }//GEN-LAST:event_tablaSolicitudesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarTabla(){
        modelo.setRowCount(0);
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSolicitud().setVisible(true);
            }
        });
    }
    
    public JTable getTablaSolicitudes(){
        
        return tablaSolicitudes;
    }
    public JComboBox getComboEstado(){
        
       return comboEstado;
    }
    
    public JButton getBtnAnularSolicitud(){
        return btnAnularSolicitud;
    }
    public JButton getBtnAplicarResolucion(){
        return btnAplicarResolucion;
    }
    
    public void cargarEnModelo(String fech, String idS, String car, String nomEs, String celEs, String per, String cur,
                                String gru, String cat, String des, int numSolicitud){
        
        String[] fila = new String[11];
        fila[0] = fech;
        fila[1] = idS;
        fila[2] = car;
        fila[3] = nomEs;
        fila[4] = celEs;
        fila[5] = per;
        fila[6] = cur;
        fila[7] = gru;
        fila[8] = cat;
        fila[9] = des;
        fila[10] = String.valueOf(numSolicitud);
        
        modelo.addRow(fila);
        
        tablaSolicitudes.setModel(modelo);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularSolicitud;
    private javax.swing.JButton btnAplicarResolucion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSolicitudes;
    // End of variables declaration//GEN-END:variables
}
