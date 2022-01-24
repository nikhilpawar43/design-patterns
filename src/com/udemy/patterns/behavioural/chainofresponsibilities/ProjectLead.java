package com.udemy.patterns.behavioural.chainofresponsibilities;

import com.udemy.patterns.behavioural.chainofresponsibilities.LeaveApplication.Type;

public class ProjectLead extends Employee {
    
    public ProjectLead(String role, LeaveApprover nextProcessor) {
        super(role, nextProcessor);
    }

    @Override
    public boolean canApproveLeaveRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == Type.SICK && leaveApplication.getNumberOfDaysOut() <= 2) {
            return true;
        }
        return false;
    }
}
