/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONN.Conexion;
import DTO.ProveedorDTO;
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
public class ProveedorDAO {
    
    
    public void agregaProveedor(ProveedorDTO proveedor)
    {
        
        try
        {
            Connection conexion=Conexion.getConnection();
            String sql="INSERT INTO proveedores (rut_proveedor,nom_proveedor) VALUES (?,?)";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setString(1, proveedor.getRut_proveedor());
            ps.setString(2, proveedor.getNom_proveedor());
            
            ps.executeUpdate();
            
        }catch(SQLException e)
        {
            
        }
        
        
    }
    
    public List<ProveedorDTO> listarTodos()
    {
        List<ProveedorDTO> lista=new ArrayList<>();
        
        try
        {
            Connection conexion=Conexion.getConnection();
            String query="SELECT id_proveedor,rut_proveedor,nom_proveedor FROM proveedores";
            PreparedStatement ps=conexion.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                ProveedorDTO proveedor=new ProveedorDTO();
                proveedor.setId_proveedor(rs.getInt("id_proveedor"));
                proveedor.setRut_proveedor(rs.getString("rut_proveedor"));
                proveedor.setNom_proveedor(rs.getString("nom_proveedor"));
                lista.add(proveedor);
            }
            
        }catch(SQLException e)
        {
            
        }
        
        return lista;
    }
    
    public List<ProveedorDTO> comboProveedor()
    {
        List<ProveedorDTO> lista=new ArrayList<>();
        
        try
        {
            Connection conexion=Conexion.getConnection();
            String query="SELECT id_proveedor,nom_proveedor FROM proveedores";
            PreparedStatement ps=conexion.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                ProveedorDTO proveedor=new ProveedorDTO();
                proveedor.setId_proveedor(rs.getInt("id_proveedor"));
              /*  proveedor.setRut_proveedor(rs.getString("rut_proveedor"));*/
                proveedor.setNom_proveedor(rs.getString("nom_proveedor"));
                lista.add(proveedor);
            }
            
        }catch(SQLException e)
        {
            
        }
        
        return lista;
    }
    
    
}
