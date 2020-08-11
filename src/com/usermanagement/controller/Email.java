package com.usermanagement.controller;


import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 


public class Email 
{ 

public static void main(String [] args) 
{	 
	// email ID of Recipient. 
	String recipient = args[2]; 

	// email ID of Sender. 
	String sender = "userrepositorysystem2020@gmail.com"; 

	// using host as localhost 
	String host = "smtp.gmail.com"; 

	// Getting system properties 
	Properties properties = System.getProperties(); 

	// Setting up mail server 
	
	properties.setProperty("mail.smtp.host", host);
    properties.setProperty("mail.smtp.port", "465");
    properties.setProperty("mail.smtp.ssl.enable", "true");
    properties.setProperty("mail.smtp.auth", "true");
    
    Authenticator auth = new javax.mail.Authenticator() {
    	
        protected PasswordAuthentication getPasswordAuthentication() {

            return new PasswordAuthentication("userrepositorysystem2020@gmail.com", "OnePlace");

        }

    };

	// creating session object to get properties 
	Session session = Session.getDefaultInstance(properties,auth); 

	try
	{ 
		// MimeMessage object. 
		MimeMessage message = new MimeMessage(session); 

		// Set From Field: adding senders email to from field. 
		message.setFrom(new InternetAddress(sender)); 

		// Set To Field: adding recipient's email to from field. 
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 

		// Set Subject: subject of the email 
		message.setSubject("Welcome to URS"); 

		// set body of the email. 
		
		String link = "http://localhost:8085/URS/ChangePwdParam?firstname= "+ args[0]+"&lastname="+args[1]+"&uniqueid="+args[3]+"&upwd="+args[4];
        String html = " user name is:" + args[5] + " <br><p> user unique id: "+args[3]+"</p><br><p>user password:"+args[4]+"</p><br> <a href= '"+link+"'>"+link+"</a></h5>";
        message.setContent(html, "text/html");

        System.out.println("sending...");

		// Send email. 
		Transport.send(message); 
		System.out.println("Mail successfully sent"); 
	} 
	catch (MessagingException mex) 
	{ 
		mex.printStackTrace(); 
	} 
} 
} 
