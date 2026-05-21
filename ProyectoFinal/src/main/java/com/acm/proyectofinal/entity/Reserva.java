package com.acm.proyectofinal.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "reserva")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserva_id")
    private Integer reservaId;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    List<Habitacion> habitaciones;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    List<Puente> puentes;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    List<Pago> pagos;



}
