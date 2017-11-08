package com.patterns.factory.se.book;

public class CoffeeMachine extends DrinkMashine {

    public Drink dispenseDrink(){
        return new Coffee();
    }
}
