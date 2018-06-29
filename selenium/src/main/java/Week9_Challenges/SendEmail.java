package Week9_Challenges;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	
	public static void main(String[] args) throws EmailException {
		
	
	send_Email();
	
	
	}

	public static void send_Email() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("krish.ganesh24@gmail.com", "Yamaha@123"));
		email.setSSLOnConnect(true);
		email.setFrom("krish.ganesh24@gmail.com");
		email.setSubject("Test message for selenium testing");
		email.setMsg("This mail for testing Email functionality");
		email.addTo("krish.ganesh82@gmail.com");
		email.send();
		System.out.println("Test Mail Sent");
	}
}
