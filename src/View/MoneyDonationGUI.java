/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.BloodDonation;
import Model.MoneyDonation;
import Model.StaticUser;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pkm_pondoksalam
 */
public class MoneyDonationGUI extends javax.swing.JFrame {

    /**
     * Creates new form MoneyDonation
     */
    public MoneyDonationGUI() {
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

        MoneyDonation = new javax.swing.JPanel();
        MoneyDonationLabel = new javax.swing.JLabel();
        InfoDescriptionLabel2 = new javax.swing.JLabel();
        AccountInfo2 = new javax.swing.JLabel();
        AccountOwnerTF = new javax.swing.JTextField();
        AccountNumberTF = new javax.swing.JTextField();
        AccountBankTF = new javax.swing.JTextField();
        DestinationBankTF = new javax.swing.JTextField();
        SubmitBtn2 = new javax.swing.JButton();
        BackBtn2 = new javax.swing.JButton();
        SlogLabel4 = new javax.swing.JLabel();
        AccountNumberLabel = new javax.swing.JLabel();
        AccountOwnerLabel = new javax.swing.JLabel();
        AccountBankLabel = new javax.swing.JLabel();
        DestinationBankLabel = new javax.swing.JLabel();
        InstComboBox = new javax.swing.JComboBox();
        DestinationBankLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MoneyDonation.setBackground(new java.awt.Color(0, 102, 102));
        MoneyDonation.setForeground(new java.awt.Color(240, 240, 240));

        MoneyDonationLabel.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        MoneyDonationLabel.setForeground(new java.awt.Color(240, 240, 240));
        MoneyDonationLabel.setText("Money DONATION");

        InfoDescriptionLabel2.setForeground(new java.awt.Color(240, 240, 240));
        InfoDescriptionLabel2.setText("Fill the account based on account used in Donation Process.");

        AccountInfo2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        AccountInfo2.setForeground(new java.awt.Color(240, 240, 240));
        AccountInfo2.setText("Account Information");

        AccountNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNumberTFActionPerformed(evt);
            }
        });

        AccountBankTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountBankTFActionPerformed(evt);
            }
        });

        SubmitBtn2.setFont(new java.awt.Font("Felix Titling", 0, 13)); // NOI18N
        SubmitBtn2.setText("Submit");
        SubmitBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtn2ActionPerformed(evt);
            }
        });

        BackBtn2.setFont(new java.awt.Font("Felix Titling", 0, 13)); // NOI18N
        BackBtn2.setText("Back");
        BackBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SlogLabel4.setForeground(new java.awt.Color(240, 240, 240));
        SlogLabel4.setText("Transfer anytime, anywhere, everywhere.");

        AccountNumberLabel.setForeground(new java.awt.Color(240, 240, 240));
        AccountNumberLabel.setText("Account Number");

        AccountOwnerLabel.setForeground(new java.awt.Color(240, 240, 240));
        AccountOwnerLabel.setText("Account Owner");

        AccountBankLabel.setForeground(new java.awt.Color(240, 240, 240));
        AccountBankLabel.setText("Bank Name");

        DestinationBankLabel.setForeground(new java.awt.Color(240, 240, 240));
        DestinationBankLabel.setText("Destination Bank");

        InstComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstComboBoxActionPerformed(evt);
            }
        });

        DestinationBankLabel1.setForeground(new java.awt.Color(240, 240, 240));
        DestinationBankLabel1.setText("Selected  Institution");

        javax.swing.GroupLayout MoneyDonationLayout = new javax.swing.GroupLayout(MoneyDonation);
        MoneyDonation.setLayout(MoneyDonationLayout);
        MoneyDonationLayout.setHorizontalGroup(
            MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneyDonationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SlogLabel4)
                    .addComponent(MoneyDonationLabel))
                .addGap(238, 238, 238))
            .addGroup(MoneyDonationLayout.createSequentialGroup()
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoneyDonationLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoDescriptionLabel2)
                            .addComponent(AccountInfo2)))
                    .addGroup(MoneyDonationLayout.createSequentialGroup()
                        .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MoneyDonationLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AccountOwnerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AccountBankLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AccountNumberLabel)
                                    .addComponent(DestinationBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MoneyDonationLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(DestinationBankLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MoneyDonationLayout.createSequentialGroup()
                                .addComponent(SubmitBtn2)
                                .addGap(18, 18, 18)
                                .addComponent(BackBtn2))
                            .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AccountOwnerTF)
                                .addComponent(AccountNumberTF)
                                .addComponent(AccountBankTF)
                                .addComponent(DestinationBankTF, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(InstComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MoneyDonationLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        MoneyDonationLayout.setVerticalGroup(
            MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneyDonationLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(MoneyDonationLabel)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(SlogLabel4)
                .addGap(24, 24, 24)
                .addComponent(AccountInfo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoDescriptionLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountOwnerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountOwnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AccountNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountBankTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountBankLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinationBankTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinationBankLabel))
                .addGap(9, 9, 9)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinationBankLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoneyDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitBtn2)
                    .addComponent(BackBtn2))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MoneyDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MoneyDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtn2ActionPerformed
            try {  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/do-nation","root","");  
            
            PreparedStatement pst1 = conn.prepareStatement("SELECT * from moneyDonation;");
            ResultSet rs1 = pst1.executeQuery();    
            rs1 = pst1.executeQuery("SELECT COUNT(*) FROM moneyDonation;");
            // get the number of rows from the result set
             rs1.next();
            int rowCount = rs1.getInt(1)+301;
            PreparedStatement pst4 = conn.prepareStatement("SELECT * from InNeedInstitution");
            ResultSet rs4 = pst4.executeQuery();    
            String S = InstComboBox.getSelectedItem().toString();
            rs4 = pst4.executeQuery("SELECT InNeedPK FROM InNeedInstitution WHERE InstName ='"+S+"';");
            // get the number of rows from the result set
            rs4.next();
            int InstitutionFK = rs4.getInt(1);

            if ("".equals(getAccountOwnerTF()) || "".equals(getAccountBankTF()) || getAccountNumberTF() == 0 
                    ||  "".equals(getDestinationBankTF()))
            {
                showMessage("Data can not be Empty!","Error", 0); 
            }else{
                MoneyDonation moneyDonation = new MoneyDonation(rowCount,InstitutionFK,StaticUser.getDonorPK(),getAccountOwnerTF(), getAccountBankTF(), getAccountNumberTF(),getDestinationBankTF(), 2018,"");
                PreparedStatement pst = conn.prepareStatement("INSERT INTO MoneyDonation VALUES("+moneyDonation.getDonationPK()+
                                    ","+moneyDonation.getInNeedInstitutionFK()+","+moneyDonation.getDonorFK()+",'"+moneyDonation.getAccountOwner()+"','"
                                    + moneyDonation.getBankName()+"',"+moneyDonation.getAccountNumber()+",'"+moneyDonation.getDestinationBank()+"',"+
                                    +moneyDonation.getDonationDateTime()+",'"+moneyDonation.getDonationPurpose()+"');");
                int rs = pst.executeUpdate();
                if (rs > 0){
                    showMessage("Data Saved Safely!","Success", 0);       
                }else{
                    showMessage("Data Not Saved.","Error", 0);       
                }
            }
            conn.close();
            new GUIMainMenu().setVisible(true);
            this.dispose();
        } catch (Exception e) {  
            showMessage("Data can not be Empty!","Error", 0);        
            new GUIMainMenu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_SubmitBtn2ActionPerformed

    private void AccountBankTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountBankTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountBankTFActionPerformed

    private void AccountNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountNumberTFActionPerformed

    private void InstComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(MoneyDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoneyDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoneyDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoneyDonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyDonationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountBankLabel;
    private javax.swing.JTextField AccountBankTF;
    private javax.swing.JLabel AccountInfo2;
    private javax.swing.JLabel AccountNumberLabel;
    private javax.swing.JTextField AccountNumberTF;
    private javax.swing.JLabel AccountOwnerLabel;
    private javax.swing.JTextField AccountOwnerTF;
    private javax.swing.JButton BackBtn2;
    private javax.swing.JLabel DestinationBankLabel;
    private javax.swing.JLabel DestinationBankLabel1;
    private javax.swing.JTextField DestinationBankTF;
    private javax.swing.JLabel InfoDescriptionLabel2;
    private javax.swing.JComboBox InstComboBox;
    private javax.swing.JPanel MoneyDonation;
    private javax.swing.JLabel MoneyDonationLabel;
    private javax.swing.JLabel SlogLabel4;
    private javax.swing.JButton SubmitBtn2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
  
    private void ButtonHandler(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/do-nation", "root", "");  
            PreparedStatement pst = conn.prepareStatement("SELECT InstName from InNeedInstitution;");
            ResultSet rs = pst.executeQuery();  
            while (rs.next()) {  
                InstComboBox.addItem(rs.getString("InstName"));  
            }
            conn.close();
        } catch (Exception e) {  
            showMessage("Failed to Connect to Database MoneyDonation","Error Connection", 0);   
        } 
        BackBtn2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtn2ActionPerformed(evt);
            }
        });
    }
    private void BackBtn2ActionPerformed(java.awt.event.ActionEvent evt){
        new GUIMainMenu().setVisible(true);
        this.dispose();
    }    
    
    public String getAccountBankTF() {
        return AccountBankTF.getText();
    }
    public void setAccountBankTF(String s) {
        this.AccountBankTF.setText(s);
    }
    public int getAccountNumberTF() {
        return Integer.valueOf(AccountNumberTF.getText());
    }
    public void setAccountNumberTF(String s) {
        this.AccountNumberTF.setText(s);
    }
    public String getAccountOwnerTF() {
        return AccountOwnerTF.getText();
    }
    public void setAccountOwnerTF(String s) {
        this.AccountOwnerTF.setText(s);
    }
    public String getDestinationBankTF() {
        return DestinationBankTF.getText();
    }
    public void setDestinationBankTF(String s) {
        this.DestinationBankTF.setText(s);
    }

    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
}
