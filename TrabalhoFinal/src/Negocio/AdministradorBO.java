/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AdministradorDAO;
import DomainModel.Administrador;

/**
 *
 * @author Iara
 */
public class AdministradorBO {
    private AdministradorDAO administradorDAO = new AdministradorDAO();
    
    public boolean Salvar(Administrador administrador){
        if(administrador.getUsuario().trim().length() == 0){
            throw new RuntimeException("O usuario nao pode ser vazio!");
        }
        if (administrador.getUsuario().length() > 20){
            throw new RuntimeException("O usuario esta além do tamanho permitido!");
        }
        administradorDAO.Salvar(administrador);
        return true;
    }
    public Administrador Abrir(int codigo){
        return administradorDAO.Abrir(codigo);
    }
    public void Apagar(Administrador administrador){
        administradorDAO.Apagar(administrador);
    }
    
}
