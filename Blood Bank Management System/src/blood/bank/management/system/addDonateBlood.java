/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.bank.management.system;
import java.sql.*;
import Project.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class addDonateBlood extends javax.swing.JFrame {

    /**
     * Creates new form addDonateBlood
     */
    public addDonateBlood() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        dobTxt = new com.toedter.calendar.JDateChooser();
        fatherNameTxt = new javax.swing.JTextField();
        motherNameTxt = new javax.swing.JTextField();
        mobileNoTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        bloodGroupTxt = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        idTxt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Add New Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 15, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 72, 743, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("New Donor ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 111, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 154, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 198, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mother Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 242, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 288, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 339, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 388, -1, -1));

        fullNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(fullNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 154, 216, -1));
        getContentPane().add(dobTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 297, 216, -1));

        fatherNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(fatherNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 201, 216, -1));

        motherNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(motherNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 248, 216, -1));

        mobileNoTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mobileNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 345, 216, -1));

        genderTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sex Type>", "Male", "Female" }));
        getContentPane().add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 394, 216, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 111, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 154, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Blood Group");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 199, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("City");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 244, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Complete Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 299, -1, -1));

        emailTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 154, 225, -1));

        cityTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 244, 225, -1));

        bloodGroupTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloodGroupTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Blood Type>", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        getContentPane().add(bloodGroupTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 199, 225, -1));

        addressTxt.setColumns(20);
        addressTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressTxt.setRows(5);
        jScrollPane1.setViewportView(addressTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 302, 225, 138));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 452, 769, 12));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 482, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Update details.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 482, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logout.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 482, -1, -1));

        idTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idTxt.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 60, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/FcxA0Q.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel14ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String donorId = idTxt.getText();
        String name = fullNameTxt.getText();
        String fatherName = fatherNameTxt.getText();
        String motherName = motherNameTxt.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String DOB = dFormat.format(dobTxt.getDate());
        String MobileNo = mobileNoTxt.getText();
        String gender = (String)genderTxt.getSelectedItem();
        String email = emailTxt.getText();
        String bloodGroup = (String)bloodGroupTxt.getSelectedItem();
        String city = cityTxt.getText();
        String address = addressTxt.getText();
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into donor value('" + donorId + "','" + name + "','" + fatherName + "','" + motherName + "','" + DOB + "','" + MobileNo + "','" + gender + "','" + email + "','" + bloodGroup + "','" + city + "','" + address + "')");
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new addDonateBlood().setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DonateBlood().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addDonateBlood().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(donorId) from donor");
            if(rs.next()){
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                idTxt.setText(str);
            }else{
                idTxt.setText("1");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jLabel14ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel14ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14ComponentShown

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addDonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDonateBlood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTxt;
    private javax.swing.JComboBox<String> bloodGroupTxt;
    private javax.swing.JTextField cityTxt;
    private com.toedter.calendar.JDateChooser dobTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fatherNameTxt;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JComboBox<String> genderTxt;
    private javax.swing.JLabel idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mobileNoTxt;
    private javax.swing.JTextField motherNameTxt;
    // End of variables declaration//GEN-END:variables
}
