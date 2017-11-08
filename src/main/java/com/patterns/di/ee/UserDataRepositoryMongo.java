package com.patterns.di.ee;

import com.patterns.di.User;
import com.patterns.di.UserDataRepository;

import javax.inject.Named;

@Named("UserDataRepositoryMongo")
public class UserDataRepositoryMongo implements UserDataRepository{

    @Mongo
    private UserDataRepository udr;

    @Override
    @Named
    public void save(User user) {
        //here implementation
    }
}
