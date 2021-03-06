package com.patterns.singleton.se.book;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton(){}

    public static synchronized MySingleton getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }
}
