package ${package}.adapters.outbound.smtp;

import ${package}.application.domain.Email;
import ${package}.application.ports.SendEmailServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SmtpSendEmailService implements SendEmailServicePort {

    @Autowired
    JavaMailSender emailSender;

    @Override
    public void sendEmailSmtp(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email.getEmailFrom());
        message.setTo(email.getEmailTo());
        message.setSubject(email.getSubject());
        message.setText(email.getText());
        emailSender.send(message);
    }
}
