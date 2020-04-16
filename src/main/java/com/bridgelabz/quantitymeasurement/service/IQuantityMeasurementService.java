package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.dto.ConvertDTO;
import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.enumarator.Unit;

import java.util.List;

public interface IQuantityMeasurementService {
    List<QuantityType> quantityType();

    List<Unit> unitType(QuantityType type);

    double convertValue(ConvertDTO convertDTO);
}
