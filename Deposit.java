package org.example;

import javax.swing.JOptionPane;

public class Deposit extends javax.swing.JFrame {
    private javax.swing.JButton demoTransectionId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lTransectionId;
    private javax.swing.JLabel labelDeposit;
    private javax.swing.JButton pay;
    private javax.swing.JTextField transectionId;
    private String accountNo;
    private String password;
    public Deposit(String accountNo,String password) {
        this.accountNo=accountNo;
        this.password=password;
        initComponents();
    }
    private void initComponents() {
        pay = new javax.swing.JButton();
        transectionId = new javax.swing.JTextField();
        lTransectionId = new javax.swing.JLabel();
        labelDeposit = new javax.swing.JLabel();
        demoTransectionId= new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMK Bank");
        setResizable(false);

        pay.setBackground(new java.awt.Color(42, 125, 0));
        pay.setFont(new java.awt.Font("SimSun", 0, 16));
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        lTransectionId.setFont(new java.awt.Font("Rockwell", 0, 16)); 
        lTransectionId.setText("Enter the Transection ID");

        labelDeposit.setBackground(new java.awt.Color(255, 255, 255));
        labelDeposit.setFont(new java.awt.Font("Serif", 0, 35));
        labelDeposit.setForeground(new java.awt.Color(22, 155, 0));
        labelDeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeposit.setText("Deposit");

        demoTransectionId.setBackground(new java.awt.Color(42, 125, 0));
        demoTransectionId.setFont(new java.awt.Font("SimSun", 0, 12));
        demoTransectionId.setForeground(new java.awt.Color(255, 255, 255));
        demoTransectionId.setText("Demo Transection Id");
        demoTransectionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoTransectionIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));
        jLabel1.setForeground(new java.awt.Color(101, 15, 20));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deposit Amount on Nearby ATM to your Account ,After Enter the Deposit Transection ID here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(labelDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lTransectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(demoTransectionId)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTransectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demoTransectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        pack();
    }

    private void demoTransectionIdActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Enter the TRANSID + (Enter Deposit Amount) EX : TRANSID1000");
    }

    private void payActionPerformed(java.awt.event.ActionEvent evt) {
        String TransectionId=transectionId.getText();
        if(TransectionId.length()>0){
            String stringAmount="";
            String transId="";
            for(int i=0;i<TransectionId.length();i++){
                boolean digit=Character.isDigit(TransectionId.charAt(i));
                if(digit){
                    stringAmount+=TransectionId.charAt(i);
                }
                else{
                    transId+=TransectionId.charAt(i);
                } 
            }
            int amount=Integer.parseInt(stringAmount);
            if(transId.equals("TRANSID")){
                if(0<amount){
                    readData readData=new readData();
                    int validate=readData.readLoginData(accountNo, password);
                    if(validate<=-1){
                        JOptionPane.showMessageDialog(null,"Invalid Data1");
                    }
                    else{
                        WriteData writeData=new WriteData();
                        writeData.writeAmount(amount,validate);
                        String[]displayUserData=readData.readFile().get(validate);
                        UserPage userPage=new UserPage(displayUserData);
                        userPage.setVisible(true);
                        setVisible(false);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Transection Id");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter Transection Id");
            
        }
    }
}
