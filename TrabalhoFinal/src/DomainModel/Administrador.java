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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rosy
 */
@Entity
public class Administrador {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idAdministrador;
    @Column(name="Usuario",length=200,nullable=false)
    private String usuario;
    @Column(name="Senha",length=20,nullable=false)
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
