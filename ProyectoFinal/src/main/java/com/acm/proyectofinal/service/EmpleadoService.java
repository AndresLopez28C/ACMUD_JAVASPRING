package com.acm.proyectofinal.service;


import com.acm.proyectofinal.entity.Empleado;
import com.acm.proyectofinal.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    private EmpleadoRepository empleadoRepository;
    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado createEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public Empleado findById(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }
    public Empleado deleteById(int id) {
        return empleadoRepository.findById(id).map(empleado -> {
            empleadoRepository.delete(empleado);
            return empleado;
        }).orElse(null);
    }

    public Empleado updateEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}


