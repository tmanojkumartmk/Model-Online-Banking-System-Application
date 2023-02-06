package org.example;

import javax.swing.JOptionPane;

public class RegisterPage extends javax.swing.JFrame {
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JPasswordField confrimPassword;
    private javax.swing.JTextField emailId;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lAge;
    private javax.swing.JLabel lConfrimPassword;
    private javax.swing.JLabel lEmailId;
    private javax.swing.JLabel lFullName;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lPhoneNo;
    private javax.swing.JLabel logintitle;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JButton register;
    private javax.swing.JButton registerBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private String[]displayUserData;
    public RegisterPage() {
        initComponents();
    }
    private void initComponents() {

        lFullName = new javax.swing.JLabel();
        lAge = new javax.swing.JLabel();
        lEmailId = new javax.swing.JLabel();
        lPhoneNo = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        lConfrimPassword = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        emailId = new javax.swing.JTextField();
        phoneNo = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confrimPassword = new javax.swing.JPasswordField();
        address = new javax.swing.JTextField();
        logintitle = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        registerBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMK Bank");
        setResizable(false);

        lFullName.setFont(new java.awt.Font("Serif", 0, 16)); 
        lFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lFullName.setText("Full Name");

        lAge.setFont(new java.awt.Font("Serif", 0, 16)); 
        lAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lAge.setText("Age");

        lEmailId.setFont(new java.awt.Font("Serif", 0, 16));
        lEmailId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lEmailId.setText("Email ID");

        lPhoneNo.setFont(new java.awt.Font("Serif", 0, 16)); 
        lPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPhoneNo.setText("Phone NO");

        lAddress.setFont(new java.awt.Font("Serif", 0, 16)); 
        lAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lAddress.setText("Address");

        lPassword.setFont(new java.awt.Font("Serif", 0, 16)); 
        lPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPassword.setText("Password");

        lConfrimPassword.setFont(new java.awt.Font("Serif", 0, 16)); 
        lConfrimPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lConfrimPassword.setText("Confrim Password");

        fullName.setFont(new java.awt.Font("Serif", 0, 14));

        age.setFont(new java.awt.Font("Serif", 0, 14)); 

        emailId.setFont(new java.awt.Font("Serif", 0, 14)); 
        phoneNo.setFont(new java.awt.Font("Serif", 0, 14)); 

        password.setFont(new java.awt.Font("Serif", 0, 14)); 

        confrimPassword.setFont(new java.awt.Font("Serif", 0, 14)); 

        address.setFont(new java.awt.Font("Serif", 0, 14)); 

        logintitle.setFont(new java.awt.Font("SimSun", 1, 35)); 
        logintitle.setForeground(new java.awt.Color(42, 125, 0));
        logintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logintitle.setText("Register");

        register.setBackground(new java.awt.Color(42, 125, 0));
        register.setFont(new java.awt.Font("SimSun", 0, 20));
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        registerBack.setBackground(new java.awt.Color(10, 50, 235));
        registerBack.setFont(new java.awt.Font("SimSun", 0, 20)); 
        registerBack.setForeground(new java.awt.Color(255, 255, 255));
        registerBack.setText("Back");
        registerBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logintitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(192, 192, 192)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lConfrimPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(registerBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(76, 76, 76)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confrimPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confrimPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lConfrimPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {
        String FullName=fullName.getText();
        String Age=age.getText();
        String Address=emailId.getText();
        String PhoneNo=phoneNo.getText();
        String EmailId=address.getText();
        String Password=password.getText();
        String ConfrimPassword=confrimPassword.getText();
        if((FullName.isEmpty()!=true)&&(Age.isEmpty()!=true)&&(EmailId.isEmpty()!=true)&&(PhoneNo.isEmpty()!=true)&&(Address.isEmpty()!=true)&&(Password.isEmpty()!=true)&&(ConfrimPassword.isEmpty()!=true)){
            if((FullName.length()>1)&&(Age.length()>0)&&(Character.isDigit(Age.charAt(0)))&&(Character.isDigit(Age.charAt(0)))){
                if(Integer.parseInt(Age)>=18){
                    boolean emailIdChecker=false;
                    for(int i=0;i<EmailId.length();i++){
                        char symbol=EmailId.charAt(i);
                        if(symbol=='@'){
                            
                            emailIdChecker=true;
                        }
                    }
                    if(PhoneNo.length()==10){
                        if((emailIdChecker)){
                            if((Password.length()>=8)&&(16>=Password.length())){
                                if(Password.equals(ConfrimPassword)){
                                    register(FullName, Age, EmailId, PhoneNo, Address, Password);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Password and Confrim Password are Not Match");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Password Must be in Minimum 8 character and Maximum 16 character");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Invalid Email");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid PhoneNo");
                    }    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Not Eligible");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter Correct Name and Age ");
            }
        }
    else{
        JOptionPane.showMessageDialog(null,"Enter the Data");
    }
}
    private void register(String FullName, String Age, String EmailId, String PhoneNo, String Address, String Password) {
        String AccountNo=new readData().accountNo();
        WriteData writeData=new WriteData();
        writeData.userData(FullName, Age, EmailId, PhoneNo, Address, Password,AccountNo);
        readData readData=new readData();
        int validate=readData.readLoginData(AccountNo, Password);
        if(validate==-1){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            displayUserData=readData.readFile().get(validate);
            lFullName.setVisible(false);
            lAge.setVisible(false);
            lEmailId.setVisible(false);
            lPhoneNo.setVisible(false);
            lAddress.setVisible(false);
            lPassword.setVisible(false);
            lConfrimPassword.setVisible(false);
            fullName.setVisible(false);
            age.setVisible(false);
            emailId.setVisible(false);
            phoneNo.setVisible(false);
            password.setVisible(false);
            confrimPassword.setVisible(false);
            address.setVisible(false);
            logintitle.setVisible(false);
            register.setVisible(false);
            registerBack.setVisible(false);
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); 
            jLabel1.setForeground(new java.awt.Color(42, 125, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Registered Successfully");

            jLabel2.setBackground(new java.awt.Color(42, 125, 0));
            jLabel2.setFont(new java.awt.Font(" Old Standard TT", 1, 40));
            jLabel2.setForeground(new java.awt.Color(0, 5, 105));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(AccountNo);
            //jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 0, 105), 2));
            jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

            jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 30)); 
            jLabel3.setForeground(new java.awt.Color(102, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("your Account No");

            jButton1.setBackground(new java.awt.Color(42, 125, 0));
            jButton1.setFont(new java.awt.Font("SimSun", 0, 16)); 
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("Continue");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(150, 150, 150))
                .addGroup(layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(88, 88, 88))
            );

            pack();
            setVisible(true);
            }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        UserPage userPage=new UserPage(displayUserData);
        userPage.setVisible(true);
        setVisible(false);
    }

    private void registerBackActionPerformed(java.awt.event.ActionEvent evt){
        WelcomePage welcomePage=new WelcomePage();
        welcomePage.setVisible(true);
        setVisible(false);
    }
}
