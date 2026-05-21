package com.acm.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Table(name = "habitacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "habitacion_id")
    private Integer habitacionId;
    private String tipo;
    private Integer capacidad;
    private Integer precio;
    private Boolean disponibilidad;
    private String estado;
    private String piso;
    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;


}
