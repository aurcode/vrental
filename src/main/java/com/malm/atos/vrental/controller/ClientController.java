package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.DAO.ClientRepository;
import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.entity.Client;
import com.malm.atos.vrental.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.http.HttpStatus.NOT_FOUND;

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

    @PutMapping( value="/{id}" )
    public void put(@PathVariable long id, @RequestBody ClientDTO clientDTO) {
        Client client = new Client();
        //return None;
    }

    @GetMapping(path="/delete/{id}")
    public ModelAndView delete(@PathVariable long id) {
        clientService.delete(id);
        return new ModelAndView("redirect:/clients/");
    }

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
