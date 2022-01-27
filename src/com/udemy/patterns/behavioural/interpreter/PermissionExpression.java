package com.udemy.patterns.behavioural.interpreter;

public interface PermissionExpression {

    boolean interpret(User user);
}
