package br.ufes.dip;

/**
 *
 * @author Alcebiades
 */
public class Botao {

    private Dispositivo dispositivo;

    public void acionar(int i) {
        dispositivo = new Lampada();
        if (i == 1) {
            dispositivo.ligar();
        } else {
            dispositivo.desligar();
        }
    }
}
