package com.patterns.di.se;

public class UserServiceFactory {

    public UserService getInstance(){
        return new UserService(new UserDataRepositoryImpl());
    }
}
