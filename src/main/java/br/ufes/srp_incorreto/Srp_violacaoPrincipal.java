package br.ufes.srp_incorreto;

/**
 *
 * @author Alcebiades
 */
public class Srp_violacaoPrincipal {
    public static void main(String[] args) {
        ModelCliente cliente = new ModelCliente();
        cliente.adicionarCliente(cliente);
    }
    /**
     * note que o cliente está com a responsabilidade de se adicionar no banco, ferindo o SRP.
     */
}
