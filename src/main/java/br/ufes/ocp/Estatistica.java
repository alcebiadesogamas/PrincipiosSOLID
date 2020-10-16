package br.ufes.ocp;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alcebiades
 * 
 * Este Exemplo foi retirado do caderno de exercícios.
 */
public class Estatistica implements IMetodosEstatistica {

    private static final int MEDIA = 0;
    private static final int SOMATORIO = 1;
    private static final int MAIOR = 2;
    private static final int MENOR = 3;
    private static final int VARIANCIA = 4;
    private static final int DESVIOPADRAO = 5;
    private ArrayList<Double> meusNumeros;

    @Override
    public double calcula(int op, ArrayList<Double> numeros) {
        if (op == Estatistica.MEDIA) {
            double total = 0;
            for (int i = 0; i < numeros.size(); i++) {
                total += numeros.get(i);
            }
            return total / numeros.size();
        } else if (op == Estatistica.SOMATORIO) {
            return getSomaDosElementos(numeros);

        } else if (op == Estatistica.MAIOR) {
            return Collections.max(numeros);
        } else if (op == Estatistica.MENOR) {
            return Collections.min(numeros);
        } else if (op == Estatistica.VARIANCIA) {
            double p1 = 1 / Double.valueOf(numeros.size() - 1);
            double p2 = getSomaDosElementosAoQuadrado(numeros) - (Math.pow(getSomaDosElementos(numeros),
                    2) / Double.valueOf(numeros.size()));
            return p1 * p2;
        } else if (op == Estatistica.DESVIOPADRAO) {
            double p1 = 1 / Double.valueOf(numeros.size() - 1);
            double p2 = getSomaDosElementosAoQuadrado(numeros) - (Math.pow(getSomaDosElementos(numeros), 2)
                    / Double.valueOf(numeros.size()));
            return Math.sqrt(p1 * p2);
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public double getSomaDosElementosAoQuadrado(ArrayList<Double> numeros
    ) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += Math.pow(numeros.get(counter), 2);
        }
        return total;

    }

    @Override
    public double getSomaDosElementos(ArrayList<Double> numeros
    ) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += numeros.get(counter);
        }
        return total;
    }
}
