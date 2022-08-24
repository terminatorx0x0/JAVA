package QuipoHouse.EmailSenderDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailsender;
	
	public void sendEmail(String toEmail,String subject,String body) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("singhterminator3@gmail.com");
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);
		mailsender.send(message);
		
		System.out.println("Mail Sent Successfully..!!");
	}
}
