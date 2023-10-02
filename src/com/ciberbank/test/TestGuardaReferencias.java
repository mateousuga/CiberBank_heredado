package com.ciberbank.test;

import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.CuentaCorriente;
import com.ciberbank.modelo.GuardaReferencias;

public class TestGuardaReferencias {
    public static void main(String[] args) {
        GuardaReferencias guardaReferencias = new GuardaReferencias();
        Cuenta cc = new CuentaCorriente(112,43);
        guardaReferencias.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(42,13);
        guardaReferencias.adicionar(cc2);

        System.out.println(guardaReferencias.obtener(0));
        System.out.println(guardaReferencias.obtener(1));
    }


}
