package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AllQuantities implements IQuantityMeasurementService {
    @Override
    public List<QuantityType> type() {
        return Arrays.asList(QuantityType.values());
    }
}
