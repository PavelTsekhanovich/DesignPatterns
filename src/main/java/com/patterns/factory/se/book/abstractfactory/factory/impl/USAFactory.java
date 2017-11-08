package com.patterns.factory.se.book.abstractfactory.factory.impl;

import com.patterns.factory.se.book.abstractfactory.factory.interfaces.TransportFactory;
import com.patterns.factory.se.book.abstractfactory.transport.impl.aircraft.Boeing747;
import com.patterns.factory.se.book.abstractfactory.transport.impl.car.Porsche;
import com.patterns.factory.se.book.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.factory.se.book.abstractfactory.transport.interfaces.Car;

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
