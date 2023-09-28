package com.ciberbank.test;

import com.ciberbank.modelo.Funcionario;
import com.ciberbank.modelo.Gerente;

public class TestReferencias {
    public static void main(String[] args) {
        //el elemento mas generico puede ser adaptado al elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Jaime");

        Gerente gerente = new Gerente();
        gerente.setNombre("laidy");

        funcionario.setSalario(3000);
        gerente.setSalario(5000);
    }
}
