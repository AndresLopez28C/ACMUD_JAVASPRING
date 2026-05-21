package com.acm.proyectofinal.repository;

import com.acm.proyectofinal.entity.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {
}
