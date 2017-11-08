package com.patterns.facade.se.course.facade;

import com.patterns.facade.se.course.parts.Door;
import com.patterns.facade.se.course.parts.Ignition;
import com.patterns.facade.se.course.parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Ignition ignition = new Ignition();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        ignition.fire();
        wheel.turn();
    }
}
