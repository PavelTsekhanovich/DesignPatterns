package com.patterns.di.ejb.elementary;

import com.patterns.di.ejb.User;
import com.patterns.di.ejb.UserDataRepository;

public class UserService {

    private UserDataRepository udr;

    UserService(UserDataRepository udr){
        this.udr = udr;
    }

    public void persistUser(User user){
        udr.save(user);
    }
}
