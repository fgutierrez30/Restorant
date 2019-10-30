/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author felipegutierrez
 */
public class UsuarioDTO {
    
    private int id_usr;

    public int getId_usr() {
        return id_usr;
    }

    public void setId_usr(int id_usr) {
        this.id_usr = id_usr;
    }
    private String nombreUsuario;
    private String apellUsuario;
    private String apell2Usuario;
    private String userName;
    private String clave;
    private int estadoUsr;

    public String getApell2Usuario() {
        return apell2Usuario;
    }

    public void setApell2Usuario(String apell2Usuario) {
        this.apell2Usuario = apell2Usuario;
    }

    public int getEstadoUsr() {
        return estadoUsr;
    }

    public void setEstadoUsr(int estadoUsr) {
        this.estadoUsr = estadoUsr;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellUsuario() {
        return apellUsuario;
    }

    public void setApellUsuario(String apellUsuario) {
        this.apellUsuario = apellUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public UsuarioDTO() {
    }
    
    
    
}
