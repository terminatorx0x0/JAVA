package QuipoHouse.EmailSenderDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@SpringBootApplication
public class EmailSenderDemoApplication {

	@Autowired
	EmailSenderService senderservice;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderDemoApplication.class, args);
		
	}
    @org.springframework.context.event.EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
    	senderservice.sendEmail("nikki5038061@gmail.com","ByJava", "happy friendship day dude");
    }
    
}
