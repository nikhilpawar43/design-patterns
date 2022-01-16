package com.udemy.patterns.structural.adapter;

public class Client {

    public static void main(String[] args) {

        Employee employee = new Employee();
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        populateEmailDetails(employeeClassAdapter);

        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        String cardDesign = cardDesigner.designCard(employeeClassAdapter);
        System.out.println(cardDesign);

    }

    private static void populateEmailDetails(Employee employee) {
        employee.setFullName("Nikhil Pawar");
        employee.setJobTitle("Software developer");
        employee.setOfficeLocationAddress("Pune Camp");
    }
}
