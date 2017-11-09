package com.patterns.strategy.se.course.strategy;

public interface AuthStrategy {

    boolean checkLogin(String name, String password);
}
