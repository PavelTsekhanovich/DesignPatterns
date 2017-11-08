package com.patterns.factory.se.course.abstractfactory.factory.impl;

import com.patterns.factory.se.course.abstractfactory.factory.interfaces.TransportFactory;
import com.patterns.factory.se.course.abstractfactory.transport.impl.aircraft.Boeing747;
import com.patterns.factory.se.course.abstractfactory.transport.impl.car.Porsche;
import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
