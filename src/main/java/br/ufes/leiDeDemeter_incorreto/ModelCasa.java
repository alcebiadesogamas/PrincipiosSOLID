package br.ufes.leiDeDemeter_incorreto;

/**
 *
 * @author Alcebiades
 */
public class ModelCasa implements IModelCasa{
    private String cor;
    private ModelEndereco endereco;
    
    @Override
    public void setEndereco(ModelEndereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public ModelEndereco getEndereco(){
        return this.endereco;
    }
}
