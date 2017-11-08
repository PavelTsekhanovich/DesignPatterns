package com.patterns.factory.se.course.abstractfactory.factory.interfaces;

import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();

}
