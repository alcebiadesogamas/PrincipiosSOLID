package br.ufes.lsp_incorreto;

/**
 *
 * @author Alcebiades
 */
public class Principal {

    private static void ObterAreaRetangulo(Retangulo ret) {
        System.out.println("Calculo da área do Retangulo");
        System.out.println(ret.calcularArea());

    }

    public static void main(String[] args) {
        Retangulo quad = new Quadrado(5,10);
        ObterAreaRetangulo(quad);
    }
}
