
package proyectoCajero;

import java.awt.Color;

public class LoginSmartCash extends javax.swing.JFrame {
    int xMouse,yMouse;
    
    public LoginSmartCash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreEmpresa = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        TituloInicioS = new javax.swing.JLabel();
        TituloContraseña = new javax.swing.JLabel();
        TituloBienvenido = new javax.swing.JLabel();
        TituloUsuario = new javax.swing.JLabel();
        IngresoUsuario = new javax.swing.JTextField();
        IngresoContraseña = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JLabel();
        PanelBtnExit = new javax.swing.JPanel();
        PanelEncabezado = new javax.swing.JPanel();
        PanelBtnSalir = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        NombreEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        NombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreEmpresa.setText("SMART CASH");
        background.add(NombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 230, 40));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N
        background.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 420));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icono.png"))); // NOI18N
        Icono.setText(" ");
        background.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 50));

        TituloInicioS.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        TituloInicioS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInicioS.setText("INICIAR SESIÓN");
        background.add(TituloInicioS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        TituloContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        TituloContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloContraseña.setText("Contraseña");
        background.add(TituloContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 30));

        TituloBienvenido.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        TituloBienvenido.setText("BIENVENIDOS! ");
        background.add(TituloBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        TituloUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        TituloUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloUsuario.setText("USUARIO");
        background.add(TituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 30));

        IngresoUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        IngresoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        IngresoUsuario.setText("Ingrese su nombre de usuario");
        IngresoUsuario.setBorder(null);
        IngresoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IngresoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresoUsuarioMousePressed(evt);
            }
        });
        background.add(IngresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 30));

        IngresoContraseña.setForeground(new java.awt.Color(204, 204, 204));
        IngresoContraseña.setText("********");
        IngresoContraseña.setBorder(null);
        IngresoContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IngresoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresoContraseñaMousePressed(evt);
            }
        });
        background.add(IngresoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 90, 30));

        LoginBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginBtn.setText("ENTRAR");
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginBtnMouseEntered(evt);
            }
        });
        background.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, 40));

        PanelBtnExit.setBackground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout PanelBtnExitLayout = new javax.swing.GroupLayout(PanelBtnExit);
        PanelBtnExit.setLayout(PanelBtnExitLayout);
        PanelBtnExitLayout.setHorizontalGroup(
            PanelBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        PanelBtnExitLayout.setVerticalGroup(
            PanelBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        background.add(PanelBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, 40));

        PanelEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        PanelEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        PanelEncabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelEncabezadoMouseDragged(evt);
            }
        });
        PanelEncabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelEncabezadoMousePressed(evt);
            }
        });

        PanelBtnSalir.setForeground(new java.awt.Color(255, 255, 255));

        ExitBtn.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        ExitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelBtnSalirLayout = new javax.swing.GroupLayout(PanelBtnSalir);
        PanelBtnSalir.setLayout(PanelBtnSalirLayout);
        PanelBtnSalirLayout.setHorizontalGroup(
            PanelBtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
        PanelBtnSalirLayout.setVerticalGroup(
            PanelBtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBtnSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitBtn))
        );

        javax.swing.GroupLayout PanelEncabezadoLayout = new javax.swing.GroupLayout(PanelEncabezado);
        PanelEncabezado.setLayout(PanelEncabezadoLayout);
        PanelEncabezadoLayout.setHorizontalGroup(
            PanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEncabezadoLayout.createSequentialGroup()
                .addComponent(PanelBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 608, Short.MAX_VALUE))
        );
        PanelEncabezadoLayout.setVerticalGroup(
            PanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEncabezadoLayout.createSequentialGroup()
                .addComponent(PanelBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        background.add(PanelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseEntered
        // TODO add your handling code here:
        PanelBtnSalir.setBackground(Color.red);
        ExitBtn.setForeground(Color.white);
    }//GEN-LAST:event_ExitBtnMouseEntered

    private void PanelEncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelEncabezadoMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelEncabezadoMousePressed

    private void PanelEncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelEncabezadoMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_PanelEncabezadoMouseDragged

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void ExitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseExited
        // TODO add your handling code here:
        PanelBtnSalir.setBackground(Color.white);
        ExitBtn.setForeground(Color.black);
    }//GEN-LAST:event_ExitBtnMouseExited

    private void IngresoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoUsuarioMousePressed
        // TODO add your handling code here:
        if (IngresoUsuario.getText().equals("Ingrese su nombre de usuario")){
         IngresoUsuario.setText("");
         IngresoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(IngresoContraseña.getPassword()).isEmpty()){
         IngresoContraseña.setText("********");
         IngresoContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IngresoUsuarioMousePressed

    private void IngresoContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoContraseñaMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngresoContraseña.getPassword()).equals("********")){
         IngresoContraseña.setText("");
         IngresoContraseña.setForeground(Color.BLACK);
        }
        if (IngresoUsuario.getText().isEmpty()){
            IngresoUsuario.setText("Ingrese su nombre de usuario");
            IngresoUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngresoContraseñaMousePressed

    private void LoginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LoginBtnMouseEntered

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
            java.util.logging.Logger.getLogger(LoginSmartCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSmartCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSmartCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSmartCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSmartCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono;
    private javax.swing.JPasswordField IngresoContraseña;
    private javax.swing.JTextField IngresoUsuario;
    private javax.swing.JLabel LoginBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JPanel PanelBtnExit;
    private javax.swing.JPanel PanelBtnSalir;
    private javax.swing.JPanel PanelEncabezado;
    private javax.swing.JLabel TituloBienvenido;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloInicioS;
    private javax.swing.JLabel TituloUsuario;
    private javax.swing.JPanel background;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
