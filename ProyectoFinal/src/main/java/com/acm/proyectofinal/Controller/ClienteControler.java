package com.acm.proyectofinal.Controller;

import com.acm.proyectofinal.service.ClienteService;
import com.acm.proyectofinal.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable int id) {
        Cliente clienteEncontrado = clienteService.findById(id);
        if (clienteEncontrado != null) {
            return ResponseEntity.ok(clienteEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Cliente> deleteById(@PathVariable int id) {
        Cliente clienteEliminado = clienteService.deleteById(id);
        if (clienteEliminado != null) {
            return ResponseEntity.ok(clienteEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-cliente")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
        Cliente clienteActualizado = clienteService.updateCliente(cliente);
        return ResponseEntity.ok(clienteActualizado);
    }

}
