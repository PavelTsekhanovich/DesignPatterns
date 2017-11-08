package com.patterns.factory.se.course.abstractfactory.transport.impl.car;

import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Car;

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
