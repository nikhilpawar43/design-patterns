package com.udemy.patterns.behavioural.chainofresponsibilities;

import com.udemy.patterns.behavioural.chainofresponsibilities.LeaveApplication.Type;

public class Manager extends Employee {
    public Manager(String role, LeaveApprover nextProcessor) {
        super(role, nextProcessor);
    }

    @Override
    public boolean canApproveLeaveRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == Type.PATERNITY || leaveApplication.getType() == Type.SICK) {
            return true;
        }
        return false;
    }
}
