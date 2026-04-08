package Ejercicio1.monitores;

import Ejercicio1.alertas.Alerta;

public class MonitorCritico implements Monitoreo{
    private Alerta alerta;

    public MonitorCritico(Alerta alerta) {
        this.alerta = alerta;
    }
    @Override
    public String RevisarAlerta(){
        return "Revisando el sistema en este momento "+ alerta.generarAlerta();
    }

}