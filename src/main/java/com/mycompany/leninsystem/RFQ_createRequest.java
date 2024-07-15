/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.leninsystem;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import db_connection.db_config;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author predator 300
 */
public class RFQ_createRequest extends javax.swing.JFrame {

    /**
     * Creates new form RFQ_createRequest
     */
    private javax.swing.ButtonGroup stockAvailabilityGroup;
    
    public RFQ_createRequest() {
        initComponents();
        
        stockAvailabilityGroup = new javax.swing.ButtonGroup();
        stockAvailabilityGroup.add(Complete_stock);
        stockAvailabilityGroup.add(Incoplete_stock);
        
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
        header_rfq1 = new panels.header_rfq();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proj_location = new javax.swing.JTextField();
        client_name = new javax.swing.JTextField();
        send_to_email = new javax.swing.JTextField();
        send_req_rfq_btn = new panels.MyButton();
        jLabel6 = new javax.swing.JLabel();
        client_email = new javax.swing.JTextField();
        cancel_btn = new panels.MyButton();
        request_by = new javax.swing.JTextField();
        Client_Information = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contact_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Complete_stock = new javax.swing.JRadioButton();
        Incoplete_stock = new javax.swing.JRadioButton();
        Client_Information1 = new javax.swing.JLabel();
        Client_Information2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        body_login1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Client Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Location:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Requested by:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Send to (email):");

        proj_location.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        proj_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proj_locationActionPerformed(evt);
            }
        });

        client_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        send_to_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        send_req_rfq_btn.setText("SUBMIT");
        send_req_rfq_btn.setBorderColor(new java.awt.Color(0, 0, 255));
        send_req_rfq_btn.setColorClick(new java.awt.Color(66, 66, 184));
        send_req_rfq_btn.setColorOver(new java.awt.Color(159, 159, 250));
        send_req_rfq_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        send_req_rfq_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_req_rfq_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Client Email:");

        client_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cancel_btn.setText("CANCEL");
        cancel_btn.setBorderColor(new java.awt.Color(0, 0, 255));
        cancel_btn.setColorClick(new java.awt.Color(66, 66, 184));
        cancel_btn.setColorOver(new java.awt.Color(159, 159, 250));
        cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        request_by.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Client_Information.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Client_Information.setText("CLIENT INFORMATION");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Contact Number:");

        contact_no.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Stock Availability:");

        Complete_stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Complete_stock.setText("Complete");
        Complete_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Complete_stockActionPerformed(evt);
            }
        });

        Incoplete_stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Incoplete_stock.setText("Incomplete");
        Incoplete_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Incoplete_stockActionPerformed(evt);
            }
        });

        Client_Information1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Client_Information1.setText("EMAIL INFORMATION");

        Client_Information2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Client_Information2.setText("PRODUCT INFORMATION");

        javax.swing.GroupLayout body_login1Layout = new javax.swing.GroupLayout(body_login1);
        body_login1.setLayout(body_login1Layout);
        body_login1Layout.setHorizontalGroup(
            body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_login1Layout.createSequentialGroup()
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(body_login1Layout.createSequentialGroup()
                        .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(send_req_rfq_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(body_login1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(request_by, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(body_login1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(body_login1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(body_login1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(proj_location, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(body_login1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(client_name, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(body_login1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(client_email))
                                        .addGroup(body_login1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(send_to_email))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                                    .addGap(188, 188, 188)
                                    .addComponent(Client_Information1)
                                    .addGap(112, 112, 112))))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(body_login1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header_rfq1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                        .addComponent(Client_Information)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Complete_stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Incoplete_stock)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, body_login1Layout.createSequentialGroup()
                        .addComponent(Client_Information2)
                        .addGap(164, 164, 164))))
        );
        body_login1Layout.setVerticalGroup(
            body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_login1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_rfq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Client_Information)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(client_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(proj_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(client_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Client_Information1)
                .addGap(14, 14, 14)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(request_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(send_to_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Client_Information2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Incoplete_stock)
                    .addComponent(Complete_stock)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(body_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send_req_rfq_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body_login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body_login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Incoplete_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Incoplete_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Incoplete_stockActionPerformed

    private void Complete_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Complete_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Complete_stockActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Request cancelled.");

        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void send_req_rfq_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_req_rfq_btnActionPerformed
        // TODO add your handling code here:
        //        String projectTitle = proj_title.getText();
        String clientName = client_name.getText();
        String projAddress = proj_location.getText();
        String contactNoStr = contact_no.getText();
        String clientEmail = client_email.getText();
        String requestFrom = request_by.getText();
        String sendTo = send_to_email.getText();
        String requestApp = "pending";



        // Validate contact number
        if (!contactNoStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Contact number must be numeric.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Integer contactNo = Integer.parseInt(contactNoStr);
        
        // Get stock availability value
        String stockAvailability;
        if (Complete_stock.isSelected()) {
            stockAvailability = "Available";
        } else if (Incoplete_stock.isSelected()) {
            stockAvailability = "Not Available";
        } else {
            JOptionPane.showMessageDialog(this, "Please select stock availability.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        db_config dbConfig = new db_config();
        dbConfig.insertRequest(clientName, contactNo, projAddress, clientEmail, requestFrom, sendTo, stockAvailability);

        // Clear text fields
        client_name.setText("");
        proj_location.setText("");
        contact_no.setText("");
        client_email.setText("");
        request_by.setText("");
        send_to_email.setText("");
        stockAvailabilityGroup.clearSelection();
    }//GEN-LAST:event_send_req_rfq_btnActionPerformed

    private void proj_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proj_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proj_locationActionPerformed

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
//            java.util.logging.Logger.getLogger(RFQ_createRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RFQ_createRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RFQ_createRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RFQ_createRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RFQ_createRequest().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Client_Information;
    private javax.swing.JLabel Client_Information1;
    private javax.swing.JLabel Client_Information2;
    private javax.swing.JRadioButton Complete_stock;
    private javax.swing.JRadioButton Incoplete_stock;
    private panels.body_login body_login1;
    private panels.MyButton cancel_btn;
    private javax.swing.JTextField client_email;
    private javax.swing.JTextField client_name;
    private javax.swing.JTextField contact_no;
    private panels.header_rfq header_rfq1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField proj_location;
    private javax.swing.JTextField request_by;
    private panels.MyButton send_req_rfq_btn;
    private javax.swing.JTextField send_to_email;
    // End of variables declaration//GEN-END:variables
}
