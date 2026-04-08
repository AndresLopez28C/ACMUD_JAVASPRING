package com.acm;
import com.acm.empleados.Desarrollador;
import com.acm.empleados.Empleado;
import com.acm.informes.InformeEjecutivo;
import com.acm.informes.Informe;
import com.acm.configuracion.Configuracion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String [] args){
        //Gestionar objetos de manera manual sin spring
       // Informe informe = new InformeEjecutivo();
        //Desarrollador dev = new Desarrollador(informe);

        //System.out.println(dev.getTareas());
        //System.out.println(dev.getInforme());
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
        Empleado Desarrollador = context.getBean(Desarrollador.class);
        System.out.println(Desarrollador.getTareas());
        System.out.println(Desarrollador.getInforme());

        }
}

