package com.patterns.factory.se.book.normal;

public class CarSelector {

    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case LAWN:
                car = new NewGeep();
                break;
        }

        return car;
    }
}
