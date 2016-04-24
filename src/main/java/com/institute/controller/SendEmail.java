package com.institute.controller;


import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {

    public void sendtomail(String recipient) {

        final String username = "lakshmananrm18@gmail.com";
        final String password = "laks@1993";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lakshmananrm18@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(recipient));
            message.setSubject("Application Decision:UNC Charlotte");
            message.setText("Dear Student,"
                + "\n\n You have been admitted into UNC Charlotte Please log into Application portal for further Instructions");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


    public void sendtomailreject(String recipient) {

        final String username = "lakshmananrm18@gmail.com";
        final String password = "laks@1993";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lakshmananrm18@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(recipient));
            message.setSubject("Application Decision:UNC Charlotte");
            message.setText("Dear Student,"
                + "\n\n We are sorry to Inform you that you have not been admitted into UNC Charlotte.We wish you luck for your future");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
