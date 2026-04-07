package com.acm.LiskovSubstitution.CORRECTO;

public class Cuenta_corriente implements Cuenta {
    private double saldo;

    public CuentaCorriente(double saldoInicial) {
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
