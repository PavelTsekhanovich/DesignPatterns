package com.patterns.facade.ee;

import javax.ejb.Stateless;

@Stateless
public class CustomerService {

    public long getCustomer(int sessionID){
        return 100005L;
    }

    public boolean checkId(long x){
        return true;
    }
}
