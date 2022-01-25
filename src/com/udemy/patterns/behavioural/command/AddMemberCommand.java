package com.udemy.patterns.behavioural.command;

public class AddMemberCommand implements Command {
    
    private String contact;
    private String distributionList;
    private ExternalMailService externalMailService;

    public AddMemberCommand(String contact, String distributionList, ExternalMailService externalMailService) {
        this.contact = contact;
        this.distributionList = distributionList;
        this.externalMailService = externalMailService;
    }

    @Override
    public void execute() {
        this.externalMailService.addMemberToDistributionList(contact, distributionList);
    }
}
