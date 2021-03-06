package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(int hour) {
        return hour >= 6 && hour <= 20;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}