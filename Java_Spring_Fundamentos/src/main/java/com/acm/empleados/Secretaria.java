package com.acm.empleados;

public class Secretaria implements Empleado{
    @Override
    public String getTareas(){
        return "Secretaria atiende llamadas y tareas";
    }
    @Override
    public String getInforme(){
        return "";
    }
}
