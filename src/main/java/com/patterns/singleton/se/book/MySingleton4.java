package com.patterns.singleton.se.book;

public class MySingleton4 {

    private volatile MySingleton4 instance;

    private MySingleton4(){}

    public MySingleton4 getInstance(){
        if (instance == null){
            synchronized (MySingleton4.class){
                if (instance == null){
                    instance = new MySingleton4();
                }
            }
        }
        return instance;
    }

}
