package br.ufes.crp;

/**
 *
 * @author Alcebiades
 */
public class ControladorDeContas {

    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void render(double taxa) {
        this.saldo = this.saldo + (this.saldo * taxa);
    }
}
