package com.javarush.task.task15.task1529;

public class Plane implements Flyable {
    private int count;

    Plane (int count) {
        this.count = count;
    }

    @Override
    public void fly() {}
}
