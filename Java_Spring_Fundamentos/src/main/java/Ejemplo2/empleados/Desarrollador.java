package Ejemplo2.empleados;
import Ejemplo2.informes.Informe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Desarrollador implements Empleado{
    private Informe informe;

    @Autowired
    public Desarrollador(Informe informe){
        this.informe = informe;
    }
    @Override
    public String getTareas(){
        return "Tareas del desarrollador: programar";
    }
    @Override
    public String getInforme(){
        return "Informe del desarrollador : "+ informe.getInforme();
    }
}
