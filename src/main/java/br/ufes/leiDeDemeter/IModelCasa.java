package br.ufes.leiDeDemeter;

/**
 *
 * @author Alcebiades
 */
public interface IModelCasa {
    public void setEndereco(IModelEndereco endereco);
    public IModelEndereco getEndereco();
    public String getCep();
}
