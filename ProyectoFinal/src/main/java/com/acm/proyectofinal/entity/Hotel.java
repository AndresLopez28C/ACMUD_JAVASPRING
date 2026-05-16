package com.acm.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Table(name = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Integer id;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correo;
    private String categoria;
    private String estado;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    List<Administrador> administradores;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    List<Habitacion> habitaciones;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    List<Empleado> empleados;

}
