package Ventas;

import Productos.Producto;
import Productos.Registro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeleccionArticulos extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionArticulos
     */
    public SeleccionArticulos() {
        initComponents();
        tblProductos.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Código", "Nombre", "Cantidad", "Precio", "Unidad de Medida"}
        ));
        this.setLocationRelativeTo(null);
        registrarCantidadProductos();
        cargarProductosDesdeArchivo("src/Productos/Registro_Productos.txt");
    }

    public void registrarCantidadProductos() {
        Registro registro = new Registro("src/Productos/Registro_Productos.txt");
        registro.registraArchivoPlano(new Producto("Cortina", 27F, 12, "centimetros"));
        registro.registraArchivoPlano(new Producto("Cortina", 32F, 14, "centimetros"));
        registro.registraArchivoPlano(new Producto("Cortina", 22F, 9, "centimetros"));
        registro.registraArchivoPlano(new Producto("Alfombra", 53F, 6, "metros"));
        registro.registraArchivoPlano(new Producto("Alfombra", 63F, 4, "metros"));
        registro.registraArchivoPlano(new Producto("Alfombra", 58F, 8, "metros"));
        registro.registraArchivoPlano(new Producto("Cojin", 13F, 21, "unidades"));
        registro.registraArchivoPlano(new Producto("Cojin", 17F, 26, "unidades"));
        registro.registraArchivoPlano(new Producto("Cojin", 14F, 31, "unidades"));
        registro.registraArchivoPlano(new Producto("Cojin", 19F, 13, "unidades"));
        registro.registraArchivoPlano(new Producto("Mesa", 75F, 10, "unidades"));
registro.registraArchivoPlano(new Producto("Silla", 45F, 20, "unidades"));
registro.registraArchivoPlano(new Producto("Escritorio", 120F, 5, "unidades"));
registro.registraArchivoPlano(new Producto("Estante", 90F, 8, "unidades"));
registro.registraArchivoPlano(new Producto("Lámpara", 30F, 15, "unidades"));
registro.registraArchivoPlano(new Producto("Cuadro", 40F, 25, "unidades"));
registro.registraArchivoPlano(new Producto("Almohada", 20F, 50, "unidades"));
registro.registraArchivoPlano(new Producto("Colcha", 60F, 30, "unidades"));
registro.registraArchivoPlano(new Producto("Toalla", 15F, 100, "unidades"));
registro.registraArchivoPlano(new Producto("Cortina de ducha", 25F, 40, "unidades"));
registro.registraArchivoPlano(new Producto("Tapete", 35F, 12, "unidades"));

    }

    public void cargarProductosDesdeArchivo(String nombreArchivo) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador " | "
                String[] partes = linea.split("\\. | \\| ");
                if (partes.length == 5) {
                    String codigo = partes[0].trim();
                    String nombre = partes[1].trim();
                    String cantidad = partes[2].trim();
                    String precio = partes[3].trim();
                    String unidadMedida = partes[4].trim();

                    // Agregar los datos a la tabla
                    modeloTabla.addRow(new Object[]{codigo, nombre, cantidad, precio, unidadMedida});
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void registrarProducto(String nombreArchivo, Producto producto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            String texto = producto.getCodigo() + ". " + producto.getNombre() + " | " + producto.getCantidad() + " | " + producto.getPrecio() + " | " + producto.getUnidadMedida();
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngBusquedas = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(157, 191, 202));

        tblProductos.setBackground(new java.awt.Color(204, 204, 204));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.setGridColor(new java.awt.Color(15, 52, 71));
        jScrollPane1.setViewportView(tblProductos);

        btnVender.setBackground(new java.awt.Color(0, 51, 51));
        btnVender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setText("Realizar venta");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVender)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVender)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        JOptionPane ventanaMensaje = new JOptionPane();

        try {
            // Obtener los datos de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                String codigo = modeloTabla.getValueAt(i, 0).toString();
                String nombre = modeloTabla.getValueAt(i, 1).toString();
                int cantidad = Integer.parseInt(modeloTabla.getValueAt(i, 2).toString());
                float precio = Float.parseFloat(modeloTabla.getValueAt(i, 3).toString());
                String unidadMedida = modeloTabla.getValueAt(i, 4).toString();

                // Crear el objeto Producto y guardar en archivo
                Producto producto = new Producto(nombre, precio, cantidad, unidadMedida);
                registrarProducto("src/Productos/Productos_Vendidos.txt", producto);
            }
            
            ventanaMensaje.showMessageDialog(this, "La venta se ha realizado exitosamente.", "Información de Venta", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        ConfirmacionVenta cv = new ConfirmacionVenta();
        cv.setVisible(true);
    }//GEN-LAST:event_btnVenderActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionArticulos().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVender;
    private javax.swing.ButtonGroup btngBusquedas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}