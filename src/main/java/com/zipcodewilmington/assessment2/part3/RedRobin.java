package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public int getSpeed() {
        return 2;
    }
}
