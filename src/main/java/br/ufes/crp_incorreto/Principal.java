package br.ufes.crp_incorreto;

/**
 *
 * @author Alcebiades
 */
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<ContaCorrente> listaDeContas = new ArrayList<>();
        listaDeContas.add(new ContaCorrente());
        listaDeContas.add(new ContaSalario());

        for (ContaCorrente conta : listaDeContas) {
            conta.rende();

            System.out.println("Saldo Novo:");
            System.out.println(conta.getSaldo());
        }
    }
}
