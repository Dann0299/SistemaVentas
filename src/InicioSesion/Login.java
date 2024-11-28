package InicioSesion;

import Archivos.Lector;
import Personal.Empleado;
import Personal.Registro;
import Ventas.SeleccionArticulos;
import java.awt.Image;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private boolean autenticado;

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); // Ubicar el formulario al centro de la pantalla

        // Asignar imágenes a los Label's
        this.EscalarImagenLabel(lblLogo, "src\\InicioSesion\\Recursos\\Imagenes\\Logo.png");
        this.EscalarImagenLabel(lblImgIdentificador, "src\\InicioSesion\\Recursos\\Imagenes\\Identificador.png");
        this.EscalarImagenLabel(lblImgContrasenia, "src\\InicioSesion\\Recursos\\Imagenes\\Contrasenia.png");

        this.autenticado = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBorde = new javax.swing.JPanel();
        pnlFondo = new javax.swing.JPanel();
        lblIdentificador = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        lblIcnIdentificador = new javax.swing.JPanel();
        lblImgIdentificador = new javax.swing.JLabel();
        lblIconContrasenia = new javax.swing.JPanel();
        lblImgContrasenia = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        ptxContrasenia = new javax.swing.JPasswordField();
        txtIdentificador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.POPUP);

        pnlBorde.setBackground(new java.awt.Color(34, 42, 53));

        pnlFondo.setBackground(new java.awt.Color(239, 195, 136));

        lblIdentificador.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        lblIdentificador.setForeground(new java.awt.Color(0, 0, 0));
        lblIdentificador.setText("Identificador:");

        lblContrasenia.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasenia.setText("Contraseña:");

        lblIcnIdentificador.setBackground(new java.awt.Color(214, 139, 39));

        lblImgIdentificador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout lblIcnIdentificadorLayout = new javax.swing.GroupLayout(lblIcnIdentificador);
        lblIcnIdentificador.setLayout(lblIcnIdentificadorLayout);
        lblIcnIdentificadorLayout.setHorizontalGroup(
            lblIcnIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblIcnIdentificadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        lblIcnIdentificadorLayout.setVerticalGroup(
            lblIcnIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblIcnIdentificadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblIconContrasenia.setBackground(new java.awt.Color(214, 139, 39));

        lblImgContrasenia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout lblIconContraseniaLayout = new javax.swing.GroupLayout(lblIconContrasenia);
        lblIconContrasenia.setLayout(lblIconContraseniaLayout);
        lblIconContraseniaLayout.setHorizontalGroup(
            lblIconContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblIconContraseniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        lblIconContraseniaLayout.setVerticalGroup(
            lblIconContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblIconContraseniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnIniciarSesion.setBackground(new java.awt.Color(79, 38, 4));
        btnIniciarSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        ptxContrasenia.setBackground(new java.awt.Color(246, 233, 224));
        ptxContrasenia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ptxContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        ptxContrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtIdentificador.setBackground(new java.awt.Color(246, 233, 224));
        txtIdentificador.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addComponent(lblIconContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(lblContrasenia)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(ptxContrasenia)))
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addComponent(lblIcnIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdentificador)
                                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(301, 301, 301))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblIdentificador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIcnIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblIconContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblContrasenia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ptxContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pnlBordeLayout = new javax.swing.GroupLayout(pnlBorde);
        pnlBorde.setLayout(pnlBordeLayout);
        pnlBordeLayout.setHorizontalGroup(
            pnlBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBordeLayout.setVerticalGroup(
            pnlBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        JOptionPane ventanaMensaje = new JOptionPane();

        String nombreArchivo = "src/Personal/Registro_de_credenciales.txt";
        Lector lector = new Lector(nombreArchivo);
        Registro registro = new Registro();
        
        // VDR000001
        registro.registrarArchivoPlano(nombreArchivo, new Empleado("Oscar Leopoldo", "Sánchez Tirado", "DNI", "12345678", "123", "Vendedor"));
        autenticado = lector.lineaContienePalabras(txtIdentificador.getText(), new String(ptxContrasenia.getPassword()));

        // Verifica si lo ingresado por el txtIdentificador y el ptxContrasenia comparado con el contenido del fichero son correctos
        if (autenticado) {
            this.dispose();
        } else {
            ventanaMensaje.showMessageDialog(this, "Identificador o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Login login = new Login();
        login.setVisible(true);

        login.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                if (login.isAutenticado()) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            SeleccionArticulos seleccionArticulosForm = new SeleccionArticulos();
                            seleccionArticulosForm.setVisible(true);
                        }
                    });
                }
            }
        });
    }

    private void EscalarImagenLabel(javax.swing.JLabel label, String ruta) {
        javax.swing.ImageIcon imagen = new javax.swing.ImageIcon(ruta);
        javax.swing.Icon icon = new javax.swing.ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JPanel lblIcnIdentificador;
    private javax.swing.JPanel lblIconContrasenia;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblImgContrasenia;
    private javax.swing.JLabel lblImgIdentificador;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlBorde;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPasswordField ptxContrasenia;
    private javax.swing.JTextField txtIdentificador;
    // End of variables declaration//GEN-END:variables
}
