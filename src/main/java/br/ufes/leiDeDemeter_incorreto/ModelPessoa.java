package br.ufes.leiDeDemeter_incorreto;

/**
 *
 * @author Alcebiades
 */
public class ModelPessoa implements IModelPessoa{
    private String nome;
    private ModelCasa casa;

    @Override
    public void setCasa(ModelCasa casa) {
        this.casa = (ModelCasa) casa;
    }
    
    @Override
    public ModelCasa getCasa(){
        return this.casa;
    }
    
    
}
