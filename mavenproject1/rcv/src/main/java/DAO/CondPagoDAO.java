/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONN.Conexion;
import DTO.CondPagoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Gutierrez
 */
public class CondPagoDAO {
    
    public List<CondPagoDTO> listarTodos()
    {
        List<CondPagoDTO> lista=new ArrayList<>();
        
        try
        {
            Connection conexion=Conexion.getConnection();
            String query="SELECT id_condicion_pago,nom_condicion_pago FROM condicion_pago";
            PreparedStatement ps=conexion.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                CondPagoDTO condPago=new CondPagoDTO();
                condPago.setId_condPago(rs.getInt("id_condicion_pago"));
                condPago.setNom_condPago(rs.getString("nom_condicion_pago"));
                
                lista.add(condPago);
            }
            
        }catch(SQLException e)
        {
            
        }
        
        return lista;
    }
    
}
