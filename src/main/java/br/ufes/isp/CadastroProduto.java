package br.ufes.isp;

/**
 *
 * @author Alcebiades
 */
public class CadastroProduto implements ICadastroProduto {

    @Override
    public void validarDados() {
        //validando dados do 
        System.out.println("validando dados.");
    }

    @Override
    public void salvarDados() {
        //salvando dados no banco;
        System.out.println("salvando dados no banco de dados");
    }

}
