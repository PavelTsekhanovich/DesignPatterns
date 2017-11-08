package com.patterns.facade.se.course.object;

import com.patterns.facade.se.course.facade.CarFacade;
import com.patterns.facade.se.course.parts.Door;
import com.patterns.facade.se.course.parts.Ignition;
import com.patterns.facade.se.course.parts.Wheel;

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
