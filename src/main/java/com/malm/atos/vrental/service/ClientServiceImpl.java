package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.ClientRepository;
import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service("clientServiceImpl")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        List<Client> clients = clientRepository.findAll();
        System.out.printf("Get all clients\n");
        return clients;
    }

    @Override
    public Client getById(Long id) { return clientRepository.findById(id).orElseThrow(ClientNotFoundException::new); }

    @ResponseStatus(NOT_FOUND)
    public class ClientNotFoundException extends RuntimeException {
        public ClientNotFoundException() {
            super();
        }
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
        System.out.printf("Create a new client: " + client.toString() + "\n");
    }

    @Override
    public void delete(Long id) {
        List<Client> clients = clientRepository.findAllById(Arrays.asList(new Long[]{id}));
        Client client = clients.get(0);
        if (client.getDeleted() == 0) {
            client.setDeleted(1);
        } else {
            client.setDeleted(0);
        }

        clientRepository.save(client);

        System.out.printf("Change deleted of " + client.getFisrtName() + " to " + client.getDeleted() +"\n");
    }

    public void put(ClientDTO clientDTO, Long id) {
        Client client = new Client(); // duplicate code, is very similar to save()
        client.setId(clientDTO.getId());
        client.setUsername(clientDTO.getUsername());
        client.setFisrtName(clientDTO.getFisrtName());
        client.setLastName(clientDTO.getLastName());
        client.setPhone(clientDTO.getPhone());
        client.setAddress(clientDTO.getAddress());
        client.setDeleted(clientDTO.getDeleted());
        clientRepository.save(client);
        System.out.println("Update client with id: " + id + "\n");
    }
}
