package com.patterns.singleton.ejb.elementary;

public class MySingleton2 {

    private final static MySingleton2 instanse = new MySingleton2();

    private MySingleton2(){}

    public static MySingleton2 getInstanse(){
        return instanse;
    }
}
