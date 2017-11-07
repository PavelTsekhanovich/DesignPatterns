package com.patterns.factory.simple.abstractfactory.transport.impl.car;

import com.patterns.factory.simple.abstractfactory.transport.interfaces.Car;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Porsche drive");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stop");
    }
}
