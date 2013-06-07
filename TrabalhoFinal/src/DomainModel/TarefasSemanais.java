/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author Iara
 */
public class TarefasSemanais {
    int idTarefas;
    String descricao;
    
    public TarefasSemanais(int id, String desc){
        this.idTarefas = id;
        this.descricao = desc;
    }

    public int getIdTarefas() {
        return idTarefas;
    }

    public void setIdTarefas(int idTarefas) {
        this.idTarefas = idTarefas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
