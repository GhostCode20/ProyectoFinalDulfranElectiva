/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AP-SE105-01
 */
public class Frm_Shary1 extends javax.swing.JFrame {

    /**
     * Creates new form Frm_FincaShary
     */
    public Frm_Shary1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_nit = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_ubi = new javax.swing.JTextField();
        txt_prop = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_registrar1 = new javax.swing.JButton();
        btn_actualizar2 = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_codigo1 = new javax.swing.JTextField();
        txt_nombre2 = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_produccion = new javax.swing.JTextField();
        txt_codtrabajo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_guardar1 = new javax.swing.JButton();
        btn_actualizar1 = new javax.swing.JButton();
        btn_registrar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_codigo2 = new javax.swing.JTextField();
        txt_nombre3 = new javax.swing.JTextField();
        txt_contacto = new javax.swing.JTextField();
        txt_nitfinca = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_guardar2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Finca Mi Tierra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        txt_nit.setText("Nit");
        txt_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitActionPerformed(evt);
            }
        });

        txt_nombre.setText("Nombre");

        txt_ubi.setText("Ubicación");
        txt_ubi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ubiActionPerformed(evt);
            }
        });

        txt_prop.setText("Propietario");

        txt_correo.setText("Correo");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Finca");

        btn_registrar1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_registrar1.setText("Resgitrar");

        btn_actualizar2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_actualizar2.setText("Actualizar");

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualizar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar2)
                    .addComponent(btn_registrar1))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        txt_codigo1.setText("Código");
        txt_codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo1ActionPerformed(evt);
            }
        });

        txt_nombre2.setText("Nombre");

        txt_descripcion.setText("Descripción");
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });

        txt_produccion.setText("Producion");

        txt_codtrabajo.setText("Código de trabajador");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cultivo");

        btn_guardar1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_guardar1.setText("Guardar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        btn_actualizar1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_actualizar1.setText("Actualizar");

        btn_registrar2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_registrar2.setText("Resgitrar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codtrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_produccion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar1)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codtrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_produccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar2)
                    .addComponent(btn_actualizar1)
                    .addComponent(btn_guardar1))
                .addGap(45, 45, 45))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));

        txt_codigo2.setText("Código");
        txt_codigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo2ActionPerformed(evt);
            }
        });

        txt_nombre3.setText("Nombre");

        txt_contacto.setText("Contacto");
        txt_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactoActionPerformed(evt);
            }
        });

        txt_nitfinca.setText("Nit de finca");

        txt_cargo.setText("Cargo");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Trabajador");

        btn_registrar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_registrar.setText("Resgitrar");

        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_actualizar.setText("Actualizar");

        btn_guardar2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_guardar2.setText("Guardar");
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nitfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_guardar2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nitfinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_guardar2)
                    .addComponent(btn_registrar))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitActionPerformed

    private void txt_ubiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ubiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ubiActionPerformed

    private void txt_codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo1ActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void txt_codigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo2ActionPerformed

    private void txt_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
 // Obtén los valores ingresados en los campos de texto
    String str_nit = txt_nit.getText();
    String nombre = txt_nombre.getText();
    String ubicacion = txt_ubi.getText();
    String str_prop = txt_prop.getText();
    String correo = txt_correo.getText();

    ClsFincaNov07.guardar(str_nit, nombre, ubicacion, str_nit, correo, str_nit, nombre, str_nit, ubicacion, str_nit, nombre, str_nit, str_nit);
        
        txt_nombre.setText("");
        txt_ubi.setText("");
        txt_prop.setText("");
        txt_correo.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        // TODO add your handling code here:
         String codigo = txt_codigo.getText();
         String nombre2 = txt_nombre3.getText();
          String produccion = txt_produccion.getText();
           String descripcion = txt_descripcion.getText();
           
        ClsFincaNov07.guardar(nombre2, nombre2, produccion, descripcion, nombre2, codigo2, nombre2, produccion, descripcion, codigo2, nombre2, produccion, nombre2);
           
           
         
         
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
        // TODO add your handling code here:
         String codigo2 = txt_codigo2.getText();
         String nombre3 = txt_nombre3.getText();
         String contacto = txt_contacto.getText();
         String cargo = txt_cargo.getText();
         
         ClsFincaNov07.guardar(cargo, nombre3, cargo, cargo, cargo, cargo, nombre3, contacto, codigo2, cargo, nombre3, contacto, cargo);
         
    }//GEN-LAST:event_btn_guardar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_FincaShary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_FincaShary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_FincaShary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_FincaShary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Shary1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_actualizar1;
    private javax.swing.JButton btn_actualizar2;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.JButton btn_registrar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_codigo1;
    private javax.swing.JTextField txt_codigo2;
    private javax.swing.JTextField txt_codtrabajo;
    private javax.swing.JTextField txt_contacto;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nitfinca;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre2;
    private javax.swing.JTextField txt_nombre3;
    private javax.swing.JTextField txt_produccion;
    private javax.swing.JTextField txt_prop;
    private javax.swing.JTextField txt_ubi;
    // End of variables declaration//GEN-END:variables
}
