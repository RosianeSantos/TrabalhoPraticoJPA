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
import javax.persistence.ManyToOne;

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
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private Campus campus;
    
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

    public Funcionario getfuncionario() {
        return funcionario;
    }

    public void setfuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Campus getcampus() {
        return campus;
    }

    public void setcampus(Campus campus) {
        this.campus = campus;
    }
    
    
}
