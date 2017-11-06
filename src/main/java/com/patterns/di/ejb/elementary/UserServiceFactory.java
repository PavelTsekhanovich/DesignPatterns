package com.patterns.di.ejb.elementary;

public class UserServiceFactory {

    public UserService getInstance(){
        return new UserService(new UserDataRepositoryImpl());
    }
}
