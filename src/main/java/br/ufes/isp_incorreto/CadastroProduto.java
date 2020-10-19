package br.ufes.isp_incorreto;

/**
 *
 * @author Alcebiades
 */
public class CadastroProduto implements ICadastro {

    @Override
    public void validarDados() {
        //validando dados do produto
        System.out.println("validando dados.");
    }

    @Override
    public void salvarDados() {
        //salvando dados no banco;
        System.out.println("salvando dados no banco de dados");
    }

    @Override
    public void enviarEmail() {
        //Produto não envia e-mail
    }

}
