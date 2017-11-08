package com.patterns.factory.se.book.abstractfactory.transport.impl.aircraft;

import com.patterns.factory.se.book.abstractfactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU134 fly");
    }
}
