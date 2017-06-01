package com.epam.training.oop.services.impl;

import com.epam.training.oop.domain.Plain;
import com.epam.training.oop.domain.Vehicle;
import com.epam.training.oop.services.IPlainService;

import java.util.List;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public class PlainService extends AbstractVehicleService<Plain> implements IPlainService {

    public List<Plain> getBySeries(String seriesName) {return  null;}

    @Override
    public List<Vehicle> list() {
        return super.list();
    }
}
