package com.epam.training.oop.domain;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public class Plain extends Vehicle {
    private static final int SPEED = 1000;
    private String seriesName;

    public Plain(int id, String name, int capacity, int horsePowers, String seriesName) {
        super(id, name, capacity, horsePowers);
        this.seriesName = seriesName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    @Override
    protected long calculateDistance(long millis) {
        return SPEED * millis;
    }
}
