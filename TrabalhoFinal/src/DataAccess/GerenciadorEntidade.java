/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rosy
 */
public class GerenciadorEntidade {
    
    public static void main(String[] args){
// Gerenciador de entidades
    EntityManager manager;

// Criador de Gerenciador de entidades
    EntityManagerFactory factory;
    
    factory = Persistence.createEntityManagerFactory("TrabalhoFinalPU2");
    manager = factory.createEntityManager();
    
    }
}
