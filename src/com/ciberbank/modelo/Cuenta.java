package com.ciberbank.modelo;// Entidad cuenta:

/**
 * Cuenta va a crear nuevas instancias
 */
public abstract class Cuenta {
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    public static int total;

    /**
     * Intancia una nueva cuenta sin parametros
     *
     */
    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estoy creando una cuenta "+ numero);
        total ++;
    }

    // No retorna valor
    public abstract void depositar (double valor);

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error devulve un excepcion
     * @param valor
     * @throws SaldoInsificienteException
     */
    public void retirar (double valor) throws SaldoInsificienteException {
        if (this.saldo < valor) {
            throw new SaldoInsificienteException("No tienes saldo");
        }
        this.saldo -= valor;

    }
    public boolean transferir (double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            try {
                this.retirar(valor);
            } catch (SaldoInsificienteException e) {
                e.printStackTrace();
            }
            cuenta.depositar(valor);
            return true;
        }
        return false;

    }
    public double getsaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    @Override
    public String toString() {
        String cuenta = "Número: " + this.numero + ", Agencia: " + this.agencia;
        return cuenta;
    }
}