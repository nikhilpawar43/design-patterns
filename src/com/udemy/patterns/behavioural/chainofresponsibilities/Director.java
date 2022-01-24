package com.udemy.patterns.behavioural.chainofresponsibilities;

import com.udemy.patterns.behavioural.chainofresponsibilities.LeaveApplication.Type;

public class Director extends Employee {
    public Director(String role, LeaveApprover nextProcessor) {
        super(role, nextProcessor);
    }

    @Override
    public boolean canApproveLeaveRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == Type.LOP) {
            return true;
        }
        return false;
    }
}
