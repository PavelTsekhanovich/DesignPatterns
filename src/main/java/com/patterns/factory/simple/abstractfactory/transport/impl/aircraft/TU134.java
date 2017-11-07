package com.patterns.factory.simple.abstractfactory.transport.impl.aircraft;

import com.patterns.factory.simple.abstractfactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU134 fly");
    }
}
