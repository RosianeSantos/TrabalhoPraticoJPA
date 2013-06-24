/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.FuncionarioDAO;
import DomainModel.Funcionario;
import java.util.List;

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
        if (funcionario.getCpf().trim().length() == 0){
            throw new RuntimeException("O CPF nao pode ser vazio!");
        }
        if (funcionario.getCpf().length() > 14){
            throw new RuntimeException("O CPF esta acima do tamanho permitido!");
        }
        if (funcionario.getTelefone().trim().length() == 0){
            throw new RuntimeException("O telefone nao pode ser vazio!");
        }
        if (funcionario.getTelefone().length() > 14){
            throw new RuntimeException("O telefone esta acima do tamanho permitido!");
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
    
    public List<Funcionario> listarTodos(){
        return funcionarioDAO.listarTodos();
    }
    
    public List<Funcionario> buscar(Funcionario filtro){
        return funcionarioDAO.buscar(filtro);
    }
            
}
