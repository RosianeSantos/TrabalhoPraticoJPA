/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.EstoqueGeralDAO;
import DomainModel.EstoqueGeral;

/**
 *
 * @author Iara
 * 
 * 
idmaterial int
 */
public class EstoqueGeralBO {
    private EstoqueGeralDAO estoquegeralDAO = new EstoqueGeralDAO();
    
    public boolean Salvar(EstoqueGeral estoquegeral){
        if(estoquegeral.getQtde() == 0){
            throw new RuntimeException("A quantidade deve ser maior que zero!");
        }
        estoquegeralDAO.Salvar(estoquegeral);
        return true;
    }
    public EstoqueGeral Abrir(int codigo){
        return estoquegeralDAO.Abrir(codigo);
    }
    public void Apagar(EstoqueGeral estoquegeral){
        estoquegeralDAO.Apagar(estoquegeral);
    }
    
}
