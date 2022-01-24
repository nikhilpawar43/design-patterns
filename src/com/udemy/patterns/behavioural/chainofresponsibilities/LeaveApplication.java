package com.udemy.patterns.behavioural.chainofresponsibilities;

import java.time.LocalDate;

public class LeaveApplication {
    
    public enum Type { SICK, PATERNITY, LOP }
    
    public enum Status { PENDING, APPROVED, REJECTED }
    
    private LocalDate from;
    
    private LocalDate to;
    
    private Type type;
    
    private Status status;
    
    private String approvedBy;

    public LeaveApplication(LocalDate from, LocalDate to, Type type, Status status, String approvedBy) {
        this.from = from;
        this.to = to;
        this.type = type;
        this.status = status;
        this.approvedBy = approvedBy;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }
    
    public int getNumberOfDaysOut() {
        LocalDate localDate = to.minusDays(from.toEpochDay());
        return localDate.getDayOfMonth();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
    
    public static LeaveApplicationBuilder getBuilder() {
        return new LeaveApplicationBuilder();
    }

    @Override
    public String toString() {
        return "LeaveApplication{" + "from=" + from + ", to=" + to + ", type=" + type + ", status=" + status + ", approvedBy='" + approvedBy + '\'' + '}';
    }

    public static class LeaveApplicationBuilder {
        
        private LocalDate from;

        private LocalDate to;

        private Type type;

        private Status status;

        private String approvedBy;

        public LeaveApplicationBuilder withFrom(LocalDate from) {
            this.from = from;
            return this;
        }

        public LeaveApplicationBuilder withTo(LocalDate to) {
            this.to = to;
            return this;
        }

        public LeaveApplicationBuilder withType(Type type) {
            this.type = type;
            return this;
        }

        public LeaveApplication build() {
            return new LeaveApplication(from, to, type, Status.PENDING, null);
        }

    }
}
