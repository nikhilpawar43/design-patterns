package com.udemy.patterns.structural.adapter;

// Class/Two way adapter
public class EmployeeClassAdapter extends Employee implements Consumer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocationAddress();
    }
}
