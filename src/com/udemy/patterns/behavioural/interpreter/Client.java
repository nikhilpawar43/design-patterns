package com.udemy.patterns.behavioural.interpreter;

public class Client {

    public static void main(String[] args) {

        Report report = new Report("Cashflow report", "FINANCE_USER OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();
        PermissionExpression expression = builder.build(report);

        System.out.println(expression);

        User user = new User("Dave", "USER", "ADMIN");
        System.out.println("User has access to report: " + expression.interpret(user));
    }
}
