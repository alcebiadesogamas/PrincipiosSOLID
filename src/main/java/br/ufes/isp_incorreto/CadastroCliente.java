package br.ufes.isp_incorreto;

/**
 *
 * @author Alcebiades
 */
public class CadastroCliente implements ICadastro {

    @Override
    public void validarDados() {
        System.out.println("Validando Dados.");
    }

    @Override
    public void salvarDados() {
        System.out.println("Salvando Dados no Banco.");
    }

    @Override
    public void enviarEmail() {
        System.out.print("Email Enviado");
    }

}
