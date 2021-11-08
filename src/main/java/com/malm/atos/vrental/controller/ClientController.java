package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(path="/")
    public String view(Model model) {
        model.addAttribute("clients", clientService.getAll());
        return "clients";
    }

    @GetMapping( value = "/new")
    public String profile(Model model) {
        model.addAttribute("client", new ClientDTO());
        return "clientcreator";
    }

    @PostMapping(value = "/new")
    public ModelAndView save(ClientDTO client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("clientcreator");
        }
        clientService.save(client);
        return new ModelAndView("redirect:/clients/");
    }

    @GetMapping(path="/delete/{id}")
    public ModelAndView delete(@PathVariable long id) {
        clientService.delete(id);
        return new ModelAndView("redirect:/clients/");
    }

    @GetMapping(path="/edit/{id}")
    public String editor(@PathVariable long id, Model model) {
        model.addAttribute("client", clientService.getById(id));
        return "clienteditor";
    }

    @PostMapping(value = "/edit/{id}")
    public ModelAndView put(ClientDTO client, BindingResult bindingResult, @PathVariable long id) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("clienteditor");
        }
        clientService.put(client, id);
        return new ModelAndView("redirect:/clients/");
    }
}
