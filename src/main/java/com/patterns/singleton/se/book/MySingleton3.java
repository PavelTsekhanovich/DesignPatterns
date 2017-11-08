package com.patterns.singleton.se.book;

public class MySingleton3 {

    private static MySingleton3 instance = null;

    static {
        instance = new MySingleton3();
    }

    private MySingleton3(){}

    public static MySingleton3 getInstance(){
        return instance;
    }
}
