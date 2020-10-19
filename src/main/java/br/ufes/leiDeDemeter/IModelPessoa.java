package br.ufes.leiDeDemeter;

/**
 *
 * @author Alcebiades
 */
public interface IModelPessoa {
    public void setCasa(IModelCasa casa);
    public IModelCasa getCasa();
    public String getCep();
}
