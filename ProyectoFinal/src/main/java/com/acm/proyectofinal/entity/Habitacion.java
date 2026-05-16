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
    private Integer id;
    private String tipo;
    private Integer capacidad;
    private Integer precio;
    private Boolean disponibilidad;
    private String estado;
    private String piso;
    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL)
    List<Reserva> reservas;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;


}
