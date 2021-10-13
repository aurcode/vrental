package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.entity.VehiclePrice;
import com.malm.atos.vrental.entity.VehicleType;
import com.malm.atos.vrental.service.VehiclePriceService;
import com.malm.atos.vrental.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class VehicleAPIController {
    @Autowired
    private VehiclePriceService vehiclePriceService;
    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping(path="/getAllVehiclePrices")
    public @ResponseBody
    List<VehiclePrice> getAllVehiclePrices() {
        return vehiclePriceService.getAll();
    }

    @GetMapping(path="/getAllVehicleTypes")
    public @ResponseBody List<VehicleType> getAllVehicleTypes() {
        // This returns a JSON or XML with the users
        return vehicleTypeService.getAll();
    }
}
