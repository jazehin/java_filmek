/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;

/**
 *
 * @author steyza
 */
public class Film_modositas extends javax.swing.JFrame {
    static Integer Allapot=null;
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String Nevellenorzes_evellenorzes=null;
    static String filmcim=null;
    static String ev=null;
    static String hossz=null;
    static String mufaj=null;
    Boolean ok = false;
    /**
     * Creates new form Film_modositas
     */
    public Film_modositas() {
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

        javax.swing.JLabel jLabel_film = new javax.swing.JLabel();
        jTextField_filmcim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Film = new javax.swing.JTable();
        jLabel_ev = new javax.swing.JLabel();
        jComboBox_ev = new javax.swing.JComboBox<>();
        jLabel_hossz = new javax.swing.JLabel();
        jLabel_mufaj = new javax.swing.JLabel();
        jTextField_Hossz = new javax.swing.JTextField();
        jTextField_mufaj = new javax.swing.JTextField();
        jButton_rogzit = new javax.swing.JButton();
        jButton_vissza = new javax.swing.JButton();
        jLabel_id = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel_film.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_film.setText("Filcím:");

        jTextField_filmcim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_filmcim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_filmcimMouseClicked(evt);
            }
        });
        jTextField_filmcim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_filmcimActionPerformed(evt);
            }
        });
        jTextField_filmcim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_filmcimKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_filmcimKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_filmcimKeyTyped(evt);
            }
        });

        jTable_Film.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Filmcím", "Év", "Hossz", "Műfaj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Film.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_FilmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Film);

        jLabel_ev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_ev.setText("Év: ");

        jComboBox_ev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel_hossz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_hossz.setText("Hossz");

        jLabel_mufaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mufaj.setText("Műfaj");

        jTextField_Hossz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Hossz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_HosszMouseClicked(evt);
            }
        });
        jTextField_Hossz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_HosszKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HosszKeyTyped(evt);
            }
        });

        jTextField_mufaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_mufaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_mufajMouseClicked(evt);
            }
        });
        jTextField_mufaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_mufajKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_mufajKeyTyped(evt);
            }
        });

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

        jLabel_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_id.setText("ID:");

        jTextField_id.setEditable(false);
        jTextField_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_film)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_filmcim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_hossz)
                                        .addComponent(jLabel_ev)
                                        .addComponent(jLabel_mufaj, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_Hossz, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox_ev, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)
                                        .addComponent(jTextField_mufaj))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_id)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton_rogzit)
                        .addGap(159, 159, 159)
                        .addComponent(jButton_vissza)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_film, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_filmcim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ev)
                    .addComponent(jComboBox_ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_hossz)
                    .addComponent(jTextField_Hossz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_mufaj)
                    .addComponent(jTextField_mufaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_rogzit)
                    .addComponent(jButton_vissza))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combofresh() // mindig az aktuális termekcsoportokat tölti be a combo box-ba
    {
        //kitörlünk mindent a combobox-ból
        jComboBox_ev.removeAllItems();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        for (int i=1900; i<=year; i++)
        {
            jComboBox_ev.addItem(Integer.toString(i));
        }
    }
    
    private void jButton_visszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_visszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_visszaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tblfresh();
        combofresh();
    }//GEN-LAST:event_formWindowOpened

    private void jTable_FilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_FilmMouseClicked
        int sor=jTable_Film.getSelectedRow();
        filmcim=jTable_Film.getModel().getValueAt(sor, 0).toString();
        ev=jTable_Film.getModel().getValueAt(sor, 1).toString();
        hossz=jTable_Film.getModel().getValueAt(sor, 2).toString();
        mufaj=jTable_Film.getModel().getValueAt(sor, 3).toString();
        
        jTextField_filmcim.setText(filmcim);
        jTextField_Hossz.setText(hossz);
        jTextField_mufaj.setText(mufaj);
        jComboBox_ev.setSelectedIndex(Integer.parseInt(ev)-1900);
        //ID megtudakolása
        
        try
        {
            int idfilm = 0;
            conn=MySQL.ConnectDB();
            String sql="Select id "
                    +"FROM Filmek Where filmcim = '" + filmcim + "' and ev = " + ev;
            Statement sta=conn.createStatement();
            ResultSet rs=sta.executeQuery(sql);
            JOptionPane.showMessageDialog(null, sql);
            while(rs.next())
            {
                idfilm=Integer.parseInt(rs.getString("id"));
                jTextField_id.setText(Integer.toString(idfilm));
            }
            sta.close();
            conn.close();
            
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! " +e);
        }
        
    }//GEN-LAST:event_jTable_FilmMouseClicked

    private void jTextField_filmcimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_filmcimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_filmcimActionPerformed

    private void jTextField_filmcimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_filmcimKeyPressed
        tblkeres();
    }//GEN-LAST:event_jTextField_filmcimKeyPressed

    private void jTextField_filmcimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_filmcimKeyReleased
        tblkeres();
        char c= evt.getKeyChar();
        char ch2;
        String s=jTextField_filmcim.getText();
        int hossz=jTextField_filmcim.getText().length();
        if (jTextField_filmcim.getText().length()>0)
        {
            ch2=s.charAt(hossz-1);
        }
        else
        {
            ch2=c;
        }
        if (jTextField_filmcim.getText().equals(""))
        {
            if (((c ==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c ==' ') && (ch2==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_filmcim.getText().length()>=70)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_filmcimKeyReleased

    private void jTextField_HosszMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_HosszMouseClicked
        jTextField_Hossz.setText("");
    }//GEN-LAST:event_jTextField_HosszMouseClicked

    private void jTextField_mufajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_mufajMouseClicked
        jTextField_mufaj.setText("");
    }//GEN-LAST:event_jTextField_mufajMouseClicked

    private void jTextField_filmcimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_filmcimMouseClicked
        jTextField_filmcim.setText("");
    }//GEN-LAST:event_jTextField_filmcimMouseClicked

    private void jTextField_filmcimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_filmcimKeyTyped
        char c= evt.getKeyChar();
        char ch2;
        String s=jTextField_filmcim.getText();
        int hossz=jTextField_filmcim.getText().length();
        if (jTextField_filmcim.getText().length()>0)
        {
            ch2=s.charAt(hossz-1);
        }
        else
        {
            ch2=c;
        }
        if (jTextField_filmcim.getText().equals(""))
        {
            if (((c ==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c ==' ') && (ch2==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_filmcim.getText().length()>=70)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_filmcimKeyTyped

    private void jTextField_HosszKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HosszKeyTyped
        char c= evt.getKeyChar();
        if (jTextField_Hossz.getText().equals(""))
        {
            if (((c <'1') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c <'0') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_Hossz.getText().length()>=3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_HosszKeyTyped

    private void jTextField_HosszKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HosszKeyReleased
        char c= evt.getKeyChar();
        if (jTextField_Hossz.getText().equals(""))
        {
            if (((c <'1') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c <'0') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_Hossz.getText().length()>=3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_HosszKeyReleased

    private void jTextField_mufajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mufajKeyTyped
        char c= evt.getKeyChar();
        if (jTextField_mufaj.getText().equals(""))
        {
            if (((c ==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_mufaj.getText().length()>=15)
        {
            evt.consume();
        }      
    }//GEN-LAST:event_jTextField_mufajKeyTyped

    private void jTextField_mufajKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mufajKeyReleased
        char c= evt.getKeyChar();
        if (jTextField_mufaj.getText().equals(""))
        {
            if (((c ==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_mufaj.getText().length()>=15)
        {
            evt.consume();
        }      
    }//GEN-LAST:event_jTextField_mufajKeyReleased

    private void jButton_rogzitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rogzitActionPerformed
        if (jTextField_id.getText() != "")
        {
            try
            {
            conn=MySQL.ConnectDB();
            int evup = jComboBox_ev.getSelectedIndex() + 1900;
            JOptionPane.showMessageDialog(null, jComboBox_ev.getSelectedIndex());
            String sql="update Filmek set "
                    +" filmcim = '" + jTextField_filmcim.getText() +"', ev = " + evup + ", hossz = " + Integer.parseInt(jTextField_Hossz.getText()) + ", mufaj = '" + jTextField_mufaj.getText() + "'";
            Statement sta=conn.createStatement();
            sta.executeUpdate(sql);
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Hiba történt a módosításkor." + e);
            }
            
                   
        }
    }//GEN-LAST:event_jButton_rogzitActionPerformed

    private void tblkeres()
    {
        DefaultTableModel model=(DefaultTableModel)jTable_Film.getModel();
        int sorokszama=model.getRowCount();
        for (int i =sorokszama-1; i>=0; i--) // kitöröljük azt, ami benne van a táblában
        {
            model.removeRow(i);
        }
        try
        {
            conn=MySQL.ConnectDB();
            String sql="Select filmcim, ev, hossz, mufaj "
                    + "FROM Filmek WHERE filmcim LIKE '"+jTextField_filmcim.getText()+"%'";
            Statement sta=conn.createStatement();
            ResultSet rs=sta.executeQuery(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("filmcim"), rs.getInt("ev"),rs.getInt("hossz"),rs.getString("mufaj")});
            }
            sta.close();
            conn.close();
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! "+ e);
        }
    }
    
    private void tblfresh()
    {
        DefaultTableModel model=(DefaultTableModel)jTable_Film.getModel();
        int sorokszama=model.getRowCount();
        for (int i =sorokszama-1; i>=0; i--)
        {
            model.removeRow(i);
        }
        try
        {
            conn=MySQL.ConnectDB();
            String sql="Select filmcim, ev, hossz, mufaj "
                    +"FROM Filmek ";
            Statement sta=conn.createStatement();
            ResultSet rs=sta.executeQuery(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("filmcim"),rs.getInt("ev"),rs.getInt("hossz"),rs.getString("mufaj")});
            }
            sta.close();
            conn.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! " +e);
        }
    }
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
            java.util.logging.Logger.getLogger(Film_modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Film_modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Film_modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Film_modositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Film_modositas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_rogzit;
    private javax.swing.JButton jButton_vissza;
    private javax.swing.JComboBox<String> jComboBox_ev;
    private javax.swing.JLabel jLabel_ev;
    private javax.swing.JLabel jLabel_hossz;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_mufaj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Film;
    private javax.swing.JTextField jTextField_Hossz;
    private javax.swing.JTextField jTextField_filmcim;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_mufaj;
    // End of variables declaration//GEN-END:variables
}
