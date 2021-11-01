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

    @Autowired
    private ClientRepository clientRepository;

    @DeleteMapping("/")
    public ModelAndView deleteHome(ClientDTO client, BindingResult bindingResult) {
        //clientRepository.deleteById(id);
        System.out.printf(client.toString());
        clientRepository.deleteById(client.getId());
        return new ModelAndView("clients");
    }

    @DeleteMapping("/{id}")
    public ModelAndView delete(@PathVariable long id) {
        System.out.printf("I'm here", id);
        clientService.delete(id);
        return new ModelAndView("redirect:/clients");
    }

    @GetMapping( path="/{id}" )
    public String getStudent(@PathVariable long id, Model model) {
        model.addAttribute("client", clientRepository.findById(id).orElseThrow(ClientNotFoundException::new));
        return "client"; //clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);
    }

    @ResponseStatus(NOT_FOUND)
    public class ClientNotFoundException extends RuntimeException {
        public ClientNotFoundException() {
            super();
        }
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
