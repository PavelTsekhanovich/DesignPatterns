package com.patterns.decorator.se.course.objects;

public class TextView implements Component{

    @Override
    public void draw() {
        System.out.println("Text view draw.");
    }
}
