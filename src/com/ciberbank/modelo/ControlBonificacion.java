package com.ciberbank.modelo;

public class ControlBonificacion {
    private double suma;
    public double registrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println(this.suma);
        return this.suma;
    }
}
