

package Oficina01.tela;

public class CRudcompl extends javax.swing.JFrame {
    private Object JOptionPane;

   
    public CRudcompl() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jColorChooser1 = new javax.swing.JColorChooser();
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        query1 = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JToggleButton();
        lblPlaca = new javax.swing.JLabel();
        lblnomeCompleto = new javax.swing.JLabel();
        jTextFieldNOme = new javax.swing.JTextField();
        jTextFieldServico = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oficina");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        btnSalvar.setText("SALVAR");
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(330, 140, 90, 30);

        btnCancelar.setText("CANCELAR ");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(440, 140, 90, 30);

        lblPlaca.setText("Placa:");
        getContentPane().add(lblPlaca);
        lblPlaca.setBounds(20, 90, 90, 30);

        lblnomeCompleto.setText("Nome Completo:");
        getContentPane().add(lblnomeCompleto);
        lblnomeCompleto.setBounds(20, 50, 100, 30);
        getContentPane().add(jTextFieldNOme);
        jTextFieldNOme.setBounds(130, 50, 170, 30);

        jTextFieldServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldServico);
        jTextFieldServico.setBounds(130, 90, 170, 30);

        jTableDados.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Placa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableDados);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 300, 560, 90);

        setSize(new java.awt.Dimension(596, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(validaCamposObrigatorios()){
            JOptionPane.showMessageDiaLog(null, "Preencha todos os campos antes de salvar!");
        }else{
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextFieldServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServicoActionPerformed

  
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
            java.util.logging.Logger.getLogger(CRudcompl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRudcompl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRudcompl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRudcompl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new CRudcompl().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldNOme;
    private javax.swing.JTextField jTextFieldServico;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblnomeCompleto;
    private java.util.List list1;
    private javax.persistence.Query query1;
    // End of variables declaration//GEN-END:variables

    private boolean validaCamposObrigatorios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
