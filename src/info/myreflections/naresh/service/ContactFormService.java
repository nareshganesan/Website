package info.myreflections.naresh.service;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ContactFormService implements BusinessService {

	public static final String USERNAME = "nareshkumarganesan";
	public static final String PASSWORD = "gremarch";
	public static final String mailTo = "nareshkumarganesan@gmail.com";
	
	@Override
	public HashMap executeService(HashMap requestData) throws Exception {
		// TODO Auto-generated method stub
		HashMap responseData = new HashMap();
		String fromEmail = requestData.get("fromEmail").toString();
		String subject = requestData.get("subject").toString();
		String messgae = requestData.get("message").toString();
		sendMail(fromEmail, mailTo, subject,messgae);
		responseData.put("resultPage", "success");
		return responseData;
	}
	
	private static void sendMail(String mailFrom, String mailTo, String mailSubject,
			String mailText) throws Exception {

		Properties config = createConfiguration();

		//
		// Creates a mail session. We need to supply username and
		// password for Gmail authentication.
		//
		Session session = Session.getInstance(config, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(USERNAME,
						PASSWORD);
			}
		});

		//
		// Creates email message
		//
		Message message = new MimeMessage(session);
		message.setSentDate(new Date());
		message.setFrom(new InternetAddress(mailFrom));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(
				mailTo));
		message.setSubject(mailSubject);
		message.setText(mailText);

		//
		// Send a message
		//
		Transport.send(message);
	}

	private static Properties createConfiguration() {
		return new Properties() {
			{
				put("mail.smtp.auth", "true");
				put("mail.smtp.host", "smtp.gmail.com");
				put("mail.smtp.port", "587");
				put("mail.smtp.starttls.enable", "true");
			}
		};
	}

}
