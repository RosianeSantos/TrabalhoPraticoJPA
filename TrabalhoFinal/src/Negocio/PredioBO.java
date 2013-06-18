/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.PredioDAO;
import DomainModel.Predio;

/**
 *
 * @author Iara
 */
public class PredioBO {
    private PredioDAO predioDAO = new PredioDAO();
    
    public boolean Salvar(Predio predio){
        if(predio.getNome().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        if (predio.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        predioDAO.Salvar(predio);
        return true;
    }
    public Predio Abrir(int codigo){
        return predioDAO.Abrir(codigo);
    }
    public void Apagar(Predio predio){
        predioDAO.Apagar(predio);
    }
    
}
