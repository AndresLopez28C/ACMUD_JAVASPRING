package com.acm.proyectofinal.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "puente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Puente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "puente_id")
    private Integer puenteId;
    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicios servicios;

}
