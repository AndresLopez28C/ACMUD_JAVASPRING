package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Servicios;
import com.acm.proyectofinal.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosService {
    private ServiciosRepository serviciosRepository;
    @Autowired
    public ServiciosService(ServiciosRepository serviciosRepository){
        this.serviciosRepository = serviciosRepository;
    }

    public Servicios createServicios(Servicios servicios){
        return serviciosRepository.save(servicios);
    }

    public Servicios findById(int id) {
        return serviciosRepository.findById(id).orElse(null);
    }
    public Servicios deleteById(int id) {
        return serviciosRepository.findById(id).map(servicios -> {
            serviciosRepository.delete(servicios);
            return servicios;
        }).orElse(null);
    }

    public Servicios updateServicios(Servicios servicios) {
        return serviciosRepository.save(servicios);
    }
}