package com.patterns.facade.ee;

import javax.ejb.Stateless;

@Stateless
public class LoanService {

    public boolean checkCreditRating(long id, double amount){
        return true;
    }
}
