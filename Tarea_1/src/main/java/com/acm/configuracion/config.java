package com.acm.configuracion;

import com.acm.alertas.Alerta;
import com.acm.alertas.AlertaCritica;
import com.acm.monitores.MonitorPersonal;
import com.acm.monitores.Monitoreo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public Monitoreo MonitorPersonal()
    {
        return new MonitorPersonal(AlertaCritica());
    }

    @Bean
    public Alerta AlertaCritica(){
        return new AlertaCritica();
    }
}
