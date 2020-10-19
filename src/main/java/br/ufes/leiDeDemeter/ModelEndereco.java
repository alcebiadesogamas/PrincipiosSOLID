package br.ufes.leiDeDemeter;

/**
 *
 * @author Alcebiades
 */
public class ModelEndereco implements IModelEndereco {

    private String rua;
    private String CEP;

    @Override
    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public void setCep(String Cep) {
        this.CEP = Cep;
    }

    @Override
    public String getCep() {
        return this.CEP;
    }

    @Override
    public String getRua() {
        return this.rua;
    }

}
