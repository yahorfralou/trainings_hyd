package com.epam.training.oop.services;

import com.epam.training.oop.domain.Plain;

import java.util.List;

/**
 * Created by Yahor_Fralou on 6/1/2017.
 */
public interface IPlainService {
    List<Plain> getBySeries(String seriesName);
}
