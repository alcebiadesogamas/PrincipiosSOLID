package br.ufes.lsp;

/**
 *
 * @author Alcebiades
 */
public class Principal {
    private static void ObterAreaRetangulo(Paralelogramo ret) {
        System.out.println("Calculo da área do Retangulo");
        System.out.println(ret.calculaArea());

    }
    public static void main(String[] args) {
         Paralelogramo quad;
        try {
            quad = new ModelQuadrado(5,10);
            ObterAreaRetangulo(quad);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
