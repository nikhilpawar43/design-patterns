package com.lynda.structural.design.patterns.composite.ch02;

public class SalesClient {

    public static void main(String[] args) {
        
        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob", jane);
        SalesPerson joe = new SalesPerson("Joe", jane);
        
        SalesTeam salesTeam = new SalesTeam();
        salesTeam.addPayee(jane);
        salesTeam.addPayee(bob);
        salesTeam.addPayee(joe);

        payPayee(jane, 300);
        payPayee(bob, 100);
        payPayee(salesTeam, 200);
    }

    private static void payPayee(Payee payee, int amount) {
        System.out.println("Payment request initiated");
        payee.payExpense(amount);
        System.out.println("Payment has been made\n");
    }

}
