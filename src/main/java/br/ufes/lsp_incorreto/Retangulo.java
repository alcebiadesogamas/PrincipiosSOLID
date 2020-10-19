package br.ufes.lsp_incorreto;

/**
 *
 * @author Alcebiades
 */
public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public double calcularArea(){
        return altura*largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
}
