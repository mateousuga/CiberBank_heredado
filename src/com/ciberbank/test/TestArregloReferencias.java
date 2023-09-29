package com.ciberbank.test;

import com.ciberbank.modelo.Cliente;
import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.CuentaAhorro;
import com.ciberbank.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Object[] referencias = new Object[5];

        CuentaCorriente cc = new CuentaCorriente(24,54);


        referencias[1] = cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente obtenido = (Cliente) referencias[4];
        System.out.println(obtenido);

        CuentaAhorro ca = new CuentaAhorro(42,413);
        referencias[3] = ca;

        System.out.println(cc);
        referencias[0] = new CuentaCorriente(12,32);
        System.out.println(referencias[0]);

        CuentaCorriente cuenta = (CuentaCorriente) referencias[1];

        for (int i = 0; i < referencias.length; i++) {
            System.out.println(referencias[i]);
        }
    }
}
