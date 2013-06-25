/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.CampusDAO;
import DomainModel.Campus;
import java.util.List;

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
            throw new RuntimeException("O nome está além do tamanho permitido!");
        }
        if(campus.getTelefone().trim().length() == 0){
            throw new RuntimeException("O telefone nao pode ser vazio!");
        }
        if (campus.getTelefone().length() > 14){
            throw new RuntimeException("O telefone está além do tamanho permitido!");
        }
        if(campus.getCidade().trim().length() == 0){
            throw new RuntimeException("O campo cidade nao pode ser vazio!");
        }
        if (campus.getCidade().length() > 30){
            throw new RuntimeException("Campo cidade está além do tamanho permitido!");
        }
        if(campus.getRua().trim().length() == 0){
            throw new RuntimeException("Campo rua nao pode ser vazio!");
        }
        if (campus.getRua().length() > 40){
            throw new RuntimeException("Campo rua esta além do tamanho permitido!");
        }
        if (campus.getNumero() == 0){
            throw new RuntimeException("Numero Inválido!");
        }
        campusDAO.Salvar(campus);
        return true;
    }
    public Campus Abrir(int codigo){
        return campusDAO.Abrir(codigo);
    }
    public boolean Apagar(Campus campus){
        campusDAO.Apagar(campus);
        return true;
    }
    public List<Campus> listarTodos (){
        return campusDAO.listarTodos();
        
    }
    public List<Campus> buscar(Campus filtro){
        return campusDAO.buscar(filtro);
    }
}

