package org.example;

public class WelcomePage extends javax.swing.JFrame {
    private javax.swing.JButton login;
    private javax.swing.JButton register;
    private javax.swing.JLabel tmkBank;
    public WelcomePage() {
        initComponents();
    }
    private void initComponents() {

        tmkBank = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMK Bank");
        setResizable(false);

        tmkBank.setFont(new java.awt.Font("Algerian", 1, 45)); 
        tmkBank.setForeground(new java.awt.Color(203, 0, 0));
        tmkBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tmkBank.setText("TMK Bank");
        tmkBank.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tmkBank.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        register.setBackground(new java.awt.Color(42, 125, 0));
        register.setFont(new java.awt.Font("SimSun", 1, 16)); 
        register.setForeground(new java.awt.Color(255, 235, 200));
        register.setText("Create Account");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(42, 125, 0));
        login.setFont(new java.awt.Font("SimSun", 1, 16)); 
        login.setForeground(new java.awt.Color(255, 235, 200));
        login.setText("Account Login");
        login.setName(""); 
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tmkBank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tmkBank, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterPage registerPage=new RegisterPage();
        registerPage.setVisible(true);
        setVisible(false);
    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        LoginPage loginPage=new LoginPage();
        loginPage.setVisible(true);
        setVisible(false);
    }
}
