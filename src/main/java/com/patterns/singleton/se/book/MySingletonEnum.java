package com.patterns.singleton.se.book;

public enum MySingletonEnum {

    INSTANCE;

    public void doSomethingInteresting(){}
}

class GettingSingleton{

    MySingletonEnum mse = MySingletonEnum.INSTANCE;

}