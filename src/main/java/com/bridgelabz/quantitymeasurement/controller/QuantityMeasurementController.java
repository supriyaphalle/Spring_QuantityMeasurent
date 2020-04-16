package com.bridgelabz.quantitymeasurement.controller;

import com.bridgelabz.quantitymeasurement.dto.ConvertDTO;
import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.service.IQuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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

    @PostMapping(value = "/convert" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public double convert(@RequestBody ConvertDTO convertDTO){
        double convertedValue = iQuantityMeasurementService.convertValue(convertDTO);
        return convertedValue;
    }

}
