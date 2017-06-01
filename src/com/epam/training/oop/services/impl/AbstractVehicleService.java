package com.epam.training.oop.services.impl;

import com.epam.training.oop.domain.Vehicle;
import com.epam.training.oop.services.IVehicleService;

import java.util.List;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public abstract class AbstractVehicleService<T extends Vehicle> implements IVehicleService<Vehicle> {
    @Override
    public List<Vehicle> list() {
        return null;
    }
}
