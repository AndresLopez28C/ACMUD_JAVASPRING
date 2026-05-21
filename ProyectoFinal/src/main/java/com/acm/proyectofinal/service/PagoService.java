package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Pago;
import com.acm.proyectofinal.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService {
    private PagoRepository pagoRepository;
    @Autowired
    public PagoService(PagoRepository pagoRepository){
        this.pagoRepository = pagoRepository;
    }

    public Pago createPago(Pago pago){
        return pagoRepository.save(pago);
    }

    public Pago findById(int id) {
        return pagoRepository.findById(id).orElse(null);
    }
    public Pago deleteById(int id) {
        return pagoRepository.findById(id).map(pago -> {
            pagoRepository.delete(pago);
            return pago;
        }).orElse(null);
    }

    public Pago updatePago(Pago pago) {
        return pagoRepository.save(pago);
    }
}