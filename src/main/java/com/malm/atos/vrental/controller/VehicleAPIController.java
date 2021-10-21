package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.entity.VehiclePrice;
import com.malm.atos.vrental.entity.VehicleType;
import com.malm.atos.vrental.entity.Vehicle;
import com.malm.atos.vrental.entity.Client;
import com.malm.atos.vrental.entity.LicenseType;
import com.malm.atos.vrental.entity.LicenseDriver;
import com.malm.atos.vrental.entity.RentOrder;
import com.malm.atos.vrental.entity.RentTime;
import com.malm.atos.vrental.entity.VehicleDetails;
import com.malm.atos.vrental.entity.Billing;

import com.malm.atos.vrental.service.VehiclePriceService;
import com.malm.atos.vrental.service.VehicleTypeService;
import com.malm.atos.vrental.service.VehicleService;
import com.malm.atos.vrental.service.ClientService;
import com.malm.atos.vrental.service.LicenseTypeService;
import com.malm.atos.vrental.service.LicenseDriverService;
import com.malm.atos.vrental.service.RentOrderService;
import com.malm.atos.vrental.service.RentTimeService;
import com.malm.atos.vrental.service.VehicleDetailsService;
import com.malm.atos.vrental.service.BillingService;

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

    @GetMapping(path="/getAllVehiclePrices")
    public @ResponseBody
    List<VehiclePrice> getAllVehiclePrices() {
        return vehiclePriceService.getAll();
    }

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping(path="/getAllVehicleTypes")
    public @ResponseBody List<VehicleType> getAllVehicleTypes() {
        // This returns a JSON or XML with the users
        return vehicleTypeService.getAll();
    }

    @Autowired
    private VehicleService vehicleService;
    
    @GetMapping(path="/getAllVehicles")
    public @ResponseBody List<Vehicle> getAllVehicles() {
        return vehicleService.getAll();
    }

    @Autowired
    private ClientService clientService;
    
    @GetMapping(path="/getAllClients")
    public @ResponseBody List<Client> getAllClients() {
        return clientService.getAll();
    }

    @Autowired
    private LicenseTypeService licenseTypeService;
    
    @GetMapping(path="/getAllLicenseTypes")
    public @ResponseBody List<LicenseType> getAllLicenseTypes() {
        return licenseTypeService.getAll();
    }

    @Autowired
    private LicenseDriverService licenseDriverService;
    
    @GetMapping(path="/getAllLicenseDrivers")
    public @ResponseBody List<LicenseDriver> getAllLicenseDrivers() {
        return licenseDriverService.getAll();
    }

    @Autowired
    private RentOrderService rentOrderService;
    
    @GetMapping(path="/getAllRentOrders")
    public @ResponseBody List<RentOrder> getAllRentOrders() {
        return rentOrderService.getAll();
    }

    @Autowired
    private RentTimeService rentTimeService;
    
    @GetMapping(path="/getAllRentTimes")
    public @ResponseBody List<RentTime> getAllRentTimes() {
        return rentTimeService.getAll();
    }

    @Autowired
    private VehicleDetailsService vehicleDetailsService;
    
    @GetMapping(path="/getAllVehicleDetails")
    public @ResponseBody List<VehicleDetails> getAllVehicleDetails() {
        return vehicleDetailsService.getAll();
    }

    @Autowired
    private BillingService billingService;
    
    @GetMapping(path="/getAllBillings")
    public @ResponseBody List<Billing> getAllBillings() {
        return billingService.getAll();
    }

}
