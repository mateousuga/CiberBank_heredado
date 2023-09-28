package com.ciberbank.modelo;

public class Gerente extends Funcionario implements Autenticable {

    //sobre-escritura de metodo
    public double getBonificacion() {
        return 200;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
