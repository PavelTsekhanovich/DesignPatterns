package com.patterns.decorator.simple.objects;

public class Window implements Component {

    @Override
    public void draw() {
        System.out.println("Draw window.");
    }
}
