package com.acm.proyectofinal.Controller;

import com.acm.proyectofinal.repository.ClienteService;
import com.acm.proyectofinal.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
public class ClienteControler {
    private ClienteService clienteService;
    @Autowired
    public ClienteControler(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    @PostMapping("/create-cliente")
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
        Cliente clienteGuardado  = clienteService.crearCliente(cliente);
        return ResponseEntity.ok(clienteGuardado);
    }
}
