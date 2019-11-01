/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author felipegutierrez
 */
public class GastoDTO {
    
    private int id_gasto;
    private int id_usr;
    private String rut_provedor;
    private int id_cond_pago;
    private int monto;
    private Date fecha_pago;
    private String estado_pago;
    private String descripcion_pago;
    private String nro_docto_pago;

    public int getId_gasto() {
        return id_gasto;
    }

    public void setId_gasto(int id_gasto) {
        this.id_gasto = id_gasto;
    }

    public int getId_usr() {
        return id_usr;
    }

    public void setId_usr(int id_usr) {
        this.id_usr = id_usr;
    }

    public String getRut_provedor() {
        return rut_provedor;
    }

    public void setRut_provedor(String rut_provedor) {
        this.rut_provedor = rut_provedor;
    }

    public int getId_cond_pago() {
        return id_cond_pago;
    }

    public void setId_cond_pago(int id_cond_pago) {
        this.id_cond_pago = id_cond_pago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getDescripcion_pago() {
        return descripcion_pago;
    }

    public void setDescripcion_pago(String descripcion_pago) {
        this.descripcion_pago = descripcion_pago;
    }

    public String getNro_docto_pago() {
        return nro_docto_pago;
    }

    public void setNro_docto_pago(String nro_docto_pago) {
        this.nro_docto_pago = nro_docto_pago;
    }
    
    
    
    
}
