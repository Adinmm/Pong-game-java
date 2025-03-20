package com.loginandsignup;

import com.crud.Crud;
import com.game.Lobby;

public class Login2ndPlayer extends javax.swing.JFrame {

        public Login2ndPlayer() {
                initComponents();
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jButtonLogin = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jTextFieldUsername = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jButtongotosignup = new javax.swing.JButton();
                jPasswordFieldPass = new javax.swing.JPasswordField();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jButtonLogin.setBackground(new java.awt.Color(229, 221, 210));
                jButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButtonLogin.setForeground(new java.awt.Color(80, 61, 66));
                jButtonLogin.setText("Login");
                jButtonLogin.setBorder(null);
                jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonLoginActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(80, 61, 66));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("LOGIN");

                jLabel3.setForeground(new java.awt.Color(80, 61, 66));
                jLabel3.setText("Username");

                jLabel4.setForeground(new java.awt.Color(80, 61, 66));
                jLabel4.setText("Password");

                jLabel6.setForeground(new java.awt.Color(80, 61, 66));
                jLabel6.setText("Don't have an account yet?");

                jButtongotosignup.setBackground(new java.awt.Color(229, 221, 210));
                jButtongotosignup.setForeground(new java.awt.Color(80, 61, 66));
                jButtongotosignup.setText("Sign Up");
                jButtongotosignup.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtongotosignupActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(50, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jTextFieldUsername)
                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                300,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jPasswordFieldPass))
                                                                                                                .addGap(50, 50, 50))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jButtongotosignup))
                                                                                                                                .addComponent(jButtonLogin,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                260,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGap(70, 70, 70)))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldUsername,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordFieldPass,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jButtonLogin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jButtongotosignup))
                                                                .addContainerGap(78, Short.MAX_VALUE)));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 500));

                jLabel1.setIcon(new javax.swing.ImageIcon(
                                "src\\assets\\BG-Login.jpg")); // NOI18N
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButtongotosignupActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtongotosignupActionPerformed
                Sign2ndPlayer signup = new Sign2ndPlayer();
                signup.setVisible(true);
                signup.pack();
                signup.setLocationRelativeTo(null);
                this.dispose();
        }// GEN-LAST:event_jButtongotosignupActionPerformed

        private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLoginActionPerformed
                if (Crud.find2ndPlayer(jTextFieldUsername.getText(), String.valueOf(jPasswordFieldPass.getPassword()))) {
                      Crud.add2ndPlayer(Crud.getName2ndPlayer());
                      Lobby lobby = new Lobby();
                      lobby.setVisible(true);
                      lobby.pack();
                      lobby.setLocationRelativeTo(null);
                        this.dispose();
                }
        }// GEN-LAST:event_jButtonLoginActionPerformed

        private javax.swing.JButton jButtonLogin;
        private javax.swing.JButton jButtongotosignup;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField jPasswordFieldPass;
        private javax.swing.JTextField jTextFieldUsername;
}