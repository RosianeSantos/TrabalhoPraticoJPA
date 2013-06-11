/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.CursoDAO;
import DomainModel.Curso;

/**
 *
 * @author Iara
 */
public class CursoBO {
    CursoDAO cursoDAO = new CursoDAO();
    
    public void Salvar(Curso obj){
        //Validacao do nome (igual a zero)
        if (obj.getNome().trim().length() == 0 ){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        // Validacao por tamanho de variavel no banco de dados
        if (obj.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        //
        /*Curso cursoobt = cursoDAO.buscar(obj);*/
        
        //Se tudo estiver ok, passa para DataAccess
        cursoDAO.Salvar(obj);
    }
    
    
}
