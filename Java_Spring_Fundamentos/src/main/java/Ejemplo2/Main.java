package Ejemplo2;
import Ejemplo2.empleados.Desarrollador;
import Ejemplo2.empleados.Empleado;
import Ejemplo2.informes.InformeActividades;
import Ejemplo2.informes.Informe;
import Ejemplo2.config.Configuracion;
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

        //Objetos creados con SPring gestionados manualmente
      //  ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
        //Empleado Desarrollador = context.getBean(Desarrollador.class);
        //System.out.println(Desarrollador.getTareas());
        //System.out.println(Desarrollador.getInforme());

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
        Empleado Desarrollador = context.getBean(Desarrollador.class);
        System.out.println(Desarrollador.getTareas());
        System.out.println(Desarrollador.getInforme());

        Empleado Desarrollador2 = context.getBean(Desarrollador.class);
        if (Desarrollador == Desarrollador2){
            System.out.println("Los objetos son iguales (Singleton)");
        }else{
            System.out.println("Los objetos son diferentes (Prototype)");
        }
    }
}
