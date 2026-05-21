package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Habitacion;
import com.acm.proyectofinal.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitacionService {
    private HabitacionRepository habitacionRepository;
    @Autowired
    public HabitacionService(HabitacionRepository habitacionRepository){
        this.habitacionRepository = habitacionRepository;
    }

    public Habitacion createHabitacion(Habitacion habitacion){
        return habitacionRepository.save(habitacion);
    }

    public Habitacion findById(int id) {
        return habitacionRepository.findById(id).orElse(null);
    }
    public Habitacion deleteById(int id) {
        return habitacionRepository.findById(id).map(habitacion -> {
            habitacionRepository.delete(habitacion);
            return habitacion;
        }).orElse(null);
    }

    public Habitacion updateHabitacion(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }
}