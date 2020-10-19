package br.ufes.crp;

/**
 *
 * @author Alcebiades
 */
public class ContaCorrente {

    private ControladorDeContas controlador;

    public ContaCorrente() {
        this.controlador = new ControladorDeContas();
    }

    public void depositar(double valor) {
        this.controlador.depositar(valor);
    }
    
    public void sacar(double valor) {
    	this.controlador.sacar(valor);
    }

    public double getSaldo() {
        return this.controlador.getSaldo();
    }

    public void render() {
        this.controlador.render(0.02);
    }
	
    @Override
    public String toString() {
    	return "Saldo da conta corrente: " + this.getSaldo();
    }	
}