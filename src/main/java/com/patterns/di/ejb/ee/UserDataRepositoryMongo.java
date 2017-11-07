package com.patterns.di.ejb.ee;

import com.patterns.di.ejb.User;
import com.patterns.di.ejb.UserDataRepository;

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
