package br.ufes.leiDeDemeter;

/**
 *
 * @author Alcebiades
 */
public class Principal {
    public static void main(String[] args) {
        IModelEndereco end = new ModelEndereco();
        end.setRua("um");
        end.setCep("0001");
        
        IModelCasa casa = new ModelCasa();
        casa.setEndereco(end);
        
        IModelPessoa p = new ModelPessoa();
        p.setCasa(casa);
        
        System.out.println(p.getCep());
    }
}
