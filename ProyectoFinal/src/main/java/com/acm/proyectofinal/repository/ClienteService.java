package com.acm.proyectofinal.repository;

import com.acm.proyectofinal.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente crearCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
