package com.tpddl.bts.utils;


import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public interface Mailer {
	
	public static boolean sendMail() {
		ResourceBundle rb = ResourceBundle.getBundle(CommonConstants.CONFIG_NAME);
		
		final String username = rb.getString("gmailid");
        final String password = rb.getString("password");

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("amit.shashi.srivastava@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("amit.shashi.srivastava@gmail.com"
                    		+ ", amit.shashi.srivastava@gmail.com")
            );
            message.setSubject("File Uploaded SuccessFully");
            message.setText("XLS File Upload done");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
        return true;
	}

}
