/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.MaterialDAO;
import DomainModel.Material;
import java.util.List;

/**
 *
 * @author Iara
 */
public class MaterialBO {
    
    private MaterialDAO materialDAO = new MaterialDAO();
    
    public boolean Salvar(Material material){
        if(material.getDescricao().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        if (material.getDescricao().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        materialDAO.Salvar(material);
        return true;
    }
    public Material Abrir(int codigo){
        return materialDAO.Abrir(codigo);
    }
    public boolean Apagar(Material material){
        return materialDAO.Apagar(material);
    }
    public List<Material> listarTodos(){
        return materialDAO.listarTodos();
    }
    
    public List<Material> buscar(Material filtro){
        return materialDAO.buscar(filtro);
    }
    
}
