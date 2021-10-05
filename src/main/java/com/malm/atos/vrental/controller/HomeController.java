package com.malm.atos.vrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("name", "Aurelio");
        model.addAttribute("last_name", "Marquez");
        return "home";
    }
}
