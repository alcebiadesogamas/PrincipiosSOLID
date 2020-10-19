package br.ufes.crp;

/**
 *
 * @author Alcebiades
 */
public class ContaSalario {
	
    private ControladorDeContas controlador;
	
    public ContaSalario() {
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
    
    @Override
    public String toString() {
    	return "Saldo da conta salario: " + this.getSaldo();
    }
}
