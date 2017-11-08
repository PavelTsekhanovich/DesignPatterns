package com.patterns.di.se;

import com.patterns.di.User;
import com.patterns.di.UserDataRepository;

public class UserService {

    private UserDataRepository udr;

    UserService(UserDataRepository udr){
        this.udr = udr;
    }

    public void persistUser(User user){
        udr.save(user);
    }
}
