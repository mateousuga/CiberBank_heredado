package com.ciberbank.test;

import com.ciberbank.modelo.Cuenta;
import com.ciberbank.modelo.Cliente;
import com.ciberbank.modelo.CuentaAhorro;
import com.ciberbank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorro(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorro(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta>  lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        System.out.println("antes de ordenar");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }
        //Ordenar las cuentas
        //Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
        //lista.sort(new OrdenadorPorNumeroCuenta());

        lista.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });

        System.out.println("despues de ordenar");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }
        //Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
        //lista.sort(comparatorNombreTitular);

        Collections.sort(lista, new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
            }
        });

        System.out.println("despues de ordenar por nombre");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }
    }
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        // forma basica
        //if (o1.getNumero() == o2.getNumero()) {
        //    return 0;
        //} else if (o1.getNumero() > o2.getNumero()) {
        //    return 1;
        //} else {
        //    return -1;
        // forma intermedia
        //return o1.getNumero() - o2.getNumero();
        //forma wrapper
        return Integer.compare(o1.getNumero(),o2.getNumero());
        }
}
class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());

    }
}