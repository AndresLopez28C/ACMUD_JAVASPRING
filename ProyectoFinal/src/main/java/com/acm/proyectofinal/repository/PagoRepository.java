package com.acm.proyectofinal.repository;

import com.acm.proyectofinal.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
}
