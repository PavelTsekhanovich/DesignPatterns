package com.patterns.decorator.simple.objects;

public class Button implements Component{

    @Override
    public void draw() {
        System.out.println("draw button");
    }
}
