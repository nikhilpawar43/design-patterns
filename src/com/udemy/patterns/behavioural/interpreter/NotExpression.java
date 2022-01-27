package com.udemy.patterns.behavioural.interpreter;

public class NotExpression implements PermissionExpression {

    private PermissionExpression permissionExpression;

    public NotExpression(PermissionExpression permissionExpression) {
        this.permissionExpression = permissionExpression;
    }

    @Override
    public boolean interpret(User user) {
        return !permissionExpression.interpret(user);
    }

    @Override
    public String toString() {
        return " NOT " + permissionExpression;
    }
}
