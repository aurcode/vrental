package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.entity.VehicleType;
import com.malm.atos.vrental.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping(value = "/")
    public String home(Model model){
        List<VehicleType> vehicleTypes = vehicleTypeService.getAll();
        model.addAttribute("name", StringUtils.join(vehicleTypes, "  ") );
        return "home";
    }

    @GetMapping(path="/getAllUsers")
    public @ResponseBody List<VehicleType> getAllUsers() {
        // This returns a JSON or XML with the users
        List<VehicleType> vehicleTypes = vehicleTypeService.getAll();
        return vehicleTypes;
    }

    /* @GetMapping(path="/testing")
    public String testing() {
        return vehicleTypeService.getAll();
        //System.out.printf(vehicleTypes.toString());
    }*/
}
