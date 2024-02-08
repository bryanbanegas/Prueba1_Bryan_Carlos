
public class Main extends javax.swing.JFrame {

    private BlockBuster blockBuster = new BlockBuster();

    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscaritem = new javax.swing.JButton();
        agregaritem = new javax.swing.JButton();
        Rentar = new javax.swing.JButton();
        auditarMovieEstado = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        buscaritem.setBackground(new java.awt.Color(255, 255, 0));
        buscaritem.setForeground(new java.awt.Color(0, 0, 255));
        buscaritem.setText("BUSCAR ITEM");
        buscaritem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaritemActionPerformed(evt);
            }
        });

        agregaritem.setBackground(new java.awt.Color(255, 255, 51));
        agregaritem.setForeground(new java.awt.Color(0, 0, 255));
        agregaritem.setText("AGREGAR ITEM");
        agregaritem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaritemActionPerformed(evt);
            }
        });

        Rentar.setBackground(new java.awt.Color(255, 255, 102));
        Rentar.setForeground(new java.awt.Color(0, 0, 204));
        Rentar.setText("RENTAR");
        Rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentarActionPerformed(evt);
            }
        });

        auditarMovieEstado.setBackground(new java.awt.Color(255, 255, 153));
        auditarMovieEstado.setForeground(new java.awt.Color(0, 0, 204));
        auditarMovieEstado.setText("AUDITAR");
        auditarMovieEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auditarMovieEstadoActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(204, 0, 0));
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/block_image_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(auditarMovieEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rentar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregaritem)
                            .addComponent(buscaritem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 194, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(buscaritem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregaritem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rentar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(auditarMovieEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaritemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaritemActionPerformed
        int codigo = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el código del ítem:"));
        String tipo = javax.swing.JOptionPane.showInputDialog("Ingrese el tipo de ítem (MOVIE o GAME):");
        BlockBusterItem item = blockBuster.buscarItem(codigo, tipo);
        if (item != null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Ítem encontrado:\n" + item.toString());
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Ítem no encontrado.");
        }
    }//GEN-LAST:event_buscaritemActionPerformed

    private void agregaritemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaritemActionPerformed
        int codigo = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el código del ítem:"));
        String nombre = javax.swing.JOptionPane.showInputDialog("Ingrese el nombre del ítem:");
        String tipoItem = javax.swing.JOptionPane.showInputDialog("Ingrese el tipo de ítem (MOVIE o GAME):");
        blockBuster.agregarItem(codigo, nombre, tipoItem);
    }//GEN-LAST:event_agregaritemActionPerformed

    private void RentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentarActionPerformed
        int codigo = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el código del ítem a rentar:"));
        String tipoItem = javax.swing.JOptionPane.showInputDialog("Ingrese el tipo de ítem a rentar (MOVIE o GAME):");
        int dias = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la cantidad de días a rentar:"));
        blockBuster.rentar(codigo, tipoItem, dias);
    }//GEN-LAST:event_RentarActionPerformed

    private void auditarMovieEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auditarMovieEstadoActionPerformed
        blockBuster.auditarMovieEstados();
        javax.swing.JOptionPane.showMessageDialog(null, "Auditoría completada.");
    }//GEN-LAST:event_auditarMovieEstadoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       dispose();
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rentar;
    private javax.swing.JButton agregaritem;
    private javax.swing.JButton auditarMovieEstado;
    private javax.swing.JButton buscaritem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
