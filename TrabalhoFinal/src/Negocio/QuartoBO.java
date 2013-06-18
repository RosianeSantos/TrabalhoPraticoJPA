/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.QuartoDAO;
import DomainModel.Quarto;

/**
 *
 * @author Iara
 */
public class QuartoBO {
    private QuartoDAO quartoDAO = new QuartoDAO();
    
    public boolean Salvar(Quarto quarto){
        if(quarto.getNumero() == 0){
            throw new RuntimeException("O numero nao pode ser igual a 0!");
        }
        quartoDAO.Salvar(quarto);
        return true;
    }
    public Quarto Abrir(int codigo){
        return quartoDAO.Abrir(codigo);
    }
    public void Apagar(Quarto quarto){
        quartoDAO.Apagar(quarto);
    }
}
