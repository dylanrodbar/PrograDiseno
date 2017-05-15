package proyectoresoluciones.vista;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyectoresoluciones.negocio.DTOResolucion;
import proyectoresoluciones.negocio.UIFrameResolucion;

public class FrameResolucion extends javax.swing.JFrame {
    FrameConfigPlantilla frameConfigPlantilla;
    DTOResolucion dtoRes;
    private UIFrameResolucion uiFrameResolucion = new UIFrameResolucion();
    String[] titulosTabla = {"Fecha", "Carnet", "Nombre estudiante", "Periodo", "Curso", "Profesor", "Grupo", "N.Solicitud"}; 
    String[] titulos = {"Considerandos:"};
    private DefaultTableModel modelo;
    private DefaultTableModel modeloDatos;
    private String tipoArchivo = "";
    
    


    
    public FrameResolucion() {
        
        modelo = new DefaultTableModel(null, titulos);
        modeloDatos = new DefaultTableModel(null, titulosTabla);
        
        initComponents();
        tablaConsiderandos.setModel(modelo);
        tablaDatos.setModel(modeloDatos);
        
        uiFrameResolucion.cargarDatosPlantilla(this);
    }

    
        public FrameResolucion(DTOResolucion dtoResolucion) {
         dtoRes = dtoResolucion;

        frameConfigPlantilla = new FrameConfigPlantilla(dtoRes);
        
       
        modelo = new DefaultTableModel(null, titulos);
        modeloDatos = new DefaultTableModel(null, titulosTabla);       
        initComponents();
   
        tablaConsiderandos.setModel(modelo);
        tablaDatos.setModel(modeloDatos);
                
        uiFrameResolucion.cargarDatosPlantilla(this);
        
        this.setVisible(true);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsiderandos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsiderando = new javax.swing.JTextArea();
        lblConsiderando = new javax.swing.JLabel();
        btnAnnadirConsiderando = new javax.swing.JButton();
        btnConfigurarValoresRes = new javax.swing.JButton();
        btnGenerarResolucion = new javax.swing.JButton();
        btnGenerarHTML = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");

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
        jScrollPane1.setViewportView(tablaConsiderandos);

        txtConsiderando.setColumns(20);
        txtConsiderando.setRows(5);
        jScrollPane2.setViewportView(txtConsiderando);

        lblConsiderando.setText("Considerando:");

        btnAnnadirConsiderando.setText("Añadir considerando");
        btnAnnadirConsiderando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnadirConsiderandoActionPerformed(evt);
            }
        });

        btnConfigurarValoresRes.setText("Configurar valores resolución");
        btnConfigurarValoresRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarValoresResActionPerformed(evt);
            }
        });

        btnGenerarResolucion.setText("Generar resolución");
        btnGenerarResolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarResolucionActionPerformed(evt);
            }
        });

        btnGenerarHTML.setText("Generar HTML");
        btnGenerarHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarHTMLActionPerformed(evt);
            }
        });

        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero solicitud", "Fecha", "Id solicitante", "Carnet", "Nombre estudiante", "Celular estudiante", "Periodo", "Curso", "Grupo", "Categoría", "Descripción", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaDatos.setName(""); // NOI18N
        jScrollPane3.setViewportView(tablaDatos);

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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnnadirConsiderando)
                    .addComponent(lblConsiderando)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfigurarValoresRes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerarResolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarHTML)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarPDF)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsiderando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnnadirConsiderando)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfigurarValoresRes)
                    .addComponent(btnGenerarResolucion)
                    .addComponent(btnGenerarHTML)
                    .addComponent(btnGenerarPDF)
                    .addComponent(jButton1))
                .addGap(344, 344, 344))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarResolucionActionPerformed
        uiFrameResolucion.crearResolucion(this);
    }//GEN-LAST:event_btnGenerarResolucionActionPerformed

    private void btnAnnadirConsiderandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnadirConsiderandoActionPerformed
        String[] fila = new String[1];
        fila[0] = txtConsiderando.getText();
        txtConsiderando.setText("");
        modelo.addRow(fila);
        
        tablaConsiderandos.setModel(modelo);
        //uiFrameResolucion.annadirConsiderando(this);
        
    }//GEN-LAST:event_btnAnnadirConsiderandoActionPerformed

    public void setTipoArchivo(String tipo){
        
        this.tipoArchivo = tipo;
        
    }
    
    public String getTipoArchivo(){
        return this.tipoArchivo;
    }
    
    private void btnConfigurarValoresResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarValoresResActionPerformed
         ArrayList<String> considerandos = new ArrayList<>();

        int columnas = tablaConsiderandos.getColumnCount();
        int filas = tablaConsiderandos.getRowCount();
        for(int i=0; i<filas; i++) {
            for(int j=0; j<columnas; j++){
                considerandos.add((String) tablaConsiderandos.getValueAt(i,j));
            }
        
        }
        frameConfigPlantilla.setConsiderandos(considerandos);


        frameConfigPlantilla.setVisible(true);
    }//GEN-LAST:event_btnConfigurarValoresResActionPerformed

    private void btnGenerarHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarHTMLActionPerformed
        //uiFrameResolucion.generarHTML(this);
        this.setTipoArchivo("HTML");
        uiFrameResolucion.generarArchivo(this);
    }//GEN-LAST:event_btnGenerarHTMLActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        this.setTipoArchivo("PDF");
        //uiFrameResolucion.generarPDF(this);
        uiFrameResolucion.generarArchivo(this);
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameResolucion().setVisible(true);
            }
        });
    }
    
    
    
    public FrameConfigPlantilla getFrameConfigPlantilla(){
        return frameConfigPlantilla;
    }
    
    
    public void limpiarTabla(){
        modelo.setRowCount(0);
    }
    
    public JTable getTablaConsiderandos(){
        
        return tablaConsiderandos;
        
    }
    
    
    
    public DefaultTableModel getModeloDatos(){
        
        return modeloDatos;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnadirConsiderando;
    private javax.swing.JButton btnConfigurarValoresRes;
    private javax.swing.JButton btnGenerarHTML;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnGenerarResolucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblConsiderando;
    private javax.swing.JTable tablaConsiderandos;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextArea txtConsiderando;
    // End of variables declaration//GEN-END:variables
}
