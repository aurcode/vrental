package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.ClientRepository;
import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("clientServiceImpl")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }

    public void save(ClientDTO clientDTO) {
        Client client = new Client();
        client.setId(clientDTO.getId());
        client.setUsername(clientDTO.getUsername());
        client.setFisrtName(clientDTO.getFisrtName());
        client.setLastName(clientDTO.getLastName());
        client.setPhone(clientDTO.getPhone());
        client.setAddress(clientDTO.getAddress());
        client.setDeleted(clientDTO.getDeleted());
        clientRepository.save(client);
    }
}
