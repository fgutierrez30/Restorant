/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author felipegutierrez
 */
public class Conexion {

    public static Connection getConnection()
    {
        Connection con=null;
        try{
            String url="jdbc:sqlite:registro.db";
            con=DriverManager.getConnection(url);
            System.out.println("Conexion exitosa");
            
        }catch(SQLException e)
        {
            System.out.println("error "+ e.getMessage());
        }
        return con;
        
    }
    
}
