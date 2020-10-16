package br.ufes.srp_violacao;

import java.time.LocalDate;

/**
 *
 * @author Alcebiades
 */
public class ModelCliente {
    
    private int clienteId;
    private String nome;
    private String email;
    private String telefone;
    private String CPF;
    private LocalDate dataCadastro;
    
    public void adicionarCliente(ModelCliente cliente){
        //operações para adicionar o cliente no banco de dados;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
}
