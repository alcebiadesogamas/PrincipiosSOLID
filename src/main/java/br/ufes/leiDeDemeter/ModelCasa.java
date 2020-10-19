package br.ufes.leiDeDemeter;

/**
 *
 * @author Alcebiades
 */
public class ModelCasa implements IModelCasa{
    private String cor;
    private IModelEndereco endereco;
    @Override
    public void setEndereco(IModelEndereco endereco) {
       this.endereco = endereco;
    }
    
    public IModelEndereco getEndereco(){
        return endereco;
    }
    
    public String getCep(){
        return endereco.getCep();
    }
}
