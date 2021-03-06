/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.toubou.librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author theo
 */
public class LendItem extends javax.swing.JFrame {

    private boolean lendingRights = true;
    private Student student;
    private Faculty faculty;
    
    private Connection connection = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    private Title title;
    private String memberId;
    /** Creates new form LendItem */
    public LendItem() {
        initComponents();
        connection = DatabaseConnection.getConnection();
        
        titleNameJTextField.setEnabled(false);
        itemNoJTextField.setEnabled(false);
        lendJButton.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        studentJTextField = new javax.swing.JTextField();
        facultyJTextField = new javax.swing.JTextField();
        facultyJRadioButton = new javax.swing.JRadioButton();
        studentJRadioButton = new javax.swing.JRadioButton();
        investigateJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titleNameJTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        itemNoJTextField = new javax.swing.JTextField();
        lendJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jButton1.setText("Lend");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lend an Item");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Provide Attribute", 0, 0, new java.awt.Font("Vijaya", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N

        studentJTextField.setToolTipText("AEM");
        studentJTextField.setEnabled(false);
        studentJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentJTextFieldActionPerformed(evt);
            }
        });

        facultyJTextField.setToolTipText("Faculty ID");
        facultyJTextField.setEnabled(false);
        facultyJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyJTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(facultyJRadioButton);
        facultyJRadioButton.setText("Faculty | MemberID");
        facultyJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyJRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(studentJRadioButton);
        studentJRadioButton.setText("Student | MemberID");
        studentJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentJRadioButtonActionPerformed(evt);
            }
        });

        investigateJButton.setBackground(new java.awt.Color(204, 255, 204));
        investigateJButton.setText("Investigate Member's Lendings");
        investigateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investigateJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(investigateJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentJRadioButton)
                            .addComponent(facultyJRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facultyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facultyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyJRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(investigateJButton))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member came with a Title named...", 0, 0, new java.awt.Font("Vijaya", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N

        titleNameJTextField.setBackground(new java.awt.Color(204, 255, 255));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, ", which Item's Number is...", 0, 0, new java.awt.Font("Vijaya", 1, 18))); // NOI18N

        itemNoJTextField.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemNoJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleNameJTextField)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lendJButton.setText("Lend");
        lendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendJButtonActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/toubou/librarymanagement/clear_icon.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lendJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lendJButton)
                    .addComponent(jButton2))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/toubou/librarymanagement/Start-Menu-Help-icon.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(95, 24));
        jButton3.setMinimumSize(new java.awt.Dimension(95, 24));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearJComponents();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendJButtonActionPerformed
        //if only noone of the 3 swing components is empty, we check member's lending rights
        if((!titleNameJTextField.getText().equals("")) && (!itemNoJTextField.getText().equals("")))
        {
            title = new Title();
            title.setTitleName(titleNameJTextField.getText());
            title.setItemNo(Integer.parseInt(itemNoJTextField.getText()));

            updateAvailableItems();
            updateOpenLendings();
            updateItemsBorrowed();
            clearJComponents();
        }
        else
        JOptionPane.showMessageDialog(null,"Please fill all the required fields.","Invalid data",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_lendJButtonActionPerformed

    private void investigateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investigateJButtonActionPerformed
        if( (!studentJTextField.getText().equals("") || !facultyJTextField.getText().equals("")))
        {
            lendingRights = checkIfMemberCanBorrowAnItem();
            if(lendingRights==true)
            {
                JOptionPane.showMessageDialog(null,"Member is allowed to borrow an item","Everything is OK",JOptionPane.INFORMATION_MESSAGE);
                titleNameJTextField.setEnabled(true);
                itemNoJTextField.setEnabled(true);
                lendJButton.setEnabled(true);
                titleNameJTextField.requestFocus();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Member is not allowed to borrow an item.He must first return an already borrowed item, in order to borrow again, or Member is not registered in the database.","Invalid Borrow Limit",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_investigateJButtonActionPerformed

    private void studentJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentJRadioButtonActionPerformed
        facultyJTextField.setText("");
        facultyJTextField.setEnabled(false);
        studentJTextField.setEnabled(true);
        studentJTextField.requestFocus();
    }//GEN-LAST:event_studentJRadioButtonActionPerformed

    private void facultyJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyJRadioButtonActionPerformed
        studentJTextField.setText("");
        studentJTextField.setEnabled(false);
        facultyJTextField.setEnabled(true);
        facultyJTextField.requestFocus();
    }//GEN-LAST:event_facultyJRadioButtonActionPerformed

    private void facultyJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyJTextFieldActionPerformed

    private void studentJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentJTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Librarian lib = new Librarian();
        lib.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private boolean checkIfMemberCanBorrowAnItem()
    {
        String attribute = null;
        if(studentJRadioButton.isSelected())
        {
            attribute = studentJTextField.getText();
            memberId = studentJTextField.getText();
        }
            
        else if(facultyJRadioButton.isSelected())
        {
            attribute = facultyJTextField.getText();
            memberId = facultyJTextField.getText();
        }
            
        
            String query = "SELECT DISTINCT(ItemsBorrowed) AS ItemsBorrowed FROM members WHERE"
                    + " MemberId='"+attribute+"' ";
            try
            {
                 pst = connection.prepareStatement(query);
                 rs = pst.executeQuery();
                 if(rs.next())
                 {
                     if(studentJRadioButton.isSelected())
                     {
                         student = new Student();
                         if(student.getLimit() > (rs.getInt("ItemsBorrowed")))
                            return true;
                         else
                            return false;
                     }
                     else if(facultyJRadioButton.isSelected())
                     {
                         faculty = new Faculty();
                         if(faculty.getLimit() > (rs.getInt("ItemsBorrowed")))
                            return true;
                         else
                            return false;
                     }
                 }
            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);       
            }
            finally{
            try{
                rs.close();
                pst.close();
                }
            catch(Exception e)
            {
            }
           }
            return false;
    }
    
    private void updateAvailableItems()
    {
        
        String query = "UPDATE available_items_books SET AvailableItems=(AvailableItems-1) WHERE Name="
                + "'"+title.getTitleName()+"' ";
        try
        {
            pst = connection.prepareStatement(query);
            pst.execute();
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);       
        }
        finally{
            try{
                rs.close();
                pst.close();
                }
            catch(Exception e)
            {
            }
           }
    }
    
    private void updateOpenLendings()
    {
        String query = "INSERT INTO open_lendings(MemberId,Title,ItemNo) VALUES(?,?,?)";
        try
        {
            pst = connection.prepareStatement(query);
            pst.setString(1, (facultyJRadioButton.isSelected()) ? facultyJTextField.getText()  : studentJTextField.getText());
            pst.setString(2,title.getTitleName());
            pst.setInt(3,title.getItemNo());
            
            
            pst.execute();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);       
        }
        finally{
            try{
                rs.close();
                pst.close();
                }
            catch(Exception e)
            {
            }
           }
    }
    
    private void updateItemsBorrowed()
    {
        String attribute = null;
        if(studentJRadioButton.isSelected())
        {
            attribute = studentJTextField.getText();
            memberId = studentJTextField.getText();
        }
            
        else if(facultyJRadioButton.isSelected())
        {
            attribute = facultyJTextField.getText();
            memberId = facultyJTextField.getText();
        }
        String query = "UPDATE members SET ItemsBorrowed=(ItemsBorrowed+1) WHERE MemberId='"+attribute+"' ";
        String query2 = "UPDATE books SET IsBorrowed=1 WHERE ((Name='"+title.getTitleName()+"') AND (ItemNo='"+title.getItemNo()+"')) ";
        
                
        try
        {
            pst = connection.prepareStatement(query);
            pst = connection.prepareStatement(query2);
            pst.addBatch(query);
            pst.addBatch(query2);
            pst.executeBatch();
            JOptionPane.showMessageDialog(null,"All tables are up-to-date.\nYou can now lend the Item to Member","Successful lending",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);       
        }
        finally{
            try{
                rs.close();
                pst.close();
                }
            catch(Exception e)
            {
            }
           }
        
    }
    
    private void clearJComponents()
    {
        buttonGroup1.clearSelection();
        studentJTextField.setText("");
        facultyJTextField.setText("");
        titleNameJTextField.setText("");
        itemNoJTextField.setText("");
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
            java.util.logging.Logger.getLogger(LendItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LendItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LendItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LendItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LendItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton facultyJRadioButton;
    private javax.swing.JTextField facultyJTextField;
    private javax.swing.JButton investigateJButton;
    private javax.swing.JTextField itemNoJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lendJButton;
    private javax.swing.JRadioButton studentJRadioButton;
    private javax.swing.JTextField studentJTextField;
    private javax.swing.JTextField titleNameJTextField;
    // End of variables declaration//GEN-END:variables
}
