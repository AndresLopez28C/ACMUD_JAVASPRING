package com.acm.alertas;

public class AlertaCritica implements Alerta{
    @Override
    public String generarAlerta(){
        return "ALERTA CRITICA REVISE EL SISTEMA YA MISMO";
    }
}
