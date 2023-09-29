package com.ciberbank.test;

import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.CuentaCorriente;
import com.ciberbank.modelo.GuardaCuentas;

public class TestGuardarCuenta {
    public static void main(String[] args) {
        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(32,13);
        guardaCuentas.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(46,32);
        guardaCuentas.adicionar(cc2);

        System.out.println(guardaCuentas.obtener(0));
        System.out.println(guardaCuentas.obtener(1));
    }
}
