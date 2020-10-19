package br.ufes.crp_incorreto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alcebiades
 */
public class ContaSalario extends ContaCorrente {

    @Override
    public void rende() {
        try {
            throw new Exception("Esse tipo de conta não possui rendimento");
        } catch (Exception ex) {
            Logger.getLogger(ContaSalario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}