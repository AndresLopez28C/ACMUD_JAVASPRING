package com.acm.DependencyInversion.CORRECTO;

public class EmailService implements MensajeServicio{
    public void EnviarMensaje(String mensaje){
        System.out.println("Mensaje enviado "+ mensaje);
    }

}
