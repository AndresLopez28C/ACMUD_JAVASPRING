package Ejemplo2.empleados;
import Ejemplo2.informes.Informe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desarrollador implements Empleado{
    private Informe informe;

    @Autowired
    public Desarrollador(@Qualifier("informeActividades") Informe informe){
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
