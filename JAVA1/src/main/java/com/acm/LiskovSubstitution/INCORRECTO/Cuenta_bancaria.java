package com.acm.LiskovSubstitution.INCORRECTO;

public class Cuenta_bancaria {

    protected double saldo;

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            throw new IllegalArgumentException
                    ("Fondos insuficientes");
        }
        saldo -= cantidad;
    }
}
