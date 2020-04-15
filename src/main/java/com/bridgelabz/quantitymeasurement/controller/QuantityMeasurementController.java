package com.bridgelabz.quantitymeasurement.controller;

import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.service.IQuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuantityMeasurementController {
    @Autowired
    IQuantityMeasurementService iQuantityMeasurementService;

    @GetMapping("/allunit")
    public List getAllQuantity() {
        return iQuantityMeasurementService.quantityType();
    }

    @GetMapping("/unit/{type}")
    public List getAllUnit(@PathVariable QuantityType type) {
        return iQuantityMeasurementService.unitType(type);
    }


}
