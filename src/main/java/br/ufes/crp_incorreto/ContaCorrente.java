package br.ufes.crp_incorreto;

/**
 * 
 * @author Alcebiades
 */
public class ContaCorrente {

    protected double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende() {
        this.saldo *= 0.03;
    }
}