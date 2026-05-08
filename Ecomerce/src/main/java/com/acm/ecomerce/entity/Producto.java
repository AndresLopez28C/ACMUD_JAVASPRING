package com.acm.ecomerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
Table(name = "producto")
public class Producto {
    @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    
}
