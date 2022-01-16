package com.udemy.patterns.structural.adapter;

public class EmployeeObjectAdapter implements Consumer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return this.adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.adaptee.getOfficeLocationAddress();
    }
}
