/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.toubou.librarymanagement;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author theo
 */
public class SubscribeMember extends javax.swing.JFrame {

    private Connection connection = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    private boolean checkExistenceInUniversityDB;
    private  boolean isStudentVariable = false;
    
    private Student newStudent;
    private Faculty newFaculty;
    /** Creates new form SubscribeMember */
    public SubscribeMember() {
        initComponents();
        
        connection = DatabaseConnection.getConnection();
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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        studentJTextField = new javax.swing.JTextField();
        facultyJTextField = new javax.swing.JTextField();
        facultyJRadioButton = new javax.swing.JRadioButton();
        studentJRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        lastNameJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subscribe Member");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setText("Library Management System | v0.1 - Beta Version | All Rights Reserved © ");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Provide Candidate's Data", 0, 0, new java.awt.Font("Garamond", 0, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/toubou/librarymanagement/save_icon.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/toubou/librarymanagement/clear_icon.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name :");

        jLabel3.setText("Email :");

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
        facultyJRadioButton.setText("Faculty | ID");
        facultyJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyJRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(studentJRadioButton);
        studentJRadioButton.setText("Student | AEM");
        studentJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentJRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentJRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facultyJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facultyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("First Name :");

        emailJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJTextFieldActionPerformed(evt);
            }
        });

        lastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(firstNameJTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastNameJTextField)
                                            .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facultyJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyJRadioButtonActionPerformed
        studentJTextField.setText("");
        studentJTextField.setEnabled(false);
        facultyJTextField.setEnabled(true);
        facultyJTextField.requestFocus();
        //studentJTextField.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_facultyJRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        //checking if the candidate is registered in University
        checkExistenceInUniversityDB = aknowledgeCandidateMember();
        subscribe();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentJRadioButtonActionPerformed
        facultyJTextField.setText("");
        facultyJTextField.setEnabled(false);
        studentJTextField.setEnabled(true);
        studentJTextField.requestFocus();
        //facultyJTextField.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_studentJRadioButtonActionPerformed

    private void facultyJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyJTextFieldActionPerformed

    private void studentJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentJTextFieldActionPerformed

    private void lastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTextFieldActionPerformed

    private void emailJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearJTextFields();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SubscribeMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubscribeMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubscribeMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubscribeMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubscribeMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JRadioButton facultyJRadioButton;
    private javax.swing.JTextField facultyJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JRadioButton studentJRadioButton;
    private javax.swing.JTextField studentJTextField;
    // End of variables declaration//GEN-END:variables

    /*candidate's authentication through a copy of university registered members
    that is kept in library's database*/
    private boolean aknowledgeCandidateMember() {
        String query = "SELECT * FROM university_registered WHERE Name=? AND Surname=? AND"
                + " UniversityID=? AND IsStudent=? ";
        
        
        try
        {
            pst = connection.prepareStatement(query);
            pst.setString(1, firstNameJTextField.getText());
            pst.setString(2, lastNameJTextField.getText());
            pst.setString(3, (facultyJRadioButton.isSelected()) ? facultyJTextField.getText() : studentJTextField.getText());
            pst.setBoolean(4, (studentJRadioButton.isSelected()) ? true : false);
            
            rs = pst.executeQuery();
            while(rs.next())
            {
                System.out.println("vre9ike\n");
                return true;
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
    
    //a function that clears form text fields
    //when a new record has been inserted into DB
    //or when the user has pressed "Clear" button
    private void clearJTextFields()
    {
        firstNameJTextField.setText("");
        lastNameJTextField.setText("");
        emailJTextField.setText("");
        studentJTextField.setText("");
        facultyJTextField.setText("");
        
        buttonGroup1.clearSelection();
        
    }
    
      private void studentOrFacultyObjectDecision() throws SQLException
                {if(isStudentVariable==true)
                {
                
                pst.setString(1, newStudent.getFirstName());
                pst.setString(2, newStudent.getLastName());
                pst.setString(3, newStudent.getEmail());
                pst.setBoolean(4,true);
                }
                else
                {
                    pst.setString(1, newFaculty.getFirstName());
                    pst.setString(2, newFaculty.getLastName());
                    pst.setString(3, newFaculty.getEmail());
                    pst.setBoolean(4,false);
                }
                }
      
      private void subscribe()
      {
          if(checkExistenceInUniversityDB==true)  //candidate is registered in University
        {
            System.out.println("Complet.");
          
          //checking if the candidate member is a student
          //and calling setters to set the required fields for the insert query
          if(studentJRadioButton.isSelected())  
          { 
            newStudent = new Student();
            newStudent.setFirstName(firstNameJTextField.getText());
            newStudent.setLastName(lastNameJTextField.getText());
            newStudent.setEmail(emailJTextField.getText());
            isStudentVariable = true;
          }else if(facultyJRadioButton.isSelected())
          {
            newFaculty = new Faculty();
            newFaculty.setFirstName(firstNameJTextField.getText());
            newFaculty.setLastName(lastNameJTextField.getText());
            newFaculty.setEmail(emailJTextField.getText());
            isStudentVariable = false;
          }   
            
            //Subscribing University Member to Library System
            String query = "INSERT INTO members(Name,Surname,Email,IsStudent) VALUES (?,?,?,?) " ;
            
            try
            {
                pst = connection.prepareStatement(query);
                
                studentOrFacultyObjectDecision();
                pst.execute();  //the query has just been executed
                //our record is now on table members
                
                String memberIdQuery = "SELECT MemberId FROM members WHERE Name=? AND Surname=? AND Email=? AND"
                        + " IsStudent=?" ;
                pst = connection.prepareStatement(memberIdQuery);
                studentOrFacultyObjectDecision();
                rs = pst.executeQuery();
                //success message
                while(rs.next())
                        JOptionPane.showMessageDialog(null,"New Member successfully registered!\n"
                                + "------------\nMember Information\n"
                                + "Member id:" + rs.getString("MemberId"),"Well done",JOptionPane.INFORMATION_MESSAGE);
                
                //clearing the form after new record's insertion
                clearJTextFields();
                
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
        
        else
        {
            JOptionPane.showMessageDialog(null, "Please "
                    + "retry giving the correct input data.\n"
                    + "If problem continues, maybe the applicant is not allowed to"
                    + "become a member.", "Input Error Occured", JOptionPane.ERROR_MESSAGE);
        }
      }
}
