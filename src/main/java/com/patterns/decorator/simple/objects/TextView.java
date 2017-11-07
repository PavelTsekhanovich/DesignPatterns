package com.patterns.decorator.simple.objects;

public class TextView implements Component{

    @Override
    public void draw() {
        System.out.println("Text view draw.");
    }
}
