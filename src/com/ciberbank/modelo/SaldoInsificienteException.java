package com.ciberbank.modelo;

public class SaldoInsificienteException extends Exception {
    public SaldoInsificienteException (String mensaje) {
        super(mensaje);
    }
}
