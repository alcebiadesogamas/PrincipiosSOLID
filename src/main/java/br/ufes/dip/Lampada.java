package br.ufes.dip;

/**
 *
 * @author Alcebiades
 */
public class Lampada implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Desligado");
    }
    
}
