package Ejercicio1;

import Ejercicio1.configuracion.config;
import Ejercicio1.monitores.Monitoreo;
import Ejercicio1.monitores.MonitorPersonal;
import Ejercicio1.monitores.MonitorCritico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Monitoreo MonitorPersonal = context.getBean(MonitorPersonal.class);
        Monitoreo MonitorCritico = context.getBean(MonitorCritico.class);
        System.out.println(MonitorPersonal.RevisarAlerta());
        System.out.println(MonitorCritico.RevisarAlerta());

    }
}
