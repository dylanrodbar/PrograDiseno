
package proyectoresoluciones.vista;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import proyectoresoluciones.negocio.UIFrameEstadisticas;

public class FrameEstadisticas extends javax.swing.JFrame {
    UIFrameEstadisticas uiFrameEstadisticas = new UIFrameEstadisticas();
    
    final DefaultCategoryDataset dataset;
    final DefaultCategoryDataset dataset2;
    
    private JFreeChart barChart;
    private JFreeChart barChart2;
    
    public FrameEstadisticas() {
        dataset = new DefaultCategoryDataset();
        dataset2 = new DefaultCategoryDataset();
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTopFive = new javax.swing.JButton();
        btnTopThree = new javax.swing.JButton();
        txtPeriodo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");

        btnTopFive.setText("Top five");
        btnTopFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopFiveActionPerformed(evt);
            }
        });

        btnTopThree.setText("Top three");
        btnTopThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopThreeActionPerformed(evt);
            }
        });

        jLabel1.setText("Período");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnTopFive)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTopThree)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTopFive)
                    .addComponent(btnTopThree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTopFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopFiveActionPerformed
        try {
            uiFrameEstadisticas.generarGraficoTopFive(this);
        } catch (IOException ex) {
            Logger.getLogger(FrameEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTopFiveActionPerformed

    private void btnTopThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopThreeActionPerformed
        try {
            uiFrameEstadisticas.generarGraficoTopThree(this);
        } catch (IOException ex) {
            Logger.getLogger(FrameEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTopThreeActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void iniciarBarChart(String periodoActual){
        
        barChart = ChartFactory.createBarChart(
        "Estadística Top 5 Cursos en " + periodoActual, 
        "Cursos", "No. Resoluciones", 
        dataset,PlotOrientation.VERTICAL, 
        true, true, false);
        
        
    }
    
    public JTextField getTxtPeriodo(){
        return txtPeriodo;
    }
    
    public JFreeChart getBarChart(){
        
        return barChart;
        
    }
    
    public DefaultCategoryDataset getDataset(){
        
        return dataset;
                
    }
    
    public void iniciarBarChart2(String periodoActual){
        
        barChart2 = ChartFactory.createBarChart(
        "Estadística Top 3 Profesores", 
        "Profesores", "No. Modificaciones Acta", 
        dataset2,PlotOrientation.VERTICAL, 
        true, true, false);
        
        
    }
    
    public JFreeChart getBarChart2(){
        
        return barChart2;
        
    }
    
    public DefaultCategoryDataset getDataset2(){
        
        return dataset2;
                
    }
    
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
            java.util.logging.Logger.getLogger(FrameEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTopFive;
    private javax.swing.JButton btnTopThree;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
