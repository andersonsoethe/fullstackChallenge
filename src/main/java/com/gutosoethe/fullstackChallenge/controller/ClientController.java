package com.gutosoethe.fullstackChallenge.controller;

import com.gutosoethe.fullstackChallenge.entity.Client;
import com.gutosoethe.fullstackChallenge.entity.dto.ClientDto;
import com.gutosoethe.fullstackChallenge.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientDto clientDto){
        Client client = clientService.saveClient(clientDto);
        return ResponseEntity.ok().body(client);
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Client>> listAllClients(){
        List<Client> clientList = clientService.listAllClients();
        return ResponseEntity.ok().body(clientList);
    }

}
