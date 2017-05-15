package proyectoresoluciones.vista;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import proyectoresoluciones.negocio.UIFrameLogin;

public class FrameLogin extends javax.swing.JFrame {
    private UIFrameLogin uiFrameLogin = new UIFrameLogin();
    
    
    public FrameLogin() {
         super();

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
        labelIcono = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Resoluciones");
        setBackground(new java.awt.Color(210, 253, 238));

        lblBienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblBienvenida.setText("Bienvenido(a). A continuación, inicie sesión:");

        lblCorreoElectronico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        lblCorreoElectronico.setText("Correo electrónico:");

        lblIdentificacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        lblIdentificacion.setText("Identificacion:");

        btnIniciarSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(51, 153, 0));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoR.png"))); // NOI18N
        labelIcono.setMaximumSize(new java.awt.Dimension(256, 256));

        jLabelTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabelTitulo.setText("Administrador de Resoluciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCorreoElectronico)
                                    .addComponent(lblIdentificacion))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblBienvenida))
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTitulo)
                        .addGap(134, 134, 134))))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion))
                .addGap(48, 48, 48)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JPasswordField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
