package com.ciberbank.test;

import com.ciberbank.modelo.Administrador;
import com.ciberbank.modelo.Gerente;
import com.ciberbank.modelo.SistemaInterno;

public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        sistema.autentica(gerente1);
        sistema.autentica(admin);
    }
}
