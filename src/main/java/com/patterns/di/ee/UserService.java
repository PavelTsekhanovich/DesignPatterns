package com.patterns.di.ee;

import com.patterns.di.User;
import com.patterns.di.UserDataRepository;

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
