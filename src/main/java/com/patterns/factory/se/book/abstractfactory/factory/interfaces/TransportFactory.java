package com.patterns.factory.se.book.abstractfactory.factory.interfaces;

import com.patterns.factory.se.book.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.factory.se.book.abstractfactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();

}
