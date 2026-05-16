package com.acm.proyectofinal.entity;

import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "servicio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_id")
    private Integer id;
    private String tipo;
    private Integer precio;
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

}
