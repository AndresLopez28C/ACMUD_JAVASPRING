package com.acm.empleados;

public class Director implements Empleado{
    @Override
    public String getTareas(){
        return "El director maneja al equipo";
    }
    @Override
    public String getInforme(){
        return "";
    }
}
