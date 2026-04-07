package com.acm.OpenClose.CORRECTO;

public class Bancolombia implements Metodo_pago{
    @override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con Nequi.");
    }
}
