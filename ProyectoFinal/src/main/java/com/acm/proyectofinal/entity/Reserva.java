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

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;
    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    List<Servicios> servicio;
    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    List<Pago> pagos;
}
