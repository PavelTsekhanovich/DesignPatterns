package com.patterns.factory.se.course.abstractfactory.transport.impl.aircraft;

import com.patterns.factory.se.course.abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("Boeing747 fly");
    }
}
