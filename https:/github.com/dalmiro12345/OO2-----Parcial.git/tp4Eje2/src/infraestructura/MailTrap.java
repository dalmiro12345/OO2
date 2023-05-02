package infraestructura;

import java.util.Properties;

import domain.portsout.Notificacion;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailTrap implements Notificacion {

	private String username;
	private String password;
	private String host;
	private String from;

	public MailTrap(String username, String password, String host, String from) {
		super();
		this.username = username;
		this.password = password;
		this.host = host;
		this.from = from;
	}

	@Override
	public void enviarNotificaciones(String msg, String asunto, String email) {
		// TODO Auto-generated method stub
		String to = email;
		// provide sender's email ID

		// configure Mailtrap's SMTP server details
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		// create the Session object
		Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			// create a MimeMessage object
			Message message = new MimeMessage(session);
			// set From email field
			message.setFrom(new InternetAddress(from));
			// set To email field
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			// set email subject field
			message.setSubject(asunto);
			// set the content of the email message
			message.setText(msg);
			// send the email message
			Transport.send(message);
			// System.out.println("Email Message Sent Successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}
