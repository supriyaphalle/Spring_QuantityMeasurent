package com.bridgelabz.quantitymeasurement.dto;

import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.enumarator.Unit;

public class ConvertDTO {
    public QuantityType mainQuantity;
    public  Double inputValue;
    public   Unit mainUnit;
    public Unit convertedUnit;

    public ConvertDTO(QuantityType mainQuantity, Double inputValue, Unit mainUnit, Unit convertedUnit) {

        this.mainQuantity = mainQuantity;
        this.inputValue = inputValue;
        this.mainUnit = mainUnit;
        this.convertedUnit = convertedUnit;
    }
}
