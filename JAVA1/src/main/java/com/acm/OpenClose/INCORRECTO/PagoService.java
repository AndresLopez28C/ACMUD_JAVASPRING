package com.acm.OpenClose.INCORRECTO;

public class PagoService {
    public void procesarPago(String tipo, double montoTotal){
        if(tipo.equalsIgnoreCase("Nequi")){
            System.out.println("Procesando pago con tarjeta por un monto de: " + montoTotal);
        } else if(tipo.equalsIgnoreCase("Bancolombia")){
            System.out.println("Procesando pago en efectivo por un monto de: " + montoTotal);
        } else if(tipo.equalsIgnoreCase("Davivienda")){
            System.out.println("Procesando pago con transferencia por un monto de: " + montoTotal);
        } else {
            System.out.println("Tipo de pago no reconocido.");
        }
    }
}
