package br.ufes.dip_incorreto;

/**
 *
 * @author Alcebiades
 */
public class Botao {
    private Lampada lampada;
    
    public void acionar(int i){
        lampada = new Lampada();
        if(i == 1)
            lampada.ligar();
        else
            lampada.desligar();
    }
}
