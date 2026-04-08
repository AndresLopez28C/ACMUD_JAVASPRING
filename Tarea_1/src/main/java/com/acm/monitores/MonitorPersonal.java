package com.acm.monitores;

import com.acm.alertas.AlertaCritica;

public class MonitorPersonal implements Monitoreo{
    private AlertaCritica alertaCritica;

    public MonitorPersonal(AlertaCritica alertaCritica) {
        this.alertaCritica = alertaCritica;
    }
    @Override
    public String RevisarAlerta(){
        return "Revisando el sistema en este momento "+ alertaCritica.generarAlerta();
    }

}
