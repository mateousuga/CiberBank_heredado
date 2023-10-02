package com.ciberbank.test;

import com.ciberbank.modelo.Cliente;
import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Cuenta cc = new CuentaCorriente(313,424);
        Cuenta cc2 = new CuentaCorriente(13,543);

        lista.add(cc);
        lista.add(cc2);

        //Cliente cliente = new Cliente();
        //lista.add(cliente);

        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        for (Object cuenta : lista){
            System.out.println(lista.get(0));
        }
    }
}
