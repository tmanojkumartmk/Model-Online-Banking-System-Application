package org.example;

import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
    private javax.swing.JButton LoginBack;
    private javax.swing.JTextField accountNo;
    private javax.swing.JLabel lAccountNoLogin;
    private javax.swing.JLabel lPasswordLogin;
    private javax.swing.JButton login;
    private javax.swing.JTextField loginPassword;
    private javax.swing.JLabel loginTitle;
    public LoginPage() {
        initComponents();
    }
    private void initComponents() {

        lAccountNoLogin = new javax.swing.JLabel();
        lPasswordLogin = new javax.swing.JLabel();
        accountNo = new javax.swing.JTextField();
        loginPassword = new javax.swing.JTextField();
        loginTitle = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        LoginBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMK  Bank");
        setResizable(false);

        lAccountNoLogin.setFont(new java.awt.Font("Serif", 0, 20)); 
        lAccountNoLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lAccountNoLogin.setText("Account NO");
        lAccountNoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lPasswordLogin.setFont(new java.awt.Font("Serif", 0, 20)); 
        lPasswordLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPasswordLogin.setText("Password");

        accountNo.setFont(new java.awt.Font("Serif", 0, 14)); 

        loginPassword.setFont(new java.awt.Font("Serif", 0, 14));

        loginTitle.setFont(new java.awt.Font("Sylfaen", 1, 30));
        loginTitle.setForeground(new java.awt.Color(50, 105, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("Login");

        login.setBackground(new java.awt.Color(42, 125, 0));
        login.setFont(new java.awt.Font("SimSun", 0, 16)); 
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed();
            }
        });

        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LoginBack.setBackground(new java.awt.Color(10, 50, 235));
        LoginBack.setFont(new java.awt.Font("SimSun", 0, 16));
        LoginBack.setForeground(new java.awt.Color(255, 255, 255));
        LoginBack.setText("Back");
        LoginBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbackActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoginBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAccountNoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAccountNoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }
    private void loginActionPerformed(){
        String AccountNo=accountNo.getText();
        String Password=loginPassword.getText();
        readData readData=new readData();
        int validate=readData.readLoginData(AccountNo, Password);
        if(validate==-1){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            String[]displayUserData=readData.readFile().get(validate);
            UserPage userPage=new UserPage(displayUserData);
            userPage.setVisible(true);
            setVisible(false);
        }
    }
    private void loginbackActionPerformed(java.awt.event.ActionEvent evt){
        WelcomePage welcomePage=new WelcomePage();
        welcomePage.setVisible(true);
        setVisible(false);
    }
}
