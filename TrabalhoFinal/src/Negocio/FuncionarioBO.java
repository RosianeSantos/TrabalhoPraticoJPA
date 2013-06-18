/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.FuncionarioDAO;
import DomainModel.Funcionario;

/**
 *
 * @author Iara
 */
public class FuncionarioBO {
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public boolean Salvar(Funcionario funcionario){
        if(funcionario.getNome().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        if (funcionario.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        funcionarioDAO.Salvar(funcionario);
        return true;
    }
    public Funcionario Abrir(int codigo){
        return funcionarioDAO.Abrir(codigo);
    }
    public void Apagar(Funcionario funcionario){
        funcionarioDAO.Apagar(funcionario);
    }
    
}
