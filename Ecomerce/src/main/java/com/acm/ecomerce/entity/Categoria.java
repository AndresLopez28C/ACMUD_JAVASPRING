package com.acm.ecomerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "categoria")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Integer id;
    private String nombre;
    private String slug;
    private String descripcion;
    @Column(name = "esta_activo")
    private Boolean estaActivo;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    List<Producto> productos;
}
