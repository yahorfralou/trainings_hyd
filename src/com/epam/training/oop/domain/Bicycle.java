package com.epam.training.oop.domain;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public class Bicycle extends Vehicle {
    private static final int SPEED = 10;
    private boolean isTandem;

    public Bicycle(int id, String name, int capacity, int horsePowers, boolean isTandem) {
        super(id, name, capacity, horsePowers);
        this.isTandem = isTandem;
    }

    public boolean isTandem() {
        return isTandem;
    }

    public void setTandem(boolean tandem) {
        isTandem = tandem;
    }

    @Override
    protected long calculateDistance(long millis) {
        return SPEED * millis;
    }
}
