package com.patterns.facade.simple.facade;

import com.patterns.facade.simple.parts.Door;
import com.patterns.facade.simple.parts.Ignition;
import com.patterns.facade.simple.parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Ignition zazhiganie = new Ignition();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
