package com.patterns.di.ejb.ee;

import com.patterns.di.ejb.User;
import com.patterns.di.ejb.UserDataRepository;

import javax.inject.Inject;
import javax.inject.Named;

public class UserService {

    @Inject
    @Named("UserDataRepositoryMongo")
    private UserDataRepository udr;

    public void persistUser(User user){
        udr.save(user);
    }
}
