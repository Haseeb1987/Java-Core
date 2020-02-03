import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;


public class Email {
	public static void main (String... args){
		String to = "darkingdistance@yahoo.com";
		String from = "darkingditance@gmail.com";
		String host = "localhost";
		
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		Session session = Session.getDefaultInstance(properties);
		
		try {
			MimeMessage message = new MimeMessage (session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Send from Code");
			message.setText("This email is send from Java Code !!! So be happy on this and Enjoy !!!");
			
			Transport.send(message);
			
		}catch(MessagingException e){
			e.printStackTrace();
		}
		
	}
}
