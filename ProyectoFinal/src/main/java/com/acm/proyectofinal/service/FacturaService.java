package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Factura;
import com.acm.proyectofinal.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    private FacturaRepository facturaRepository;
    @Autowired
    public FacturaService(FacturaRepository facturaRepository){
        this.facturaRepository = facturaRepository;
    }

    public Factura createFactura(Factura factura){
        return facturaRepository.save(factura);
    }

    public Factura findById(int id) {
        return facturaRepository.findById(id).orElse(null);
    }
    public Factura deleteById(int id) {
        return facturaRepository.findById(id).map(factura -> {
            facturaRepository.delete(factura);
            return factura;
        }).orElse(null);
    }

    public Factura updateFactura(Factura factura) {
        return facturaRepository.save(factura);
    }
}
