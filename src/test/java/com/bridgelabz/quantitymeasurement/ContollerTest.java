package com.bridgelabz.quantitymeasurement;


import com.bridgelabz.quantitymeasurement.controller.QuantityMeasurementController;
import com.bridgelabz.quantitymeasurement.enumarator.QuantityType;
import com.bridgelabz.quantitymeasurement.enumarator.Unit;
import com.bridgelabz.quantitymeasurement.service.IQuantityMeasurementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static com.bridgelabz.quantitymeasurement.enumarator.Unit.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QuantityMeasurementController.class)
public class ContollerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    IQuantityMeasurementService service;


    @Test
    public void quantityMeasurementGetQuantityType_ShouldReturnArrayOfQuantityType() throws Exception {
        QuantityType[] expectedArray = {QuantityType.LENGTH, QuantityType.WEIGHT, QuantityType.VOLUME, QuantityType.TEMPERATURE};
        given(service.quantityType()).willReturn(Arrays.asList(expectedArray));
        mvc.perform(get("/allunit"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(Arrays.toString(expectedArray)));
    }


    @Test
    public void quantityMeasurementGetUnitType_ShouldReturnArrayOfUnitType() throws Exception {
        Unit[] expectedArray = {LITER,GALLON,MILLILITER};
        given(service.unitType(QuantityType.VOLUME)).willReturn(Arrays.asList(expectedArray));
        mvc.perform(get("/unit/VOLUME"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(Arrays.toString(expectedArray)));
    }
}