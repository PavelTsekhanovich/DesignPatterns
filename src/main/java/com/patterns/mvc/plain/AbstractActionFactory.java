package com.patterns.mvc.plain;

public class AbstractActionFactory {

    private final static ActionFactory instance = new ActionFactory();

    public static ActionFactory getInstance() {
        return instance;
    }
}

