package Ejemplo2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ejemplo2.empleados", "ejemplo2.informes"})
public class Configuracion {
}
