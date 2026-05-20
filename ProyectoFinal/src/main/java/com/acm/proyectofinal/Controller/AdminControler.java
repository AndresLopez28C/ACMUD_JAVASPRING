package com.acm.proyectofinal.Controller;

import com.acm.proyectofinal.entity.Administrador;
import com.acm.proyectofinal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/administrador")
public class AdminControler {
    private AdminService adminService;
    @Autowired
    public AdminControler(AdminService adminService){
        this.adminService = adminService;
    }
    @PostMapping("/create-administrador")
    public ResponseEntity<Administrador> saveAdministrador(@RequestBody Administrador administrador){
        Administrador administradorGuardado  = adminService.createAdministrador(administrador);
        return ResponseEntity.ok(administradorGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Administrador> findById(@PathVariable int id) {
        Administrador administradorEncontrado = adminService.findById(id);
        if (administradorEncontrado != null) {
            return ResponseEntity.ok(administradorEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Administrador> deleteById(@PathVariable int id) {
        Administrador administradorEliminado = adminService.deleteById(id);
        if (administradorEliminado != null) {
            return ResponseEntity.ok(administradorEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-administrador")
    public ResponseEntity<Administrador> updateCategoria(@RequestBody Administrador administrador) {
        Administrador administradorActualizado = adminService.updateAdministrador(administrador);
        return ResponseEntity.ok(administradorActualizado);
    }
}
