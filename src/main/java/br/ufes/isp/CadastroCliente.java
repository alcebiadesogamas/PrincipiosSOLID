package br.ufes.isp;

/**
 *
 * @author Alcebiades
 */
public class CadastroCliente implements ICadastroCliente {

    @Override
    public void validarDados() {
        //Procedimento para validar Dados;
        System.out.println("Validando Dados.");
    }

    @Override
    public void salvarDados() {
        //procedimento para salvar dados no banco de Dados
        System.out.println("Salvando Dados no Banco.");
    }

    @Override
    public void enviarEmail() {
        //procedimento para enviar o e-mail
        System.out.print("Email Enviado");
    }

}
