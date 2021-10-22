package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping( value = "/profile")
    public String profile(Model model) {
        model.addAttribute("client", new ClientDTO());
        return "clientprofile";
    }

    @PostMapping(value = "/save")
    public ModelAndView save(ClientDTO client, BindingResult bindingResult) {
        System.out.printf(client.toString());
        if (bindingResult.hasErrors()) {
            return new ModelAndView("clientprofile");
        }
        clientService.save(client);
        return new ModelAndView("redirect:/");
    }
}
