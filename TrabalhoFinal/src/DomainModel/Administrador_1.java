/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * create table administrador(
idadministrador int not null primary key,
usuario varchar(20),
senha varchar(18))
 */
package DomainModel;

/**
 *
 * @author Iara
 */
public class Administrador {
    private int idAdministrador;
    private String usuario;
    private String senha;
    
    public Administrador(){
        idAdministrador =0;
        usuario = "";
        senha = "";    
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
