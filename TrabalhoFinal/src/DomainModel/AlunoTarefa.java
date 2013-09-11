/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Rosy
 */
@Entity
public class AlunoTarefa {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idalunotarefa;
    @ManyToMany
    private Aluno aluno;
    @ManyToMany
    private TarefasSemanais tarefassemanais;

    public int getIdalunotarefa() {
        return idalunotarefa;
    }

    public void setIdalunotarefa(int idalunotarefa) {
        this.idalunotarefa = idalunotarefa;
    }

    public Aluno getaluno() {
        return aluno;
    }

    public void setaluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public TarefasSemanais gettarefa() {
        return tarefassemanais;
    }

    public void settarefa(TarefasSemanais tarefasSemanais) {
        this.tarefassemanais = tarefasSemanais;
    }

    
    
    
    
    
    
    
    
}
