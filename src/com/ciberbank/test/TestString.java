package com.ciberbank.test;

import com.ciberbank.modelo.CuentaAhorro;

public class TestString {
    public static void main(String[] args) {
        String nombre = "cibebank";
        System.out.println("Antes de replace: "+nombre);
        nombre = nombre.replace("c","C");
        printline(nombre);
        printline(new CuentaAhorro(200,2313));
    }

    public static void printline(Object valor) {
        System.out.println(valor.toString());
    }
}
