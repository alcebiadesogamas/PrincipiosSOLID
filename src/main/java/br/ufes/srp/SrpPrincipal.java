package br.ufes.srp;

import java.time.LocalDate;

/**
 *
 * @author Alcebiades
 */
public class SrpPrincipal {
    public static void main(String[] args) {
        ModelCliente cliente = new ModelCliente(1,"Alcebiades", "alcebiades@alcebiades.com", "028999-9999", "122.222.222.22", LocalDate.now());
        try{
            ClienteDAO cdao = new ClienteDAO();
            cdao.adcicionarCliente(cliente);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
