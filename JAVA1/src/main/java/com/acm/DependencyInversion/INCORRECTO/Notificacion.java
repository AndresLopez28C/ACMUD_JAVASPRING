package com.acm.DependencyInversion.INCORRECTO;

public class Notificacion {
    private EmailService emailService;
    private SMSService smsService;

    public Notificacion(EmailService emailService) {
        this.emailService = emailService;
    }

    public Notificacion(SMSService smsService) {
        this.smsService = smsService;
    }

    public void enviarNotificacion(String mensaje) {
        emailService.sendEmail(mensaje);
    }

    public void enviarNotificacionSMS(String mensaje) {
        smsService.sendSMS(mensaje);
    }
}
