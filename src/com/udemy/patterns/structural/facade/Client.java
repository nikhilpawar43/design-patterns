package com.udemy.patterns.structural.facade;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        
        Order order = new Order("Soulful soaps", 10L, new BigDecimal(200));

        //boolean status = sendEmailOrderWithoutFacade(order);
        EmailFacade emailFacade = new EmailFacade();
        boolean status = emailFacade.sendEmail(order);

        System.out.println("Email send status: " + status);
    }

    /*private static boolean sendEmailOrderWithoutFacade(Order order) {
        Mailer emailMailer = Mailer.getMailer();
        Stationary emailStationary = Stationary.getInstance();

        Email email = Email.getBuilder()
                            .withMailer(emailMailer)
                            .withStationary(emailStationary)
                            .withOrder(order)
                            .build();
        
        MailExchange exchange = new MailExchange();
        return exchange.send(email);
    }*/
}
