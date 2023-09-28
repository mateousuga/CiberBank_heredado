package com.ciberbank.test;

import com.ciberbank.modelo.Gerente;

public class TestFuncionario {
    public static void main(String[] args) {
        // com.ciberbank.modelo.Funcionario sergio = new com.ciberbank.modelo.Funcionario();
        Gerente gerente = new Gerente();

        gerente.setSalario(1500);
        gerente.setClave("clave");
        gerente.setTipo(1);

        System.out.println(gerente.getSalario());
        System.out.println(gerente.iniciarSesion("clave"));
    }
}
