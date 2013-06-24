/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AlunoTarefaDAO;
import DomainModel.AlunoTarefa;

/**
 *
 * idaluno int
idtarefa int
 * @author Iara
 */
public class AlunoTarefaBO {
    private AlunoTarefaDAO alunotarefaDAO = new AlunoTarefaDAO();
    
    public boolean Salvar(AlunoTarefa alunotarefa){
        alunotarefaDAO.Salvar(alunotarefa);
        return true;
    }
    public AlunoTarefa Abrir(int codigo){
        return alunotarefaDAO.Abrir(codigo);
    }
    public void Apagar(AlunoTarefa alunotarefa){
        alunotarefaDAO.Apagar(alunotarefa);
    }
    
}
