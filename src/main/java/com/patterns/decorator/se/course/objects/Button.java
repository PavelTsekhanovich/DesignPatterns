package com.patterns.decorator.se.course.objects;

public class Button implements Component{

    @Override
    public void draw() {
        System.out.println("draw button");
    }
}
