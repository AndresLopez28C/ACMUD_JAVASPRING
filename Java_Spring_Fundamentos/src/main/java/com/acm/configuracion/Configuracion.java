package com.acm.configuracion;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.acm.informes.Informe;
import com.acm.informes.InformeEjecutivo;
import com.acm.empleados.Desarrollador;
import com.acm.empleados.Empleado;
@Configuration
public class Configuracion {
    @Bean
    public Empleado Desarrollador(){
        return new Desarrollador(InformeEjecutivo());
    }
    @Bean
    public Informe InformeEjecutivo(){
        return new InformeEjecutivo();
    }

}
