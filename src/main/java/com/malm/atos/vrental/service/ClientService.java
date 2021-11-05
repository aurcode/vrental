package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client getById(Long id);
    void save(ClientDTO client);
    void delete(Long id);
    void put(ClientDTO clientDTO, Long id);
}
