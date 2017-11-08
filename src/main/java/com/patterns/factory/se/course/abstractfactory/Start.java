package com.patterns.factory.se.course.abstractfactory;

import com.patterns.factory.se.course.abstractfactory.factory.impl.RussianFactory;
import com.patterns.factory.se.course.abstractfactory.factory.impl.USAFactory;
import com.patterns.factory.se.course.abstractfactory.factory.interfaces.TransportFactory;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {

        if (true) {
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }

        factory.createAircraft();
        factory.createCar();

    }
}
