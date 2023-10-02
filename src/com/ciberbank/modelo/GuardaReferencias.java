package com.ciberbank.modelo;

public class GuardaReferencias {


    // crear un objecto para guardar cuentas y agregar cuentas con un metodo
    //guardarCuentas.adicional(cuenta);
    // obtener, remover, etc.
    Object[] referencia = new Object[10];
    int indice = 0;

    public void adicionar(Object cc) {
        referencia[indice] = cc;
        indice++;
    }
    public Object obtener(int indice) {
        return referencia[indice];
    }

}
