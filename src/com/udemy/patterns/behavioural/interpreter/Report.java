package com.udemy.patterns.behavioural.interpreter;

public class Report {

    private String name;

    // 'NOT ADMIN', 'FINANCE_USER AND ADMIN'
    private String permission;

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
