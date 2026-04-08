package com.acm.empleados;
import com.acm.informes.Informe;
public class Desarrollador implements Empleado{
    private Informe informe;

    public Desarrollador(Informe informe){
        this.informe = informe;
    }
    @Override
    public String getTareas(){
        return "Desarrollo de Software";
    }
    @Override
    public String getInforme(){
        return "Informe del desarrollador " + informe.getInforme();

    }
}
