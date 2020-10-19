package br.ufes.lsp_incorreto;

/**
 *
 * @author Alcebiades
 */
public class Quadrado extends Retangulo {

    public Quadrado(double altura, double largura) {
        super(altura, largura);
    }
    
    @Override
    public void setAltura(double altura) {
        this.setAltura(altura);
        this.setLargura(altura); //define altura igual a largura para o quadrado
    }

    @Override
    public void setLargura(double largura) {
        this.setAltura(largura);
        this.setLargura(largura); //define altura igual a largura para o quadrado
    }
}
