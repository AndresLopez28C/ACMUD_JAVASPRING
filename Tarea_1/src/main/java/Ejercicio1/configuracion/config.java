package Ejercicio1.configuracion;

import Ejercicio1.alertas.Alerta;
import Ejercicio1.alertas.AlertaCritica;
import Ejercicio1.alertas.AlertaInformativa;
import Ejercicio1.monitores.MonitorPersonal;
import Ejercicio1.monitores.MonitorCritico;
import Ejercicio1.monitores.Monitoreo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public Monitoreo MonitorPersonal()
    {
        return new MonitorPersonal(AlertaInformativa());
    }
    @Bean
    public Alerta AlertaInformativa(){
        return new AlertaInformativa();
    }
    @Bean
    public Monitoreo MonitorCritico()
    {
        return new MonitorCritico(AlertaCritica());
    }

    @Bean
    public Alerta AlertaCritica(){
        return new AlertaCritica();
    }
}
