/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.CampusDAO;
import DomainModel.Campus;

/**
 *
 * @author Iara
 */
public class CampusBO {
    private CampusDAO campusDAO = new CampusDAO();
    
    public boolean Salvar(Campus campus){
        if(campus.getNome().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        if (campus.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        campusDAO.Salvar(campus);
        return true;
    }
    public Campus Abrir(int codigo){
        return campusDAO.Abrir(codigo);
    }
    public void Apagar(Campus campus){
        campusDAO.Apagar(campus);
    }
}
