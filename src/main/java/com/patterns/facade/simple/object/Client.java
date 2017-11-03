package com.patterns.facade.simple.object;

import com.patterns.facade.simple.facade.CarFacade;
import com.patterns.facade.simple.parts.Door;
import com.patterns.facade.simple.parts.Ignition;
import com.patterns.facade.simple.parts.Wheel;

public class Client {

    public static void main(String[] args) {
        Door door = new Door();
        door.open();

        Ignition ignition = new Ignition();
        ignition.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
