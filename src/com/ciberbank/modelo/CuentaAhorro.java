package com.ciberbank.modelo;

public class CuentaAhorro extends Cuenta {
    public CuentaAhorro(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
