package proyectoresoluciones.vista;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import proyectoresoluciones.negocio.UIFrameLogin;

public class FrameLogin extends javax.swing.JFrame {
    private UIFrameLogin uiFrameLogin = new UIFrameLogin();
    
    
    public FrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBienvenida.setText("Bienvenido(a), para continuar, digite un correo electrónico y una contraseña");

        lblCorreoElectronico.setText("Correo electrónico:");

        lblIdentificacion.setText("Identificacion:");

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenida)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreoElectronico)
                            .addComponent(lblIdentificacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoElectronico)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificacion)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnIniciarSesion)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        int permiso = uiFrameLogin.iniciarSesion(this);
        
        if (permiso == 0){
            FrameMenuPrincipal frameMenuPrincipal = new FrameMenuPrincipal();
            this.dispose();
        }
        if (permiso == 1){
            FrameConsultar frameConsultar = new FrameConsultar();
            this.dispose();
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }
    
    /*Se obtiene el correo electrónico*/
    public JTextField getTxtCorreoElectronico(){
        
        return txtCorreoElectronico;
        
    }
    
    /*Se obtiene la contraseña*/
    public JTextField getTxtIdentificacion(){
        
        return txtIdentificacion;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JPasswordField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
