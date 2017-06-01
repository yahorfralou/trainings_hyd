package com.epam.training.oop.services;

import com.epam.training.oop.domain.Vehicle;

import java.util.List;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public interface IVehicleService<T extends Vehicle> {

    List<T> list();
}
