package br.ufes.lsp;

/**
 *
 * @author Alcebiades
 */
public abstract class Paralelogramo {
    private double altura,largura;
    
    public Paralelogramo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double calculaArea(){
        return this.altura*this.largura;
    }
}
