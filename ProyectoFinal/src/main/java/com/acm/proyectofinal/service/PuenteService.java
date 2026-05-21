package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Puente;
import com.acm.proyectofinal.repository.PuenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuenteService {
    private PuenteRepository puenteRepository;
    @Autowired
    public PuenteService(PuenteRepository puenteRepository){
        this.puenteRepository = puenteRepository;
    }

    public Puente createPuente(Puente puente){
        return puenteRepository.save(puente);
    }

    public Puente findById(int id) {
        return puenteRepository.findById(id).orElse(null);
    }
    public Puente deleteById(int id) {
        return puenteRepository.findById(id).map(puente -> {
            puenteRepository.delete(puente);
            return puente;
        }).orElse(null);
    }

    public Puente updatePuente(Puente puente) {
        return puenteRepository.save(puente);
    }
}