/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AlocacaoDAO;
import DomainModel.Alocacao;

/**
 *
 * @author Iara
 * 
dataentrada date
datasaida date
 */
public class AlocacaoBO {
    private AlocacaoDAO alocacaoDAO = new AlocacaoDAO();
    
    public boolean Salvar(Alocacao alocacao){
        if(alocacao.getIdaluno() == 0){
            throw new RuntimeException("O Codigo do Aluno nao pode ser igual a 0!");
        }
        if(alocacao.getIdquarto() == 0){
            throw new RuntimeException("O Codigo do Quarto nao pode ser igual a 0!");
        }
        if(alocacao.getSemestreletivo().trim().length() == 0){
            throw new RuntimeException("O semestre letivo nao pode ser vazio!");
        }
        if (alocacao.getSemestreletivo().length() > 20){
            throw new RuntimeException("O semestre letivo esta além do tamanho permitido!");
        }
        alocacaoDAO.Salvar(alocacao);
        return true;
    }
    public Alocacao Abrir(int codigo){
        return alocacaoDAO.Abrir(codigo);
    }
    public void Apagar(Alocacao alocacao){
        alocacaoDAO.Apagar(alocacao);
    }
    
}
