/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.MaterialQuartoDAO;
import DomainModel.MaterialQuarto;

/**
 *
 * -
idmaterial int

 * @author Iara
 */
public class MaterialQuartoBO {
    private MaterialQuartoDAO materialquartoDAO = new MaterialQuartoDAO();
    
    public boolean Salvar(MaterialQuarto materialquarto){
        if(materialquarto.getQtde() == 0){
            throw new RuntimeException("A quantidade deve ser maior que zero!");
        }
        materialquartoDAO.Salvar(materialquarto);
        return true;
    }
    public MaterialQuarto Abrir(int codigo){
        return materialquartoDAO.Abrir(codigo);
    }
    public void Apagar(MaterialQuarto materialquarto){
        materialquartoDAO.Apagar(materialquarto);
    }
    
}
