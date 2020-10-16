package br.ufes.ocp;

import java.util.ArrayList;

/**
 *
 * @author Alcebiades
 */
public interface IMetodosEstatistica {

    public double calcula(int op, ArrayList<Double> numeros);

    public double getSomaDosElementosAoQuadrado(ArrayList<Double> numeros);

    public double getSomaDosElementos(ArrayList<Double> numeros);
}
