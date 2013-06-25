/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.PredioDAO;
import DomainModel.Predio;
import java.util.List;

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
        if (predio.getCodfuncionario() == 0){
            throw new RuntimeException("Codigo do Funcionario Invalido!");
        }
        if (predio.getCodcampus() == 0){
            throw new RuntimeException("Codigo do Campus Inválido!");
        }
        predioDAO.Salvar(predio);
        return true;
    }
    public Predio Abrir(int codigo){
        return predioDAO.Abrir(codigo);
    }
    public boolean Apagar(Predio predio){
        return predioDAO.Apagar(predio);
    }
    
    public List<Predio> listarTodos(){
        return predioDAO.listarTodos();
    }
    
    public List<Predio> buscar(Predio filtro){
        return predioDAO.buscar(filtro);
    }
    
}

