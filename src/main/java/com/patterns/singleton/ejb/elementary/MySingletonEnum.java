package com.patterns.singleton.ejb.elementary;

public enum MySingletonEnum {

    INSTANCE;

    public void doSomethingInteresting(){}
}

class GettingSingleton{

    MySingletonEnum mse = MySingletonEnum.INSTANCE;

}