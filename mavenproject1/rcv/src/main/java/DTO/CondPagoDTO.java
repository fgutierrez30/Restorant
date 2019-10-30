/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Felipe Gutierrez
 */
public class CondPagoDTO {
    
    private int id_condPago;
    private String nom_condPago;
    
    @Override
    public String toString()
    {
        return nom_condPago;
    }
    

    public int getId_condPago() {
        return id_condPago;
    }

    public void setId_condPago(int id_condPago) {
        this.id_condPago = id_condPago;
    }

    public String getNom_condPago() {
        return nom_condPago;
    }

    public void setNom_condPago(String nom_condPago) {
        this.nom_condPago = nom_condPago;
    }
    
    
    
}
