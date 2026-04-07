package com.acm.LiskovSubstitution.INCORRECTO;

public class Cuenta_ahorros extends cuenta_bancaria{
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            throw new IllegalArgumentException
                    ("Fondos insuficientes");
        }
        saldo -= cantidad;
    }
}
