package com.ciberbank.test;

import com.ciberbank.modelo.Cliente;
import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestArrayList {
    public static void main(String[] args) {
        //  List<Cliente> listaClientes = new LinkedList<>();
        List<Cuenta> lista = new Vector<>();
        // referencia     Objeto-> HEAP
        Cuenta cc = new CuentaCorriente(313,424);
        Cuenta cc2 = new CuentaCorriente(13,543);
        Cuenta cc3 = new CuentaCorriente(313,424);

        // [cc, cc2]
        lista.add(cc);
        lista.add(cc2);

        //Cliente cliente = new Cliente();
        //lista.add(cliente);

        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
        boolean contiene = lista.contains(cc);
        // por referencia
        if (contiene) {
            System.out.println("Si");
        }
        if (cc.esIgual(cc3)) {
            // por valores
            System.out.println("Si, son iguales");
        }
    }
}
