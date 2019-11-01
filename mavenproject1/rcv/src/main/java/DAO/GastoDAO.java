/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONN.Conexion;
import DTO.GastoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author felipegutierrez
 */
public class GastoDAO {
    
    
    public void agregaRegistro(GastoDTO gasto)
    {
        
        try
        {
            Connection conexion=Conexion.getConnection();
            String sql="INSERT INTO gasto (id_usr,id_proveedor,id_cond_pago,monto_gasto,fecha_pago,estado_pago,descripcion,nro_docto) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, gasto.getId_usr());
            ps.setString(2, gasto.getRut_provedor());
            ps.setInt(3, gasto.getId_cond_pago());
            ps.setInt(4,gasto.getMonto());
            java.sql.Date sqlDate=new java.sql.Date(gasto.getFecha_pago().getTime());
            ps.setDate(5,sqlDate);
            ps.setString(6,gasto.getEstado_pago());
            ps.setString(7,gasto.getDescripcion_pago());
            ps.setString(8,gasto.getNro_docto_pago() );
            
            ps.executeUpdate();
            
        }catch(SQLException e)
        {
            
        }
        
        
    }
    
}
