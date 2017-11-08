package com.patterns.singleton.se.course;

public class TestSingleton {

    private static TestSingleton instance;

    public synchronized static TestSingleton getInstance(){
        if (instance == null){
            instance = new TestSingleton();
        }
        return instance;
    }

    private TestSingleton(){}

    public void print(){
        System.out.println(this);
    }

    public void stop(){
        System.out.println("stop");
    }
}
