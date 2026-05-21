package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Reserva;
import com.acm.proyectofinal.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    private ReservaRepository reservaRepository;
    @Autowired
    public ReservaService(ReservaRepository reservaRepository){
        this.reservaRepository = reservaRepository;
    }

    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public Reserva findById(int id) {
        return reservaRepository.findById(id).orElse(null);
    }
    public Reserva deleteById(int id) {
        return reservaRepository.findById(id).map(reserva -> {
            reservaRepository.delete(reserva);
            return reserva;
        }).orElse(null);
    }

    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}