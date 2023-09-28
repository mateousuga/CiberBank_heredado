package com.ciberbank.test;

import com.ciberbank.modelo.CuentaAhorro;
import com.ciberbank.modelo.CuentaCorriente;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorro ca = new CuentaAhorro(3, 2);
        cc.depositar(3000);
        cc.transferir(1000, ca);
        System.out.println(cc.getSaldo());
        System.out.println(ca.getsaldo());
    }
}

