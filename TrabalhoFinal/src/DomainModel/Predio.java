/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rosy
 */
@Entity
public class Predio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idPredio;
    @Column(nullable=false)
    private String nome;
    private int codfuncionario;
    private int codcampus;
    
    public Predio(int id, String nome){
        this.idPredio = id;
        this.nome = nome;
    }

    public int getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(int idPredio) {
        this.idPredio = idPredio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodfuncionario() {
        return codfuncionario;
    }

    public void setCodfuncionario(int codfuncionario) {
        this.codfuncionario = codfuncionario;
    }

    public int getCodcampus() {
        return codcampus;
    }

    public void setCodcampus(int codcampus) {
        this.codcampus = codcampus;
    }
    
    
}
