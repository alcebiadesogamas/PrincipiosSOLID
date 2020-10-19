package br.ufes.leiDeDemeter;

/**
 *
 * @author Alcebiades
 */
public class ModelPessoa implements IModelPessoa{
    private String pessoa;
    private IModelCasa casa;
    @Override
    public void setCasa(IModelCasa casa) {
        this.casa =  casa;
    }
    public IModelCasa getCasa(){
        return casa;
    }
    public String getCep(){
        return casa.getCep();
    }
    
}
