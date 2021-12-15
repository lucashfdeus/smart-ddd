package ${package}.application.ports;


import ${package}.application.domain.Email;


public interface SendEmailServicePort {
    void sendEmailSmtp(Email email);

}
