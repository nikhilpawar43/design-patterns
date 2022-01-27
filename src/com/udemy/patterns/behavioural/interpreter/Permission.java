package com.udemy.patterns.behavioural.interpreter;

// Terminal operation
public class Permission implements PermissionExpression {

    private String permission;

    public Permission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(this.permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
