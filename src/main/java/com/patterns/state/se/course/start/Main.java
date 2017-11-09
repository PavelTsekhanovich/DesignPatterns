package com.patterns.state.se.course.start;

import com.patterns.state.se.course.context.TransformerContext;
import com.patterns.state.se.course.state.FireState;
import com.patterns.state.se.course.state.MoveState;
import com.patterns.state.se.course.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();

    }
}
