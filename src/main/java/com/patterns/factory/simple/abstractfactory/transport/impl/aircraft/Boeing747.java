package com.patterns.factory.simple.abstractfactory.transport.impl.aircraft;

import com.patterns.factory.simple.abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("Boeing747 fly");
    }
}
