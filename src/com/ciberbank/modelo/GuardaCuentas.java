package com.ciberbank.modelo;

public class GuardaCuentas {

    // crear un objecto para guardar cuentas y agregar cuentas con un metodo
    //guardarCuentas.adicional(cuenta);
    // obtener, remover, etc.
    Cuenta[] cuenta = new Cuenta[10];
    int indice = 0;

    public void adicionar(Cuenta cc) {
        cuenta[indice] = cc;
        indice++;
    }

    public Cuenta obtener(int indice) {
        return cuenta[indice];
    }
}
