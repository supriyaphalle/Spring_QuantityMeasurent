package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.enumarator.Unit;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllQuantities implements IQuantityMeasurementService {
    @Override
    public List<QuantityType> quantityType() {
        return Arrays.asList(QuantityType.values());
    }

    @Override
    public List<Unit> unitType(QuantityType  type) {/*
        List<Unit> units = Arrays.asList(Unit.values());
        List<Unit> collect = units.stream().filter(unit -> unit.quantityType.equals(type))
                .collect(Collectors.toList());
        return collect;*/
        return null;
    }


}
