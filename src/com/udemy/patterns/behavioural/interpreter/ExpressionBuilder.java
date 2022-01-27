package com.udemy.patterns.behavioural.interpreter;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Stack;
import java.util.StringTokenizer;

public class ExpressionBuilder {

    private Stack<String> operators = new Stack<>();
    private Stack<PermissionExpression> permissions = new Stack<>();

    public PermissionExpression build(Report report) {
        parse(report.getPermission());
        buildExpressions();

        return permissions.pop();
    }

    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission);
        while (tokenizer.hasMoreTokens()) {
            String token = null;
            switch ((token = tokenizer.nextToken())) {
                case "and":
                case "or":
                case "not":
                    operators.push(token);
                    break;
                default:
                    permissions.push(new Permission(token));
            }
        }
    }

    private void buildExpressions() {
        while (!operators.isEmpty()) {
            String operator = operators.pop();

            PermissionExpression perm1;
            PermissionExpression perm2;
            PermissionExpression expression;

            switch (operator) {
                case "not":
                    perm1 = permissions.pop();
                    expression = new NotExpression(perm1);
                    break;

                case "and":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    expression = new AndExpression(perm1, perm2);
                    break;

                case "or":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    expression = new OrExpression(perm1, perm2);
                    break;

                default:
                    throw new IllegalArgumentException("Unknown operator: " + operator);
            }

            permissions.push(expression);
        }
    }
}
