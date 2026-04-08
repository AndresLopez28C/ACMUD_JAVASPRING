package Ejercicio2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Ejercicio2.conversor","Ejercicio2.Calculadora"})
public class config {

}
