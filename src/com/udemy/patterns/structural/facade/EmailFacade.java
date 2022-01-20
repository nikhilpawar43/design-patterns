package com.udemy.patterns.structural.facade;

public class EmailFacade {
    
    public boolean sendEmail(Order order) {
        Mailer emailMailer = Mailer.getMailer();
        Stationary emailStationary = Stationary.getInstance();

        Email email = Email.getBuilder()
                .withMailer(emailMailer)
                .withStationary(emailStationary)
                .withOrder(order)
                .build();

        MailExchange exchange = new MailExchange();
        return exchange.send(email);
    }
}
