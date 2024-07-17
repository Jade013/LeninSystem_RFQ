/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leninsystem;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author predator 300
 */

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.util.Properties;

public class EmailUtil {
    public static void sendEmail(String toEmail, String fromEmail, String subject, String body, String host, final String username, final String password, File attachment) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        message.setSubject(subject);

        // Create the message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(body);

        // Create a multipart message
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // Part two is attachment
        if (attachment != null) {
            MimeBodyPart attachPart = new MimeBodyPart();
            try {
                attachPart.attachFile(attachment);
            } catch (Exception e) {
                e.printStackTrace();
                throw new MessagingException("Failed to attach file", e);
            }
            multipart.addBodyPart(attachPart);
        }

        // Send the complete message parts
        message.setContent(multipart);

        // Send message
        Transport.send(message);
    }
}



//public class EmailUtil {
////      public static void sendEmail(String to, String from, String subject, String body, String host, String port, String username, String password) throws MessagingException {
////        // Set up the properties for the mail session
////        Properties props = new Properties();
////        props.put("mail.smtp.host", host);
////        props.put("mail.smtp.port", port);
////        props.put("mail.smtp.auth", "true");
////        props.put("mail.smtp.starttls.enable", "true");
////
////        // Get the Session object
////        Session session = Session.getInstance(props, new Authenticator() {
////            protected PasswordAuthentication getPasswordAuthentication() {
////                return new PasswordAuthentication(username, password);
////            }
////        });
////
////        try {
////            // Create a default MimeMessage object
////            Message message = new MimeMessage(session);
////
////            // Set From: header field
////            message.setFrom(new InternetAddress(from));
////
////            // Set To: header field
////            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
////
////            // Set Subject: header field
////            message.setSubject(subject);
////
////            // Set the actual message
////            message.setText(body);
////
////            // Send message
////            Transport.send(message);
////        } catch (MessagingException e) {
////            throw new MessagingException("Error while sending email", e);
////        }
////    }
////     public static void sendEmail(String toAddress, String fromAddress, String subject, String body, String host, String username, String password) throws MessagingException {
////        Properties properties = new Properties();
////        properties.put("mail.smtp.host", host);
////        properties.put("mail.smtp.port", "587");
////        properties.put("mail.smtp.auth", "true");
////        properties.put("mail.smtp.starttls.enable", "true");
////
////        Session session = Session.getInstance(properties, new Authenticator() {
////            @Override
////            protected PasswordAuthentication getPasswordAuthentication() {
////                return new PasswordAuthentication(username, password);
////            }
////        });
////
////        Message message = new MimeMessage(session);
////        message.setFrom(new InternetAddress(fromAddress));
////        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
////        message.setSubject(subject);
////        message.setText(body);
////
////        Transport.send(message);
////    }
////}
//
//    public static void sendEmail(String toEmail, String fromEmail, String subject, String body, String host, final String username, final String password) throws MessagingException {
//        Properties props = new Properties();
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//
//        Session session = Session.getInstance(props, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        });
//
//        Message message = new MimeMessage(session);
//        message.setFrom(new InternetAddress(fromEmail));
//        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//        message.setSubject(subject);
//        message.setText(body);
//
//        Transport.send(message);
//    }
//}