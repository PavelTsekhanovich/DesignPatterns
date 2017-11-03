package com.patterns.facade.ejb.ee;

import javax.ejb.Stateless;

@Stateless
public class AccountService {

    public boolean getLoan(double amount) {
        return true;
    }

    public boolean setCustomerBalance(long id, double amount) {
        return true;
    }
}
