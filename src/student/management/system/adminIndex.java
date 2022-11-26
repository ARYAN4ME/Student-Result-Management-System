/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.management.system;

/**
 *
 * @author AKASH
 */
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

public class adminIndex extends javax.swing.JFrame {

    /**
     * Creates new form adminIndex
     */
    public adminIndex() {
        initComponents();
    }
     public adminIndex(String password,String name) {
        initComponents();
//        jTextField2.setText(rollno);
//        jTextField1.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        panel4 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        courseDetail = new javax.swing.JComboBox<>();
        branchInput = new javax.swing.JComboBox<>();
        redgNo = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        fatherInput = new javax.swing.JTextField();
        genderSelect = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 102, 102));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/management/system/icons8_View_Details_26px.png"))); // NOI18N
        jButton1.setText("Add New Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Insert New Result");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Registered Student");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, -1));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("All Student List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, -1));

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("Log Out");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 406, 110, 40));

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel3.setBackground(new java.awt.Color(51, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel4.setBackground(new java.awt.Color(255, 204, 204));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Course");
        panel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, 94, 31));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Branch Name\n");
        panel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 113, 28));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Roll Number");
        panel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 98, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name");
        panel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 61, 26));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Father's Name");
        panel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, 113, 34));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Gender");
        panel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 72, 28));

        courseDetail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        courseDetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech", "BCA", "BE", "CSE", "Bsc", " ", " " }));
        courseDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseDetailActionPerformed(evt);
            }
        });
        panel4.add(courseDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 29, -1, -1));

        branchInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        branchInput.setForeground(new java.awt.Color(51, 51, 51));
        branchInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "CE", "CS&E", "EEE", "AE" }));
        panel4.add(branchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 65, 80, -1));

        redgNo.setBackground(new java.awt.Color(153, 153, 153));
        redgNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        redgNo.setForeground(new java.awt.Color(255, 255, 255));
        redgNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redgNoActionPerformed(evt);
            }
        });
        redgNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                redgNoKeyPressed(evt);
            }
        });
        panel4.add(redgNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        nameInput.setBackground(new java.awt.Color(153, 153, 153));
        nameInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameInput.setForeground(new java.awt.Color(255, 255, 255));
        panel4.add(nameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 140, 124, -1));

        fatherInput.setBackground(new java.awt.Color(153, 153, 153));
        fatherInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fatherInput.setForeground(new java.awt.Color(255, 255, 255));
        panel4.add(fatherInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 182, 124, -1));

        genderSelect.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderSelect.setForeground(new java.awt.Color(51, 51, 51));
        genderSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        panel4.add(genderSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Save");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 130, 40));

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        panel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 120, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        panel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, -1));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        panel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, -1));

        panel3.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 310, 320));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/management/system/student.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        panel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 450, 590));

        panel2.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 450, 500));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
//        new AllStudentList().setVisible(true);
        new InsertNewResult().setVisible(true);
//        new RegisteredStudent().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void courseDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseDetailActionPerformed

    private void redgNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redgNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redgNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new mainIndex().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
//        new AllStudentList().setVisible(true);
//        new InsertNewResult().setVisible(true);
        new RegisteredStudent().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AllStudentList().setVisible(true);
//        new InsertNewResult().setVisible(true);
//        new RegisteredStudent().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String courses=(String)courseDetail.getSelectedItem();
        String branch=(String)branchInput.getSelectedItem();
        String rollno=redgNo.getText();
        String name=nameInput.getText();
        String fathername=fatherInput.getText();
        String gender =(String)genderSelect.getSelectedItem();
        
         if(redgNo.getText().equals("")&& nameInput.getText().equals("") && fatherInput.getText().equals("")){
          jLabel8.setText("password can't empty");
          jLabel9.setText("name can't empty");
          jLabel10.setText("Father's name can't empty");
        }
         else if(!redgNo.getText().equals("")&& !nameInput.getText().equals("") && !fatherInput.getText().equals("")){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetail","root","skmk9045");
                Statement st=con.createStatement();
                st.executeUpdate("insert into stuent values('"+rollno+"','"+branch+"','"+name+"','"+courses+"','"+fathername+"','"+gender+"')");
                JOptionPane.showMessageDialog(null,"Sucessfully added");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.toString());
            }
        }
         else if(redgNo.getText().equals("")&& !nameInput.getText().equals("") && !fatherInput.getText().equals("")){
          jLabel8.setText("password can't empty");
//          jLabel9.setText("name can't empty");
//          jLabel10.setText("Father's name can't empty");
        }
         else if(!redgNo.getText().equals("")&& nameInput.getText().equals("") && !fatherInput.getText().equals("")){
//          jLabel8.setText("password can't empty");
          jLabel9.setText("name can't empty");
//          jLabel10.setText("Father's name can't empty");
        }
         else if(!redgNo.getText().equals("")&& !nameInput.getText().equals("") && fatherInput.getText().equals("")){
//          jLabel8.setText("password can't empty");
//          jLabel9.setText("name can't empty");
          jLabel10.setText("Father's name can't empty");
        }
          else if(!redgNo.getText().equals("")&& nameInput.getText().equals("") && fatherInput.getText().equals("")){
//          jLabel8.setText("password can't empty");
          jLabel9.setText("name can't empty");
          jLabel10.setText("Father's name can't empty");
        }
          else if(redgNo.getText().equals("")&& !nameInput.getText().equals("") && fatherInput.getText().equals("")){
          jLabel8.setText("password can't empty");
//          jLabel9.setText("name can't empty");
          jLabel10.setText("Father's name can't empty");
        }
          else if(redgNo.getText().equals("")&& nameInput.getText().equals("") && !fatherInput.getText().equals("")){
          jLabel8.setText("password can't empty");
          jLabel9.setText("name can't empty");
//          jLabel10.setText("Father's name can't empty");
        }
          
 
       
         else{
            JOptionPane.showMessageDialog(null, "Plese Enter All Detial");
         }
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void redgNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redgNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_redgNoKeyPressed

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
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branchInput;
    private javax.swing.JComboBox<String> courseDetail;
    private javax.swing.JTextField fatherInput;
    private javax.swing.JComboBox<String> genderSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameInput;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private javax.swing.JTextField redgNo;
    // End of variables declaration//GEN-END:variables
}
