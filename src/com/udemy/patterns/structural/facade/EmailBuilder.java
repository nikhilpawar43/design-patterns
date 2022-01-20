package com.udemy.patterns.structural.facade;

public class EmailBuilder {
    
    public EmailBuilder withMailer(Mailer emailMailer) {
        return this;
    }

    public EmailBuilder withStationary(Stationary emailStationary) {
        return this;
    }

    public EmailBuilder withOrder(Order order) {
        return this;
    }
    
    public Email build() {
        return new Email();
    }
}
