package com.openinov.glamping.controller;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.openinov.glamping.entity.ClientDto;
import com.openinov.glamping.entity.Clients;
import com.openinov.glamping.mapper.ClientMapper;
import com.openinov.glamping.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    protected ClientRepository clientRepository;

    @Autowired
    ClientMapper mapper;

    @Autowired
    public ClientController(Jackson2ObjectMapperBuilder jacksonBuilder) {
        // Configurer l'ObjectMapper ici
        jacksonBuilder.featuresToDisable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @GetMapping("/allorder")
    @ResponseBody
    public List<ClientDto> findByOrderByIdDesc(@RequestParam final Optional<Boolean> actifs) {
        try {
            List<Clients> clients;
            clients = clientRepository.findByOrderByIdDesc();
            return mapper.toDtos(clients);
        } catch (Exception e) {
            return emptyList();
        }
    }


    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<Clients>> findAll() {
        List<Clients> clients = clientRepository.findAll();
        return ResponseEntity.ok(clients);//mapper.toDtos(clients));
    }
}
