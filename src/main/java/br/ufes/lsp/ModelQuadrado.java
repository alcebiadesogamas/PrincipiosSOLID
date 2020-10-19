package br.ufes.lsp;

/**
 *
 * @author Alcebiades
 */
public class ModelQuadrado extends Paralelogramo {

    public ModelQuadrado(double altura, double largura) throws Exception {
        super(altura, largura);
        if (largura != altura) {
            throw new Exception("Lados do quadrado precisam ser iguais");
        }
    }

}
