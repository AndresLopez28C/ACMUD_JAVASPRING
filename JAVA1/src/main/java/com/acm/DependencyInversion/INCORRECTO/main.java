package com.acm.DependencyInversion.INCORRECTO;

public class main {
    public static void main(){
        EmailService emailService = new EmailService();
        Notificacion notificacion = new Notificacion(emailService);

        notificacion.enviarNotificacion("¡Reserva confirmada!");
    }
}
