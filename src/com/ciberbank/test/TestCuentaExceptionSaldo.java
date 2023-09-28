package com.ciberbank.test;

import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.CuentaAhorro;
import com.ciberbank.modelo.SaldoInsificienteException;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorro(2234, 2341);
        cuenta.depositar(200);
        try {
            cuenta.retirar(203);
        } catch (SaldoInsificienteException e) {
            e.printStackTrace();
        }
    }
}
