package com.acm.DependencyInversion.CORRECTO;

public class Notificacion {
    private MensajeServicio servicionotificacion;

    public Notificacion(MensajeServicio servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }
    public void enviarNotificacion(String mensaje) {
        servicioNotificacion.enviarMensaje(mensaje);
    }
}
