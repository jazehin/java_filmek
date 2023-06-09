/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author steyza
 */
public class Szinesz_Modositas extends javax.swing.JFrame {

    /**
     * Creates new form Szinesz_Modositas
     */
    public Szinesz_Modositas() {
        initComponents();
    }
    
    int id = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_rogzit = new javax.swing.JButton();
        jButton_vissza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Szineszek = new javax.swing.JTable();
        jtf_nev = new javax.swing.JTextField();
        jtf_cim = new javax.swing.JTextField();
        jLabel_Hossz = new javax.swing.JLabel();
        jLabel_mMufaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton_rogzit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_rogzit.setText("Rögzít");
        jButton_rogzit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rogzitActionPerformed(evt);
            }
        });

        jButton_vissza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_vissza.setText("Vissza");
        jButton_vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_visszaActionPerformed(evt);
            }
        });

        jTable_Szineszek.setModel(refreshTable());
        jTable_Szineszek.setColumnSelectionAllowed(true);
        jTable_Szineszek.getTableHeader().setReorderingAllowed(false);
        jTable_Szineszek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SzineszMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Szineszek);
        jTable_Szineszek.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jtf_nev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtf_nev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nevKeyTyped(evt);
            }
        });

        jtf_cim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtf_cim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_cimKeyTyped(evt);
            }
        });

        jLabel_Hossz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Hossz.setText("Név:");

        jLabel_mMufaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mMufaj.setText("Cím:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_mMufaj)
                                    .addComponent(jLabel_Hossz))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_nev, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_cim, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_vissza)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jButton_rogzit)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Hossz)
                    .addComponent(jtf_nev, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_cim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_mMufaj))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_rogzit)
                    .addComponent(jButton_vissza))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_rogzitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rogzitActionPerformed
        if (id < 1) return;
        
        String nev = jtf_nev.getText();
        String cim = jtf_cim.getText();
        
        try {
            Connection con = MySQL.ConnectDB();
            String sql = "UPDATE Szineszek SET nev = ?, cim = ? WHERE id = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nev);
            stmt.setString(2, cim);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Sikeres módosítás!");
            jtf_nev.setText(null);
            jtf_cim.setText(null);
            id = 0;
            
            jTable_Szineszek.setModel(refreshTable());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jButton_rogzitActionPerformed

    private void jButton_visszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_visszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_visszaActionPerformed

    private void jTable_SzineszMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SzineszMouseClicked
        if (jTable_Szineszek.getSelectedRowCount() != 1) return;
        
        int row = jTable_Szineszek.getSelectedRow();
        id = Integer.parseInt(jTable_Szineszek.getValueAt(row, 0).toString());
        jtf_nev.setText(jTable_Szineszek.getValueAt(row, 1).toString());
        jtf_cim.setText(jTable_Szineszek.getValueAt(row, 2).toString());
        

    }//GEN-LAST:event_jTable_SzineszMouseClicked

    private void jtf_nevKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nevKeyTyped

    }//GEN-LAST:event_jtf_nevKeyTyped

    private void jtf_cimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_cimKeyTyped

    }//GEN-LAST:event_jtf_cimKeyTyped

    private TableModel refreshTable() {
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("id");
        model.addColumn("név");
        model.addColumn("cím");
        
        try {
            Connection con = MySQL.ConnectDB();
            String sql = "SELECT * FROM Szineszek;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                model.addRow(new Object[] {rs.getInt(1), rs.getString(2), rs.getString(3)});
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        return model;
    }
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
            java.util.logging.Logger.getLogger(Szinesz_Modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szinesz_Modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szinesz_Modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szinesz_Modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szinesz_Modositas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_rogzit;
    private javax.swing.JButton jButton_vissza;
    private javax.swing.JLabel jLabel_Hossz;
    private javax.swing.JLabel jLabel_mMufaj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Szineszek;
    private javax.swing.JTextField jtf_cim;
    private javax.swing.JTextField jtf_nev;
    // End of variables declaration//GEN-END:variables
}
