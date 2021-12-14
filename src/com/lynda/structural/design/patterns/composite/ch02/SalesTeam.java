package com.lynda.structural.design.patterns.composite.ch02;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    
    private List<Payee> payees = new ArrayList<>();
    
    public void addPayee(Payee payee) {
        payees.add(payee);
    }
    
    public void payExpense(int amount) {
        payees.forEach(payee -> payee.payExpense(amount));
    }
}
