package com.gutosoethe.fullstackChallenge.service;

import com.gutosoethe.fullstackChallenge.entity.Client;
import com.gutosoethe.fullstackChallenge.entity.dto.ClientDto;
import com.gutosoethe.fullstackChallenge.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(ClientDto clientDto){
        Client client = new Client();

        client.setFirstName(clientDto.firstName());
        client.setLastName(clientDto.lastName());
        client.setParticipation(clientDto.participation());
        if (client == null
            || client.getFirstName() == null
            || client.getLastName() == null
            || client.getParticipation() == null){

            throw new NullPointerException();
        }
        return clientRepository.save(client);
    }

    public List<Client> listAllClients(){
        List<Client> allClient = clientRepository.findAll();

        if (allClient == null){
            throw new NullPointerException();
        }

        return allClient;
    }
}
