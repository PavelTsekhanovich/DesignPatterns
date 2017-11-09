package com.patterns.state.se.course.state;

public class FireState implements TransformerState {

    @Override
    public void action() {
        System.out.println("Fire!!!");
    }
}
