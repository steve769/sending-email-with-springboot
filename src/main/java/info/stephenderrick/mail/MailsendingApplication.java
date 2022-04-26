package info.stephenderrick.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class MailsendingApplication {
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(MailsendingApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMailSend() throws MessagingException {
//		emailSenderService.sendSimpleEmail("stephenderrick98@gmail.com",
//				"StartUp Recruitment", "This is my first email ever");

		emailSenderService.sendSimpleMessageWithAttachment("stephenotieno1700@gmail.com",
				"This email has an attachment", "This is the Body of thy email",
				"C:\\Users\\user\\Desktop\\Pix\\stev.jpg");
	}
}
