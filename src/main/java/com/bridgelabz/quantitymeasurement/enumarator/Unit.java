package com.bridgelabz.quantitymeasurement.enumarator;

import com.bridgelabz.quantitymeasurement.service.AllQuantities;

public enum Unit {
    FEET(QuantityType.LENGTH, 12),
    INCH(QuantityType.LENGTH, 1),
    YARD(QuantityType.LENGTH, 36),
    CM(QuantityType.LENGTH, 2.5),

    KILOGRAM(QuantityType.WEIGHT, 1),
    GRAM(QuantityType.WEIGHT, 0.001),
    TONNE(QuantityType.WEIGHT, 1000),

    CELSIUS(QuantityType.TEMPERATURE, 1.8),
    FAHRENHEIT(QuantityType.TEMPERATURE, 0.5555556),

    LITER(QuantityType.VOLUME, 1),
    GALLON(QuantityType.VOLUME, 3.78),
    MILLILITER(QuantityType.VOLUME, 0.001);


    public QuantityType quantityType;
    public double conversionFactor;

    Unit(QuantityType quantityType, double conversionFactor) {

        this.quantityType = quantityType;
        this.conversionFactor = conversionFactor;
    }
}
