/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.TarefaSemanaisDAO;
import DomainModel.TarefasSemanais;
import java.util.List;

/**
 *
 * @author Iara
 */
public class TarefaSemanaisBO {
    private TarefaSemanaisDAO tarefaDAO = new TarefaSemanaisDAO();
    
    public boolean Salvar(TarefasSemanais tarefasemanal){
        if(tarefasemanal.getDescricao().trim().length() == 0){
            throw new RuntimeException("A descricao nao pode ser vazia!");
        }
        if (tarefasemanal.getDescricao().length() > 70){
            throw new RuntimeException("A descricao esta além do tamanho permitido!");
        }
        tarefaDAO.Salvar(tarefasemanal);
        return true;
    }
    
    public TarefasSemanais Abrir(int codigo){
        return tarefaDAO.Abrir(codigo);
    }
    public boolean Apagar(TarefasSemanais tarefasemanal){
        return tarefaDAO.Apagar(tarefasemanal);
    }
    public List<TarefasSemanais> listarTodos(){
        return tarefaDAO.listarTodos();
    }
    
    public List<TarefasSemanais> buscar(TarefasSemanais filtro){
        return tarefaDAO.buscar(filtro);
    }
    
    
}
