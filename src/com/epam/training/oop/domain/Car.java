package com.epam.training.oop.domain;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public class Car extends Vehicle {
    private static final int SPEED = 60;
    private String color;

    public Car(int id, String name, int capacity, int horsePowers, String color) {
        super(id, name, capacity, horsePowers);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected long calculateDistance(long millis) {
        return SPEED * millis;
    }
}
