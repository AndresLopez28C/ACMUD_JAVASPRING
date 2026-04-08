package Ejemplo2.informes;

import org.springframework.stereotype.Component;

@Component
public class InformeAnual implements Informe{
    @Override
    public String getInforme(){
        return "Informe anual de la empresa ";
    }
}
