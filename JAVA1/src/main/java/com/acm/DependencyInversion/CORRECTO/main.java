package com.acm.DependencyInversion.CORRECTO;

public class main {
    public static void main(String[] args) {

        MensajeServicio servicio = new SmsService();
        MensajeServicio servicio2 = new EmailService();
        Notificacion notificacion = new Notificacion(servicio);
        Notificacion notificacion = new Notificacion(servicio2);
        notificacion.enviarNotificacion("¡Reserva confirmada!");

    }
}
