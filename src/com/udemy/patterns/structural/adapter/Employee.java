package com.udemy.patterns.structural.adapter;

public class Employee {

    private String fullName;
    private String jobTitle;
    private String officeLocationAddress;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocationAddress() {
        return officeLocationAddress;
    }

    public void setOfficeLocationAddress(String officeLocationAddress) {
        this.officeLocationAddress = officeLocationAddress;
    }
}
