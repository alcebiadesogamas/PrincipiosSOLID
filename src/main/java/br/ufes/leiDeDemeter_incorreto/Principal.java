package br.ufes.leiDeDemeter_incorreto;

/**
 *
 * @author Alcebiades
 */
public class Principal {
    public static void main(String[] args) {
        ModelEndereco end = new ModelEndereco();
        end.setRua("um");
        end.setCep("0001");
        
        ModelCasa casa = new ModelCasa();
        casa.setEndereco(end);
        
        IModelPessoa p = new ModelPessoa();
        p.setCasa(casa);
        
        System.out.println(p.getCasa().getEndereco().getCep());
    }
}
