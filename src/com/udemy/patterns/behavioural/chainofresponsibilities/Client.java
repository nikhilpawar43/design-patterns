package com.udemy.patterns.behavioural.chainofresponsibilities;

import com.udemy.patterns.behavioural.chainofresponsibilities.LeaveApplication.Type;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        
        LeaveApplication leave = LeaveApplication.getBuilder()
                                    .withFrom(LocalDate.of(2022, 1, 24))
                                    .withTo(LocalDate.of(2022, 1, 25))
                                    .withType(Type.SICK)
                                    .build();

        System.out.println(leave);
        
        Employee approverChain = createApproverChain();
        approverChain.approveLeaveRequest(leave);

        System.out.println("*******************");
        System.out.println(leave);

    }
    
    private static Employee createApproverChain() {
        return new ProjectLead("Project Lead", new Manager("Manager", new Director("Director", null)));
    }
}
