package org.example;

import javax.swing.JOptionPane;

public class UserPage extends javax.swing.JFrame {
    private javax.swing.JButton accountsetting;
    private javax.swing.JButton checkBalance;
    private javax.swing.JLabel displayAccountNo;
    private javax.swing.JLabel displayEmailId;
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel displayPhoneNo;
    private javax.swing.JButton logout;
    private javax.swing.JButton moneyTransfer;
    private javax.swing.JButton passBook;
    private javax.swing.JLabel tmkBankProfilePage;
    String[] displayData;
    public UserPage(String[] displayData) {
        this.displayData=displayData;
        initComponents();
    }
    private void initComponents() {

        displayName = new javax.swing.JLabel();
        displayAccountNo = new javax.swing.JLabel();
        displayEmailId = new javax.swing.JLabel();
        displayPhoneNo = new javax.swing.JLabel();
        checkBalance = new javax.swing.JButton();
        moneyTransfer = new javax.swing.JButton();
        accountsetting = new javax.swing.JButton();
        passBook = new javax.swing.JButton();
        tmkBankProfilePage = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMK Bank");
        setResizable(false);

        displayName.setFont(new java.awt.Font("Serif", 1, 20)); 
        displayName.setText(displayData[0]);

        displayAccountNo.setFont(new java.awt.Font("Serif", 1, 16)); 
        displayAccountNo.setText(displayData[6]);

        displayEmailId.setFont(new java.awt.Font("Serif", 1, 16)); 
        displayEmailId.setText(displayData[2]);

        displayPhoneNo.setFont(new java.awt.Font("Serif", 1, 16)); 
        displayPhoneNo.setText(displayData[3]);

        checkBalance.setBackground(new java.awt.Color(42, 125, 0));
        checkBalance.setFont(new java.awt.Font("SimSun", 0, 16)); 
        checkBalance.setForeground(new java.awt.Color(255, 255, 255));
        checkBalance.setText("Check Balance");
        checkBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalanceActionPerformed(evt);
            }
        });

        moneyTransfer.setBackground(new java.awt.Color(42, 125, 0));
        moneyTransfer.setFont(new java.awt.Font("SimSun", 0, 16)); 
        moneyTransfer.setForeground(new java.awt.Color(255, 255, 255));
        moneyTransfer.setText("Money Transfer");

        accountsetting.setBackground(new java.awt.Color(42, 125, 0));
        accountsetting.setFont(new java.awt.Font("SimSun", 0, 16)); 
        accountsetting.setForeground(new java.awt.Color(255, 255, 255));
        accountsetting.setText("Setting");

        passBook.setBackground(new java.awt.Color(42, 125, 0));
        passBook.setFont(new java.awt.Font("SimSun", 0, 16)); 
        passBook.setForeground(new java.awt.Color(255, 255, 255));
        passBook.setText("Deposit");
        passBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBookActionPerformed(evt);
            }
        });

        tmkBankProfilePage.setFont(new java.awt.Font("Algerian", 1, 45)); 
        tmkBankProfilePage.setForeground(new java.awt.Color(203, 0, 0));
        tmkBankProfilePage.setText("    TMK Bank");

        logout.setBackground(new java.awt.Color(42, 125, 0));
        logout.setFont(new java.awt.Font("SimSun", 0, 16)); 
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(moneyTransfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accountsetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(tmkBankProfilePage, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(tmkBankProfilePage, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(displayPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(accountsetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }

    private void checkBalanceActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Account Balance  "+displayData[7]);
    }

    private void passBookActionPerformed(java.awt.event.ActionEvent evt) {
        Deposit deposit=new Deposit(displayData[6],displayData[5]);
        deposit.setVisible(true);
        setVisible(false);
        
    }
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
        WelcomePage welcomePage=new WelcomePage();
        welcomePage.setVisible(true);
        setVisible(false);
    }
    private void depositActionPerformed(java.awt.event.ActionEvent evt){
        System.out.println("userp"+ABORT);
    }

}
