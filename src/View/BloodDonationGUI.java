/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.BloodDonation;
import Model.StaticUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author pkm_pondoksalam
 */
public class BloodDonationGUI extends javax.swing.JFrame {

    /**
     * Creates new form BloodDonation
     */
    public BloodDonationGUI() {
        initComponents();
        ButtonHandler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BloodDonation = new javax.swing.JPanel();
        BloodDonationLabel = new javax.swing.JLabel();
        InfoDescriptionLabel = new javax.swing.JLabel();
        AccountInfoLabel = new javax.swing.JLabel();
        BodyWeightTF = new javax.swing.JTextField();
        HeightTF = new javax.swing.JTextField();
        AgeTF = new javax.swing.JTextField();
        CrewAmountTF = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        SlogLabel1 = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        BodyWeightLabel = new javax.swing.JLabel();
        HeightLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        SmokingCondLabel = new javax.swing.JLabel();
        CrewAmountLabel = new javax.swing.JLabel();
        SelectedHospitalLabel = new javax.swing.JLabel();
        HospitalCB = new javax.swing.JComboBox();
        SmokeYesRDB = new javax.swing.JRadioButton();
        SmokeNoRDB = new javax.swing.JRadioButton();
        MaleRDB = new javax.swing.JRadioButton();
        FemaleRDB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        InstComboBox = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BloodDonation.setBackground(new java.awt.Color(0, 102, 102));
        BloodDonation.setForeground(new java.awt.Color(240, 240, 240));

        BloodDonationLabel.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        BloodDonationLabel.setForeground(new java.awt.Color(240, 240, 240));
        BloodDonationLabel.setText("BLOOD DONATION");

        InfoDescriptionLabel.setForeground(new java.awt.Color(240, 240, 240));
        InfoDescriptionLabel.setText("Fill the account based on account used in Donation Process.");

        AccountInfoLabel.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        AccountInfoLabel.setForeground(new java.awt.Color(240, 240, 240));
        AccountInfoLabel.setText("Account Information");

        HeightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightTFActionPerformed(evt);
            }
        });

        AgeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTFActionPerformed(evt);
            }
        });

        SubmitBtn.setFont(new java.awt.Font("Felix Titling", 0, 13)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Felix Titling", 0, 13)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SlogLabel1.setForeground(new java.awt.Color(240, 240, 240));
        SlogLabel1.setText("Transfer anytime, anywhere, everywhere.");

        GenderLabel.setForeground(new java.awt.Color(240, 240, 240));
        GenderLabel.setText("Gender");

        BodyWeightLabel.setForeground(new java.awt.Color(240, 240, 240));
        BodyWeightLabel.setText("Body Weight");

        HeightLabel.setForeground(new java.awt.Color(240, 240, 240));
        HeightLabel.setText("Height");

        AgeLabel.setForeground(new java.awt.Color(240, 240, 240));
        AgeLabel.setText("Age");

        SmokingCondLabel.setForeground(new java.awt.Color(240, 240, 240));
        SmokingCondLabel.setText("Smoking Condition");

        CrewAmountLabel.setForeground(new java.awt.Color(240, 240, 240));
        CrewAmountLabel.setText("Crew Amount");

        SelectedHospitalLabel.setForeground(new java.awt.Color(240, 240, 240));
        SelectedHospitalLabel.setText("Selected Hospital");

        SmokeYesRDB.setForeground(new java.awt.Color(240, 240, 240));
        SmokeYesRDB.setText("Yes");

        SmokeNoRDB.setForeground(new java.awt.Color(240, 240, 240));
        SmokeNoRDB.setText("No");

        MaleRDB.setForeground(new java.awt.Color(240, 240, 240));
        MaleRDB.setText("Male");

        FemaleRDB.setForeground(new java.awt.Color(240, 240, 240));
        FemaleRDB.setText("Female");

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Selected Institution");

        javax.swing.GroupLayout BloodDonationLayout = new javax.swing.GroupLayout(BloodDonation);
        BloodDonation.setLayout(BloodDonationLayout);
        BloodDonationLayout.setHorizontalGroup(
            BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodDonationLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BloodDonationLayout.createSequentialGroup()
                        .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoDescriptionLabel)
                            .addComponent(AccountInfoLabel)
                            .addGroup(BloodDonationLayout.createSequentialGroup()
                                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SmokingCondLabel)
                                    .addComponent(BodyWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BloodDonationLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(BloodDonationLayout.createSequentialGroup()
                                                .addComponent(MaleRDB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FemaleRDB))
                                            .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BodyWeightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                                .addComponent(HeightTF)
                                                .addComponent(AgeTF))))
                                    .addGroup(BloodDonationLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(SmokeYesRDB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SmokeNoRDB))))
                            .addGroup(BloodDonationLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(InstComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BloodDonationLayout.createSequentialGroup()
                                .addComponent(CrewAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BloodDonationLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(SubmitBtn)
                                        .addGap(36, 36, 36)
                                        .addComponent(BackBtn))
                                    .addGroup(BloodDonationLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CrewAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BloodDonationLayout.createSequentialGroup()
                        .addComponent(SelectedHospitalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HospitalCB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BloodDonationLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(BloodDonationLabel)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(BloodDonationLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BloodDonationLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(SlogLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BloodDonationLayout.setVerticalGroup(
            BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BloodDonationLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(BloodDonationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SlogLabel1)
                .addGap(17, 17, 17)
                .addComponent(AccountInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BodyWeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BodyWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GenderLabel)
                    .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MaleRDB)
                        .addComponent(FemaleRDB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SmokingCondLabel)
                    .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SmokeYesRDB)
                        .addComponent(SmokeNoRDB)))
                .addGap(18, 18, 18)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectedHospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrewAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrewAmountLabel))
                .addGap(18, 18, 18)
                .addGroup(BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn)
                    .addComponent(BackBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BloodDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BloodDonation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightTFActionPerformed

    private void AgeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTFActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/do-nation","root",""); 
            
            PreparedStatement pst1 = conn.prepareStatement("SELECT * from bloodDonation;");
            
            ResultSet rs1 = pst1.executeQuery();    
             rs1 = pst1.executeQuery("SELECT COUNT(*) FROM bloodDonation;");
             // get the number of rows from the result set
             rs1.next();
            int rowCount = rs1.getInt(1)+101;
   
            PreparedStatement pst2 = conn.prepareStatement("SELECT * from InNeedInstitution");
            ResultSet rs2 = pst2.executeQuery();    
            String S = InstComboBox.getSelectedItem().toString();
            rs2 = pst2.executeQuery("SELECT InNeedPK FROM InNeedInstitution WHERE InstName ='"+S+"';");
            // get the number of rows from the result set
            rs2.next();
            int InstitutionFK = rs2.getInt(1);
            PreparedStatement pst3 = conn.prepareStatement("SELECT * from Hospital_Technician");
            ResultSet rs3 = pst3.executeQuery();    
            String P = HospitalCB.getSelectedItem().toString();
            rs3 = pst3.executeQuery("SELECT HospitalTechPK FROM Hospital_Technician WHERE HospitalName ='"+P+"';");
            // get the number of rows from the result set
            rs3.next();
            int HostecFK = rs2.getInt(1);
            
            
            BloodDonation bloodDonation = new BloodDonation(rowCount,InstitutionFK,StaticUser.getDonorPK(),HostecFK,getBodyWeightTF(), getJK(), getHeightTF(),
                                          getAgeTF(), getSmokinCond(), 2018, "");
            
            if ("".equals(getAgeTF()) || "".equals(getBodyWeightTF()) || "".equals(getHeightTF()) 
               ||  "".equals(getCrewAmountTF()))
            {
                showMessage("Data can not be Empty!","Error", 0); 
            }else{
                PreparedStatement pst = conn.prepareStatement("INSERT INTO BloodDonation VALUES("+bloodDonation.getDonationPK()+
                                        ","+bloodDonation.getInNeedInstitutionFK()+","+bloodDonation.getDonorFK()+","+bloodDonation.getHospitalTechFK()+","
                                        + bloodDonation.getBodyWeight()+",'"+bloodDonation.getGender()+"',"+bloodDonation.getHeight()+","+ bloodDonation.getAge()+",'"+
                                        bloodDonation.BloodAcceptance()+"',"+bloodDonation.getDonationDateTime()+",'"+bloodDonation.getDonationPurpose()+"');");
                
                int rs = pst.executeUpdate();
                if (rs > 0){
                     showMessage("Data Added Safely!","Success", 0);       
                }else{
                     showMessage("Data Not Added.","Error", 0);       
                }
            }
            conn.close();
            new GUIMainMenu().setVisible(true);
            this.dispose();
        } catch (Exception e) {  
            showMessage("Failed to Connect to Database Hospital","Error Connection", 0);        
            new GUIMainMenu().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_SubmitBtnActionPerformed
    
      private void ButtonHandler(){
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getInstPKComboBox();
        getHosTecPKComboBox();
    }
    
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt){
        new GUIMainMenu().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(BloodDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodDonationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountInfoLabel;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTF;
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel BloodDonation;
    private javax.swing.JLabel BloodDonationLabel;
    private javax.swing.JLabel BodyWeightLabel;
    private javax.swing.JTextField BodyWeightTF;
    private javax.swing.JLabel CrewAmountLabel;
    private javax.swing.JTextField CrewAmountTF;
    private javax.swing.JRadioButton FemaleRDB;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JTextField HeightTF;
    private javax.swing.JComboBox HospitalCB;
    private javax.swing.JLabel InfoDescriptionLabel;
    private javax.swing.JComboBox InstComboBox;
    private javax.swing.JRadioButton MaleRDB;
    private javax.swing.JLabel SelectedHospitalLabel;
    private javax.swing.JLabel SlogLabel1;
    private javax.swing.JRadioButton SmokeNoRDB;
    private javax.swing.JRadioButton SmokeYesRDB;
    private javax.swing.JLabel SmokingCondLabel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
 


    public void setAgeTF(int AgeTF) {
        this.AgeTF.setText(String.valueOf(AgeTF));
    }  
    public void setBodyWeightTF(double BodyWeightTF) {
        this.BodyWeightTF.setText(String.valueOf(BodyWeightTF));
    }
    public void setCrewAmountTF(int CrewAmountTF) {
        this.CrewAmountTF.setText(String.valueOf(CrewAmountTF));
    }
    public void setHeightTF(double HeightTF) {
        this.HeightTF.setText(String.valueOf(HeightTF));
    }
    public void setJK(String x){
        if (x == "L"){
            MaleRDB.setSelected(true);
            FemaleRDB.setSelected(false);
        }else{
            MaleRDB.setSelected(false);
            FemaleRDB.setSelected(true);
        }
    }
    public void setSmokinCond(String x){
        if (x == "yes"){
            SmokeYesRDB.setSelected(true);
            SmokeNoRDB.setSelected(false);
        }else{
            SmokeYesRDB.setSelected(false);
            SmokeNoRDB.setSelected(true);
        }
    }
    
    public int getAgeTF() {
        return Integer.valueOf(AgeTF.getText());
    }
    public double getBodyWeightTF() {
        return Double.valueOf(BodyWeightTF.getText());
    }
    public int getCrewAmountTF() {
        return Integer.valueOf(CrewAmountTF.getText());
    }
    public double getHeightTF() {
        return Double.valueOf(HeightTF.getText());
    }
    public String getJK(){
        if (MaleRDB.isSelected()) return "L";
        else return "P";
    }
    public boolean getSmokinCond(){
        return SmokeYesRDB.isSelected();
    }
    public String getComboBoxInst(){
        String Inst =  InstComboBox.getSelectedItem().toString();
        return Inst;
    }
    public String getComboBoxHosTec(){
        String Hospital =  HospitalCB.getSelectedItem().toString();
        return Hospital;
    }
        
    public void getInstPKComboBox(){
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/do-nation","root","");  
            PreparedStatement pst = conn.prepareStatement("SELECT InstName from InNeedInstitution");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {  
                InstComboBox.addItem(rs.getString("InstName"));  
            }
            conn.close();
        } catch (Exception e) {  
            showMessage("Failed to Connect to Database Institution","Error Connection", 0);  
            
    }  
 }
    public void getHosTecPKComboBox(){
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/do-nation","root","");  
            PreparedStatement pst = conn.prepareStatement("SELECT HospitalName from hospital_technician");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {  
                HospitalCB.addItem(rs.getString("HospitalName"));  
            }
            conn.close();
    } catch (Exception e) {  
        showMessage("Failed to Connect to Database Hospital","Error Connection", 0);  
          
    }  
 }
            
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    
    
    public void reset(){
        setAgeTF(0);
        setBodyWeightTF(0);
    //    cbJurusan.setSelectedIndex(0);
    }

    }
    