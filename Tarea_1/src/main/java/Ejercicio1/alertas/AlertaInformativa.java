package Ejercicio1.alertas;

public class AlertaInformativa implements Alerta {
    @Override
    public String generarAlerta(){
        return "Alerta de seguridad, por favor revise la bandeja";
    }
}
