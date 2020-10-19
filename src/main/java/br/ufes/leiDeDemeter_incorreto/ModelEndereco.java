package br.ufes.leiDeDemeter_incorreto;

/**
 *
 * @author Alcebiades
 */
public class ModelEndereco implements IModelEndereco {

    private String rua, CEP;

    @Override
    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public void setCep(String cep) {
        this.CEP = cep;
    }

    @Override
    public String getRua() {
        return this.rua;
    }

    @Override
    public String getCep() {
        return this.CEP;
    }

}
