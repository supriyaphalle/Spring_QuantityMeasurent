package com.bridgelabz.quantitymeasurement.controller;

import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.service.AllQuantities;
import com.bridgelabz.quantitymeasurement.service.IQuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class QuantityMeasurementController {
    @Autowired
    IQuantityMeasurementService iQuantityMeasurementService;

    @GetMapping("/allunit")
    public List getAllUnit() {
        return iQuantityMeasurementService.type();
    }

}
