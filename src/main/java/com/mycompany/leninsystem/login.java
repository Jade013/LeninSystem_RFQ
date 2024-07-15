/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.leninsystem;
import javax.swing.JPanel;
import db_connection.db_config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author predator 300
 */
public class login extends javax.swing.JFrame {

    private db_config dbConfig;
    private MongoDatabase database;
    /**
     * Creates new form login
     */
    public login() {
        dbConfig = new db_config();
        database = dbConfig.getDatabase();
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

        body_login1 = new panels.body_login();
        header_login1 = new panels.header_login();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        login_btn = new panels.MyButton();
        signup_btn = new panels.MyButton();
        login_pwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body_login1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Username: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password: ");

        login_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_usernameActionPerformed(evt);
            }
        });

        login_btn.setText("LOGIN");
        login_btn.setBorderColor(new java.awt.Color(0, 0, 255));
        login_btn.setColorClick(new java.awt.Color(66, 66, 184));
        login_btn.setColorOver(new java.awt.Color(159, 159, 250));
        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        signup_btn.setText("SIGN UP");
        signup_btn.setBorderColor(new java.awt.Color(0, 0, 255));
        signup_btn.setColorClick(new java.awt.Color(66, 66, 184));
        signup_btn.setColorOver(new java.awt.Color(159, 159, 250));
        signup_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        login_pwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_pwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout body_login1Layout = new javax.swing.GroupLayout(body_login1);
        body_login1.setLayout(body_login1Layout);
        body_login1Layout.setHorizontalGroup(
            body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_login1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(body_login1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)))
                .addGap(15, 15, 15)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(body_login1Layout.createSequentialGroup()
                        .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(login_username)
                    .addComponent(login_pwd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(body_login1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_login1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        body_login1Layout.setVerticalGroup(
            body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_login1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_login1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(login_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body_login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body_login1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        String username = login_username.getText();
        String password = login_pwd.getText();

    
        // Validate login credentials
        if (validateLogin(username, password)) {
            // If credentials are valid, proceed to the next page
            select_dsb dsb = new select_dsb();
            dsb.setVisible(true);
            dispose();  // Close the current login window
        } else {
            // If credentials are invalid, show an error message
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_signup_btnActionPerformed

    private void login_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_usernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_login_usernameActionPerformed

    private void login_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_pwdActionPerformed

    private boolean validateLogin(String username, String password) {
//        boolean isValid = false;
//        Connection connection = null;
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            connection = db_config.getConnection();
//            String sql = "SELECT * FROM users WHERE username = ? AND pwd = ?";
//            statement = connection.prepareStatement(sql);
//            statement.setString(1, username);
//            statement.setString(2, password);
//            resultSet = statement.executeQuery();
//
//            if (resultSet.next()) {
//                isValid = true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (resultSet != null) resultSet.close();
//                if (statement != null) statement.close();
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return isValid;

        MongoCollection<Document> collection = database.getCollection("Users");
        Bson filter = Filters.and(Filters.eq("username", username), Filters.eq("pwd", password));
        Document user = collection.find(filter).first();
        return user != null;
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panels.body_login body_login1;
    private panels.header_login header_login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private panels.MyButton login_btn;
    private javax.swing.JPasswordField login_pwd;
    private javax.swing.JTextField login_username;
    private panels.MyButton signup_btn;
    // End of variables declaration//GEN-END:variables
}
