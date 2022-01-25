package com.udemy.patterns.behavioural.command;

public class Client {

    public static void main(String[] args) {
        
        ExternalMailService externalMailService = new ExternalMailService();
        
        Command addMemberCommand1 = new AddMemberCommand("a@a.com", "spam", externalMailService);
        Command addMemberCommand2 = new AddMemberCommand("b@b.com", "spam", externalMailService);
        Command addMemberCommand3 = new AddMemberCommand("c@c.com", "spam", externalMailService);

        MailingTask mailingTask = MailingTask.getInstance();
        
        mailingTask.addCommand(addMemberCommand1);
        mailingTask.addCommand(addMemberCommand2);
        mailingTask.addCommand(addMemberCommand3);
        
        mailingTask.stop();
    }
}
