package proyectoresoluciones.vista;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import proyectoresoluciones.negocio.UIFrameConsultar;

public class FrameConsultar extends javax.swing.JFrame {
    private UIFrameConsultar uiFrameConsultar = new UIFrameConsultar(); 
    private DefaultTableModel modelo;
    String[] titulos = {"Fecha", "Id solicitante", "Carnet", "Nombre estudiante", "Celular estudiante", "Periodo", "Curso", "Grupo", "Categoría", "Descripción"}; 
    
    
    
    public FrameConsultar() {
        initComponents();
        modelo = new DefaultTableModel(null, titulos);
        this.setVisible(true);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroSolicitud = new javax.swing.JLabel();
        txtNumeroSolicitud = new javax.swing.JTextField();
        btnConsultarSolicitud = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolicitud = new javax.swing.JTable();
        btnHacerSolicitud = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");

        lblNumeroSolicitud.setText("Número de solicitud:");

        btnConsultarSolicitud.setText("Consultar solicitud");
        btnConsultarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSolicitudActionPerformed(evt);
            }
        });

        lblBienvenida.setText("Se podrán conocer las solicitudes que hace un solicitante");

        tablaSolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero solicitud", "Fecha", "Id solicitante", "Carnet", "Nombre estudiante", "Celular estudiante", "Periodo", "Curso", "Grupo", "Categoria", "Descripcion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSolicitud);

        btnHacerSolicitud.setText("Hacer una nueva solicitud");
        btnHacerSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerSolicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultarSolicitud)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumeroSolicitud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBienvenida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHacerSolicitud)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBienvenida)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroSolicitud)
                            .addComponent(txtNumeroSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnHacerSolicitud)))
                .addGap(40, 40, 40)
                .addComponent(btnConsultarSolicitud)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSolicitudActionPerformed
        uiFrameConsultar.consultarSolicitud(this);
    }//GEN-LAST:event_btnConsultarSolicitudActionPerformed

    private void btnHacerSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerSolicitudActionPerformed
        FrameCrearSolicitud frameCrearSolicitud = new FrameCrearSolicitud();
    }//GEN-LAST:event_btnHacerSolicitudActionPerformed

    public JTable getTablaSolicitud(){
        return tablaSolicitud;
    }
    
    public JTextField getTxtNumeroSolicitud(){
        return txtNumeroSolicitud;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConsultar().setVisible(true);
            }
        });
    }
    
    public void cargarEnModelo(String fech, String idS, String car, String nomEs, String celEs, String per, String cur,
                                String gru, String cat, String des){
        
        String[] fila = new String[10];
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
        
        modelo.addRow(fila);
        
        tablaSolicitud.setModel(modelo);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarSolicitud;
    private javax.swing.JButton btnHacerSolicitud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblNumeroSolicitud;
    private javax.swing.JTable tablaSolicitud;
    private javax.swing.JTextField txtNumeroSolicitud;
    // End of variables declaration//GEN-END:variables
}
