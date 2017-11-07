package com.patterns.factory.simple.abstractfactory.factory.interfaces;

import com.patterns.factory.simple.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.factory.simple.abstractfactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();

}
