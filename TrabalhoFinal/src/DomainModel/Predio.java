/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author Iara
 */
public class Predio {
    int idPredio;
    String nome;
    int codfuncionario;
    int codcampus;
    
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
