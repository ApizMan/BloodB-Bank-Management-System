/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.bank.management.system;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DonateBlood extends javax.swing.JFrame {
    
    User userDonor = new Donor("piya", "aloha", "Siti", "F", 66, 45.1f, "B+", null, 2, 1, 12);
    User userPatient = new Patient(null, null, null, null, 0, 0, null, null);

    //DownCasting
    Donor donor = (Donor) userDonor;
    Patient patient = (Patient) userPatient;
    
    /**
     * Creates new form DonateBlood
     */
    public DonateBlood() {
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

        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        NameLbl = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        GenderLbl = new javax.swing.JLabel();
        AgeLbl = new javax.swing.JLabel();
        WeightLbl = new javax.swing.JLabel();
        BloodGLbl = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        cmbBloodGroup = new javax.swing.JComboBox<>();
        WeightLbl1 = new javax.swing.JLabel();
        WeightLbl2 = new javax.swing.JLabel();
        WeightLbl3 = new javax.swing.JLabel();
        radHealthyYes = new javax.swing.JRadioButton();
        radHealthyNo = new javax.swing.JRadioButton();
        radPvtYes = new javax.swing.JRadioButton();
        radPvtNo = new javax.swing.JRadioButton();
        txtWeek = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelDonor = new javax.swing.JLabel();
        labelBlood = new javax.swing.JLabel();
        labelDonateTo = new javax.swing.JLabel();
        labelWeight = new javax.swing.JLabel();
        labelEligibility = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Donate Blood");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 15, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 761, 13));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        NameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NameLbl.setText("Name");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        GenderLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GenderLbl.setText("Gender");

        AgeLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgeLbl.setText("Age");

        WeightLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WeightLbl.setText("Weight");

        BloodGLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BloodGLbl.setText("Blood Group");

        cmbGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sex Type>", "Male", "Female" }));
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        cmbBloodGroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Blood Type>", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));

        WeightLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WeightLbl1.setText("Healthy?");

        WeightLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WeightLbl2.setText("Private Name?");

        WeightLbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WeightLbl3.setText("Last Donation Week");

        buttonGroup3.add(radHealthyYes);
        radHealthyYes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radHealthyYes.setText("Yes");
        radHealthyYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radHealthyYesActionPerformed(evt);
            }
        });

        buttonGroup3.add(radHealthyNo);
        radHealthyNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radHealthyNo.setText("No");

        buttonGroup1.add(radPvtYes);
        radPvtYes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radPvtYes.setText("Yes");
        radPvtYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPvtYesActionPerformed(evt);
            }
        });

        buttonGroup1.add(radPvtNo);
        radPvtNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radPvtNo.setText("No");

        txtWeek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeekActionPerformed(evt);
            }
        });

        btnVerify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search1.png"))); // NOI18N
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Update details.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgeLbl)
                            .addComponent(GenderLbl)
                            .addComponent(NameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(WeightLbl2)
                                    .addComponent(WeightLbl1)))
                            .addComponent(WeightLbl3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radHealthyYes)
                                .addGap(18, 18, 18)
                                .addComponent(radHealthyNo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radPvtYes)
                                .addGap(18, 18, 18)
                                .addComponent(radPvtNo))
                            .addComponent(txtWeek)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BloodGLbl)
                                    .addComponent(WeightLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLbl)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenderLbl)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgeLbl)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WeightLbl1)
                            .addComponent(radHealthyYes)
                            .addComponent(radHealthyNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WeightLbl2)
                            .addComponent(radPvtYes)
                            .addComponent(radPvtNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WeightLbl3)
                            .addComponent(txtWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WeightLbl)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BloodGLbl)
                    .addComponent(cmbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, 785, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eligibility Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(51, 51, 255))); // NOI18N

        labelDonor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDonor.setText("Donor:");

        labelBlood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelBlood.setText("Blood Group:");

        labelDonateTo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDonateTo.setText("Donate Blood To:");

        labelWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelWeight.setText("Weight:");

        labelEligibility.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEligibility.setText("Eligibility:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEligibility)
                    .addComponent(labelWeight)
                    .addComponent(labelDonateTo)
                    .addComponent(labelBlood)
                    .addComponent(labelDonor))
                .addContainerGap(610, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDonor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelBlood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDonateTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWeight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEligibility)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 780, 200));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 613, 800, 10));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add new.png"))); // NOI18N
        jButton3.setText("Add Donor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, 120, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit application.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/FcxA0Q.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void radHealthyYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radHealthyYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radHealthyYesActionPerformed

    private void radPvtYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPvtYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radPvtYesActionPerformed

    private void txtWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeekActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        // TODO add your handling code here:
        donor.setName(txtName.getText()); //Get name from Name field
        donor.setAge(Integer.parseInt(txtAge.getText()));//Get Age from Age field
        donor.setWeight(Integer.parseInt(txtWeight.getText())); //get weight from weight field
        donor.setLastWeekDonate(Integer.parseInt(txtWeek.getText()));//get week donation from last week donation field
        
        //Get gender from radio button:
        if(cmbGender.getSelectedIndex()==1){
            donor.setGender("Male");
        }else if(cmbGender.getSelectedIndex()==2){
            donor.setGender("Female");
        }
        
        //Get bloodtype from combo box:
        if(cmbBloodGroup.getSelectedIndex()==1){
            donor.setBloodGroup("A+");
        }else if(cmbBloodGroup.getSelectedIndex()==2){
            donor.setBloodGroup("O+");
        }else if(cmbBloodGroup.getSelectedIndex()==3){
            donor.setBloodGroup("B+");
        }else if(cmbBloodGroup.getSelectedIndex()==4){
            donor.setBloodGroup("AB+");
        }else if(cmbBloodGroup.getSelectedIndex()==5){
            donor.setBloodGroup("A-");
        }else if(cmbBloodGroup.getSelectedIndex()==6){
            donor.setBloodGroup("O-");
        }else if(cmbBloodGroup.getSelectedIndex()==7){
            donor.setBloodGroup("B-");
        }else if(cmbBloodGroup.getSelectedIndex()==8){
            donor.setBloodGroup("AB-");
        }
        
        //Output:
        labelDonor.setText("Donor                   : " + donor.getName());
        labelBlood.setText("Blood Group         : " + donor.getBloodGroup());
        labelDonateTo.setText("Donate Blood To  : " + donor.CheckRecipient());
        labelWeight.setText("Weight                  : " + String.valueOf(donor.getWeight()));
        
        //Get health status and anonymity:
        if(radHealthyYes.isSelected()){
            donor.setHealthStatus(1);
            labelEligibility.setText("Eligibility             : " + donor.checkEligibility());
        }else if(radHealthyNo.isSelected()){
            donor.setHealthStatus(2);
            labelEligibility.setText("Eligibility             : You are sick, sorry you can't donate right now.");
        }else if(radPvtYes.isSelected()){
            donor.setAnonymity(1);
        }else if(radPvtNo.isSelected()){
            donor.setAnonymity(2);
        }
        
        
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        addDonateBlood frmAddDB = new addDonateBlood();
//        frmAddDB.show();//display frame
//        dispose();
//        
        setVisible(false);
        new addDonateBlood().setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do You Really Want To Close This Interface?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new menu().setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DonateBlood().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonateBlood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JLabel BloodGLbl;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JLabel WeightLbl;
    private javax.swing.JLabel WeightLbl1;
    private javax.swing.JLabel WeightLbl2;
    private javax.swing.JLabel WeightLbl3;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnVerify;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cmbBloodGroup;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelBlood;
    private javax.swing.JLabel labelDonateTo;
    private javax.swing.JLabel labelDonor;
    private javax.swing.JLabel labelEligibility;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JRadioButton radHealthyNo;
    private javax.swing.JRadioButton radHealthyYes;
    private javax.swing.JRadioButton radPvtNo;
    private javax.swing.JRadioButton radPvtYes;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeek;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
