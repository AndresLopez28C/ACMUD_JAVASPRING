package Ejercicio1.monitores;

import Ejercicio1.alertas.Alerta;

public class MonitorPersonal implements Monitoreo{
    private Alerta alerta;

    public MonitorPersonal(Alerta alerta) {
        this.alerta = alerta;
    }
    @Override
    public String RevisarAlerta(){
        return "Revisando el sistema en este momento "+ alerta.generarAlerta();
    }

}
