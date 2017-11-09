package com.patterns.state.se.course.state;

public class MoveState implements TransformerState {

    @Override
    public void action() {
        System.out.println("Move!!!");
    }
}
