package com.udemy.patterns.behavioural.chainofresponsibilities;

import com.udemy.patterns.behavioural.chainofresponsibilities.LeaveApplication.Status;

import java.util.Objects;

public abstract class Employee implements LeaveApprover {
    
    private LeaveApprover nextProcessor;
    private String role;

    public Employee(String role, LeaveApprover nextProcessor) {
        this.role = role;
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void approveLeaveRequest(LeaveApplication leaveApplication) {
        if (canApproveLeaveRequest(leaveApplication)) {
            leaveApplication.setStatus(Status.APPROVED);
            leaveApplication.setApprovedBy(getRole());
            System.out.println("The leave request has been approved.");
        } else if (Objects.nonNull(this.nextProcessor)) {
            this.nextProcessor.approveLeaveRequest(leaveApplication);
        }
    }
    
    protected abstract boolean canApproveLeaveRequest(LeaveApplication leaveApplication);

    public String getRole() {
        return role;
    }
}
