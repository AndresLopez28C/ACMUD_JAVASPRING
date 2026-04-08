package Ejemplo2.informes;
import org.springframework.stereotype.Component;

@Component
public class InformeActividades implements Informe {
    @Override
    public String getInforme(){
        return " Informe de actividades";
    }
}
