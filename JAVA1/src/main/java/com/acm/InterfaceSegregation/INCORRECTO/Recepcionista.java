package com.acm.InterfaceSegregation.INCORRECTO;

public class Recepcionista implements Empleado {
    @Override
    public void registrarReserva() {
        // Lógica para registrar una reserva
    }

    @Override
    public void limpieHabitacion() {
        throw new UnsupportedOperationException("La recepcionista no puede limpiar habitaciones");
    }

    @Override
    public void generarReporte() {
        // Lógica para generar un reporte
    }

    @Override
    public void cocine() {
        throw new UnsupportedOperationException("La recepcionista no puede cocinar");
    }
}
