package com.epam.training.oop.domain;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public abstract class Vehicle implements Movable {
    private final static float LAZINESS = 0.95f;

    private int id;
    private String name;
    private int capacity;
    private int horsePowers;

    Vehicle () {

    }

    protected abstract long calculateDistance(long millis);

    public Vehicle(int id, String name, int capacity, int horsePowers) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.horsePowers = horsePowers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public long moveInTime(long timeMillis) {
        return (long) (calculateDistance(timeMillis) * LAZINESS);
    }
}
