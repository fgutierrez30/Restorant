/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONN.Conexion;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





/**
 *
 * @author felipegutierrez
 */
public class UsuarioDAO {
    
 
    public UsuarioDTO getUsr(String login,String clave)
    {
        UsuarioDTO usr=null;
        try
        {
            
            Connection conexion=Conexion.getConnection();
            String query="SELECT id_usr,nombre_usr,apell_usr,apell2_usr FROM usuarios WHERE login=? and clave=?";
            PreparedStatement ps=conexion.prepareStatement(query);
            ps.setString(1, login);
            ps.setString(2, clave);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                usr=new UsuarioDTO();
                usr.setId_usr(rs.getInt("id_usr"));
                usr.setNombreUsuario(rs.getString("nombre_usr"));
                usr.setApellUsuario(rs.getString("apell_usr"));
                usr.setApell2Usuario(rs.getString("apell2_usr"));
                
            }
            
            
        }catch(SQLException e)
        {
            
        }
        return usr;
        
    }
            
}
