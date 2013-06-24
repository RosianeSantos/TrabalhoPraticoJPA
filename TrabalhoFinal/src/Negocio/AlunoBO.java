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
        if(aluno.getCpf().trim().length() == 0){
            throw new RuntimeException("O CPF nao pode ser vazio!");
        }
        if (aluno.getCpf().length() > 14){
            throw new RuntimeException("O CPF esta além do tamanho permitido!");
        }
        if(aluno.getRg().trim().length() == 0){
            throw new RuntimeException("O CPF nao pode ser vazio!");
        }
        if (aluno.getRg().length() > 14){
            throw new RuntimeException("O CPF esta além do tamanho permitido!");
        }
        if(aluno.getTelefone().trim().length() == 0){
            throw new RuntimeException("O Telefone nao pode ser vazio!");
        }
        if (aluno.getTelefone().length() > 14){
            throw new RuntimeException("O Telefone esta além do tamanho permitido!");
        }
        if(aluno.getEmail().trim().length() == 0){
            throw new RuntimeException("O Email nao pode ser vazio!");
        }
        if (aluno.getEmail().length() > 14){
            throw new RuntimeException("O Email esta além do tamanho permitido!");
        }
        if(aluno.getNomeresp().trim().length() == 0){
            throw new RuntimeException("O nome do responsavel nao pode ser vazio!");
        }
        if (aluno.getNomeresp().length() > 40){
            throw new RuntimeException("O nome do responsavel esta além do tamanho permitido!");
        }
        if(aluno.getTelefoneresp().trim().length() == 0){
            throw new RuntimeException("O CPF nao pode ser vazio!");
        }
        if (aluno.getTelefoneresp().length() > 14){
            throw new RuntimeException("O CPF esta além do tamanho permitido!");
        }
        if(aluno.getIdcurso() == 0){
            throw new RuntimeException("O Codigo do Curso nao pode ser 0!");
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
