package com.acm.LiskovSubstitution.CORRECTO;

public class Cuenta_ahorros implements Cuenta {
    private double saldo;

    public CuentaAhorros(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void retirar(double monto) {
        if (monto > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
