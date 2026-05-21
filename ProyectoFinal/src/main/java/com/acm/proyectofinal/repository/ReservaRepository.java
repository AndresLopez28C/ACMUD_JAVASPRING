package com.acm.proyectofinal.repository;

import com.acm.proyectofinal.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
