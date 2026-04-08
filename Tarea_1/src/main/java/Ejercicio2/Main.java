package Ejercicio2;

import Ejercicio2.Calculadora.Calculadora;
import Ejercicio2.configuration.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Calculadora calculadora  = context.getBean(Calculadora.class);
        int prueba = 25;
        System.out.println(prueba+" grados centigrados a fahrenheit es :"+ calculadora.Calcular(prueba));


    }
}
