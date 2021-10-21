package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.entity.Client;
import com.malm.atos.vrental.entity.VehiclePrice;
import com.malm.atos.vrental.service.ClientService;
import com.malm.atos.vrental.service.VehiclePriceService;
import com.malm.atos.vrental.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("vehicles", vehicleService.getAll());
        return "home";
    }

}
