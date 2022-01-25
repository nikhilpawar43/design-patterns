package com.udemy.patterns.behavioural.command;

public class ExternalMailService {
    
    public void addMemberToDistributionList(String contact, String distributionList) {
        System.out.println("Added member: " + contact + " to DL: " + distributionList);
    }

    public void removeMemberToDistributionList(String contact, String distributionList) {
        System.out.println("Removed member: " + contact + " from DL: " + distributionList);
    }
}
