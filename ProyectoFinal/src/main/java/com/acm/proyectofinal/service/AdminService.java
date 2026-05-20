package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Administrador;
import com.acm.proyectofinal.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private AdministradorRepository administradorRepository;
    @Autowired
    public AdminService(AdministradorRepository administradorRepository){
        this.administradorRepository = administradorRepository;
    }

    public Administrador createAdministrador(Administrador administrador){
        return administradorRepository.save(administrador);
    }

    public Administrador findById(int id) {
        return administradorRepository.findById(id).orElse(null);
    }
    public Administrador deleteById(int id) {
        return administradorRepository.findById(id).map(administrador -> {
            administradorRepository.delete(administrador);
            return administrador;
        }).orElse(null);
    }

    public Administrador updateAdministrador(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

}
