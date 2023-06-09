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
public class Szereplesek extends javax.swing.JFrame {

    /**
     * Creates new form Szereplesek
     */
    public Szereplesek() {
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

        jtf_filmkeres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtf_gazsi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtn_vissza = new javax.swing.JButton();
        jbtn_mentes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_filmek = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_szineszek = new javax.swing.JTable();
        jtf_szineszkeres = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_szerepel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtf_filmkeres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_filmkeresKeyReleased(evt);
            }
        });

        jLabel1.setText("Gázsi:");

        jLabel2.setText("$");

        jbtn_vissza.setText("Vissza");
        jbtn_vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_visszaActionPerformed(evt);
            }
        });

        jbtn_mentes.setText("Mentés");
        jbtn_mentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_mentesActionPerformed(evt);
            }
        });

        jt_filmek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jt_filmek.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jt_filmek.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jt_filmek);

        jt_szineszek.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_szineszek.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jt_szineszek);

        jtf_szineszkeres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_szineszkeresKeyReleased(evt);
            }
        });

        jt_szerepel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jt_szerepel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_gazsi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jtf_filmkeres, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jtf_szineszkeres, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtn_mentes))))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtn_vissza)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_filmkeres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_szineszkeres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_gazsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbtn_mentes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_vissza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_visszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_visszaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtn_visszaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jt_filmek.setModel(getFilmekModel());
        jt_szineszek.setModel(getSzineszekModel());
        refreshSzereplesek();
    }//GEN-LAST:event_formWindowOpened

    private void jtf_szineszkeresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_szineszkeresKeyReleased
        searchSzineszek(jtf_szineszkeres.getText());
    }//GEN-LAST:event_jtf_szineszkeresKeyReleased

    private void jtf_filmkeresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_filmkeresKeyReleased
        searchFilmek(jtf_filmkeres.getText());
    }//GEN-LAST:event_jtf_filmkeresKeyReleased

    private void jbtn_mentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_mentesActionPerformed
        if (jt_filmek.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Jelöljön ki egy filmet!");
            return;
        }
        
        if (jt_szineszek.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Jelöljön ki egy színészt!");
            return;
        }
        
        int filmId = Integer.parseInt(jt_filmek.getValueAt(jt_filmek.getSelectedRow(), 0).toString());
        int szineszId = Integer.parseInt(jt_szineszek.getValueAt(jt_szineszek.getSelectedRow(), 0).toString());
        int gazsi = Integer.parseInt(jtf_gazsi.getText());
        
        try {
            Connection con = MySQL.ConnectDB();
            String sql = "INSERT INTO Szereplesek (film_id, szinesz_id, fizetseg) VALUES (?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, filmId);
            stmt.setInt(2, szineszId);
            stmt.setInt(3, gazsi);
            
            stmt.execute();
            JOptionPane.showMessageDialog(this, "Sikeres felvétel!");
            refreshSzereplesek();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jbtn_mentesActionPerformed

    private void refreshSzereplesek() {
        DefaultTableModel model = (DefaultTableModel) jt_szerepel.getModel();
        model.setColumnCount(0);
        model.addColumn("Filmcím");
        model.addColumn("Színész neve");
        model.addColumn("Gázsi ($)");
        
        model.setRowCount(0);
        try {
            Connection con = MySQL.ConnectDB();
            String sql = "SELECT Filmek.filmcim, Szineszek.nev, Szereplesek.fizetseg "
                    + "FROM Szereplesek "
                    + "INNER JOIN Szineszek ON Szereplesek.szinesz_id = Szineszek.id "
                    + "INNER JOIN Filmek ON Szereplesek.film_id = Filmek.id;";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                model.addRow(new Object[]{rs.getObject(1), rs.getObject(2), rs.getObject(3)});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void searchSzineszek(String nev) {
        try {
            Connection con = MySQL.ConnectDB();
            String sql = "SELECT * FROM Szineszek WHERE nev LIKE '%"+ nev +"%';";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();

            updateSzineszekModel(rs, (DefaultTableModel) jt_szineszek.getModel());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void updateSzineszekModel(ResultSet rs, DefaultTableModel model) {
        try {
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3)});
            }
            
            //jt_szineszek.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void searchFilmek(String cim) {
        try {
            Connection con = MySQL.ConnectDB();
            String sql = "SELECT * FROM Filmek WHERE filmcim LIKE '%"+ cim +"%';";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();

            updateFilmekModel(rs, (DefaultTableModel) jt_filmek.getModel());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void updateFilmekModel(ResultSet rs, DefaultTableModel model) {
        try {
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4), rs.getObject(5)});
            }
            
            //jt_szineszek.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
            
        }
    }

    private TableModel getSzineszekModel() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("id");
        model.addColumn("név");
        model.addColumn("cím");

        try {
            Connection con = MySQL.ConnectDB();
            String sql = "SELECT * FROM Szineszek;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            updateSzineszekModel(rs, model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

        return model;
    }

    private TableModel getFilmekModel() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("id");
        model.addColumn("cím");
        model.addColumn("év");
        model.addColumn("hossz");
        model.addColumn("műfaj");

        try {
            Connection con = MySQL.ConnectDB();
            String sql = "SELECT id, filmcim, ev, hossz, mufaj FROM Filmek;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)});
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
            java.util.logging.Logger.getLogger(Szereplesek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szereplesek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szereplesek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szereplesek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szereplesek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtn_mentes;
    private javax.swing.JButton jbtn_vissza;
    private javax.swing.JTable jt_filmek;
    private javax.swing.JTable jt_szerepel;
    private javax.swing.JTable jt_szineszek;
    private javax.swing.JTextField jtf_filmkeres;
    private javax.swing.JTextField jtf_gazsi;
    private javax.swing.JTextField jtf_szineszkeres;
    // End of variables declaration//GEN-END:variables
}
