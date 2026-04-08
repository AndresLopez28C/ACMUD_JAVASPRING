package com.acm;

import com.acm.configuracion.config;
import com.acm.monitores.Monitoreo;
import com.acm.monitores.MonitorPersonal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Monitoreo MonitorPersonal = context.getBean(MonitorPersonal.class);
        System.out.println(MonitorPersonal.RevisarAlerta());

    }
}
