/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AlunoDAO;
import DomainModel.Aluno;

/**
 *
 * @author Iara
 */
public class AlunoBO {
    private AlunoDAO alunoDAO = new AlunoDAO();
    
    public boolean Salvar(Aluno aluno){
        if(aluno.getNome().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        if (aluno.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        alunoDAO.Salvar(aluno);
        return true;
    }
    public Aluno Abrir(int codigo){
        return alunoDAO.Abrir(codigo);
    }
    public void Apagar(Aluno aluno){
        alunoDAO.Apagar(aluno);
    }
}
