package com.patterns.factory.se.course.abstractfactory.factory.impl;

import com.patterns.factory.se.course.abstractfactory.factory.interfaces.TransportFactory;
import com.patterns.factory.se.course.abstractfactory.transport.impl.aircraft.TU134;
import com.patterns.factory.se.course.abstractfactory.transport.impl.car.Niva;
import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
